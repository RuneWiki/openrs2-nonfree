import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class347 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[I")
	private int[] anIntArray722;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "[I")
	private int[] anIntArray723;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Ljava/lang/String;")
	private String aString119;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
	private int[] anIntArray724;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!nj;")
	private Class212 aClass212_40;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[I")
	private int[] anIntArray725;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
	private int[] anIntArray726;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "[I")
	private int[] anIntArray727;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "[I")
	private int[] anIntArray728;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Ljava/lang/String;")
	private String aString120;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "[I")
	private int[] anIntArray729;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	public int anInt9606 = -1;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dga;I)V")
	private void method7839(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.aString120 = arg1.method6023();
		} else if (arg0 == 2) {
			this.aString119 = arg1.method6023();
		} else {
			@Pc(23) int local23;
			@Pc(30) int local30;
			if (arg0 == 3) {
				local23 = arg1.method6041();
				this.anIntArrayArray89 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray89[local30][0] = arg1.method6006();
					this.anIntArrayArray89[local30][1] = arg1.method6027();
					this.anIntArrayArray89[local30][2] = arg1.method6027();
				}
			} else if (arg0 == 4) {
				local23 = arg1.method6041();
				this.anIntArrayArray88 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray88[local30][0] = arg1.method6006();
					this.anIntArrayArray88[local30][1] = arg1.method6027();
					this.anIntArrayArray88[local30][2] = arg1.method6027();
				}
			} else if (arg0 == 5) {
				arg1.method6006();
			} else if (arg0 == 6) {
				arg1.method6041();
			} else if (arg0 == 7) {
				arg1.method6041();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method6041();
				} else if (arg0 == 10) {
					local23 = arg1.method6041();
					this.anIntArray729 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray729[local30] = arg1.method6027();
					}
				} else if (arg0 == 12) {
					arg1.method6027();
				} else if (arg0 == 13) {
					local23 = arg1.method6041();
					this.anIntArray722 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray722[local30] = arg1.method6006();
					}
				} else if (arg0 == 14) {
					local23 = arg1.method6041();
					this.anIntArrayArray87 = new int[local23][2];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArrayArray87[local30][0] = arg1.method6041();
						this.anIntArrayArray87[local30][1] = arg1.method6041();
					}
				} else if (arg0 == 15) {
					arg1.method6006();
				} else if (arg0 == 17) {
					this.anInt9606 = arg1.method6006();
				} else if (arg0 == 18) {
					local23 = arg1.method6041();
					this.aStringArray37 = new String[local23];
					this.anIntArray725 = new int[local23];
					this.anIntArray723 = new int[local23];
					this.anIntArray728 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray728[local30] = arg1.method6027();
						this.anIntArray723[local30] = arg1.method6027();
						this.anIntArray725[local30] = arg1.method6027();
						this.aStringArray37[local30] = arg1.method5991();
					}
				} else if (arg0 == 19) {
					local23 = arg1.method6041();
					this.anIntArray726 = new int[local23];
					this.aStringArray36 = new String[local23];
					this.anIntArray724 = new int[local23];
					this.anIntArray727 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray726[local30] = arg1.method6027();
						this.anIntArray727[local30] = arg1.method6027();
						this.anIntArray724[local30] = arg1.method6027();
						this.aStringArray36[local30] = arg1.method5991();
					}
				} else if (arg0 == 249) {
					local23 = arg1.method6041();
					if (this.aClass212_40 == null) {
						local30 = Static516.method7313(local23);
						this.aClass212_40 = new Class212(local30);
					}
					for (local30 = 0; local30 < local23; local30++) {
						@Pc(336) boolean local336 = arg1.method6041() == 1;
						@Pc(340) int local340 = arg1.method5988();
						@Pc(349) Class6 local349;
						if (local336) {
							local349 = new Class6_Sub6(arg1.method5991());
						} else {
							local349 = new Class6_Sub9(arg1.method6027());
						}
						this.aClass212_40.method5104((long) local340, local349);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dga;)V")
	public void method7840(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method7839(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
	public void method7844() {
		if (this.aString119 == null) {
			this.aString119 = this.aString120;
		}
	}
}
