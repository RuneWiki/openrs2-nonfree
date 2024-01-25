import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class95 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!wh;")
	private Class356 aClass356_9;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public int anInt2637 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!io;Z)V")
	public void method2234(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(22) int local22 = arg0.method4393();
			if (local22 == 0) {
				return;
			}
			this.method2235(arg0, local22);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!io;II)V")
	private void method2235(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString27 = arg0.method4395();
		} else if (arg1 == 2) {
			this.aString26 = arg0.method4395();
		} else {
			@Pc(71) int local71;
			@Pc(77) int local77;
			if (arg1 == 3) {
				local71 = arg0.method4393();
				this.anIntArrayArray21 = new int[local71][3];
				for (local77 = 0; local77 < local71; local77++) {
					this.anIntArrayArray21[local77][0] = arg0.method4426();
					this.anIntArrayArray21[local77][1] = arg0.method4371();
					this.anIntArrayArray21[local77][2] = arg0.method4371();
				}
			} else if (arg1 == 4) {
				local71 = arg0.method4393();
				this.anIntArrayArray23 = new int[local71][3];
				for (local77 = 0; local77 < local71; local77++) {
					this.anIntArrayArray23[local77][0] = arg0.method4426();
					this.anIntArrayArray23[local77][1] = arg0.method4371();
					this.anIntArrayArray23[local77][2] = arg0.method4371();
				}
			} else if (arg1 == 5) {
				arg0.method4426();
			} else if (arg1 == 6) {
				arg0.method4393();
			} else if (arg1 == 7) {
				arg0.method4393();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4393();
				} else if (arg1 == 10) {
					local71 = arg0.method4393();
					this.anIntArray160 = new int[local71];
					for (local77 = 0; local77 < local71; local77++) {
						this.anIntArray160[local77] = arg0.method4371();
					}
				} else if (arg1 == 12) {
					arg0.method4371();
				} else if (arg1 == 13) {
					local71 = arg0.method4393();
					this.anIntArray165 = new int[local71];
					for (local77 = 0; local77 < local71; local77++) {
						this.anIntArray165[local77] = arg0.method4426();
					}
				} else if (arg1 == 14) {
					local71 = arg0.method4393();
					this.anIntArrayArray22 = new int[local71][2];
					for (local77 = 0; local77 < local71; local77++) {
						this.anIntArrayArray22[local77][0] = arg0.method4393();
						this.anIntArrayArray22[local77][1] = arg0.method4393();
					}
				} else if (arg1 == 15) {
					arg0.method4426();
				} else if (arg1 == 17) {
					this.anInt2637 = arg0.method4426();
				} else if (arg1 == 18) {
					local71 = arg0.method4393();
					this.aStringArray13 = new String[local71];
					this.anIntArray159 = new int[local71];
					this.anIntArray163 = new int[local71];
					this.anIntArray167 = new int[local71];
					for (local77 = 0; local77 < local71; local77++) {
						this.anIntArray163[local77] = arg0.method4371();
						this.anIntArray167[local77] = arg0.method4371();
						this.anIntArray159[local77] = arg0.method4371();
						this.aStringArray13[local77] = arg0.method4388();
					}
				} else if (arg1 == 19) {
					local71 = arg0.method4393();
					this.anIntArray161 = new int[local71];
					this.anIntArray166 = new int[local71];
					this.aStringArray12 = new String[local71];
					this.anIntArray164 = new int[local71];
					for (local77 = 0; local77 < local71; local77++) {
						this.anIntArray164[local77] = arg0.method4371();
						this.anIntArray166[local77] = arg0.method4371();
						this.anIntArray161[local77] = arg0.method4371();
						this.aStringArray12[local77] = arg0.method4388();
					}
				} else if (arg1 == 249) {
					local71 = arg0.method4393();
					if (this.aClass356_9 == null) {
						local77 = Static200.method3428(local71);
						this.aClass356_9 = new Class356(local77);
					}
					for (local77 = 0; local77 < local71; local77++) {
						@Pc(200) boolean local200 = arg0.method4393() == 1;
						@Pc(204) int local204 = arg0.method4396();
						@Pc(213) Class1 local213;
						if (local200) {
							local213 = new Class1_Sub26(arg0.method4388());
						} else {
							local213 = new Class1_Sub32(arg0.method4371());
						}
						this.aClass356_9.method7800((long) local204, local213);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method2237() {
		if (this.aString26 == null) {
			this.aString26 = this.aString27;
		}
	}
}
