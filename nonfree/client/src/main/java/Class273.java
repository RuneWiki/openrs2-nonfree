import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class273 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray62;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray63;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "Lclient!baa;")
	private Class25 aClass25_32;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
	public int anInt7657 = -1;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public void method6669() {
		if (this.aString64 == null) {
			this.aString64 = this.aString65;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!dc;)V")
	public void method6670(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method6671(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLclient!dc;)V")
	private void method6671(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.aString65 = arg1.method5605();
		} else if (arg0 == 2) {
			this.aString64 = arg1.method5605();
		} else {
			@Pc(73) int local73;
			@Pc(79) int local79;
			if (arg0 == 3) {
				local73 = arg1.method5633();
				this.anIntArrayArray43 = new int[local73][3];
				for (local79 = 0; local79 < local73; local79++) {
					this.anIntArrayArray43[local79][0] = arg1.method5610();
					this.anIntArrayArray43[local79][1] = arg1.method5585();
					this.anIntArrayArray43[local79][2] = arg1.method5585();
				}
			} else if (arg0 == 4) {
				local73 = arg1.method5633();
				this.anIntArrayArray42 = new int[local73][3];
				for (local79 = 0; local79 < local73; local79++) {
					this.anIntArrayArray42[local79][0] = arg1.method5610();
					this.anIntArrayArray42[local79][1] = arg1.method5585();
					this.anIntArrayArray42[local79][2] = arg1.method5585();
				}
			} else if (arg0 == 5) {
				arg1.method5610();
			} else if (arg0 == 6) {
				arg1.method5633();
			} else if (arg0 == 7) {
				arg1.method5633();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5633();
				} else if (arg0 == 10) {
					local73 = arg1.method5633();
					this.anIntArray472 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray472[local79] = arg1.method5585();
					}
				} else if (arg0 == 12) {
					arg1.method5585();
				} else if (arg0 == 13) {
					local73 = arg1.method5633();
					this.anIntArray470 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray470[local79] = arg1.method5610();
					}
				} else if (arg0 == 14) {
					local73 = arg1.method5633();
					this.anIntArrayArray41 = new int[local73][2];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArrayArray41[local79][0] = arg1.method5633();
						this.anIntArrayArray41[local79][1] = arg1.method5633();
					}
				} else if (arg0 == 15) {
					arg1.method5610();
				} else if (arg0 == 17) {
					this.anInt7657 = arg1.method5610();
				} else if (arg0 == 18) {
					local73 = arg1.method5633();
					this.aStringArray63 = new String[local73];
					this.anIntArray467 = new int[local73];
					this.anIntArray469 = new int[local73];
					this.anIntArray471 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray471[local79] = arg1.method5585();
						this.anIntArray467[local79] = arg1.method5585();
						this.anIntArray469[local79] = arg1.method5585();
						this.aStringArray63[local79] = arg1.method5607();
					}
				} else if (arg0 == 19) {
					local73 = arg1.method5633();
					this.anIntArray466 = new int[local73];
					this.anIntArray468 = new int[local73];
					this.aStringArray62 = new String[local73];
					this.anIntArray465 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray468[local79] = arg1.method5585();
						this.anIntArray465[local79] = arg1.method5585();
						this.anIntArray466[local79] = arg1.method5585();
						this.aStringArray62[local79] = arg1.method5607();
					}
				} else if (arg0 == 249) {
					local73 = arg1.method5633();
					if (this.aClass25_32 == null) {
						local79 = Static533.method1203(local73);
						this.aClass25_32 = new Class25(local79);
					}
					for (local79 = 0; local79 < local73; local79++) {
						@Pc(281) boolean local281 = arg1.method5633() == 1;
						@Pc(285) int local285 = arg1.method5604();
						@Pc(294) Class3 local294;
						if (local281) {
							local294 = new Class3_Sub14(arg1.method5607());
						} else {
							local294 = new Class3_Sub51(arg1.method5585());
						}
						this.aClass25_32.method434((long) local285, local294);
					}
				}
			}
		}
	}
}
