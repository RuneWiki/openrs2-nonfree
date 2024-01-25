import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class82 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!ek;")
	private Class67 aClass67_10;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public int anInt2101 = -1;

	static {
		new Class15("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!fh;)V")
	public void method1673(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5007();
			if (local13 == 0) {
				return;
			}
			this.method1674(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method1674(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString11 = arg0.method5015();
		} else if (arg1 == 2) {
			this.aString12 = arg0.method5015();
		} else {
			@Pc(26) int local26;
			@Pc(33) int local33;
			if (arg1 == 3) {
				local26 = arg0.method5007();
				this.anIntArrayArray25 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray25[local33][0] = arg0.method5028();
					this.anIntArrayArray25[local33][1] = arg0.method4997();
					this.anIntArrayArray25[local33][2] = arg0.method4997();
				}
			} else if (arg1 == 4) {
				local26 = arg0.method5007();
				this.anIntArrayArray27 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray27[local33][0] = arg0.method5028();
					this.anIntArrayArray27[local33][1] = arg0.method4997();
					this.anIntArrayArray27[local33][2] = arg0.method4997();
				}
			} else if (arg1 == 5) {
				arg0.method5028();
			} else if (arg1 == 6) {
				arg0.method5007();
			} else if (arg1 == 7) {
				arg0.method5007();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5007();
				} else if (arg1 == 10) {
					local26 = arg0.method5007();
					this.anIntArray166 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray166[local33] = arg0.method4997();
					}
				} else if (arg1 == 12) {
					arg0.method4997();
				} else if (arg1 == 13) {
					local26 = arg0.method5007();
					this.anIntArray163 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray163[local33] = arg0.method5028();
					}
				} else if (arg1 == 14) {
					local26 = arg0.method5007();
					this.anIntArrayArray26 = new int[local26][2];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArrayArray26[local33][0] = arg0.method5007();
						this.anIntArrayArray26[local33][1] = arg0.method5007();
					}
				} else if (arg1 == 15) {
					arg0.method5028();
				} else if (arg1 == 17) {
					this.anInt2101 = arg0.method5028();
				} else if (arg1 == 18) {
					local26 = arg0.method5007();
					this.aStringArray19 = new String[local26];
					this.anIntArray161 = new int[local26];
					this.anIntArray164 = new int[local26];
					this.anIntArray167 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray164[local33] = arg0.method4997();
						this.anIntArray167[local33] = arg0.method4997();
						this.anIntArray161[local33] = arg0.method4997();
						this.aStringArray19[local33] = arg0.method5038();
					}
				} else if (arg1 == 19) {
					local26 = arg0.method5007();
					this.anIntArray165 = new int[local26];
					this.aStringArray20 = new String[local26];
					this.anIntArray162 = new int[local26];
					this.anIntArray160 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray160[local33] = arg0.method4997();
						this.anIntArray162[local33] = arg0.method4997();
						this.anIntArray165[local33] = arg0.method4997();
						this.aStringArray20[local33] = arg0.method5038();
					}
				} else if (arg1 == 249) {
					local26 = arg0.method5007();
					if (this.aClass67_10 == null) {
						local33 = Static171.method2382(local26);
						this.aClass67_10 = new Class67(local33);
					}
					for (local33 = 0; local33 < local26; local33++) {
						@Pc(204) boolean local204 = arg0.method5007() == 1;
						@Pc(208) int local208 = arg0.method5008();
						@Pc(217) Class4 local217;
						if (local204) {
							local217 = new Class4_Sub38(arg0.method5038());
						} else {
							local217 = new Class4_Sub24(arg0.method4997());
						}
						this.aClass67_10.method1426(local217, (long) local208);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	public void method1675() {
		if (this.aString12 == null) {
			this.aString12 = this.aString11;
		}
	}
}
