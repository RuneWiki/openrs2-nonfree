import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class238 implements Interface4 {

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!dg;")
	private final Class54 aClass54_37 = new Class54(256);

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!oi;")
	private final Class185 aClass185_104;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_105;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	private final int anInt6308;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "[Lclient!bb;")
	private final Class25[] aClass25Array1;

	static {
		new Class142("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V")
	public Class238(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_104 = arg2;
		this.aClass185_105 = arg1;
		@Pc(24) Class1_Sub19 local24 = new Class1_Sub19(arg0.method4002(0, 0));
		this.anInt6308 = local24.method2896();
		this.aClass25Array1 = new Class25[this.anInt6308];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6308; local36++) {
			if (local24.method2915() == 1) {
				this.aClass25Array1[local36] = new Class25();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt6308; local57++) {
			if (this.aClass25Array1[local57] != null) {
				this.aClass25Array1[local57].aBoolean60 = local24.method2915() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt6308; local90++) {
			if (this.aClass25Array1[local90] != null) {
				this.aClass25Array1[local90].aBoolean56 = local24.method2915() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt6308; local121++) {
			if (this.aClass25Array1[local121] != null) {
				this.aClass25Array1[local121].aBoolean54 = local24.method2915() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt6308; local152++) {
			if (this.aClass25Array1[local152] != null) {
				this.aClass25Array1[local152].aBoolean57 = local24.method2915() == 1;
			}
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt6308; local181++) {
			if (this.aClass25Array1[local181] != null) {
				this.aClass25Array1[local181].aByte7 = local24.method2917();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt6308; local203++) {
			if (this.aClass25Array1[local203] != null) {
				this.aClass25Array1[local203].aByte12 = local24.method2917();
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt6308; local225++) {
			if (this.aClass25Array1[local225] != null) {
				this.aClass25Array1[local225].aByte11 = local24.method2917();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt6308; local247++) {
			if (this.aClass25Array1[local247] != null) {
				this.aClass25Array1[local247].aByte10 = local24.method2917();
			}
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt6308; local269++) {
			if (this.aClass25Array1[local269] != null) {
				this.aClass25Array1[local269].aShort16 = (short) local24.method2896();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < this.anInt6308; local292++) {
			if (this.aClass25Array1[local292] != null) {
				this.aClass25Array1[local292].aByte8 = local24.method2917();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < this.anInt6308; local318++) {
			if (this.aClass25Array1[local318] != null) {
				this.aClass25Array1[local318].aByte13 = local24.method2917();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt6308; local344++) {
			if (this.aClass25Array1[local344] != null) {
				this.aClass25Array1[local344].aBoolean61 = local24.method2915() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt6308; local375++) {
			if (this.aClass25Array1[local375] != null) {
				this.aClass25Array1[local375].aBoolean62 = local24.method2915() == 1;
			}
		}
		for (@Pc(402) int local402 = 0; local402 < this.anInt6308; local402++) {
			if (this.aClass25Array1[local402] != null) {
				this.aClass25Array1[local402].aByte9 = local24.method2917();
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt6308; local428++) {
			if (this.aClass25Array1[local428] != null) {
				this.aClass25Array1[local428].aBoolean59 = local24.method2915() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt6308; local455++) {
			if (this.aClass25Array1[local455] != null) {
				this.aClass25Array1[local455].aBoolean55 = local24.method2915() == 1;
			}
		}
		for (@Pc(486) int local486 = 0; local486 < this.anInt6308; local486++) {
			if (this.aClass25Array1[local486] != null) {
				this.aClass25Array1[local486].aBoolean58 = local24.method2915() == 1;
			}
		}
		for (@Pc(519) int local519 = 0; local519 < this.anInt6308; local519++) {
			if (this.aClass25Array1[local519] != null) {
				this.aClass25Array1[local519].anInt355 = local24.method2915();
			}
		}
		for (@Pc(545) int local545 = 0; local545 < this.anInt6308; local545++) {
			if (this.aClass25Array1[local545] != null) {
				this.aClass25Array1[local545].anInt356 = local24.method2877();
			}
		}
		for (@Pc(571) int local571 = 0; local571 < this.anInt6308; local571++) {
			if (this.aClass25Array1[local571] != null) {
				this.aClass25Array1[local571].aBoolean53 = local24.method2915() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method5086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method5093(arg1).method4472(arg0, arg2, this, (double) arg3, this.aClass185_104, this.aClass25Array1[arg1].aBoolean62);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIFZI)[I")
	@Override
	public int[] method5088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method5093(arg1).method4473(arg4, this.aClass185_104, arg0, arg3, this, (double) arg2, this.aClass25Array1[arg1].aBoolean62);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Lclient!qo;")
	private Class1_Sub3_Sub15 method5093(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3 local10 = this.aClass54_37.method922((long) arg0);
		if (local10 != null) {
			return (Class1_Sub3_Sub15) local10;
		}
		@Pc(21) byte[] local21 = this.aClass185_105.method3997(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class1_Sub3_Sub15 local33 = new Class1_Sub3_Sub15(new Class1_Sub19(local21));
			this.aClass54_37.method920(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)Lclient!bb;")
	@Override
	public Class25 method5090(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIZFII)[F")
	@Override
	public float[] method5087(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method5093(arg3).method4471(arg2, this.aClass185_104, this, arg0, this.aClass25Array1[arg3].aBoolean62);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5089(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub15 local8 = this.method5093(arg0);
		return local8 != null && local8.method4475(this, this.aClass185_104);
	}
}
