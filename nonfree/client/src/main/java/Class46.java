import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class46 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public int anInt1562;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	private int anInt1561 = 0;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private int anInt1566 = 0;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private int anInt1565 = 128;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	private int anInt1560 = 128;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	private int anInt1571 = 0;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public int anInt1563 = -1;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!pg;I)V")
	private void method1126(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1573 = arg0.method2178();
		} else if (arg1 == 2) {
			this.anInt1563 = arg0.method2178();
		} else if (arg1 == 4) {
			this.anInt1565 = arg0.method2178();
		} else if (arg1 == 5) {
			this.anInt1560 = arg0.method2178();
		} else if (arg1 == 6) {
			this.anInt1571 = arg0.method2178();
		} else if (arg1 == 7) {
			this.anInt1566 = arg0.method2142();
		} else if (arg1 == 8) {
			this.anInt1561 = arg0.method2142();
		} else if (arg1 == 9) {
			this.aBoolean73 = true;
		} else {
			@Pc(83) int local83;
			@Pc(93) int local93;
			if (arg1 == 40) {
				local83 = arg0.method2142();
				this.aShortArray17 = new short[local83];
				this.aShortArray16 = new short[local83];
				for (local93 = 0; local93 < local83; local93++) {
					this.aShortArray16[local93] = (short) arg0.method2178();
					this.aShortArray17[local93] = (short) arg0.method2178();
				}
			} else if (arg1 == 41) {
				local83 = arg0.method2142();
				this.aShortArray15 = new short[local83];
				this.aShortArray14 = new short[local83];
				for (local93 = 0; local93 < local83; local93++) {
					this.aShortArray15[local93] = (short) arg0.method2178();
					this.aShortArray14[local93] = (short) arg0.method2178();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method1127(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method1126(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!ra;")
	public Class20_Sub5 method1128(@OriginalArg(1) int arg0) {
		@Pc(13) Class20_Sub5 local13 = (Class20_Sub5) Static182.aClass84_31.method2579((long) this.anInt1562);
		if (local13 == null) {
			@Pc(21) Class20_Sub4 local21 = Static89.method1399(Static188.aClass86_72, this.anInt1573);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray16 != null) {
				for (local30 = 0; local30 < this.aShortArray16.length; local30++) {
					local21.method1406(this.aShortArray16[local30], this.aShortArray17[local30]);
				}
			}
			if (this.aShortArray15 != null) {
				for (local30 = 0; local30 < this.aShortArray15.length; local30++) {
					local21.method1398(this.aShortArray15[local30], this.aShortArray14[local30]);
				}
			}
			local13 = local21.method1402(this.anInt1566 + 64, this.anInt1561 + 850, -30, -50, -30);
			Static182.aClass84_31.method2582(local13, (long) this.anInt1562);
		}
		@Pc(115) Class20_Sub5 local115;
		if (this.anInt1563 == -1 || arg0 == -1) {
			local115 = local13.method1708(true, true);
		} else {
			local115 = Static200.method3204(this.anInt1563).method3188(local13, arg0);
		}
		if (this.anInt1565 != 128 || this.anInt1560 != 128) {
			local115.method1697(this.anInt1565, this.anInt1560, this.anInt1565);
		}
		if (this.anInt1571 != 0) {
			if (this.anInt1571 == 90) {
				local115.method1709();
			}
			if (this.anInt1571 == 180) {
				local115.method1692();
			}
			if (this.anInt1571 == 270) {
				local115.method1706();
			}
		}
		return local115;
	}
}
