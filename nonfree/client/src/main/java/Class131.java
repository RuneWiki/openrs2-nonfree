import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class131 {

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!lba;")
	private Class218 aClass218_13;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public int anInt3147 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public void method2754() {
		if (this.aString32 == null) {
			this.aString32 = this.aString33;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!et;)V")
	public void method2755(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8581(-17416);
			if (local14 == 0) {
				return;
			}
			this.method2757(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!et;B)V")
	private void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString33 = arg1.method8537();
		} else if (arg0 == 2) {
			this.aString32 = arg1.method8537();
		} else {
			@Pc(92) int local92;
			@Pc(98) int local98;
			if (arg0 == 3) {
				local92 = arg1.method8581(-17416);
				this.anIntArrayArray21 = new int[local92][3];
				for (local98 = 0; local98 < local92; local98++) {
					this.anIntArrayArray21[local98][0] = arg1.method8575();
					this.anIntArrayArray21[local98][1] = arg1.method8555(-9372);
					this.anIntArrayArray21[local98][2] = arg1.method8555(-9372);
				}
			} else if (arg0 == 4) {
				local92 = arg1.method8581(-17416);
				this.anIntArrayArray23 = new int[local92][3];
				for (local98 = 0; local98 < local92; local98++) {
					this.anIntArrayArray23[local98][0] = arg1.method8575();
					this.anIntArrayArray23[local98][1] = arg1.method8555(-9372);
					this.anIntArrayArray23[local98][2] = arg1.method8555(-9372);
				}
			} else if (arg0 == 5) {
				arg1.method8575();
			} else if (arg0 == 6) {
				arg1.method8581(-17416);
			} else if (arg0 == 7) {
				arg1.method8581(-17416);
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method8581(-17416);
				} else if (arg0 == 10) {
					local92 = arg1.method8581(-17416);
					this.anIntArray251 = new int[local92];
					for (local98 = 0; local98 < local92; local98++) {
						this.anIntArray251[local98] = arg1.method8555(-9372);
					}
				} else if (arg0 == 12) {
					arg1.method8555(-9372);
				} else if (arg0 == 13) {
					local92 = arg1.method8581(-17416);
					this.anIntArray249 = new int[local92];
					for (local98 = 0; local98 < local92; local98++) {
						this.anIntArray249[local98] = arg1.method8575();
					}
				} else if (arg0 == 14) {
					local92 = arg1.method8581(-17416);
					this.anIntArrayArray22 = new int[local92][2];
					for (local98 = 0; local98 < local92; local98++) {
						this.anIntArrayArray22[local98][0] = arg1.method8581(-17416);
						this.anIntArrayArray22[local98][1] = arg1.method8581(-17416);
					}
				} else if (arg0 == 15) {
					arg1.method8575();
				} else if (arg0 == 17) {
					this.anInt3147 = arg1.method8575();
				} else if (arg0 == 18) {
					local92 = arg1.method8581(-17416);
					this.aStringArray13 = new String[local92];
					this.anIntArray250 = new int[local92];
					this.anIntArray252 = new int[local92];
					this.anIntArray245 = new int[local92];
					for (local98 = 0; local98 < local92; local98++) {
						this.anIntArray250[local98] = arg1.method8555(-9372);
						this.anIntArray245[local98] = arg1.method8555(-9372);
						this.anIntArray252[local98] = arg1.method8555(-9372);
						this.aStringArray13[local98] = arg1.method8553();
					}
				} else if (arg0 == 19) {
					local92 = arg1.method8581(-17416);
					this.anIntArray247 = new int[local92];
					this.aStringArray14 = new String[local92];
					this.anIntArray246 = new int[local92];
					this.anIntArray248 = new int[local92];
					for (local98 = 0; local98 < local92; local98++) {
						this.anIntArray247[local98] = arg1.method8555(-9372);
						this.anIntArray246[local98] = arg1.method8555(-9372);
						this.anIntArray248[local98] = arg1.method8555(-9372);
						this.aStringArray14[local98] = arg1.method8553();
					}
				} else if (arg0 == 249) {
					local92 = arg1.method8581(-17416);
					if (this.aClass218_13 == null) {
						local98 = Static330.method4577(local92);
						this.aClass218_13 = new Class218(local98);
					}
					for (local98 = 0; local98 < local92; local98++) {
						@Pc(320) boolean local320 = arg1.method8581(-17416) == 1;
						@Pc(324) int local324 = arg1.method8583();
						@Pc(333) Class2 local333;
						if (local320) {
							local333 = new Class2_Sub47(arg1.method8553());
						} else {
							local333 = new Class2_Sub2(arg1.method8555(-9372));
						}
						this.aClass218_13.method5099(local333, (long) local324);
					}
				}
			}
		}
	}
}
