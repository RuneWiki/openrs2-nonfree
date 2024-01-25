import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class130 implements Interface1 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "Lclient!dt;")
	private final Class55 aClass55_5 = new Class55(256);

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Lclient!fc;")
	private final Class71 aClass71_43;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "Lclient!fc;")
	private final Class71 aClass71_44;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "[Lclient!pt;")
	private final Class182[] aClass182Array1;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!fc;Lclient!fc;Lclient!fc;)V")
	public Class130(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_43 = arg2;
		this.aClass71_44 = arg1;
		@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0.method1555(0, 0));
		@Pc(28) int local28 = local24.method4245();
		this.aClass182Array1 = new Class182[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4240() == 1) {
				this.aClass182Array1[local34] = new Class182();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass182Array1[local58] != null) {
				this.aClass182Array1[local58].aBoolean366 = local24.method4240() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < local28; local86++) {
			if (this.aClass182Array1[local86] != null) {
				this.aClass182Array1[local86].aBoolean362 = local24.method4240() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < local28; local116++) {
			if (this.aClass182Array1[local116] != null) {
				this.aClass182Array1[local116].aBoolean361 = local24.method4240() == 1;
			}
		}
		for (@Pc(146) int local146 = 0; local146 < local28; local146++) {
			if (this.aClass182Array1[local146] != null) {
				this.aClass182Array1[local146].aBoolean365 = local24.method4240() == 1;
			}
		}
		for (@Pc(172) int local172 = 0; local172 < local28; local172++) {
			if (this.aClass182Array1[local172] != null) {
				this.aClass182Array1[local172].aByte51 = local24.method4217();
			}
		}
		for (@Pc(193) int local193 = 0; local193 < local28; local193++) {
			if (this.aClass182Array1[local193] != null) {
				this.aClass182Array1[local193].aByte49 = local24.method4217();
			}
		}
		for (@Pc(214) int local214 = 0; local214 < local28; local214++) {
			if (this.aClass182Array1[local214] != null) {
				this.aClass182Array1[local214].aByte47 = local24.method4217();
			}
		}
		for (@Pc(239) int local239 = 0; local239 < local28; local239++) {
			if (this.aClass182Array1[local239] != null) {
				this.aClass182Array1[local239].aByte48 = local24.method4217();
			}
		}
		for (@Pc(260) int local260 = 0; local260 < local28; local260++) {
			if (this.aClass182Array1[local260] != null) {
				this.aClass182Array1[local260].aShort70 = (short) local24.method4245();
			}
		}
		for (@Pc(286) int local286 = 0; local286 < local28; local286++) {
			if (this.aClass182Array1[local286] != null) {
				this.aClass182Array1[local286].aByte52 = local24.method4217();
			}
		}
		for (@Pc(311) int local311 = 0; local311 < local28; local311++) {
			if (this.aClass182Array1[local311] != null) {
				this.aClass182Array1[local311].aByte50 = local24.method4217();
			}
		}
		for (@Pc(336) int local336 = 0; local336 < local28; local336++) {
			if (this.aClass182Array1[local336] != null) {
				this.aClass182Array1[local336].aBoolean363 = local24.method4240() == 1;
			}
		}
		for (@Pc(368) int local368 = 0; local368 < local28; local368++) {
			if (this.aClass182Array1[local368] != null) {
				this.aClass182Array1[local368].aBoolean369 = local24.method4240() == 1;
			}
		}
		for (@Pc(400) int local400 = 0; local400 < local28; local400++) {
			if (this.aClass182Array1[local400] != null) {
				this.aClass182Array1[local400].aByte53 = local24.method4217();
			}
		}
		for (@Pc(425) int local425 = 0; local425 < local28; local425++) {
			if (this.aClass182Array1[local425] != null) {
				this.aClass182Array1[local425].aBoolean367 = local24.method4240() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < local28; local455++) {
			if (this.aClass182Array1[local455] != null) {
				this.aClass182Array1[local455].aBoolean368 = local24.method4240() == 1;
			}
		}
		for (@Pc(485) int local485 = 0; local485 < local28; local485++) {
			if (this.aClass182Array1[local485] != null) {
				this.aClass182Array1[local485].aBoolean364 = local24.method4240() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZIFIII)[I")
	@Override
	public int[] method2850(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method2854(arg3).method4880(this.aClass71_43, this.aClass182Array1[arg3].aBoolean369, arg0, arg4, (double) arg2, arg1, this);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIZFII)[F")
	@Override
	public float[] method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method2854(arg0).method4878(this.aClass71_43, this, this.aClass182Array1[arg0].aBoolean369, arg3, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2846(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub14 local13 = this.method2854(arg0);
		return local13 != null && local13.method4884(this.aClass71_43, this);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IFIIBZ)[I")
	@Override
	public int[] method2848(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method2854(arg2).method4877(arg0, this, (double) arg1, arg3, this.aClass71_43, this.aClass182Array1[arg2].aBoolean369);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Lclient!rq;")
	private Class2_Sub1_Sub14 method2854(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1 local10 = this.aClass55_5.method1250((long) arg0);
		if (local10 != null) {
			return (Class2_Sub1_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass71_44.method1564(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class2_Sub1_Sub14 local45 = new Class2_Sub1_Sub14(new Class2_Sub13(local21));
			this.aClass55_5.method1248((long) arg0, local45);
			return local45;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)Lclient!pt;")
	@Override
	public Class182 method2849(@OriginalArg(0) int arg0) {
		return this.aClass182Array1[arg0];
	}
}
