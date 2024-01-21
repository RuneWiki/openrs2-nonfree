import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "I")
	private int anInt2822;

	@OriginalMember(owner = "client!ue", name = "pb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!ue", name = "vb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!ue", name = "wb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	private int anInt2812 = 128;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	private int anInt2811 = 128;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
	private int anInt2814 = 0;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
	private int anInt2818 = 0;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
	private int anInt2815 = 0;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	public int anInt2810 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!na;II)V")
	private void method2025(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2822 = arg0.method632();
		} else if (arg1 == 2) {
			this.anInt2810 = arg0.method632();
		} else if (arg1 == 4) {
			this.anInt2811 = arg0.method632();
		} else if (arg1 == 5) {
			this.anInt2812 = arg0.method632();
		} else if (arg1 == 6) {
			this.anInt2814 = arg0.method632();
		} else if (arg1 == 7) {
			this.anInt2818 = arg0.method640();
		} else if (arg1 == 8) {
			this.anInt2815 = arg0.method640();
		} else {
			@Pc(71) int local71;
			@Pc(81) int local81;
			if (arg1 == 40) {
				local71 = arg0.method640();
				this.aShortArray23 = new short[local71];
				this.aShortArray21 = new short[local71];
				for (local81 = 0; local81 < local71; local81++) {
					this.aShortArray23[local81] = (short) arg0.method632();
					this.aShortArray21[local81] = (short) arg0.method632();
				}
				return;
			}
			if (arg1 == 41) {
				local71 = arg0.method640();
				this.aShortArray22 = new short[local71];
				this.aShortArray24 = new short[local71];
				for (local81 = 0; local81 < local71; local81++) {
					this.aShortArray24[local81] = (short) arg0.method632();
					this.aShortArray22[local81] = (short) arg0.method632();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method2026(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub1_Sub1_Sub2 local9 = (Class2_Sub1_Sub1_Sub2) Static79.aClass55_61.method1410((long) this.anInt2813);
		if (local9 == null) {
			@Pc(21) Class2_Sub1_Sub1_Sub7 local21 = Static131.method2175(Static104.aClass24_29, this.anInt2822);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray23 != null) {
				for (local30 = 0; local30 < this.aShortArray23.length; local30++) {
					local21.method2184(this.aShortArray23[local30], this.aShortArray21[local30]);
				}
			}
			if (this.aShortArray24 != null) {
				for (local30 = 0; local30 < this.aShortArray24.length; local30++) {
					local21.method2191(this.aShortArray24[local30], this.aShortArray22[local30]);
				}
			}
			local9 = local21.method2176(this.anInt2818 + 64, 850 - -this.anInt2815, -30, -50, -30);
			Static79.aClass55_61.method1411((long) this.anInt2813, local9);
		}
		@Pc(113) Class2_Sub1_Sub1_Sub2 local113;
		if (this.anInt2810 == -1 || arg0 == -1) {
			local113 = local9.method118(true);
		} else {
			local113 = Static40.method724(this.anInt2810).method1265(arg0, local9);
		}
		if (this.anInt2811 != 128 || this.anInt2812 != 128) {
			local113.method112(this.anInt2811, this.anInt2812, this.anInt2811);
		}
		if (this.anInt2814 != 0) {
			if (this.anInt2814 == 90) {
				local113.method111();
			}
			if (this.anInt2814 == 180) {
				local113.method111();
				local113.method111();
			}
			if (this.anInt2814 == 270) {
				local113.method111();
				local113.method111();
				local113.method111();
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!na;)V")
	public void method2029(@OriginalArg(1) Class2_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method640();
			if (local5 == 0) {
				return;
			}
			this.method2025(arg0, local5);
		}
	}
}
