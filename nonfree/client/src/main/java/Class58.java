import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class58 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!efa;")
	private Class90 aClass90_4;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
	public int anInt1166 = -1;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZILclient!gk;)V")
	private void method1110(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString17 = arg1.method4487();
		} else if (arg0 == 2) {
			this.aString18 = arg1.method4487();
		} else {
			@Pc(37) int local37;
			@Pc(44) int local44;
			if (arg0 == 3) {
				local37 = arg1.method4464();
				this.anIntArrayArray15 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray15[local44][0] = arg1.method4518();
					this.anIntArrayArray15[local44][1] = arg1.method4509();
					this.anIntArrayArray15[local44][2] = arg1.method4509();
				}
			} else if (arg0 == 4) {
				local37 = arg1.method4464();
				this.anIntArrayArray13 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray13[local44][0] = arg1.method4518();
					this.anIntArrayArray13[local44][1] = arg1.method4509();
					this.anIntArrayArray13[local44][2] = arg1.method4509();
				}
			} else if (arg0 == 5) {
				arg1.method4518();
			} else if (arg0 == 6) {
				arg1.method4464();
			} else if (arg0 == 7) {
				arg1.method4464();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4464();
				} else if (arg0 == 10) {
					local37 = arg1.method4464();
					this.anIntArray120 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray120[local44] = arg1.method4509();
					}
				} else if (arg0 == 12) {
					arg1.method4509();
				} else if (arg0 == 13) {
					local37 = arg1.method4464();
					this.anIntArray115 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray115[local44] = arg1.method4518();
					}
				} else if (arg0 == 14) {
					local37 = arg1.method4464();
					this.anIntArrayArray14 = new int[local37][2];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArrayArray14[local44][0] = arg1.method4464();
						this.anIntArrayArray14[local44][1] = arg1.method4464();
					}
				} else if (arg0 == 15) {
					arg1.method4518();
				} else if (arg0 == 17) {
					this.anInt1166 = arg1.method4518();
				} else if (arg0 == 18) {
					local37 = arg1.method4464();
					this.anIntArray116 = new int[local37];
					this.anIntArray114 = new int[local37];
					this.aStringArray7 = new String[local37];
					this.anIntArray113 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray116[local44] = arg1.method4509();
						this.anIntArray114[local44] = arg1.method4509();
						this.anIntArray113[local44] = arg1.method4509();
						this.aStringArray7[local44] = arg1.method4494();
					}
				} else if (arg0 == 19) {
					local37 = arg1.method4464();
					this.anIntArray119 = new int[local37];
					this.aStringArray6 = new String[local37];
					this.anIntArray118 = new int[local37];
					this.anIntArray117 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray117[local44] = arg1.method4509();
						this.anIntArray119[local44] = arg1.method4509();
						this.anIntArray118[local44] = arg1.method4509();
						this.aStringArray6[local44] = arg1.method4494();
					}
				} else if (arg0 == 249) {
					local37 = arg1.method4464();
					if (this.aClass90_4 == null) {
						local44 = Static355.method5078(local37);
						this.aClass90_4 = new Class90(local44);
					}
					for (local44 = 0; local44 < local37; local44++) {
						@Pc(339) boolean local339 = arg1.method4464() == 1;
						@Pc(343) int local343 = arg1.method4503();
						@Pc(352) Class2 local352;
						if (local339) {
							local352 = new Class2_Sub17(arg1.method4494());
						} else {
							local352 = new Class2_Sub44(arg1.method4509());
						}
						this.aClass90_4.method1684(local352, (long) local343);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method1111() {
		if (this.aString18 == null) {
			this.aString18 = this.aString17;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method1112(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4464();
			if (local13 == 0) {
				return;
			}
			this.method1110(local13, arg0);
		}
	}
}
