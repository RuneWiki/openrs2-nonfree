import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class80 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray15;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray16;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!tq;")
	private Class305 aClass305_15;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public int anInt2439 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method2207(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method2212(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method2210() {
		if (this.aString25 == null) {
			this.aString25 = this.aString26;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!iaa;II)V")
	private void method2212(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString26 = arg0.method4945();
		} else if (arg1 == 2) {
			this.aString25 = arg0.method4945();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method4966();
				this.anIntArrayArray17 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray17[local45][0] = arg0.method4999();
					this.anIntArrayArray17[local45][1] = arg0.method5000();
					this.anIntArrayArray17[local45][2] = arg0.method5000();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method4966();
				this.anIntArrayArray15 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray15[local45][0] = arg0.method4999();
					this.anIntArrayArray15[local45][1] = arg0.method5000();
					this.anIntArrayArray15[local45][2] = arg0.method5000();
				}
			} else if (arg1 == 5) {
				arg0.method4999();
			} else if (arg1 == 6) {
				arg0.method4966();
			} else if (arg1 == 7) {
				arg0.method4966();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4966();
					return;
				}
				if (arg1 == 10) {
					local38 = arg0.method4966();
					this.anIntArray192 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray192[local45] = arg0.method5000();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method5000();
					return;
				}
				if (arg1 == 13) {
					local38 = arg0.method4966();
					this.anIntArray191 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray191[local45] = arg0.method4999();
					}
					return;
				}
				if (arg1 == 14) {
					local38 = arg0.method4966();
					this.anIntArrayArray16 = new int[local38][2];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArrayArray16[local45][0] = arg0.method4966();
						this.anIntArrayArray16[local45][1] = arg0.method4966();
					}
					return;
				}
				if (arg1 == 15) {
					arg0.method4999();
					return;
				}
				if (arg1 == 17) {
					this.anInt2439 = arg0.method4999();
					return;
				}
				if (arg1 == 18) {
					local38 = arg0.method4966();
					this.anIntArray195 = new int[local38];
					this.aStringArray15 = new String[local38];
					this.anIntArray188 = new int[local38];
					this.anIntArray193 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray195[local45] = arg0.method5000();
						this.anIntArray193[local45] = arg0.method5000();
						this.anIntArray188[local45] = arg0.method5000();
						this.aStringArray15[local45] = arg0.method4941();
					}
					return;
				}
				if (arg1 == 19) {
					local38 = arg0.method4966();
					this.anIntArray190 = new int[local38];
					this.anIntArray194 = new int[local38];
					this.anIntArray189 = new int[local38];
					this.aStringArray16 = new String[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray190[local45] = arg0.method5000();
						this.anIntArray189[local45] = arg0.method5000();
						this.anIntArray194[local45] = arg0.method5000();
						this.aStringArray16[local45] = arg0.method4941();
					}
				} else if (arg1 == 249) {
					local38 = arg0.method4966();
					if (this.aClass305_15 == null) {
						local45 = Static247.method4363(local38);
						this.aClass305_15 = new Class305(local45);
					}
					for (local45 = 0; local45 < local38; local45++) {
						@Pc(345) boolean local345 = arg0.method4966() == 1;
						@Pc(349) int local349 = arg0.method4949();
						@Pc(360) Class6 local360;
						if (local345) {
							local360 = new Class6_Sub30(arg0.method4941());
						} else {
							local360 = new Class6_Sub24(arg0.method5000());
						}
						this.aClass305_15.method7448((long) local349, local360);
					}
					return;
				}
				return;
			}
		}
	}
}
