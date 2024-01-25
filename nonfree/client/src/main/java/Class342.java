import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class342 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
	private int[] anIntArray719;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	private int[] anIntArray720;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
	private int[] anIntArray721;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!jo;")
	private Class187 aClass187_74;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[I")
	private int[] anIntArray722;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
	private int[] anIntArray723;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
	private int[] anIntArray724;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "[I")
	private int[] anIntArray725;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "[I")
	private int[] anIntArray726;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public int anInt9959 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!so;II)V")
	private void method8288(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString109 = arg0.method5903();
		} else if (arg1 == 2) {
			this.aString108 = arg0.method5903();
		} else {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (arg1 == 3) {
				local21 = arg0.method5866();
				this.anIntArrayArray54 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray54[local28][0] = arg0.method5900();
					this.anIntArrayArray54[local28][1] = arg0.method5878();
					this.anIntArrayArray54[local28][2] = arg0.method5878();
				}
			} else if (arg1 == 4) {
				local21 = arg0.method5866();
				this.anIntArrayArray56 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray56[local28][0] = arg0.method5900();
					this.anIntArrayArray56[local28][1] = arg0.method5878();
					this.anIntArrayArray56[local28][2] = arg0.method5878();
				}
			} else if (arg1 == 5) {
				arg0.method5900();
			} else if (arg1 == 6) {
				arg0.method5866();
			} else if (arg1 == 7) {
				arg0.method5866();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5866();
				} else if (arg1 == 10) {
					local21 = arg0.method5866();
					this.anIntArray724 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray724[local28] = arg0.method5878();
					}
				} else if (arg1 == 12) {
					arg0.method5878();
				} else if (arg1 == 13) {
					local21 = arg0.method5866();
					this.anIntArray721 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray721[local28] = arg0.method5900();
					}
				} else if (arg1 == 14) {
					local21 = arg0.method5866();
					this.anIntArrayArray55 = new int[local21][2];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArrayArray55[local28][0] = arg0.method5866();
						this.anIntArrayArray55[local28][1] = arg0.method5866();
					}
				} else if (arg1 == 15) {
					arg0.method5900();
				} else if (arg1 == 17) {
					this.anInt9959 = arg0.method5900();
				} else if (arg1 == 18) {
					local21 = arg0.method5866();
					this.anIntArray725 = new int[local21];
					this.aStringArray38 = new String[local21];
					this.anIntArray726 = new int[local21];
					this.anIntArray722 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray726[local28] = arg0.method5878();
						this.anIntArray722[local28] = arg0.method5878();
						this.anIntArray725[local28] = arg0.method5878();
						this.aStringArray38[local28] = arg0.method5898();
					}
				} else if (arg1 == 19) {
					local21 = arg0.method5866();
					this.aStringArray39 = new String[local21];
					this.anIntArray723 = new int[local21];
					this.anIntArray719 = new int[local21];
					this.anIntArray720 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray720[local28] = arg0.method5878();
						this.anIntArray719[local28] = arg0.method5878();
						this.anIntArray723[local28] = arg0.method5878();
						this.aStringArray39[local28] = arg0.method5898();
					}
				} else if (arg1 == 249) {
					local21 = arg0.method5866();
					if (this.aClass187_74 == null) {
						local28 = Static330.method5181(local21);
						this.aClass187_74 = new Class187(local28);
					}
					for (local28 = 0; local28 < local21; local28++) {
						@Pc(218) boolean local218 = arg0.method5866() == 1;
						@Pc(222) int local222 = arg0.method5862();
						@Pc(233) Class14 local233;
						if (local218) {
							local233 = new Class14_Sub17(arg0.method5898());
						} else {
							local233 = new Class14_Sub18(arg0.method5878());
						}
						this.aClass187_74.method4077((long) local222, local233);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!so;I)V")
	public void method8291(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5866();
			if (local11 == 0) {
				return;
			}
			this.method8288(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public void method8293() {
		if (this.aString108 == null) {
			this.aString108 = this.aString109;
		}
	}
}
