import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class138 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!dj;")
	private Class43 aClass43_25;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray113;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljava/lang/String;")
	private String aString46;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray51;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray114;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray115;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public int anInt4329 = -1;

	static {
		new Class159("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!lf;BI)V")
	private void method3876(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString46 = arg0.method3404();
		} else if (arg1 == 2) {
			this.aString47 = arg0.method3404();
		} else {
			@Pc(28) int local28;
			@Pc(35) int local35;
			if (arg1 == 3) {
				local28 = arg0.method3440();
				this.anIntArrayArray113 = new int[local28][3];
				for (local35 = 0; local35 < local28; local35++) {
					this.anIntArrayArray113[local35][0] = arg0.method3401();
					this.anIntArrayArray113[local35][1] = arg0.method3418();
					this.anIntArrayArray113[local35][2] = arg0.method3418();
				}
			} else if (arg1 == 4) {
				local28 = arg0.method3440();
				this.anIntArrayArray115 = new int[local28][3];
				for (local35 = 0; local35 < local28; local35++) {
					this.anIntArrayArray115[local35][0] = arg0.method3401();
					this.anIntArrayArray115[local35][1] = arg0.method3418();
					this.anIntArrayArray115[local35][2] = arg0.method3418();
				}
			} else if (arg1 == 5) {
				arg0.method3401();
			} else if (arg1 == 6) {
				arg0.method3440();
			} else if (arg1 == 7) {
				arg0.method3440();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3440();
				} else if (arg1 == 10) {
					local28 = arg0.method3440();
					this.anIntArray373 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray373[local35] = arg0.method3418();
					}
				} else if (arg1 == 12) {
					arg0.method3418();
				} else if (arg1 == 13) {
					local28 = arg0.method3440();
					this.anIntArray371 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray371[local35] = arg0.method3401();
					}
				} else if (arg1 == 14) {
					local28 = arg0.method3440();
					this.anIntArrayArray114 = new int[local28][2];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArrayArray114[local35][0] = arg0.method3440();
						this.anIntArrayArray114[local35][1] = arg0.method3440();
					}
				} else if (arg1 == 15) {
					arg0.method3401();
				} else if (arg1 == 17) {
					this.anInt4329 = arg0.method3401();
				} else if (arg1 == 18) {
					local28 = arg0.method3440();
					this.anIntArray374 = new int[local28];
					this.anIntArray375 = new int[local28];
					this.aStringArray51 = new String[local28];
					this.anIntArray376 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray375[local35] = arg0.method3418();
						this.anIntArray376[local35] = arg0.method3418();
						this.anIntArray374[local35] = arg0.method3418();
						this.aStringArray51[local35] = arg0.method3446();
					}
				} else if (arg1 == 19) {
					local28 = arg0.method3440();
					this.anIntArray370 = new int[local28];
					this.anIntArray372 = new int[local28];
					this.anIntArray369 = new int[local28];
					this.aStringArray50 = new String[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray369[local35] = arg0.method3418();
						this.anIntArray370[local35] = arg0.method3418();
						this.anIntArray372[local35] = arg0.method3418();
						this.aStringArray50[local35] = arg0.method3446();
					}
				} else if (arg1 == 249) {
					local28 = arg0.method3440();
					if (this.aClass43_25 == null) {
						local35 = Static28.method5505(local28);
						this.aClass43_25 = new Class43(local35);
					}
					for (local35 = 0; local35 < local28; local35++) {
						@Pc(369) boolean local369 = arg0.method3440() == 1;
						@Pc(373) int local373 = arg0.method3442();
						@Pc(382) Class4 local382;
						if (local369) {
							local382 = new Class4_Sub26(arg0.method3446());
						} else {
							local382 = new Class4_Sub8(arg0.method3418());
						}
						this.aClass43_25.method1276(local382, (long) local373);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method3877(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method3876(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method3878() {
		if (this.aString47 == null) {
			this.aString47 = this.aString46;
		}
	}
}
