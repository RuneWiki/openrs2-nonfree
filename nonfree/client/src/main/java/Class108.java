import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class108 implements Interface9 {

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!te;")
	private final Class188 aClass188_6 = new Class188(256);

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!ir;")
	private final Class100 aClass100_65;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!ir;")
	private final Class100 aClass100_64;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "[Lclient!ra;")
	private final Class171[] aClass171Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ir;Lclient!ir;Lclient!ir;)V")
	public Class108(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_65 = arg2;
		this.aClass100_64 = arg1;
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0.method2319(0, 0));
		@Pc(28) int local28 = local24.method3649();
		this.aClass171Array1 = new Class171[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3643() == 1) {
				this.aClass171Array1[local34] = new Class171();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass171Array1[local58] != null) {
				this.aClass171Array1[local58].aBoolean318 = local24.method3643() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < local28; local87++) {
			if (this.aClass171Array1[local87] != null) {
				this.aClass171Array1[local87].aBoolean326 = local24.method3643() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < local28; local119++) {
			if (this.aClass171Array1[local119] != null) {
				this.aClass171Array1[local119].aBoolean321 = local24.method3643() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < local28; local151++) {
			if (this.aClass171Array1[local151] != null) {
				this.aClass171Array1[local151].aBoolean320 = local24.method3643() == 1;
			}
		}
		for (@Pc(179) int local179 = 0; local179 < local28; local179++) {
			if (this.aClass171Array1[local179] != null) {
				this.aClass171Array1[local179].aByte54 = local24.method3621();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < local28; local204++) {
			if (this.aClass171Array1[local204] != null) {
				this.aClass171Array1[local204].aByte53 = local24.method3621();
			}
		}
		for (@Pc(229) int local229 = 0; local229 < local28; local229++) {
			if (this.aClass171Array1[local229] != null) {
				this.aClass171Array1[local229].aByte57 = local24.method3621();
			}
		}
		for (@Pc(254) int local254 = 0; local254 < local28; local254++) {
			if (this.aClass171Array1[local254] != null) {
				this.aClass171Array1[local254].aByte58 = local24.method3621();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < local28; local275++) {
			if (this.aClass171Array1[local275] != null) {
				this.aClass171Array1[local275].aShort83 = (short) local24.method3649();
			}
		}
		for (@Pc(301) int local301 = 0; local301 < local28; local301++) {
			if (this.aClass171Array1[local301] != null) {
				this.aClass171Array1[local301].aByte52 = local24.method3621();
			}
		}
		for (@Pc(322) int local322 = 0; local322 < local28; local322++) {
			if (this.aClass171Array1[local322] != null) {
				this.aClass171Array1[local322].aByte55 = local24.method3621();
			}
		}
		for (@Pc(343) int local343 = 0; local343 < local28; local343++) {
			if (this.aClass171Array1[local343] != null) {
				this.aClass171Array1[local343].aBoolean323 = local24.method3643() == 1;
			}
		}
		for (@Pc(371) int local371 = 0; local371 < local28; local371++) {
			if (this.aClass171Array1[local371] != null) {
				this.aClass171Array1[local371].aBoolean324 = local24.method3643() == 1;
			}
		}
		for (@Pc(397) int local397 = 0; local397 < local28; local397++) {
			if (this.aClass171Array1[local397] != null) {
				this.aClass171Array1[local397].aByte56 = local24.method3621();
			}
		}
		for (@Pc(422) int local422 = 0; local422 < local28; local422++) {
			if (this.aClass171Array1[local422] != null) {
				this.aClass171Array1[local422].aBoolean322 = local24.method3643() == 1;
			}
		}
		for (@Pc(450) int local450 = 0; local450 < local28; local450++) {
			if (this.aClass171Array1[local450] != null) {
				this.aClass171Array1[local450].aBoolean325 = local24.method3643() == 1;
			}
		}
		for (@Pc(480) int local480 = 0; local480 < local28; local480++) {
			if (this.aClass171Array1[local480] != null) {
				this.aClass171Array1[local480].aBoolean319 = local24.method3643() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZIIFI)[I")
	@Override
	public int[] method2395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method2398(arg2).method2527(this.aClass171Array1[arg2].aBoolean324, this, (double) arg3, arg1, arg0, this.aClass100_65, arg4);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2394(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub12 local16 = this.method2398(arg0);
		return local16 != null && local16.method2522(this.aClass100_65, this);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZFII)[F")
	@Override
	public float[] method2393(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2398(arg2).method2524(this.aClass171Array1[arg2].aBoolean324, arg3, this.aClass100_65, arg0, this);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lclient!ra;")
	@Override
	public Class171 method2396(@OriginalArg(0) int arg0) {
		return this.aClass171Array1[arg0];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Lclient!js;")
	private Class3_Sub7_Sub12 method2398(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7 local10 = this.aClass188_6.method5061((long) arg0);
		if (local10 != null) {
			return (Class3_Sub7_Sub12) local10;
		}
		@Pc(21) byte[] local21 = this.aClass100_64.method2318(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub7_Sub12 local38 = new Class3_Sub7_Sub12(new Class3_Sub4(local21));
			this.aClass188_6.method5063(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method2392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method2398(arg2).method2526(arg1, (double) arg3, this.aClass171Array1[arg2].aBoolean324, this, this.aClass100_65, arg0);
	}
}
