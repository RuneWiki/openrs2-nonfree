import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class202 {

	@OriginalMember(owner = "client!k", name = "t", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray22;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[I")
	private int[] anIntArray387;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!qn;")
	private Class313 aClass313_23;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt5320 = -1;

	static {
		for (@Pc(51) int local51 = 0; local51 < 100; local51++) {
			aRectangleArray1[local51] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method4761(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2048(255);
			if (local9 == 0) {
				return;
			}
			this.method4764(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public void method4762() {
		if (this.aString64 == null) {
			this.aString64 = this.aString65;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!ika;)V")
	private void method4764(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aString65 = arg1.method2027();
		} else if (arg0 == 2) {
			this.aString64 = arg1.method2027();
		} else {
			@Pc(43) int local43;
			@Pc(50) int local50;
			if (arg0 == 3) {
				local43 = arg1.method2048(255);
				this.anIntArrayArray26 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray26[local50][0] = arg1.method2028(-14795);
					this.anIntArrayArray26[local50][1] = arg1.method2036();
					this.anIntArrayArray26[local50][2] = arg1.method2036();
				}
			} else if (arg0 == 4) {
				local43 = arg1.method2048(255);
				this.anIntArrayArray24 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray24[local50][0] = arg1.method2028(-14795);
					this.anIntArrayArray24[local50][1] = arg1.method2036();
					this.anIntArrayArray24[local50][2] = arg1.method2036();
				}
			} else if (arg0 == 5) {
				arg1.method2028(-14795);
			} else if (arg0 == 6) {
				arg1.method2048(255);
			} else if (arg0 == 7) {
				arg1.method2048(255);
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method2048(255);
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method2036();
						return;
					}
					if (arg0 != 13) {
						if (arg0 == 14) {
							local43 = arg1.method2048(255);
							this.anIntArrayArray25 = new int[local43][2];
							for (local50 = 0; local50 < local43; local50++) {
								this.anIntArrayArray25[local50][0] = arg1.method2048(255);
								this.anIntArrayArray25[local50][1] = arg1.method2048(255);
							}
							return;
						}
						if (arg0 == 15) {
							arg1.method2028(-14795);
							return;
						}
						if (arg0 == 17) {
							this.anInt5320 = arg1.method2028(-14795);
							return;
						}
						if (arg0 != 18) {
							if (arg0 == 19) {
								local43 = arg1.method2048(255);
								this.anIntArray382 = new int[local43];
								this.anIntArray385 = new int[local43];
								this.anIntArray386 = new int[local43];
								this.aStringArray23 = new String[local43];
								for (local50 = 0; local50 < local43; local50++) {
									this.anIntArray382[local50] = arg1.method2036();
									this.anIntArray386[local50] = arg1.method2036();
									this.anIntArray385[local50] = arg1.method2036();
									this.aStringArray23[local50] = arg1.method2014();
								}
							} else if (arg0 == 249) {
								local43 = arg1.method2048(255);
								if (this.aClass313_23 == null) {
									local50 = Static92.method1941(local43);
									this.aClass313_23 = new Class313(local50);
								}
								for (local50 = 0; local50 < local43; local50++) {
									@Pc(280) boolean local280 = arg1.method2048(255) == 1;
									@Pc(284) int local284 = arg1.method2061();
									@Pc(293) Class3 local293;
									if (local280) {
										local293 = new Class3_Sub40(arg1.method2014());
									} else {
										local293 = new Class3_Sub44(arg1.method2036());
									}
									this.aClass313_23.method7107((long) local284, local293);
								}
								return;
							}
							return;
						}
						local43 = arg1.method2048(255);
						this.anIntArray383 = new int[local43];
						this.aStringArray22 = new String[local43];
						this.anIntArray384 = new int[local43];
						this.anIntArray387 = new int[local43];
						for (local50 = 0; local50 < local43; local50++) {
							this.anIntArray383[local50] = arg1.method2036();
							this.anIntArray384[local50] = arg1.method2036();
							this.anIntArray387[local50] = arg1.method2036();
							this.aStringArray22[local50] = arg1.method2014();
						}
						return;
					}
					local43 = arg1.method2048(255);
					this.anIntArray389 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray389[local50] = arg1.method2028(-14795);
					}
					return;
				}
				local43 = arg1.method2048(255);
				this.anIntArray388 = new int[local43];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArray388[local50] = arg1.method2036();
				}
				return;
			}
		}
	}
}
