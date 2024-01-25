import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class205 implements Interface5 {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!vq;")
	private final Class260 aClass260_4 = new Class260(256);

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Lclient!qn;")
	private final Class211 aClass211_77;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_76;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "[Lclient!hi;")
	private final Class112[] aClass112Array1;

	static {
		new Class15("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
		new Class15("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!qn;Lclient!qn;Lclient!qn;)V")
	public Class205(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_77 = arg1;
		this.aClass211_76 = arg2;
		@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0.method4377(0, 0));
		@Pc(28) int local28 = local24.method5028();
		this.aClass112Array1 = new Class112[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5007() == 1) {
				this.aClass112Array1[local34] = new Class112();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass112Array1[local56] != null) {
				this.aClass112Array1[local56].aBoolean189 = local24.method5007() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < local28; local85++) {
			if (this.aClass112Array1[local85] != null) {
				this.aClass112Array1[local85].aBoolean194 = local24.method5007() == 1;
			}
		}
		for (@Pc(115) int local115 = 0; local115 < local28; local115++) {
			if (this.aClass112Array1[local115] != null) {
				this.aClass112Array1[local115].aBoolean188 = local24.method5007() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < local28; local145++) {
			if (this.aClass112Array1[local145] != null) {
				this.aClass112Array1[local145].aBoolean192 = local24.method5007() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < local28; local177++) {
			if (this.aClass112Array1[local177] != null) {
				this.aClass112Array1[local177].aByte53 = local24.method5063();
			}
		}
		for (@Pc(198) int local198 = 0; local198 < local28; local198++) {
			if (this.aClass112Array1[local198] != null) {
				this.aClass112Array1[local198].aByte51 = local24.method5063();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < local28; local223++) {
			if (this.aClass112Array1[local223] != null) {
				this.aClass112Array1[local223].aByte57 = local24.method5063();
			}
		}
		for (@Pc(244) int local244 = 0; local244 < local28; local244++) {
			if (this.aClass112Array1[local244] != null) {
				this.aClass112Array1[local244].aByte55 = local24.method5063();
			}
		}
		for (@Pc(269) int local269 = 0; local269 < local28; local269++) {
			if (this.aClass112Array1[local269] != null) {
				this.aClass112Array1[local269].aShort41 = (short) local24.method5028();
			}
		}
		for (@Pc(295) int local295 = 0; local295 < local28; local295++) {
			if (this.aClass112Array1[local295] != null) {
				this.aClass112Array1[local295].aByte56 = local24.method5063();
			}
		}
		for (@Pc(320) int local320 = 0; local320 < local28; local320++) {
			if (this.aClass112Array1[local320] != null) {
				this.aClass112Array1[local320].aByte54 = local24.method5063();
			}
		}
		for (@Pc(341) int local341 = 0; local341 < local28; local341++) {
			if (this.aClass112Array1[local341] != null) {
				this.aClass112Array1[local341].aBoolean196 = local24.method5007() == 1;
			}
		}
		for (@Pc(369) int local369 = 0; local369 < local28; local369++) {
			if (this.aClass112Array1[local369] != null) {
				this.aClass112Array1[local369].aBoolean190 = local24.method5007() == 1;
			}
		}
		for (@Pc(397) int local397 = 0; local397 < local28; local397++) {
			if (this.aClass112Array1[local397] != null) {
				this.aClass112Array1[local397].aByte52 = local24.method5063();
			}
		}
		for (@Pc(422) int local422 = 0; local422 < local28; local422++) {
			if (this.aClass112Array1[local422] != null) {
				this.aClass112Array1[local422].aBoolean195 = local24.method5007() == 1;
			}
		}
		for (@Pc(448) int local448 = 0; local448 < local28; local448++) {
			if (this.aClass112Array1[local448] != null) {
				this.aClass112Array1[local448].aBoolean191 = local24.method5007() == 1;
			}
		}
		for (@Pc(474) int local474 = 0; local474 < local28; local474++) {
			if (this.aClass112Array1[local474] != null) {
				this.aClass112Array1[local474].aBoolean193 = local24.method5007() == 1;
			}
		}
		for (@Pc(506) int local506 = 0; local506 < local28; local506++) {
			if (this.aClass112Array1[local506] != null) {
				this.aClass112Array1[local506].anInt2731 = local24.method5007();
			}
		}
		for (@Pc(531) int local531 = 0; local531 < local28; local531++) {
			if (this.aClass112Array1[local531] != null) {
				this.aClass112Array1[local531].anInt2729 = local24.method4997();
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IFIBZI)[I")
	@Override
	public int[] method4077(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method4083(arg3).method3800(this, arg2, (double) arg1, this.aClass211_76, this.aClass112Array1[arg3].aBoolean190, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method4078(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4083(arg4).method3795(this, arg1, arg3, (double) arg2, this.aClass112Array1[arg4].aBoolean190, arg0, this.aClass211_76);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZIIIF)[F")
	@Override
	public float[] method4076(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method4083(arg2).method3798(arg1, this.aClass112Array1[arg2].aBoolean190, this.aClass211_76, arg0, this);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Lclient!hi;")
	@Override
	public Class112 method4079(@OriginalArg(0) int arg0) {
		return this.aClass112Array1[arg0];
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Lclient!op;")
	private Class4_Sub2_Sub14 method4083(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2 local10 = this.aClass260_4.method5744((long) arg0);
		if (local10 != null) {
			return (Class4_Sub2_Sub14) local10;
		}
		@Pc(26) byte[] local26 = this.aClass211_77.method4353(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class4_Sub2_Sub14 local38 = new Class4_Sub2_Sub14(new Class4_Sub9(local26));
			this.aClass260_4.method5746(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4075(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub14 local16 = this.method4083(arg0);
		return local16 != null && local16.method3796(this.aClass211_76, this);
	}
}
