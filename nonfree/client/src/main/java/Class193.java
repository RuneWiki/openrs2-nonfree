import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class193 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray60;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "Lclient!tm;")
	private Class197 aClass197_28;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray61;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
	public int anInt5817 = -1;

	static {
		new Class34("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method4974(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4532();
			if (local13 == 0) {
				return;
			}
			this.method4978(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!bg;IZ)V")
	private void method4978(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString58 = arg0.method4540();
		} else if (arg1 == 2) {
			this.aString57 = arg0.method4540();
		} else {
			@Pc(29) int local29;
			@Pc(36) int local36;
			if (arg1 == 3) {
				local29 = arg0.method4532();
				this.anIntArrayArray57 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray57[local36][0] = arg0.method4556();
					this.anIntArrayArray57[local36][1] = arg0.method4545();
					this.anIntArrayArray57[local36][2] = arg0.method4545();
				}
			} else if (arg1 == 4) {
				local29 = arg0.method4532();
				this.anIntArrayArray59 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray59[local36][0] = arg0.method4556();
					this.anIntArrayArray59[local36][1] = arg0.method4545();
					this.anIntArrayArray59[local36][2] = arg0.method4545();
				}
			} else if (arg1 == 5) {
				arg0.method4556();
			} else if (arg1 == 6) {
				arg0.method4532();
			} else if (arg1 == 7) {
				arg0.method4532();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4532();
				} else if (arg1 == 10) {
					local29 = arg0.method4532();
					this.anIntArray484 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray484[local36] = arg0.method4545();
					}
				} else if (arg1 == 12) {
					arg0.method4545();
				} else if (arg1 == 13) {
					local29 = arg0.method4532();
					this.anIntArray491 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray491[local36] = arg0.method4556();
					}
				} else if (arg1 == 14) {
					local29 = arg0.method4532();
					this.anIntArrayArray58 = new int[local29][2];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArrayArray58[local36][0] = arg0.method4532();
						this.anIntArrayArray58[local36][1] = arg0.method4532();
					}
				} else if (arg1 == 15) {
					arg0.method4556();
				} else if (arg1 == 17) {
					this.anInt5817 = arg0.method4556();
				} else if (arg1 == 18) {
					local29 = arg0.method4532();
					this.aStringArray61 = new String[local29];
					this.anIntArray488 = new int[local29];
					this.anIntArray490 = new int[local29];
					this.anIntArray487 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray490[local36] = arg0.method4545();
						this.anIntArray488[local36] = arg0.method4545();
						this.anIntArray487[local36] = arg0.method4545();
						this.aStringArray61[local36] = arg0.method4534();
					}
				} else if (arg1 == 19) {
					local29 = arg0.method4532();
					this.anIntArray489 = new int[local29];
					this.anIntArray486 = new int[local29];
					this.aStringArray60 = new String[local29];
					this.anIntArray485 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray486[local36] = arg0.method4545();
						this.anIntArray485[local36] = arg0.method4545();
						this.anIntArray489[local36] = arg0.method4545();
						this.aStringArray60[local36] = arg0.method4534();
					}
				} else if (arg1 == 249) {
					local29 = arg0.method4532();
					if (this.aClass197_28 == null) {
						local36 = Static194.method3745(local29);
						this.aClass197_28 = new Class197(local36);
					}
					for (local36 = 0; local36 < local29; local36++) {
						@Pc(345) boolean local345 = arg0.method4532() == 1;
						@Pc(349) int local349 = arg0.method4514();
						@Pc(358) Class1 local358;
						if (local345) {
							local358 = new Class1_Sub31(arg0.method4534());
						} else {
							local358 = new Class1_Sub13(arg0.method4545());
						}
						this.aClass197_28.method5166(local358, (long) local349);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	public void method4980() {
		if (this.aString57 == null) {
			this.aString57 = this.aString58;
		}
	}
}
