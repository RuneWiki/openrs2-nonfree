import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class218 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!wa;")
	private Class354 aClass354_30;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray129;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray130;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray131;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public int anInt6029 = -1;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method5090() {
		if (this.aString42 == null) {
			this.aString42 = this.aString43;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!np;IB)V")
	private void method5092(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString43 = arg0.method5210();
		} else if (arg1 == 2) {
			this.aString42 = arg0.method5210();
		} else {
			@Pc(43) int local43;
			@Pc(50) int local50;
			if (arg1 == 3) {
				local43 = arg0.method5175();
				this.anIntArrayArray130 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray130[local50][0] = arg0.method5198();
					this.anIntArrayArray130[local50][1] = arg0.method5186();
					this.anIntArrayArray130[local50][2] = arg0.method5186();
				}
			} else if (arg1 == 4) {
				local43 = arg0.method5175();
				this.anIntArrayArray131 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray131[local50][0] = arg0.method5198();
					this.anIntArrayArray131[local50][1] = arg0.method5186();
					this.anIntArrayArray131[local50][2] = arg0.method5186();
				}
			} else if (arg1 == 5) {
				arg0.method5198();
			} else if (arg1 == 6) {
				arg0.method5175();
			} else if (arg1 == 7) {
				arg0.method5175();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5175();
				} else if (arg1 == 10) {
					local43 = arg0.method5175();
					this.anIntArray329 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray329[local50] = arg0.method5186();
					}
				} else if (arg1 == 12) {
					arg0.method5186();
				} else if (arg1 == 13) {
					local43 = arg0.method5175();
					this.anIntArray327 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray327[local50] = arg0.method5198();
					}
				} else if (arg1 == 14) {
					local43 = arg0.method5175();
					this.anIntArrayArray129 = new int[local43][2];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArrayArray129[local50][0] = arg0.method5175();
						this.anIntArrayArray129[local50][1] = arg0.method5175();
					}
				} else if (arg1 == 15) {
					arg0.method5198();
				} else if (arg1 == 17) {
					this.anInt6029 = arg0.method5198();
				} else if (arg1 == 18) {
					local43 = arg0.method5175();
					this.aStringArray26 = new String[local43];
					this.anIntArray325 = new int[local43];
					this.anIntArray324 = new int[local43];
					this.anIntArray326 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray324[local50] = arg0.method5186();
						this.anIntArray326[local50] = arg0.method5186();
						this.anIntArray325[local50] = arg0.method5186();
						this.aStringArray26[local50] = arg0.method5181();
					}
				} else if (arg1 == 19) {
					local43 = arg0.method5175();
					this.aStringArray25 = new String[local43];
					this.anIntArray328 = new int[local43];
					this.anIntArray332 = new int[local43];
					this.anIntArray330 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray328[local50] = arg0.method5186();
						this.anIntArray332[local50] = arg0.method5186();
						this.anIntArray330[local50] = arg0.method5186();
						this.aStringArray25[local50] = arg0.method5181();
					}
				} else if (arg1 == 249) {
					local43 = arg0.method5175();
					if (this.aClass354_30 == null) {
						local50 = Static371.method5424(local43);
						this.aClass354_30 = new Class354(local50);
					}
					for (local50 = 0; local50 < local43; local50++) {
						@Pc(307) boolean local307 = arg0.method5175() == 1;
						@Pc(311) int local311 = arg0.method5230();
						@Pc(320) Class3 local320;
						if (local307) {
							local320 = new Class3_Sub29(arg0.method5181());
						} else {
							local320 = new Class3_Sub17(arg0.method5186());
						}
						this.aClass354_30.method7691(local320, (long) local311);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!np;B)V")
	public void method5093(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5175();
			if (local17 == 0) {
				return;
			}
			this.method5092(arg0, local17);
		}
	}
}
