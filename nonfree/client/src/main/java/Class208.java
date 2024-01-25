import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class208 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "Lclient!rda;")
	private Class300 aClass300_26;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	public int anInt6172 = -1;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method5125(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7816();
			if (local12 == 0) {
				return;
			}
			this.method5128(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method5128(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString52 = arg0.method7813();
		} else if (arg1 == 2) {
			this.aString51 = arg0.method7813();
		} else {
			@Pc(77) int local77;
			@Pc(84) int local84;
			if (arg1 == 3) {
				local77 = arg0.method7816();
				this.anIntArrayArray28 = new int[local77][3];
				for (local84 = 0; local84 < local77; local84++) {
					this.anIntArrayArray28[local84][0] = arg0.method7860();
					this.anIntArrayArray28[local84][1] = arg0.method7804();
					this.anIntArrayArray28[local84][2] = arg0.method7804();
				}
			} else if (arg1 == 4) {
				local77 = arg0.method7816();
				this.anIntArrayArray30 = new int[local77][3];
				for (local84 = 0; local84 < local77; local84++) {
					this.anIntArrayArray30[local84][0] = arg0.method7860();
					this.anIntArrayArray30[local84][1] = arg0.method7804();
					this.anIntArrayArray30[local84][2] = arg0.method7804();
				}
			} else if (arg1 == 5) {
				arg0.method7860();
			} else if (arg1 == 6) {
				arg0.method7816();
			} else if (arg1 == 7) {
				arg0.method7816();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method7816();
				} else if (arg1 == 10) {
					local77 = arg0.method7816();
					this.anIntArray349 = new int[local77];
					for (local84 = 0; local84 < local77; local84++) {
						this.anIntArray349[local84] = arg0.method7804();
					}
				} else if (arg1 == 12) {
					arg0.method7804();
				} else if (arg1 == 13) {
					local77 = arg0.method7816();
					this.anIntArray348 = new int[local77];
					for (local84 = 0; local84 < local77; local84++) {
						this.anIntArray348[local84] = arg0.method7860();
					}
				} else if (arg1 == 14) {
					local77 = arg0.method7816();
					this.anIntArrayArray29 = new int[local77][2];
					for (local84 = 0; local84 < local77; local84++) {
						this.anIntArrayArray29[local84][0] = arg0.method7816();
						this.anIntArrayArray29[local84][1] = arg0.method7816();
					}
				} else if (arg1 == 15) {
					arg0.method7860();
				} else if (arg1 == 17) {
					this.anInt6172 = arg0.method7860();
				} else if (arg1 == 18) {
					local77 = arg0.method7816();
					this.anIntArray355 = new int[local77];
					this.aStringArray33 = new String[local77];
					this.anIntArray351 = new int[local77];
					this.anIntArray350 = new int[local77];
					for (local84 = 0; local84 < local77; local84++) {
						this.anIntArray350[local84] = arg0.method7804();
						this.anIntArray351[local84] = arg0.method7804();
						this.anIntArray355[local84] = arg0.method7804();
						this.aStringArray33[local84] = arg0.method7847();
					}
				} else if (arg1 == 19) {
					local77 = arg0.method7816();
					this.anIntArray354 = new int[local77];
					this.anIntArray353 = new int[local77];
					this.anIntArray352 = new int[local77];
					this.aStringArray34 = new String[local77];
					for (local84 = 0; local84 < local77; local84++) {
						this.anIntArray352[local84] = arg0.method7804();
						this.anIntArray353[local84] = arg0.method7804();
						this.anIntArray354[local84] = arg0.method7804();
						this.aStringArray34[local84] = arg0.method7847();
					}
				} else if (arg1 == 249) {
					local77 = arg0.method7816();
					if (this.aClass300_26 == null) {
						local84 = Static67.method917(local77);
						this.aClass300_26 = new Class300(local84);
					}
					for (local84 = 0; local84 < local77; local84++) {
						@Pc(227) boolean local227 = arg0.method7816() == 1;
						@Pc(231) int local231 = arg0.method7807();
						@Pc(240) Class5 local240;
						if (local227) {
							local240 = new Class5_Sub11(arg0.method7847());
						} else {
							local240 = new Class5_Sub47(arg0.method7804());
						}
						this.aClass300_26.method7191(local240, (long) local231);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public void method5130() {
		if (this.aString51 == null) {
			this.aString51 = this.aString52;
		}
	}
}
