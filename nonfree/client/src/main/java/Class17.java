import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class17 implements Interface2 {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!ce;")
	private final Class31 aClass31_2 = new Class31(256);

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!dp;")
	private final Class53 aClass53_18;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!dp;")
	private final Class53 aClass53_19;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[Lclient!gf;")
	private final Class82[] aClass82Array1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!dp;Lclient!dp;Lclient!dp;)V")
	public Class17(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_18 = arg2;
		this.aClass53_19 = arg1;
		@Pc(24) Class6_Sub10 local24 = new Class6_Sub10(arg0.method1033(0, 0));
		@Pc(28) int local28 = local24.method4021();
		this.aClass82Array1 = new Class82[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3972() == 1) {
				this.aClass82Array1[local34] = new Class82();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass82Array1[local54] != null) {
				this.aClass82Array1[local54].aBoolean162 = local24.method3972() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < local28; local83++) {
			if (this.aClass82Array1[local83] != null) {
				this.aClass82Array1[local83].aBoolean158 = local24.method3972() == 1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < local28; local111++) {
			if (this.aClass82Array1[local111] != null) {
				this.aClass82Array1[local111].aBoolean165 = local24.method3972() == 1;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local28; local141++) {
			if (this.aClass82Array1[local141] != null) {
				this.aClass82Array1[local141].aBoolean160 = local24.method3972() == 1;
			}
		}
		for (@Pc(167) int local167 = 0; local167 < local28; local167++) {
			if (this.aClass82Array1[local167] != null) {
				this.aClass82Array1[local167].aByte28 = local24.method3992();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass82Array1[local192] != null) {
				this.aClass82Array1[local192].aByte24 = local24.method3992();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < local28; local213++) {
			if (this.aClass82Array1[local213] != null) {
				this.aClass82Array1[local213].aByte27 = local24.method3992();
			}
		}
		for (@Pc(238) int local238 = 0; local238 < local28; local238++) {
			if (this.aClass82Array1[local238] != null) {
				this.aClass82Array1[local238].aByte23 = local24.method3992();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < local28; local263++) {
			if (this.aClass82Array1[local263] != null) {
				this.aClass82Array1[local263].aShort23 = (short) local24.method4021();
			}
		}
		for (@Pc(285) int local285 = 0; local285 < local28; local285++) {
			if (this.aClass82Array1[local285] != null) {
				this.aClass82Array1[local285].aByte22 = local24.method3992();
			}
		}
		for (@Pc(310) int local310 = 0; local310 < local28; local310++) {
			if (this.aClass82Array1[local310] != null) {
				this.aClass82Array1[local310].aByte26 = local24.method3992();
			}
		}
		for (@Pc(335) int local335 = 0; local335 < local28; local335++) {
			if (this.aClass82Array1[local335] != null) {
				this.aClass82Array1[local335].aBoolean157 = local24.method3972() == 1;
			}
		}
		for (@Pc(365) int local365 = 0; local365 < local28; local365++) {
			if (this.aClass82Array1[local365] != null) {
				this.aClass82Array1[local365].aBoolean161 = local24.method3972() == 1;
			}
		}
		for (@Pc(391) int local391 = 0; local391 < local28; local391++) {
			if (this.aClass82Array1[local391] != null) {
				this.aClass82Array1[local391].aByte25 = local24.method3992();
			}
		}
		for (@Pc(416) int local416 = 0; local416 < local28; local416++) {
			if (this.aClass82Array1[local416] != null) {
				this.aClass82Array1[local416].aBoolean159 = local24.method3972() == 1;
			}
		}
		for (@Pc(446) int local446 = 0; local446 < local28; local446++) {
			if (this.aClass82Array1[local446] != null) {
				this.aClass82Array1[local446].aBoolean163 = local24.method3972() == 1;
			}
		}
		for (@Pc(474) int local474 = 0; local474 < local28; local474++) {
			if (this.aClass82Array1[local474] != null) {
				this.aClass82Array1[local474].aBoolean164 = local24.method3972() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBIFIZ)[I")
	@Override
	public int[] method345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method354(arg0).method126(arg3, this, arg1, this.aClass53_18, (double) arg2, this.aClass82Array1[arg0].aBoolean161);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIZFI)[F")
	@Override
	public float[] method348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method354(arg0).method130(this, arg1, this.aClass82Array1[arg0].aBoolean161, this.aClass53_18, arg3);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lclient!gf;")
	@Override
	public Class82 method346(@OriginalArg(0) int arg0) {
		return this.aClass82Array1[arg0];
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method349(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub2_Sub1 local13 = this.method354(arg0);
		return local13 != null && local13.method123(this, this.aClass53_18);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Lclient!af;")
	private Class6_Sub2_Sub1 method354(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2 local10 = this.aClass31_2.method634((long) arg0);
		if (local10 != null) {
			return (Class6_Sub2_Sub1) local10;
		}
		@Pc(21) byte[] local21 = this.aClass53_19.method1014(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(39) Class6_Sub2_Sub1 local39 = new Class6_Sub2_Sub1(new Class6_Sub10(local21));
			this.aClass31_2.method632((long) arg0, local39);
			return local39;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIFZZ)[I")
	@Override
	public int[] method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) boolean arg4) {
		return this.method354(arg1).method120(this, arg0, arg4, arg2, (double) arg3, this.aClass82Array1[arg1].aBoolean161, this.aClass53_18);
	}
}
