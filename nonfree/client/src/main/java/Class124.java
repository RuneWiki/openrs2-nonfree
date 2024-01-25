import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class124 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!qi;")
	private Class208 aClass208_19;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "Ljava/lang/String;")
	private String aString34;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public int anInt3420 = -1;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method2682(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method2685(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
	public void method2683() {
		if (this.aString35 == null) {
			this.aString35 = this.aString34;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!wm;)V")
	private void method2685(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.aString34 = arg1.method2925();
		} else if (arg0 == 2) {
			this.aString35 = arg1.method2925();
		} else {
			@Pc(43) int local43;
			@Pc(50) int local50;
			if (arg0 == 3) {
				local43 = arg1.method2915();
				this.anIntArrayArray25 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray25[local50][0] = arg1.method2896();
					this.anIntArrayArray25[local50][1] = arg1.method2877();
					this.anIntArrayArray25[local50][2] = arg1.method2877();
				}
			} else if (arg0 == 4) {
				local43 = arg1.method2915();
				this.anIntArrayArray26 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray26[local50][0] = arg1.method2896();
					this.anIntArrayArray26[local50][1] = arg1.method2877();
					this.anIntArrayArray26[local50][2] = arg1.method2877();
				}
			} else if (arg0 == 5) {
				arg1.method2896();
			} else if (arg0 == 6) {
				arg1.method2915();
			} else if (arg0 == 7) {
				arg1.method2915();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method2915();
					return;
				}
				if (arg0 == 10) {
					local43 = arg1.method2915();
					this.anIntArray257 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray257[local50] = arg1.method2877();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method2877();
					return;
				}
				if (arg0 == 13) {
					local43 = arg1.method2915();
					this.anIntArray251 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray251[local50] = arg1.method2896();
					}
					return;
				}
				if (arg0 != 14) {
					if (arg0 == 15) {
						arg1.method2896();
						return;
					}
					if (arg0 == 17) {
						this.anInt3420 = arg1.method2896();
						return;
					}
					if (arg0 == 18) {
						local43 = arg1.method2915();
						this.anIntArray254 = new int[local43];
						this.anIntArray255 = new int[local43];
						this.anIntArray252 = new int[local43];
						this.aStringArray20 = new String[local43];
						for (local50 = 0; local50 < local43; local50++) {
							this.anIntArray255[local50] = arg1.method2877();
							this.anIntArray252[local50] = arg1.method2877();
							this.anIntArray254[local50] = arg1.method2877();
							this.aStringArray20[local50] = arg1.method2914();
						}
						return;
					}
					if (arg0 == 19) {
						local43 = arg1.method2915();
						this.anIntArray253 = new int[local43];
						this.anIntArray256 = new int[local43];
						this.aStringArray21 = new String[local43];
						this.anIntArray250 = new int[local43];
						for (local50 = 0; local50 < local43; local50++) {
							this.anIntArray250[local50] = arg1.method2877();
							this.anIntArray253[local50] = arg1.method2877();
							this.anIntArray256[local50] = arg1.method2877();
							this.aStringArray21[local50] = arg1.method2914();
						}
					} else if (arg0 == 249) {
						local43 = arg1.method2915();
						if (this.aClass208_19 == null) {
							local50 = Static191.method2764(local43);
							this.aClass208_19 = new Class208(local50);
						}
						for (local50 = 0; local50 < local43; local50++) {
							@Pc(294) boolean local294 = arg1.method2915() == 1;
							@Pc(298) int local298 = arg1.method2881();
							@Pc(307) Class1 local307;
							if (local294) {
								local307 = new Class1_Sub25(arg1.method2914());
							} else {
								local307 = new Class1_Sub18(arg1.method2877());
							}
							this.aClass208_19.method4413((long) local298, local307);
						}
						return;
					}
					return;
				}
				local43 = arg1.method2915();
				this.anIntArrayArray24 = new int[local43][2];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray24[local50][0] = arg1.method2915();
					this.anIntArrayArray24[local50][1] = arg1.method2915();
				}
				return;
			}
		}
	}
}
