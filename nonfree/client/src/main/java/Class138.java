import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class138 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Lclient!tba;")
	private Class323 aClass323_14;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public int anInt3921 = -1;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method3397(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString37 = arg0.method2884();
		} else if (arg1 == 2) {
			this.aString36 = arg0.method2884();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method2859();
				this.anIntArrayArray38 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray38[local45][0] = arg0.method2825();
					this.anIntArrayArray38[local45][1] = arg0.method2881();
					this.anIntArrayArray38[local45][2] = arg0.method2881();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method2859();
				this.anIntArrayArray39 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray39[local45][0] = arg0.method2825();
					this.anIntArrayArray39[local45][1] = arg0.method2881();
					this.anIntArrayArray39[local45][2] = arg0.method2881();
				}
			} else if (arg1 == 5) {
				arg0.method2825();
			} else if (arg1 == 6) {
				arg0.method2859();
			} else if (arg1 == 7) {
				arg0.method2859();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2859();
				} else if (arg1 == 10) {
					local38 = arg0.method2859();
					this.anIntArray253 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray253[local45] = arg0.method2881();
					}
				} else if (arg1 == 12) {
					arg0.method2881();
				} else if (arg1 == 13) {
					local38 = arg0.method2859();
					this.anIntArray257 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray257[local45] = arg0.method2825();
					}
				} else if (arg1 == 14) {
					local38 = arg0.method2859();
					this.anIntArrayArray40 = new int[local38][2];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArrayArray40[local45][0] = arg0.method2859();
						this.anIntArrayArray40[local45][1] = arg0.method2859();
					}
				} else if (arg1 == 15) {
					arg0.method2825();
				} else if (arg1 == 17) {
					this.anInt3921 = arg0.method2825();
				} else if (arg1 == 18) {
					local38 = arg0.method2859();
					this.anIntArray252 = new int[local38];
					this.anIntArray258 = new int[local38];
					this.anIntArray254 = new int[local38];
					this.aStringArray25 = new String[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray258[local45] = arg0.method2881();
						this.anIntArray252[local45] = arg0.method2881();
						this.anIntArray254[local45] = arg0.method2881();
						this.aStringArray25[local45] = arg0.method2833();
					}
				} else if (arg1 == 19) {
					local38 = arg0.method2859();
					this.anIntArray251 = new int[local38];
					this.anIntArray256 = new int[local38];
					this.aStringArray24 = new String[local38];
					this.anIntArray255 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray256[local45] = arg0.method2881();
						this.anIntArray251[local45] = arg0.method2881();
						this.anIntArray255[local45] = arg0.method2881();
						this.aStringArray24[local45] = arg0.method2833();
					}
				} else if (arg1 == 249) {
					local38 = arg0.method2859();
					if (this.aClass323_14 == null) {
						local45 = Static613.method8565(local38);
						this.aClass323_14 = new Class323(local45);
					}
					for (local45 = 0; local45 < local38; local45++) {
						@Pc(298) boolean local298 = arg0.method2859() == 1;
						@Pc(302) int local302 = arg0.method2835();
						@Pc(313) Class2 local313;
						if (local298) {
							local313 = new Class2_Sub33(arg0.method2833());
						} else {
							local313 = new Class2_Sub41(arg0.method2881());
						}
						this.aClass323_14.method7477(local313, (long) local302);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method3398() {
		if (this.aString36 == null) {
			this.aString36 = this.aString37;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method3400(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2859();
			if (local5 == 0) {
				return;
			}
			this.method3397(arg0, local5);
		}
	}
}
