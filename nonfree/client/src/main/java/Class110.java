import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class110 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!qp;")
	private Class280 aClass280_17;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	public int anInt3073 = -1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method2823(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4225();
			if (local14 == 0) {
				return;
			}
			this.method2826(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method2826(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString26 = arg0.method4215();
		} else if (arg1 == 2) {
			this.aString27 = arg0.method4215();
		} else {
			@Pc(35) int local35;
			@Pc(42) int local42;
			if (arg1 == 3) {
				local35 = arg0.method4225();
				this.anIntArrayArray23 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray23[local42][0] = arg0.method4221();
					this.anIntArrayArray23[local42][1] = arg0.method4207();
					this.anIntArrayArray23[local42][2] = arg0.method4207();
				}
			} else if (arg1 == 4) {
				local35 = arg0.method4225();
				this.anIntArrayArray22 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray22[local42][0] = arg0.method4221();
					this.anIntArrayArray22[local42][1] = arg0.method4207();
					this.anIntArrayArray22[local42][2] = arg0.method4207();
				}
			} else if (arg1 == 5) {
				arg0.method4221();
			} else if (arg1 == 6) {
				arg0.method4225();
			} else if (arg1 == 7) {
				arg0.method4225();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4225();
				} else if (arg1 == 10) {
					local35 = arg0.method4225();
					this.anIntArray151 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray151[local42] = arg0.method4207();
					}
				} else if (arg1 == 12) {
					arg0.method4207();
				} else if (arg1 == 13) {
					local35 = arg0.method4225();
					this.anIntArray150 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray150[local42] = arg0.method4221();
					}
				} else if (arg1 == 14) {
					local35 = arg0.method4225();
					this.anIntArrayArray21 = new int[local35][2];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArrayArray21[local42][0] = arg0.method4225();
						this.anIntArrayArray21[local42][1] = arg0.method4225();
					}
				} else if (arg1 == 15) {
					arg0.method4221();
				} else if (arg1 == 17) {
					this.anInt3073 = arg0.method4221();
				} else if (arg1 == 18) {
					local35 = arg0.method4225();
					this.anIntArray156 = new int[local35];
					this.anIntArray154 = new int[local35];
					this.anIntArray157 = new int[local35];
					this.aStringArray11 = new String[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray154[local42] = arg0.method4207();
						this.anIntArray157[local42] = arg0.method4207();
						this.anIntArray156[local42] = arg0.method4207();
						this.aStringArray11[local42] = arg0.method4233();
					}
				} else if (arg1 == 19) {
					local35 = arg0.method4225();
					this.anIntArray152 = new int[local35];
					this.anIntArray153 = new int[local35];
					this.anIntArray155 = new int[local35];
					this.aStringArray12 = new String[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray155[local42] = arg0.method4207();
						this.anIntArray153[local42] = arg0.method4207();
						this.anIntArray152[local42] = arg0.method4207();
						this.aStringArray12[local42] = arg0.method4233();
					}
				} else if (arg1 == 249) {
					local35 = arg0.method4225();
					if (this.aClass280_17 == null) {
						local42 = Static109.method2234(local35);
						this.aClass280_17 = new Class280(local42);
					}
					for (local42 = 0; local42 < local35; local42++) {
						@Pc(392) boolean local392 = arg0.method4225() == 1;
						@Pc(396) int local396 = arg0.method4204();
						@Pc(407) Class3 local407;
						if (local392) {
							local407 = new Class3_Sub48(arg0.method4233());
						} else {
							local407 = new Class3_Sub19(arg0.method4207());
						}
						this.aClass280_17.method7109(local407, (long) local396);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
	public void method2828() {
		if (this.aString27 == null) {
			this.aString27 = this.aString26;
		}
	}
}
