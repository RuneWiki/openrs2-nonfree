import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class160 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!ke;")
	private Class137 aClass137_26;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public int anInt4056 = -1;

	static {
		new Class231("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3707(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3111();
			if (local15 == 0) {
				return;
			}
			this.method3709(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public void method3708() {
		if (this.aString35 == null) {
			this.aString35 = this.aString36;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method3709(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString36 = arg0.method3130();
		} else if (arg1 == 2) {
			this.aString35 = arg0.method3130();
		} else {
			@Pc(30) int local30;
			@Pc(37) int local37;
			if (arg1 == 3) {
				local30 = arg0.method3111();
				this.anIntArrayArray36 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray36[local37][0] = arg0.method3108();
					this.anIntArrayArray36[local37][1] = arg0.method3109();
					this.anIntArrayArray36[local37][2] = arg0.method3109();
				}
			} else if (arg1 == 4) {
				local30 = arg0.method3111();
				this.anIntArrayArray34 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray34[local37][0] = arg0.method3108();
					this.anIntArrayArray34[local37][1] = arg0.method3109();
					this.anIntArrayArray34[local37][2] = arg0.method3109();
				}
			} else if (arg1 == 5) {
				arg0.method3108();
			} else if (arg1 == 6) {
				arg0.method3111();
			} else if (arg1 == 7) {
				arg0.method3111();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3111();
				} else if (arg1 == 10) {
					local30 = arg0.method3111();
					this.anIntArray360 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray360[local37] = arg0.method3109();
					}
				} else if (arg1 == 12) {
					arg0.method3109();
				} else if (arg1 == 13) {
					local30 = arg0.method3111();
					this.anIntArray364 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray364[local37] = arg0.method3108();
					}
				} else if (arg1 == 14) {
					local30 = arg0.method3111();
					this.anIntArrayArray35 = new int[local30][2];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArrayArray35[local37][0] = arg0.method3111();
						this.anIntArrayArray35[local37][1] = arg0.method3111();
					}
				} else if (arg1 == 15) {
					arg0.method3108();
				} else if (arg1 == 17) {
					this.anInt4056 = arg0.method3108();
				} else if (arg1 == 18) {
					local30 = arg0.method3111();
					this.anIntArray359 = new int[local30];
					this.anIntArray365 = new int[local30];
					this.aStringArray26 = new String[local30];
					this.anIntArray361 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray359[local37] = arg0.method3109();
						this.anIntArray365[local37] = arg0.method3109();
						this.anIntArray361[local37] = arg0.method3109();
						this.aStringArray26[local37] = arg0.method3093();
					}
				} else if (arg1 == 19) {
					local30 = arg0.method3111();
					this.aStringArray25 = new String[local30];
					this.anIntArray363 = new int[local30];
					this.anIntArray362 = new int[local30];
					this.anIntArray366 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray366[local37] = arg0.method3109();
						this.anIntArray362[local37] = arg0.method3109();
						this.anIntArray363[local37] = arg0.method3109();
						this.aStringArray25[local37] = arg0.method3093();
					}
				} else if (arg1 == 249) {
					local30 = arg0.method3111();
					if (this.aClass137_26 == null) {
						local37 = Static420.method5696(local30);
						this.aClass137_26 = new Class137(local37);
					}
					for (local37 = 0; local37 < local30; local37++) {
						@Pc(352) boolean local352 = arg0.method3111() == 1;
						@Pc(358) int local358 = arg0.method3078();
						@Pc(367) Class6 local367;
						if (local352) {
							local367 = new Class6_Sub11(arg0.method3093());
						} else {
							local367 = new Class6_Sub44(arg0.method3109());
						}
						this.aClass137_26.method3179((long) local358, local367);
					}
				}
			}
		}
	}
}
