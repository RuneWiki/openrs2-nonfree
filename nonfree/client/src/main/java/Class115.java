import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class115 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!lp;")
	private Class140 aClass140_23;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public int anInt3400 = -1;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method2908() {
		if (this.aString42 == null) {
			this.aString42 = this.aString41;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!nj;ZI)V")
	private void method2909(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString41 = arg0.method4119();
		} else if (arg1 == 2) {
			this.aString42 = arg0.method4119();
		} else {
			@Pc(20) int local20;
			@Pc(27) int local27;
			if (arg1 == 3) {
				local20 = arg0.method4096();
				this.anIntArrayArray23 = new int[local20][3];
				for (local27 = 0; local27 < local20; local27++) {
					this.anIntArrayArray23[local27][0] = arg0.method4083();
					this.anIntArrayArray23[local27][1] = arg0.method4108();
					this.anIntArrayArray23[local27][2] = arg0.method4108();
				}
			} else if (arg1 == 4) {
				local20 = arg0.method4096();
				this.anIntArrayArray25 = new int[local20][3];
				for (local27 = 0; local27 < local20; local27++) {
					this.anIntArrayArray25[local27][0] = arg0.method4083();
					this.anIntArrayArray25[local27][1] = arg0.method4108();
					this.anIntArrayArray25[local27][2] = arg0.method4108();
				}
			} else if (arg1 == 5) {
				arg0.method4083();
			} else if (arg1 == 6) {
				arg0.method4096();
			} else if (arg1 == 7) {
				arg0.method4096();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4096();
				} else if (arg1 == 10) {
					local20 = arg0.method4096();
					this.anIntArray208 = new int[local20];
					for (local27 = 0; local27 < local20; local27++) {
						this.anIntArray208[local27] = arg0.method4108();
					}
				} else if (arg1 == 12) {
					arg0.method4108();
				} else if (arg1 == 13) {
					local20 = arg0.method4096();
					this.anIntArray207 = new int[local20];
					for (local27 = 0; local27 < local20; local27++) {
						this.anIntArray207[local27] = arg0.method4083();
					}
				} else if (arg1 == 14) {
					local20 = arg0.method4096();
					this.anIntArrayArray24 = new int[local20][2];
					for (local27 = 0; local27 < local20; local27++) {
						this.anIntArrayArray24[local27][0] = arg0.method4096();
						this.anIntArrayArray24[local27][1] = arg0.method4096();
					}
				} else if (arg1 == 15) {
					arg0.method4083();
				} else if (arg1 == 17) {
					this.anInt3400 = arg0.method4083();
				} else if (arg1 == 18) {
					local20 = arg0.method4096();
					this.anIntArray206 = new int[local20];
					this.aStringArray18 = new String[local20];
					this.anIntArray204 = new int[local20];
					this.anIntArray210 = new int[local20];
					for (local27 = 0; local27 < local20; local27++) {
						this.anIntArray204[local27] = arg0.method4108();
						this.anIntArray210[local27] = arg0.method4108();
						this.anIntArray206[local27] = arg0.method4108();
						this.aStringArray18[local27] = arg0.method4073();
					}
				} else if (arg1 == 19) {
					local20 = arg0.method4096();
					this.anIntArray205 = new int[local20];
					this.aStringArray19 = new String[local20];
					this.anIntArray203 = new int[local20];
					this.anIntArray202 = new int[local20];
					for (local27 = 0; local27 < local20; local27++) {
						this.anIntArray205[local27] = arg0.method4108();
						this.anIntArray203[local27] = arg0.method4108();
						this.anIntArray202[local27] = arg0.method4108();
						this.aStringArray19[local27] = arg0.method4073();
					}
				} else if (arg1 == 249) {
					local20 = arg0.method4096();
					if (this.aClass140_23 == null) {
						local27 = Static342.method4774(local20);
						this.aClass140_23 = new Class140(local27);
					}
					for (local27 = 0; local27 < local20; local27++) {
						@Pc(254) boolean local254 = arg0.method4096() == 1;
						@Pc(258) int local258 = arg0.method4099();
						@Pc(267) Class3 local267;
						if (local254) {
							local267 = new Class3_Sub35(arg0.method4073());
						} else {
							local267 = new Class3_Sub30(arg0.method4108());
						}
						this.aClass140_23.method3494((long) local258, local267);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!nj;)V")
	public void method2910(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4096();
			if (local17 == 0) {
				return;
			}
			this.method2909(arg0, local17);
		}
	}
}
