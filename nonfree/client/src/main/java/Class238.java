import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class238 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "[I")
	private int[] anIntArray641;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
	private int[] anIntArray642;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
	private int[] anIntArray643;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
	private int[] anIntArray644;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "[I")
	private int[] anIntArray645;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!mn;")
	private Class167 aClass167_30;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray51;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "[I")
	private int[] anIntArray646;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
	private int[] anIntArray647;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
	private int[] anIntArray648;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public int anInt6654 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!nn;)V")
	public void method5215(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2502();
			if (local13 == 0) {
				return;
			}
			this.method5219(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public void method5216() {
		if (this.aString64 == null) {
			this.aString64 = this.aString63;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!nn;B)V")
	private void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString63 = arg1.method2482();
		} else if (arg0 == 2) {
			this.aString64 = arg1.method2482();
		} else {
			@Pc(30) int local30;
			@Pc(37) int local37;
			if (arg0 == 3) {
				local30 = arg1.method2502();
				this.anIntArrayArray61 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray61[local37][0] = arg1.method2485();
					this.anIntArrayArray61[local37][1] = arg1.method2459();
					this.anIntArrayArray61[local37][2] = arg1.method2459();
				}
			} else if (arg0 == 4) {
				local30 = arg1.method2502();
				this.anIntArrayArray62 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray62[local37][0] = arg1.method2485();
					this.anIntArrayArray62[local37][1] = arg1.method2459();
					this.anIntArrayArray62[local37][2] = arg1.method2459();
				}
			} else if (arg0 == 5) {
				arg1.method2485();
			} else if (arg0 == 6) {
				arg1.method2502();
			} else if (arg0 == 7) {
				arg1.method2502();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method2502();
				} else if (arg0 == 10) {
					local30 = arg1.method2502();
					this.anIntArray644 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray644[local37] = arg1.method2459();
					}
				} else if (arg0 == 12) {
					arg1.method2459();
				} else if (arg0 == 13) {
					local30 = arg1.method2502();
					this.anIntArray642 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray642[local37] = arg1.method2485();
					}
				} else if (arg0 == 14) {
					local30 = arg1.method2502();
					this.anIntArrayArray63 = new int[local30][2];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArrayArray63[local37][0] = arg1.method2502();
						this.anIntArrayArray63[local37][1] = arg1.method2502();
					}
				} else if (arg0 == 15) {
					arg1.method2485();
				} else if (arg0 == 17) {
					this.anInt6654 = arg1.method2485();
				} else if (arg0 == 18) {
					local30 = arg1.method2502();
					this.anIntArray647 = new int[local30];
					this.anIntArray645 = new int[local30];
					this.anIntArray641 = new int[local30];
					this.aStringArray50 = new String[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray647[local37] = arg1.method2459();
						this.anIntArray641[local37] = arg1.method2459();
						this.anIntArray645[local37] = arg1.method2459();
						this.aStringArray50[local37] = arg1.method2478();
					}
				} else if (arg0 == 19) {
					local30 = arg1.method2502();
					this.anIntArray643 = new int[local30];
					this.anIntArray648 = new int[local30];
					this.aStringArray51 = new String[local30];
					this.anIntArray646 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray643[local37] = arg1.method2459();
						this.anIntArray648[local37] = arg1.method2459();
						this.anIntArray646[local37] = arg1.method2459();
						this.aStringArray51[local37] = arg1.method2478();
					}
				} else if (arg0 == 249) {
					local30 = arg1.method2502();
					if (this.aClass167_30 == null) {
						local37 = Static186.method3002(local30);
						this.aClass167_30 = new Class167(local37);
					}
					for (local37 = 0; local37 < local30; local37++) {
						@Pc(302) boolean local302 = arg1.method2502() == 1;
						@Pc(306) int local306 = arg1.method2507();
						@Pc(315) Class10 local315;
						if (local302) {
							local315 = new Class10_Sub18(arg1.method2478());
						} else {
							local315 = new Class10_Sub12(arg1.method2459());
						}
						this.aClass167_30.method3705(local315, (long) local306);
					}
				}
			}
		}
	}
}
