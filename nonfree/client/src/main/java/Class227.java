import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class227 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!mp;")
	private Class222 aClass222_24;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray22;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public int anInt6575 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ud;IB)V")
	private void method5553(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString64 = arg0.method6910();
		} else if (arg1 == 2) {
			this.aString65 = arg0.method6910();
		} else {
			@Pc(44) int local44;
			@Pc(51) int local51;
			if (arg1 == 3) {
				local44 = arg0.method6904();
				this.anIntArrayArray61 = new int[local44][3];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArrayArray61[local51][0] = arg0.method6884();
					this.anIntArrayArray61[local51][1] = arg0.method6865();
					this.anIntArrayArray61[local51][2] = arg0.method6865();
				}
			} else if (arg1 == 4) {
				local44 = arg0.method6904();
				this.anIntArrayArray60 = new int[local44][3];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArrayArray60[local51][0] = arg0.method6884();
					this.anIntArrayArray60[local51][1] = arg0.method6865();
					this.anIntArrayArray60[local51][2] = arg0.method6865();
				}
			} else if (arg1 == 5) {
				arg0.method6884();
			} else if (arg1 == 6) {
				arg0.method6904();
			} else if (arg1 == 7) {
				arg0.method6904();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6904();
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method6865();
						return;
					}
					if (arg1 != 13) {
						if (arg1 == 14) {
							local44 = arg0.method6904();
							this.anIntArrayArray62 = new int[local44][2];
							for (local51 = 0; local51 < local44; local51++) {
								this.anIntArrayArray62[local51][0] = arg0.method6904();
								this.anIntArrayArray62[local51][1] = arg0.method6904();
							}
							return;
						}
						if (arg1 == 15) {
							arg0.method6884();
							return;
						}
						if (arg1 == 17) {
							this.anInt6575 = arg0.method6884();
						} else if (arg1 == 18) {
							local44 = arg0.method6904();
							this.anIntArray437 = new int[local44];
							this.anIntArray438 = new int[local44];
							this.aStringArray21 = new String[local44];
							this.anIntArray434 = new int[local44];
							for (local51 = 0; local51 < local44; local51++) {
								this.anIntArray434[local51] = arg0.method6865();
								this.anIntArray438[local51] = arg0.method6865();
								this.anIntArray437[local51] = arg0.method6865();
								this.aStringArray21[local51] = arg0.method6903();
							}
							return;
						} else if (arg1 == 19) {
							local44 = arg0.method6904();
							this.aStringArray22 = new String[local44];
							this.anIntArray432 = new int[local44];
							this.anIntArray439 = new int[local44];
							this.anIntArray436 = new int[local44];
							for (local51 = 0; local51 < local44; local51++) {
								this.anIntArray432[local51] = arg0.method6865();
								this.anIntArray439[local51] = arg0.method6865();
								this.anIntArray436[local51] = arg0.method6865();
								this.aStringArray22[local51] = arg0.method6903();
							}
							return;
						} else if (arg1 == 249) {
							local44 = arg0.method6904();
							if (this.aClass222_24 == null) {
								local51 = Static347.method5404(local44);
								this.aClass222_24 = new Class222(local51);
							}
							for (local51 = 0; local51 < local44; local51++) {
								@Pc(340) boolean local340 = arg0.method6904() == 1;
								@Pc(344) int local344 = arg0.method6870();
								@Pc(353) Class2 local353;
								if (local340) {
									local353 = new Class2_Sub38(arg0.method6903());
								} else {
									local353 = new Class2_Sub15(arg0.method6865());
								}
								this.aClass222_24.method5476(local353, (long) local344);
							}
							return;
						}
						return;
					}
					local44 = arg0.method6904();
					this.anIntArray433 = new int[local44];
					for (local51 = 0; local51 < local44; local51++) {
						this.anIntArray433[local51] = arg0.method6884();
					}
					return;
				}
				local44 = arg0.method6904();
				this.anIntArray435 = new int[local44];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArray435[local51] = arg0.method6865();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method5554(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6904();
			if (local13 == 0) {
				return;
			}
			this.method5553(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method5556() {
		if (this.aString65 == null) {
			this.aString65 = this.aString64;
		}
	}
}
