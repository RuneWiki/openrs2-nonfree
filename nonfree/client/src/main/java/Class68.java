import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class68 implements Interface3 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!le;")
	private final Class122 aClass122_3 = new Class122(256);

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!ij;")
	private final Class93 aClass93_31;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!ij;")
	private final Class93 aClass93_30;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[Lclient!va;")
	private final Class200[] aClass200Array1;

	static {
		new Class85("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!ij;Lclient!ij;Lclient!ij;)V")
	public Class68(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class93 arg2) {
		this.aClass93_31 = arg1;
		this.aClass93_30 = arg2;
		@Pc(24) Class5_Sub12 local24 = new Class5_Sub12(arg0.method2410(0, 0));
		@Pc(28) int local28 = local24.method5106();
		this.aClass200Array1 = new Class200[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5115() == 1) {
				this.aClass200Array1[local34] = new Class200();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass200Array1[local60] != null) {
				this.aClass200Array1[local60].aBoolean540 = local24.method5115() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < local28; local85++) {
			if (this.aClass200Array1[local85] != null) {
				this.aClass200Array1[local85].aBoolean544 = local24.method5115() == 1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < local28; local111++) {
			if (this.aClass200Array1[local111] != null) {
				this.aClass200Array1[local111].aBoolean539 = local24.method5115() == 1;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local28; local141++) {
			if (this.aClass200Array1[local141] != null) {
				this.aClass200Array1[local141].aBoolean541 = local24.method5115() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < local28; local171++) {
			if (this.aClass200Array1[local171] != null) {
				this.aClass200Array1[local171].aByte65 = local24.method5098();
			}
		}
		for (@Pc(196) int local196 = 0; local196 < local28; local196++) {
			if (this.aClass200Array1[local196] != null) {
				this.aClass200Array1[local196].aByte66 = local24.method5098();
			}
		}
		for (@Pc(221) int local221 = 0; local221 < local28; local221++) {
			if (this.aClass200Array1[local221] != null) {
				this.aClass200Array1[local221].aByte63 = local24.method5098();
			}
		}
		for (@Pc(242) int local242 = 0; local242 < local28; local242++) {
			if (this.aClass200Array1[local242] != null) {
				this.aClass200Array1[local242].aByte64 = local24.method5098();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < local28; local267++) {
			if (this.aClass200Array1[local267] != null) {
				this.aClass200Array1[local267].aShort84 = (short) local24.method5106();
			}
		}
		for (@Pc(289) int local289 = 0; local289 < local28; local289++) {
			if (this.aClass200Array1[local289] != null) {
				this.aClass200Array1[local289].aByte68 = local24.method5098();
			}
		}
		for (@Pc(310) int local310 = 0; local310 < local28; local310++) {
			if (this.aClass200Array1[local310] != null) {
				this.aClass200Array1[local310].aByte67 = local24.method5098();
			}
		}
		for (@Pc(331) int local331 = 0; local331 < local28; local331++) {
			if (this.aClass200Array1[local331] != null) {
				this.aClass200Array1[local331].aBoolean538 = local24.method5115() == 1;
			}
		}
		for (@Pc(361) int local361 = 0; local361 < local28; local361++) {
			if (this.aClass200Array1[local361] != null) {
				this.aClass200Array1[local361].aBoolean545 = local24.method5115() == 1;
			}
		}
		for (@Pc(391) int local391 = 0; local391 < local28; local391++) {
			if (this.aClass200Array1[local391] != null) {
				this.aClass200Array1[local391].aByte62 = local24.method5098();
			}
		}
		for (@Pc(416) int local416 = 0; local416 < local28; local416++) {
			if (this.aClass200Array1[local416] != null) {
				this.aClass200Array1[local416].aBoolean542 = local24.method5115() == 1;
			}
		}
		for (@Pc(444) int local444 = 0; local444 < local28; local444++) {
			if (this.aClass200Array1[local444] != null) {
				this.aClass200Array1[local444].aBoolean536 = local24.method5115() == 1;
			}
		}
		for (@Pc(472) int local472 = 0; local472 < local28; local472++) {
			if (this.aClass200Array1[local472] != null) {
				this.aClass200Array1[local472].aBoolean543 = local24.method5115() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZBIIF)[F")
	@Override
	public float[] method1510(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method1517(arg0).method3774(this.aClass93_30, arg2, arg1, this.aClass200Array1[arg0].aBoolean545, this);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1509(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub1_Sub14 local16 = this.method1517(arg0);
		return local16 != null && local16.method3775(this.aClass93_30, this);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lclient!mr;")
	private Class5_Sub1_Sub14 method1517(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1 local10 = this.aClass122_3.method3177((long) arg0);
		if (local10 != null) {
			return (Class5_Sub1_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass93_31.method2392(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class5_Sub1_Sub14 local33 = new Class5_Sub1_Sub14(new Class5_Sub12(local21));
			this.aClass122_3.method3181((long) arg0, local33);
			return local33;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lclient!va;")
	@Override
	public Class200 method1511(@OriginalArg(0) int arg0) {
		return this.aClass200Array1[arg0];
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIZFI)[I")
	@Override
	public int[] method1508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4) {
		return this.method1517(arg2).method3772(this.aClass93_30, (double) arg4, this, arg3, arg1, arg0, this.aClass200Array1[arg2].aBoolean545);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZFIIBI)[I")
	@Override
	public int[] method1512(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method1517(arg3).method3770(this.aClass200Array1[arg3].aBoolean545, arg1, arg2, this, (double) arg0, this.aClass93_30);
	}
}
