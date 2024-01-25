import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class184 implements Interface5 {

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!ib;")
	private final Class116 aClass116_2 = new Class116(256);

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Lclient!hh;")
	private final Class109 aClass109_65;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!hh;")
	private final Class109 aClass109_66;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "[Lclient!js;")
	private final Class132[] aClass132Array1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!hh;Lclient!hh;Lclient!hh;)V")
	public Class184(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_65 = arg1;
		this.aClass109_66 = arg2;
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0.method2349(0, 0));
		@Pc(28) int local28 = local24.method4498();
		this.aClass132Array1 = new Class132[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4548() == 1) {
				this.aClass132Array1[local34] = new Class132();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass132Array1[local58] != null) {
				this.aClass132Array1[local58].aBoolean284 = local24.method4548() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < local28; local87++) {
			if (this.aClass132Array1[local87] != null) {
				this.aClass132Array1[local87].aBoolean277 = local24.method4548() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass132Array1[local113] != null) {
				this.aClass132Array1[local113].aBoolean282 = local24.method4548() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass132Array1[local139] != null) {
				this.aClass132Array1[local139].aBoolean278 = local24.method4548() == 1;
			}
		}
		for (@Pc(165) int local165 = 0; local165 < local28; local165++) {
			if (this.aClass132Array1[local165] != null) {
				this.aClass132Array1[local165].aByte38 = local24.method4529();
			}
		}
		for (@Pc(186) int local186 = 0; local186 < local28; local186++) {
			if (this.aClass132Array1[local186] != null) {
				this.aClass132Array1[local186].aByte42 = local24.method4529();
			}
		}
		for (@Pc(207) int local207 = 0; local207 < local28; local207++) {
			if (this.aClass132Array1[local207] != null) {
				this.aClass132Array1[local207].aByte40 = local24.method4529();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass132Array1[local228] != null) {
				this.aClass132Array1[local228].aByte43 = local24.method4529();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < local28; local253++) {
			if (this.aClass132Array1[local253] != null) {
				this.aClass132Array1[local253].aShort63 = (short) local24.method4498();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < local28; local275++) {
			if (this.aClass132Array1[local275] != null) {
				this.aClass132Array1[local275].aByte37 = local24.method4529();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < local28; local296++) {
			if (this.aClass132Array1[local296] != null) {
				this.aClass132Array1[local296].aByte41 = local24.method4529();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < local28; local321++) {
			if (this.aClass132Array1[local321] != null) {
				this.aClass132Array1[local321].aBoolean283 = local24.method4548() == 1;
			}
		}
		for (@Pc(347) int local347 = 0; local347 < local28; local347++) {
			if (this.aClass132Array1[local347] != null) {
				this.aClass132Array1[local347].aBoolean285 = local24.method4548() == 1;
			}
		}
		for (@Pc(379) int local379 = 0; local379 < local28; local379++) {
			if (this.aClass132Array1[local379] != null) {
				this.aClass132Array1[local379].aByte39 = local24.method4529();
			}
		}
		for (@Pc(404) int local404 = 0; local404 < local28; local404++) {
			if (this.aClass132Array1[local404] != null) {
				this.aClass132Array1[local404].aBoolean286 = local24.method4548() == 1;
			}
		}
		for (@Pc(434) int local434 = 0; local434 < local28; local434++) {
			if (this.aClass132Array1[local434] != null) {
				this.aClass132Array1[local434].aBoolean281 = local24.method4548() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < local28; local460++) {
			if (this.aClass132Array1[local460] != null) {
				this.aClass132Array1[local460].aBoolean279 = local24.method4548() == 1;
			}
		}
		for (@Pc(486) int local486 = 0; local486 < local28; local486++) {
			if (this.aClass132Array1[local486] != null) {
				this.aClass132Array1[local486].anInt3547 = local24.method4548();
			}
		}
		for (@Pc(511) int local511 = 0; local511 < local28; local511++) {
			if (this.aClass132Array1[local511] != null) {
				this.aClass132Array1[local511].anInt3552 = local24.method4500();
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method3922(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub1_Sub10 local13 = this.method3925(arg0);
		return local13 != null && local13.method3977(this.aClass109_66, this);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZFBII)[I")
	@Override
	public int[] method3923(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3925(arg0).method3975(this.aClass109_66, arg1, arg3, (double) arg2, this, arg4, this.aClass132Array1[arg0].aBoolean285);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lclient!js;")
	@Override
	public Class132 method3920(@OriginalArg(0) int arg0) {
		return this.aClass132Array1[arg0];
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FBIIZI)[F")
	@Override
	public float[] method3919(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method3925(arg3).method3974(arg1, arg2, this.aClass132Array1[arg3].aBoolean285, this, this.aClass109_66);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)Lclient!om;")
	private Class1_Sub1_Sub10 method3925(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub1 local18 = this.aClass116_2.method2530((long) arg0);
		if (local18 != null) {
			return (Class1_Sub1_Sub10) local18;
		}
		@Pc(29) byte[] local29 = this.aClass109_65.method2346(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class1_Sub1_Sub10 local41 = new Class1_Sub1_Sub10(new Class1_Sub14(local29));
			this.aClass116_2.method2526(local41, (long) arg0);
			return local41;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZIIIF)[I")
	@Override
	public int[] method3921(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method3925(arg0).method3979(arg2, arg1, this.aClass132Array1[arg0].aBoolean285, (double) arg3, this.aClass109_66, this);
	}
}
