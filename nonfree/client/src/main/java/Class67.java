import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class67 implements Interface8 {

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!uc;")
	private final Class240 aClass240_2 = new Class240(256);

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!ic;")
	private final Class113 aClass113_36;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!ic;")
	private final Class113 aClass113_35;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "[Lclient!qg;")
	private final Class201[] aClass201Array1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ic;Lclient!ic;Lclient!ic;)V")
	public Class67(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_36 = arg1;
		this.aClass113_35 = arg2;
		@Pc(24) Class1_Sub11 local24 = new Class1_Sub11(arg0.method2274(0, 0));
		@Pc(28) int local28 = local24.method4485();
		this.aClass201Array1 = new Class201[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4463() == 1) {
				this.aClass201Array1[local34] = new Class201();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass201Array1[local58] != null) {
				this.aClass201Array1[local58].aBoolean432 = local24.method4463() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < local28; local83++) {
			if (this.aClass201Array1[local83] != null) {
				this.aClass201Array1[local83].aBoolean433 = local24.method4463() == 1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < local28; local111++) {
			if (this.aClass201Array1[local111] != null) {
				this.aClass201Array1[local111].aBoolean431 = local24.method4463() == 1;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local28; local141++) {
			if (this.aClass201Array1[local141] != null) {
				this.aClass201Array1[local141].aBoolean435 = local24.method4463() == 1;
			}
		}
		for (@Pc(173) int local173 = 0; local173 < local28; local173++) {
			if (this.aClass201Array1[local173] != null) {
				this.aClass201Array1[local173].aByte63 = local24.method4452();
			}
		}
		for (@Pc(194) int local194 = 0; local194 < local28; local194++) {
			if (this.aClass201Array1[local194] != null) {
				this.aClass201Array1[local194].aByte65 = local24.method4452();
			}
		}
		for (@Pc(219) int local219 = 0; local219 < local28; local219++) {
			if (this.aClass201Array1[local219] != null) {
				this.aClass201Array1[local219].aByte61 = local24.method4452();
			}
		}
		for (@Pc(240) int local240 = 0; local240 < local28; local240++) {
			if (this.aClass201Array1[local240] != null) {
				this.aClass201Array1[local240].aByte64 = local24.method4452();
			}
		}
		for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
			if (this.aClass201Array1[local265] != null) {
				this.aClass201Array1[local265].aShort61 = (short) local24.method4485();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local28; local287++) {
			if (this.aClass201Array1[local287] != null) {
				this.aClass201Array1[local287].aByte60 = local24.method4452();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < local28; local312++) {
			if (this.aClass201Array1[local312] != null) {
				this.aClass201Array1[local312].aByte59 = local24.method4452();
			}
		}
		for (@Pc(333) int local333 = 0; local333 < local28; local333++) {
			if (this.aClass201Array1[local333] != null) {
				this.aClass201Array1[local333].aBoolean436 = local24.method4463() == 1;
			}
		}
		for (@Pc(361) int local361 = 0; local361 < local28; local361++) {
			if (this.aClass201Array1[local361] != null) {
				this.aClass201Array1[local361].aBoolean429 = local24.method4463() == 1;
			}
		}
		for (@Pc(389) int local389 = 0; local389 < local28; local389++) {
			if (this.aClass201Array1[local389] != null) {
				this.aClass201Array1[local389].aByte62 = local24.method4452();
			}
		}
		for (@Pc(410) int local410 = 0; local410 < local28; local410++) {
			if (this.aClass201Array1[local410] != null) {
				this.aClass201Array1[local410].aBoolean428 = local24.method4463() == 1;
			}
		}
		for (@Pc(438) int local438 = 0; local438 < local28; local438++) {
			if (this.aClass201Array1[local438] != null) {
				this.aClass201Array1[local438].aBoolean434 = local24.method4463() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < local28; local468++) {
			if (this.aClass201Array1[local468] != null) {
				this.aClass201Array1[local468].aBoolean430 = local24.method4463() == 1;
			}
		}
		for (@Pc(496) int local496 = 0; local496 < local28; local496++) {
			if (this.aClass201Array1[local496] != null) {
				this.aClass201Array1[local496].anInt5367 = local24.method4463();
			}
		}
		for (@Pc(521) int local521 = 0; local521 < local28; local521++) {
			if (this.aClass201Array1[local521] != null) {
				this.aClass201Array1[local521].anInt5366 = local24.method4487();
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZIFBI)[I")
	@Override
	public int[] method1374(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method1378(arg4).method1396(this.aClass201Array1[arg4].aBoolean429, this.aClass113_35, (double) arg3, arg1, this, arg2, arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lclient!en;")
	private Class1_Sub3_Sub6 method1378(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3 local16 = this.aClass240_2.method5015((long) arg0);
		if (local16 != null) {
			return (Class1_Sub3_Sub6) local16;
		}
		@Pc(27) byte[] local27 = this.aClass113_36.method2273(arg0);
		if (local27 == null) {
			return null;
		} else {
			@Pc(39) Class1_Sub3_Sub6 local39 = new Class1_Sub3_Sub6(new Class1_Sub11(local27));
			this.aClass240_2.method5021(local39, (long) arg0);
			return local39;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1376(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub3_Sub6 local13 = this.method1378(arg0);
		return local13 != null && local13.method1394(this, this.aClass113_35);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIIIIF)[I")
	@Override
	public int[] method1373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method1378(arg2).method1399(this.aClass201Array1[arg2].aBoolean429, (double) arg3, arg0, arg1, this, this.aClass113_35);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(FZIBII)[F")
	@Override
	public float[] method1372(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1378(arg2).method1389(this.aClass201Array1[arg2].aBoolean429, arg3, this, this.aClass113_35, arg1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)Lclient!qg;")
	@Override
	public Class201 method1375(@OriginalArg(1) int arg0) {
		return this.aClass201Array1[arg0];
	}
}
