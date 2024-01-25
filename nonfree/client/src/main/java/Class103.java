import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class103 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	private int anInt2762 = -1;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	private final int anInt2761;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Lclient!aaa;")
	private final Class2 aClass2_1;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	private final int anInt2755;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_8;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	private final int anInt2763;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!fu;")
	private Class125_Sub1 aClass125_Sub1_2;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Lclient!ww;")
	private Interface27 anInterface27_2;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "Lclient!kh;")
	private Class188_Sub2 aClass188_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!aq;Lclient!aaa;Lclient!wba;IIIII)V")
	public Class103(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class259_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2761 = arg6;
		this.aClass2_1 = arg1;
		this.anInt2755 = arg7;
		this.aClass22_Sub1_8 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = local31 + arg2.anInt10949 * (local35 + local37);
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray6[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt2763 = local27;
		if (local27 <= 0) {
			this.aClass125_Sub1_2 = null;
		} else {
			@Pc(105) Class3_Sub2 local105 = new Class3_Sub2(local27 * 2);
			@Pc(124) int local124;
			@Pc(132) short[] local132;
			@Pc(136) int local136;
			@Pc(122) int local122;
			if (this.aClass22_Sub1_8.aBoolean60) {
				for (local52 = 0; local52 < local25; local52++) {
					local122 = arg2.anInt10949 * (local52 + local35) + local31;
					for (local124 = 0; local124 < local25; local124++) {
						local132 = arg2.aShortArrayArray6[local122++];
						if (local132 != null) {
							for (local136 = 0; local136 < local132.length; local136++) {
								local105.method2032(local132[local136] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local122 = local31 + arg2.anInt10949 * (local52 + local35);
					for (local124 = 0; local124 < local25; local124++) {
						local132 = arg2.aShortArrayArray6[local122++];
						if (local132 != null) {
							for (local136 = 0; local136 < local132.length; local136++) {
								local105.method2070(local132[local136] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface27_2 = this.aClass22_Sub1_8.method896(false, local105.aByteArray20, local105.anInt2178);
			this.aClass188_Sub2_1 = new Class188_Sub2(this.aClass22_Sub1_8, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI[BI)V")
	public void method2525(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass188_Sub2_1.method9070(arg1 * this.aClass22_Sub1_8.method951(5123), arg0);
		this.method2528(this.aClass188_Sub2_1, arg1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
	public void method2527() {
		this.method2528(this.anInterface27_2, this.anInt2763);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ww;IZ)V")
	private void method2528(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method2530();
			this.aClass22_Sub1_8.method955(this.aClass125_Sub1_2);
			this.aClass22_Sub1_8.method957(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	private void method2530() {
		if (!this.aBoolean178) {
			return;
		}
		this.aBoolean178 = false;
		@Pc(17) byte[] local17 = this.aClass2_1.aByteArray1;
		@Pc(21) byte[] local21 = this.aClass22_Sub1_8.aByteArray6;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = this.aClass2_1.anInt6;
		@Pc(45) int local45 = this.anInt2755 * this.aClass2_1.anInt6 + this.anInt2761;
		@Pc(57) int local57;
		for (@Pc(47) int local47 = -128; local47 < 0; local47++) {
			local23 = (local23 << 8) - local23;
			for (local57 = -128; local57 < 0; local57++) {
				if (local17[local45++] != 0) {
					local23++;
				}
			}
			local45 += local27 - 128;
		}
		if (this.aClass125_Sub1_2 != null && local23 == this.anInt2762) {
			this.aBoolean178 = false;
			return;
		}
		this.anInt2762 = local23;
		local57 = 0;
		local45 = this.anInt2761 + local27 * this.anInt2755;
		for (@Pc(130) int local130 = -128; local130 < 0; local130++) {
			for (@Pc(134) int local134 = -128; local134 < 0; local134++) {
				if (local17[local45] == 0) {
					@Pc(144) int local144 = 0;
					if (local17[local45 - 1] != 0) {
						local144++;
					}
					if (local17[local45 + 1] != 0) {
						local144++;
					}
					if (local17[local45 - local27] != 0) {
						local144++;
					}
					if (local17[local27 + local45] != 0) {
						local144++;
					}
					local21[local57++] = (byte) (local144 * 17);
				} else {
					local21[local57++] = 68;
				}
				local45++;
			}
			local45 += this.aClass2_1.anInt6 - 128;
		}
		if (this.aClass125_Sub1_2 == null) {
			this.aClass125_Sub1_2 = new Class125_Sub1(this.aClass22_Sub1_8, 3553, 6406, 128, 128, false, this.aClass22_Sub1_8.aByteArray6, 6406, false);
			this.aClass125_Sub1_2.method9224(false, false);
			this.aClass125_Sub1_2.method9217(true);
		} else {
			this.aClass125_Sub1_2.method9222(128, false, this.aClass22_Sub1_8.aByteArray6, 6406, 128);
		}
	}
}
