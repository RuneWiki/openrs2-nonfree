import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class125 {

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	private int anInt3913 = -1;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	private final int anInt3905;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!uf;")
	private final Class236 aClass236_1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_23;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	private final int anInt3907;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	private final int anInt3904;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Lclient!bk;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!eo;")
	private Class64_Sub1 aClass64_Sub1_2;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!af;")
	private Class6_Sub1 aClass6_Sub1_6;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!fd;Lclient!uf;Lclient!oq;IIIII)V")
	public Class125(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class65_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3905 = arg7;
		this.aClass236_1 = arg1;
		this.aClass19_Sub2_23 = arg0;
		this.anInt3907 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt5262 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray9[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt3904 = local27;
		if (local27 <= 0) {
			this.aClass6_Sub1_6 = null;
		} else {
			@Pc(96) Class4_Sub12 local96 = new Class4_Sub12(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass19_Sub2_23.aBoolean215) {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = (local50 + local35) * arg2.anInt5262 + local31;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray9[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method2524(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = local31 + arg2.anInt5262 * (local50 + local35);
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray9[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method2541(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_4 = this.aClass19_Sub2_23.method1955(local96.anInt2997, false, local96.aByteArray36);
			this.aClass64_Sub1_2 = new Class64_Sub1(this.aClass19_Sub2_23, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	private void method3187() {
		if (!this.aBoolean364) {
			return;
		}
		this.aBoolean364 = false;
		@Pc(16) byte[] local16 = this.aClass236_1.aByteArray94;
		@Pc(18) byte[] local18 = Static426.aByteArray102;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass236_1.anInt6634;
		@Pc(34) int local34 = this.aClass236_1.anInt6634 * this.anInt3905 + this.anInt3907;
		@Pc(47) int local47;
		for (@Pc(36) int local36 = -128; local36 < 0; local36++) {
			local20 = (local20 << 8) - local20;
			for (local47 = -128; local47 < 0; local47++) {
				if (local16[local34++] != 0) {
					local20++;
				}
			}
			local34 += local24 - 128;
		}
		if (this.aClass6_Sub1_6 != null && local20 == this.anInt3913) {
			this.aBoolean364 = false;
			return;
		}
		this.anInt3913 = local20;
		local47 = 0;
		local34 = this.anInt3907 + this.anInt3905 * local24;
		for (@Pc(96) int local96 = -128; local96 < 0; local96++) {
			for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
				if (local16[local34] == 0) {
					@Pc(108) int local108 = 0;
					if (local16[local34 - 1] != 0) {
						local108++;
					}
					if (local16[local34 + 1] != 0) {
						local108++;
					}
					if (local16[local34 - local24] != 0) {
						local108++;
					}
					if (local16[local24 + local34] != 0) {
						local108++;
					}
					local18[local47++] = (byte) (local108 * 17);
				} else {
					local18[local47++] = 68;
				}
				local34++;
			}
			local34 += this.aClass236_1.anInt6634 - 128;
		}
		if (this.aClass6_Sub1_6 == null) {
			this.aClass6_Sub1_6 = new Class6_Sub1(this.aClass19_Sub2_23, 3553, 6406, 128, 128, false, Static426.aByteArray102, 6406, false);
			this.aClass6_Sub1_6.method4196(false, false);
			this.aClass6_Sub1_6.method4181(true);
		} else {
			this.aClass6_Sub1_6.method4191(128, Static426.aByteArray102, 128, 6406, false);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!bk;IZ)V")
	private void method3188(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method3187();
			this.aClass19_Sub2_23.method1905(this.aClass6_Sub1_6);
			this.aClass19_Sub2_23.method1967(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public void method3189() {
		this.method3188(this.anInterface1_4, this.anInt3904);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B[BII)V")
	public void method3190(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass64_Sub1_2.method3657(arg0, arg1 * this.aClass19_Sub2_23.method1897(5123));
		this.method3188(this.aClass64_Sub1_2, arg1);
	}
}
