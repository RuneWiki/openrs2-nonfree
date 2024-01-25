import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class79 implements Interface9 {

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Lclient!gf;")
	private final Class85 aClass85_2 = new Class85(256);

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "Lclient!dk;")
	private final Class54 aClass54_35;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!dk;")
	private final Class54 aClass54_34;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "[Lclient!mj;")
	private final Class158[] aClass158Array1;

	static {
		new Class134(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!dk;Lclient!dk;Lclient!dk;)V")
	public Class79(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_35 = arg1;
		this.aClass54_34 = arg2;
		@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0.method1126(0, 0));
		@Pc(28) int local28 = local24.method3555();
		this.aClass158Array1 = new Class158[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3580() == 1) {
				this.aClass158Array1[local34] = new Class158();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass158Array1[local56] != null) {
				this.aClass158Array1[local56].aBoolean284 = local24.method3580() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass158Array1[local88] != null) {
				this.aClass158Array1[local88].aBoolean280 = local24.method3580() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < local28; local116++) {
			if (this.aClass158Array1[local116] != null) {
				this.aClass158Array1[local116].aBoolean283 = local24.method3580() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < local28; local148++) {
			if (this.aClass158Array1[local148] != null) {
				this.aClass158Array1[local148].aBoolean281 = local24.method3580() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < local28; local178++) {
			if (this.aClass158Array1[local178] != null) {
				this.aClass158Array1[local178].aByte45 = local24.method3605();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < local28; local199++) {
			if (this.aClass158Array1[local199] != null) {
				this.aClass158Array1[local199].aByte47 = local24.method3605();
			}
		}
		for (@Pc(224) int local224 = 0; local224 < local28; local224++) {
			if (this.aClass158Array1[local224] != null) {
				this.aClass158Array1[local224].aByte43 = local24.method3605();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
			if (this.aClass158Array1[local249] != null) {
				this.aClass158Array1[local249].aByte44 = local24.method3605();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < local28; local270++) {
			if (this.aClass158Array1[local270] != null) {
				this.aClass158Array1[local270].aShort37 = (short) local24.method3555();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < local28; local296++) {
			if (this.aClass158Array1[local296] != null) {
				this.aClass158Array1[local296].aByte48 = local24.method3605();
			}
		}
		for (@Pc(317) int local317 = 0; local317 < local28; local317++) {
			if (this.aClass158Array1[local317] != null) {
				this.aClass158Array1[local317].aByte42 = local24.method3605();
			}
		}
		for (@Pc(342) int local342 = 0; local342 < local28; local342++) {
			if (this.aClass158Array1[local342] != null) {
				this.aClass158Array1[local342].aBoolean282 = local24.method3580() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < local28; local374++) {
			if (this.aClass158Array1[local374] != null) {
				this.aClass158Array1[local374].aBoolean279 = local24.method3580() == 1;
			}
		}
		for (@Pc(404) int local404 = 0; local404 < local28; local404++) {
			if (this.aClass158Array1[local404] != null) {
				this.aClass158Array1[local404].aByte46 = local24.method3605();
			}
		}
		for (@Pc(425) int local425 = 0; local425 < local28; local425++) {
			if (this.aClass158Array1[local425] != null) {
				this.aClass158Array1[local425].aBoolean278 = local24.method3580() == 1;
			}
		}
		for (@Pc(451) int local451 = 0; local451 < local28; local451++) {
			if (this.aClass158Array1[local451] != null) {
				this.aClass158Array1[local451].aBoolean285 = local24.method3580() == 1;
			}
		}
		for (@Pc(483) int local483 = 0; local483 < local28; local483++) {
			if (this.aClass158Array1[local483] != null) {
				this.aClass158Array1[local483].aBoolean277 = local24.method3580() == 1;
			}
		}
		for (@Pc(511) int local511 = 0; local511 < local28; local511++) {
			if (this.aClass158Array1[local511] != null) {
				this.aClass158Array1[local511].anInt4043 = local24.method3580();
			}
		}
		for (@Pc(536) int local536 = 0; local536 < local28; local536++) {
			if (this.aClass158Array1[local536] != null) {
				this.aClass158Array1[local536].anInt4044 = local24.method3574();
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1773(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = this.method1775(arg0);
		return local13 != null && local13.method4283(this, this.aClass54_34);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZFIIZ)[I")
	@Override
	public int[] method1772(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method1775(arg2).method4286(this.aClass54_34, this.aClass158Array1[arg2].aBoolean279, arg3, arg0, this, (double) arg1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)Lclient!mj;")
	@Override
	public Class158 method1769(@OriginalArg(1) int arg0) {
		return this.aClass158Array1[arg0];
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZIIF)[F")
	@Override
	public float[] method1771(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method1775(arg2).method4287(this.aClass158Array1[arg2].aBoolean279, arg0, arg1, this, this.aClass54_34);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIFBZI)[I")
	@Override
	public int[] method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method1775(arg1).method4288(arg3, this, arg4, (double) arg2, this.aClass54_34, this.aClass158Array1[arg1].aBoolean279, arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)Lclient!pr;")
	private Class2_Sub5_Sub13 method1775(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub5 local10 = this.aClass85_2.method1935((long) arg0);
		if (local10 != null) {
			return (Class2_Sub5_Sub13) local10;
		}
		@Pc(29) byte[] local29 = this.aClass54_35.method1110(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class2_Sub5_Sub13 local41 = new Class2_Sub5_Sub13(new Class2_Sub13(local29));
			this.aClass85_2.method1934((long) arg0, local41);
			return local41;
		}
	}
}
