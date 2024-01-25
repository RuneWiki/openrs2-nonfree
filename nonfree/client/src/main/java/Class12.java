import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class12 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Lclient!kea;")
	private Class187 aClass187_2;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
	public int anInt206 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method152() {
		if (this.aString6 == null) {
			this.aString6 = this.aString5;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!mo;I)V")
	private void method153(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString5 = arg0.method5798();
		} else if (arg1 == 2) {
			this.aString6 = arg0.method5798();
		} else {
			@Pc(64) int local64;
			@Pc(70) int local70;
			if (arg1 == 3) {
				local64 = arg0.method5750();
				this.anIntArrayArray9 = new int[local64][3];
				for (local70 = 0; local70 < local64; local70++) {
					this.anIntArrayArray9[local70][0] = arg0.method5771();
					this.anIntArrayArray9[local70][1] = arg0.method5804();
					this.anIntArrayArray9[local70][2] = arg0.method5804();
				}
			} else if (arg1 == 4) {
				local64 = arg0.method5750();
				this.anIntArrayArray10 = new int[local64][3];
				for (local70 = 0; local70 < local64; local70++) {
					this.anIntArrayArray10[local70][0] = arg0.method5771();
					this.anIntArrayArray10[local70][1] = arg0.method5804();
					this.anIntArrayArray10[local70][2] = arg0.method5804();
				}
			} else if (arg1 == 5) {
				arg0.method5771();
			} else if (arg1 == 6) {
				arg0.method5750();
			} else if (arg1 == 7) {
				arg0.method5750();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5750();
				} else if (arg1 == 10) {
					local64 = arg0.method5750();
					this.anIntArray15 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray15[local70] = arg0.method5804();
					}
				} else if (arg1 == 12) {
					arg0.method5804();
				} else if (arg1 == 13) {
					local64 = arg0.method5750();
					this.anIntArray21 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray21[local70] = arg0.method5771();
					}
				} else if (arg1 == 14) {
					local64 = arg0.method5750();
					this.anIntArrayArray11 = new int[local64][2];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArrayArray11[local70][0] = arg0.method5750();
						this.anIntArrayArray11[local70][1] = arg0.method5750();
					}
				} else if (arg1 == 15) {
					arg0.method5771();
				} else if (arg1 == 17) {
					this.anInt206 = arg0.method5771();
				} else if (arg1 == 18) {
					local64 = arg0.method5750();
					this.aStringArray2 = new String[local64];
					this.anIntArray17 = new int[local64];
					this.anIntArray16 = new int[local64];
					this.anIntArray22 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray16[local70] = arg0.method5804();
						this.anIntArray17[local70] = arg0.method5804();
						this.anIntArray22[local70] = arg0.method5804();
						this.aStringArray2[local70] = arg0.method5760();
					}
				} else if (arg1 == 19) {
					local64 = arg0.method5750();
					this.aStringArray1 = new String[local64];
					this.anIntArray19 = new int[local64];
					this.anIntArray20 = new int[local64];
					this.anIntArray18 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray20[local70] = arg0.method5804();
						this.anIntArray19[local70] = arg0.method5804();
						this.anIntArray18[local70] = arg0.method5804();
						this.aStringArray1[local70] = arg0.method5760();
					}
				} else if (arg1 == 249) {
					local64 = arg0.method5750();
					if (this.aClass187_2 == null) {
						local70 = Static457.method6299(local64);
						this.aClass187_2 = new Class187(local70);
					}
					for (local70 = 0; local70 < local64; local70++) {
						@Pc(220) boolean local220 = arg0.method5750() == 1;
						@Pc(224) int local224 = arg0.method5797();
						@Pc(233) Class1 local233;
						if (local220) {
							local233 = new Class1_Sub3(arg0.method5760());
						} else {
							local233 = new Class1_Sub13(arg0.method5804());
						}
						this.aClass187_2.method3795(local233, (long) local224);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method154(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5750();
			if (local12 == 0) {
				return;
			}
			this.method153(arg0, local12);
		}
	}
}
