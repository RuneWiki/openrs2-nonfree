import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
	public int anInt2577;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	private int anInt2557 = 0;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
	private final int[] anIntArray365 = new int[6];

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	private int anInt2565 = 0;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
	private int anInt2570 = 0;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
	private int anInt2573 = 128;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "[I")
	private final int[] anIntArray367 = new int[6];

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
	public int anInt2572 = -1;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
	private int anInt2568 = 128;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1600(@OriginalArg(0) int arg0) {
		@Pc(21) Class2_Sub1_Sub4_Sub5 local21 = (Class2_Sub1_Sub4_Sub5) Static55.aClass17_70.method786((long) this.anInt2577);
		if (local21 == null) {
			local21 = Static35.method896(Static3.aClass11_4, this.anInt2575);
			if (local21 == null) {
				return null;
			}
			for (@Pc(35) int local35 = 0; local35 < 6; local35++) {
				if (this.anIntArray367[0] != 0) {
					local21.method924(this.anIntArray367[local35], this.anIntArray365[local35]);
				}
			}
			local21.method897();
			local21.method904(this.anInt2570 + 64, this.anInt2557 + 850, -30, -50, -30, true);
			Static55.aClass17_70.method783(local21, (long) this.anInt2577);
		}
		@Pc(97) Class2_Sub1_Sub4_Sub5 local97;
		if (this.anInt2572 == -1 || arg0 == -1) {
			local97 = local21.method906(true);
		} else {
			local97 = Static54.method1158(this.anInt2572).method1306(local21, arg0);
		}
		if (this.anInt2573 != 128 || this.anInt2568 != 128) {
			local97.method895(this.anInt2573, this.anInt2568, this.anInt2573);
		}
		if (this.anInt2565 != 0) {
			if (this.anInt2565 == 90) {
				local97.method901();
			}
			if (this.anInt2565 == 180) {
				local97.method901();
				local97.method901();
			}
			if (this.anInt2565 == 270) {
				local97.method901();
				local97.method901();
				local97.method901();
			}
		}
		return local97;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1602(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method665();
			if (local9 == 0) {
				return;
			}
			this.method1604(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!pd;BI)V")
	private void method1604(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2575 = arg0.method627();
		} else if (arg1 == 2) {
			this.anInt2572 = arg0.method627();
		} else if (arg1 == 4) {
			this.anInt2573 = arg0.method627();
		} else if (arg1 == 5) {
			this.anInt2568 = arg0.method627();
		} else if (arg1 == 6) {
			this.anInt2565 = arg0.method627();
		} else if (arg1 == 7) {
			this.anInt2570 = arg0.method665();
		} else if (arg1 == 8) {
			this.anInt2557 = arg0.method665();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray367[arg1 - 40] = arg0.method627();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray365[arg1 - 50] = arg0.method627();
		}
	}
}
