import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class249 implements Interface6 {

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Lclient!fs;")
	private final Class117 aClass117_8 = new Class117(256);

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!eq;")
	private final Class97 aClass97_105;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "Lclient!eq;")
	private final Class97 aClass97_106;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	private final int anInt7587;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "[Lclient!lba;")
	private final Class199[] aClass199Array1;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!eq;)V")
	public Class249(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_105 = arg1;
		this.aClass97_106 = arg2;
		@Pc(22) Class2_Sub34 local22 = new Class2_Sub34(arg0.method2545(0, 0));
		this.anInt7587 = local22.method6884();
		this.aClass199Array1 = new Class199[this.anInt7587];
		for (@Pc(34) int local34 = 0; local34 < this.anInt7587; local34++) {
			if (local22.method6904() == 1) {
				this.aClass199Array1[local34] = new Class199();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anInt7587; local56++) {
			if (this.aClass199Array1[local56] != null) {
				this.aClass199Array1[local56].aBoolean427 = local22.method6904() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt7587; local85++) {
			if (this.aClass199Array1[local85] != null) {
				this.aClass199Array1[local85].aBoolean428 = local22.method6904() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < this.anInt7587; local113++) {
			if (this.aClass199Array1[local113] != null) {
				this.aClass199Array1[local113].aBoolean429 = local22.method6904() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < this.anInt7587; local139++) {
			if (this.aClass199Array1[local139] != null) {
				this.aClass199Array1[local139].aByte83 = local22.method6908();
			}
		}
		for (@Pc(164) int local164 = 0; local164 < this.anInt7587; local164++) {
			if (this.aClass199Array1[local164] != null) {
				this.aClass199Array1[local164].aByte84 = local22.method6908();
			}
		}
		for (@Pc(189) int local189 = 0; local189 < this.anInt7587; local189++) {
			if (this.aClass199Array1[local189] != null) {
				this.aClass199Array1[local189].aByte86 = local22.method6908();
			}
		}
		for (@Pc(210) int local210 = 0; local210 < this.anInt7587; local210++) {
			if (this.aClass199Array1[local210] != null) {
				this.aClass199Array1[local210].aByte82 = local22.method6908();
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.anInt7587; local231++) {
			if (this.aClass199Array1[local231] != null) {
				this.aClass199Array1[local231].aShort83 = (short) local22.method6884();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt7587; local253++) {
			if (this.aClass199Array1[local253] != null) {
				this.aClass199Array1[local253].aByte88 = local22.method6908();
			}
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt7587; local278++) {
			if (this.aClass199Array1[local278] != null) {
				this.aClass199Array1[local278].aByte87 = local22.method6908();
			}
		}
		for (@Pc(299) int local299 = 0; local299 < this.anInt7587; local299++) {
			if (this.aClass199Array1[local299] != null) {
				this.aClass199Array1[local299].aBoolean430 = local22.method6904() == 1;
			}
		}
		for (@Pc(331) int local331 = 0; local331 < this.anInt7587; local331++) {
			if (this.aClass199Array1[local331] != null) {
				this.aClass199Array1[local331].aBoolean431 = local22.method6904() == 1;
			}
		}
		for (@Pc(361) int local361 = 0; local361 < this.anInt7587; local361++) {
			if (this.aClass199Array1[local361] != null) {
				this.aClass199Array1[local361].aByte85 = local22.method6908();
			}
		}
		for (@Pc(382) int local382 = 0; local382 < this.anInt7587; local382++) {
			if (this.aClass199Array1[local382] != null) {
				this.aClass199Array1[local382].aBoolean426 = local22.method6904() == 1;
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt7587; local410++) {
			if (this.aClass199Array1[local410] != null) {
				this.aClass199Array1[local410].aBoolean425 = local22.method6904() == 1;
			}
		}
		for (@Pc(442) int local442 = 0; local442 < this.anInt7587; local442++) {
			if (this.aClass199Array1[local442] != null) {
				this.aClass199Array1[local442].aBoolean424 = local22.method6904() == 1;
			}
		}
		for (@Pc(474) int local474 = 0; local474 < this.anInt7587; local474++) {
			if (this.aClass199Array1[local474] != null) {
				this.aClass199Array1[local474].anInt5687 = local22.method6904();
			}
		}
		for (@Pc(495) int local495 = 0; local495 < this.anInt7587; local495++) {
			if (this.aClass199Array1[local495] != null) {
				this.aClass199Array1[local495].anInt5688 = local22.method6865();
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt7587; local520++) {
			if (this.aClass199Array1[local520] != null) {
				this.aClass199Array1[local520].anInt5691 = local22.method6904();
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
	@Override
	public int method6353() {
		return this.anInt7587;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)Lclient!rba;")
	private Class2_Sub5_Sub18 method6360(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5 local10 = this.aClass117_8.method3041((long) arg0);
		if (local10 != null) {
			return (Class2_Sub5_Sub18) local10;
		}
		@Pc(29) byte[] local29 = this.aClass97_105.method2570(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class2_Sub5_Sub18 local41 = new Class2_Sub5_Sub18(new Class2_Sub34(local29));
			this.aClass117_8.method3042((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Lclient!lba;")
	@Override
	public Class199 method6357(@OriginalArg(1) int arg0) {
		return this.aClass199Array1[arg0];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6355(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub18 local8 = this.method6360(arg0);
		return local8 != null && local8.method6848(this, this.aClass97_106);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(FIZIII)[I")
	@Override
	public int[] method6354(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method6360(arg3).method6845(this.aClass97_106, this.aClass199Array1[arg3].aBoolean431, (double) arg0, this, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZIBFI)[I")
	@Override
	public int[] method6358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method6360(arg1).method6846(arg0, this, (double) arg2, this.aClass199Array1[arg1].aBoolean431, this.aClass97_106, arg3);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIZFII)[F")
	@Override
	public float[] method6356(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method6360(arg0).method6847(this.aClass199Array1[arg0].aBoolean431, this.aClass97_106, arg3, this, arg2);
	}
}
