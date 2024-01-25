import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class72 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	private int anInt2245 = -1;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Z")
	public boolean aBoolean153 = true;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_8;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	private final int anInt2244;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!m;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private final int anInt2247;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!ud;")
	private Class19_Sub4 aClass19_Sub4_1;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!lp;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!qb;")
	private Class90_Sub2 aClass90_Sub2_1;

	static {
		new Class267("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!rl;Lclient!m;Lclient!gb;IIIII)V")
	public Class72(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class86_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2249 = arg7;
		this.aClass66_Sub2_8 = arg0;
		this.anInt2244 = arg6;
		this.aClass159_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local35 + local37) * arg2.anInt8047 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray6[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt2247 = local27;
		if (local27 <= 0) {
			this.aClass19_Sub4_1 = null;
		} else {
			@Pc(98) Class6_Sub1 local98 = new Class6_Sub1(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass66_Sub2_8.aBoolean373) {
				for (local52 = 0; local52 < local25; local52++) {
					local115 = (local52 + local35) * arg2.anInt8047 + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray6[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method6453(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local115 = arg2.anInt8047 * (local52 + local35) + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray6[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method6480(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_1 = this.aClass66_Sub2_8.method5136(false, local98.aByteArray96, local98.anInt7898);
			this.aClass90_Sub2_1 = new Class90_Sub2(this.aClass66_Sub2_8, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!lp;I)V")
	private void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		if (arg0 != 0) {
			this.method1845();
			this.aClass66_Sub2_8.method5109(this.aClass19_Sub4_1);
			this.aClass66_Sub2_8.method5155(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	private void method1845() {
		if (!this.aBoolean153) {
			return;
		}
		this.aBoolean153 = false;
		@Pc(16) byte[] local16 = this.aClass159_1.aByteArray53;
		@Pc(18) byte[] local18 = Static248.aByteArray93;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass159_1.anInt4367;
		@Pc(34) int local34 = this.anInt2249 * this.aClass159_1.anInt4367 + this.anInt2244;
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
		if (this.aClass19_Sub4_1 != null && local20 == this.anInt2245) {
			this.aBoolean153 = false;
			return;
		}
		this.anInt2245 = local20;
		local47 = 0;
		local34 = this.anInt2244 + local24 * this.anInt2249;
		for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
			for (@Pc(114) int local114 = -128; local114 < 0; local114++) {
				if (local16[local34] == 0) {
					@Pc(132) int local132 = 0;
					if (local16[local34 - 1] != 0) {
						local132++;
					}
					if (local16[local34 + 1] != 0) {
						local132++;
					}
					if (local16[local34 - local24] != 0) {
						local132++;
					}
					if (local16[local24 + local34] != 0) {
						local132++;
					}
					local18[local47++] = (byte) (local132 * 17);
				} else {
					local18[local47++] = 68;
				}
				local34++;
			}
			local34 += this.aClass159_1.anInt4367 - 128;
		}
		if (this.aClass19_Sub4_1 == null) {
			this.aClass19_Sub4_1 = new Class19_Sub4(this.aClass66_Sub2_8, 3553, 6406, 128, 128, false, Static248.aByteArray93, 6406, false);
			this.aClass19_Sub4_1.method4257(false, false);
			this.aClass19_Sub4_1.method4238(true);
		} else {
			this.aClass19_Sub4_1.method4256(false, 128, 128, 6406, Static248.aByteArray93);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BIZ)V")
	public void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass90_Sub2_1.method4586(arg1, this.aClass66_Sub2_8.method5103(5123) * arg0);
		this.method1843(arg0, this.aClass90_Sub2_1);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public void method1847() {
		this.method1843(this.anInt2247, this.anInterface4_1);
	}
}
