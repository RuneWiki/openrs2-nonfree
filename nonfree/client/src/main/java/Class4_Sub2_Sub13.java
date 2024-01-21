import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
	private int anInt2541;

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
	public int anInt2549;

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
	private int anInt2546 = 0;

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "[S")
	private final short[] aShortArray9 = new short[6];

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
	private int anInt2544 = 128;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "I")
	private int anInt2550 = 128;

	@OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
	private int anInt2553 = 0;

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "[S")
	private final short[] aShortArray8 = new short[6];

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	public int anInt2545 = -1;

	@OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
	private int anInt2555 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!s;)V")
	public void method1839(@OriginalArg(1) Class4_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1474();
			if (local9 == 0) {
				return;
			}
			this.method1841(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!s;I)V")
	private void method1841(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt2541 = arg1.method1490();
		} else if (arg0 == 2) {
			this.anInt2545 = arg1.method1490();
		} else if (arg0 == 4) {
			this.anInt2544 = arg1.method1490();
		} else if (arg0 == 5) {
			this.anInt2550 = arg1.method1490();
		} else if (arg0 == 6) {
			this.anInt2553 = arg1.method1490();
		} else if (arg0 == 7) {
			this.anInt2555 = arg1.method1474();
		} else if (arg0 == 8) {
			this.anInt2546 = arg1.method1474();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray8[arg0 - 40] = (short) arg1.method1490();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray9[arg0 - 50] = (short) arg1.method1490();
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method1843(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub2_Sub1_Sub6 local9 = (Class4_Sub2_Sub1_Sub6) Static10.aClass12_12.method235((long) this.anInt2549);
		if (local9 == null) {
			@Pc(21) Class4_Sub2_Sub1_Sub4 local21 = Static95.method1747(Static19.aClass20_14, this.anInt2541);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray8[0] != 0) {
					local21.method1731(this.aShortArray8[local27], this.aShortArray9[local27]);
				}
			}
			local9 = local21.method1743(this.anInt2555 + 64, this.anInt2546 + 850, -30, -50, -30);
			Static10.aClass12_12.method234(local9, (long) this.anInt2549);
		}
		@Pc(90) Class4_Sub2_Sub1_Sub6 local90;
		if (this.anInt2545 == -1 || arg0 == -1) {
			local90 = local9.method2138(true);
		} else {
			local90 = Static116.method2017(this.anInt2545).method211(local9, arg0);
		}
		if (this.anInt2544 != 128 || this.anInt2550 != 128) {
			local90.method2129(this.anInt2544, this.anInt2550, this.anInt2544);
		}
		if (this.anInt2553 != 0) {
			if (this.anInt2553 == 90) {
				local90.method2137();
			}
			if (this.anInt2553 == 180) {
				local90.method2137();
				local90.method2137();
			}
			if (this.anInt2553 == 270) {
				local90.method2137();
				local90.method2137();
				local90.method2137();
			}
		}
		return local90;
	}
}
