import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class199 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
	private int[] anIntArray518;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35;

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "Lclient!qo;")
	private Class196 aClass196_34;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public int anInt5819 = -1;

	static {
		new Class242("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!tl;)V")
	public void method4496(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method4864();
			if (local20 == 0) {
				return;
			}
			this.method4503(arg0, local20);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method4498() {
		if (this.aString55 == null) {
			this.aString55 = this.aString54;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!tl;BI)V")
	private void method4503(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString54 = arg0.method4847();
		} else if (arg1 == 2) {
			this.aString55 = arg0.method4847();
		} else {
			@Pc(34) int local34;
			@Pc(41) int local41;
			if (arg1 == 3) {
				local34 = arg0.method4864();
				this.anIntArrayArray55 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray55[local41][0] = arg0.method4877();
					this.anIntArrayArray55[local41][1] = arg0.method4872();
					this.anIntArrayArray55[local41][2] = arg0.method4872();
				}
			} else if (arg1 == 4) {
				local34 = arg0.method4864();
				this.anIntArrayArray54 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray54[local41][0] = arg0.method4877();
					this.anIntArrayArray54[local41][1] = arg0.method4872();
					this.anIntArrayArray54[local41][2] = arg0.method4872();
				}
			} else if (arg1 == 5) {
				arg0.method4877();
			} else if (arg1 == 6) {
				arg0.method4864();
			} else if (arg1 == 7) {
				arg0.method4864();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4864();
				} else if (arg1 == 10) {
					local34 = arg0.method4864();
					this.anIntArray517 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray517[local41] = arg0.method4872();
					}
				} else if (arg1 == 12) {
					arg0.method4872();
				} else if (arg1 == 13) {
					local34 = arg0.method4864();
					this.anIntArray512 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray512[local41] = arg0.method4877();
					}
				} else if (arg1 == 14) {
					local34 = arg0.method4864();
					this.anIntArrayArray53 = new int[local34][2];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArrayArray53[local41][0] = arg0.method4864();
						this.anIntArrayArray53[local41][1] = arg0.method4864();
					}
				} else if (arg1 == 15) {
					arg0.method4877();
				} else if (arg1 == 17) {
					this.anInt5819 = arg0.method4877();
				} else if (arg1 == 18) {
					local34 = arg0.method4864();
					this.anIntArray515 = new int[local34];
					this.anIntArray519 = new int[local34];
					this.aStringArray36 = new String[local34];
					this.anIntArray518 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray515[local41] = arg0.method4872();
						this.anIntArray518[local41] = arg0.method4872();
						this.anIntArray519[local41] = arg0.method4872();
						this.aStringArray36[local41] = arg0.method4867();
					}
				} else if (arg1 == 19) {
					local34 = arg0.method4864();
					this.anIntArray516 = new int[local34];
					this.aStringArray35 = new String[local34];
					this.anIntArray514 = new int[local34];
					this.anIntArray513 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray513[local41] = arg0.method4872();
						this.anIntArray516[local41] = arg0.method4872();
						this.anIntArray514[local41] = arg0.method4872();
						this.aStringArray35[local41] = arg0.method4867();
					}
				} else if (arg1 == 249) {
					local34 = arg0.method4864();
					if (this.aClass196_34 == null) {
						local41 = Static183.method2711(local34);
						this.aClass196_34 = new Class196(local41);
					}
					for (local41 = 0; local41 < local34; local41++) {
						@Pc(413) boolean local413 = arg0.method4864() == 1;
						@Pc(417) int local417 = arg0.method4887();
						@Pc(426) Class4 local426;
						if (local413) {
							local426 = new Class4_Sub25(arg0.method4867());
						} else {
							local426 = new Class4_Sub15(arg0.method4872());
						}
						this.aClass196_34.method4474((long) local417, local426);
					}
				}
			}
		}
	}
}
