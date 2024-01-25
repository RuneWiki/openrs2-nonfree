import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class44 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!jr;")
	private Class127 aClass127_4;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public int anInt1549 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public void method1280() {
		if (this.aString13 == null) {
			this.aString13 = this.aString12;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method1281(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString12 = arg0.method6021();
		} else if (arg1 == 2) {
			this.aString13 = arg0.method6021();
		} else {
			@Pc(44) int local44;
			@Pc(51) int local51;
			if (arg1 == 3) {
				local44 = arg0.method6053();
				this.anIntArrayArray13 = new int[local44][3];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArrayArray13[local51][0] = arg0.method6004();
					this.anIntArrayArray13[local51][1] = arg0.method6014();
					this.anIntArrayArray13[local51][2] = arg0.method6014();
				}
			} else if (arg1 == 4) {
				local44 = arg0.method6053();
				this.anIntArrayArray11 = new int[local44][3];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArrayArray11[local51][0] = arg0.method6004();
					this.anIntArrayArray11[local51][1] = arg0.method6014();
					this.anIntArrayArray11[local51][2] = arg0.method6014();
				}
			} else if (arg1 == 5) {
				arg0.method6004();
			} else if (arg1 == 6) {
				arg0.method6053();
				return;
			} else if (arg1 == 7) {
				arg0.method6053();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6053();
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method6014();
						return;
					}
					if (arg1 == 13) {
						local44 = arg0.method6053();
						this.anIntArray101 = new int[local44];
						for (local51 = 0; local51 < local44; local51++) {
							this.anIntArray101[local51] = arg0.method6004();
						}
						return;
					}
					if (arg1 == 14) {
						local44 = arg0.method6053();
						this.anIntArrayArray12 = new int[local44][2];
						for (local51 = 0; local51 < local44; local51++) {
							this.anIntArrayArray12[local51][0] = arg0.method6053();
							this.anIntArrayArray12[local51][1] = arg0.method6053();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method6004();
					} else if (arg1 == 17) {
						this.anInt1549 = arg0.method6004();
						return;
					} else if (arg1 == 18) {
						local44 = arg0.method6053();
						this.aStringArray33 = new String[local44];
						this.anIntArray100 = new int[local44];
						this.anIntArray99 = new int[local44];
						this.anIntArray102 = new int[local44];
						for (local51 = 0; local51 < local44; local51++) {
							this.anIntArray100[local51] = arg0.method6014();
							this.anIntArray99[local51] = arg0.method6014();
							this.anIntArray102[local51] = arg0.method6014();
							this.aStringArray33[local51] = arg0.method6027();
						}
						return;
					} else if (arg1 == 19) {
						local44 = arg0.method6053();
						this.anIntArray97 = new int[local44];
						this.aStringArray34 = new String[local44];
						this.anIntArray98 = new int[local44];
						this.anIntArray96 = new int[local44];
						for (local51 = 0; local51 < local44; local51++) {
							this.anIntArray96[local51] = arg0.method6014();
							this.anIntArray98[local51] = arg0.method6014();
							this.anIntArray97[local51] = arg0.method6014();
							this.aStringArray34[local51] = arg0.method6027();
						}
						return;
					} else if (arg1 == 249) {
						local44 = arg0.method6053();
						if (this.aClass127_4 == null) {
							local51 = Static350.method4984(local44);
							this.aClass127_4 = new Class127(local51);
						}
						for (local51 = 0; local51 < local44; local51++) {
							@Pc(433) boolean local433 = arg0.method6053() == 1;
							@Pc(437) int local437 = arg0.method6020();
							@Pc(446) Class3 local446;
							if (local433) {
								local446 = new Class3_Sub37(arg0.method6027());
							} else {
								local446 = new Class3_Sub25(arg0.method6014());
							}
							this.aClass127_4.method3257((long) local437, local446);
						}
						return;
					}
					return;
				}
				local44 = arg0.method6053();
				this.anIntArray95 = new int[local44];
				for (local51 = 0; local51 < local44; local51++) {
					this.anIntArray95[local51] = arg0.method6014();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method1282(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6053();
			if (local13 == 0) {
				return;
			}
			this.method1281(arg0, local13);
		}
	}
}
