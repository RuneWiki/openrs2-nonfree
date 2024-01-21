import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!id", name = "W", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!id", name = "wb", descriptor = "I")
	private int anInt1592;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "[S")
	private final short[] aShortArray6 = new short[6];

	@OriginalMember(owner = "client!id", name = "xb", descriptor = "I")
	public int anInt1593 = -1;

	@OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
	private int anInt1589 = 0;

	@OriginalMember(owner = "client!id", name = "Bb", descriptor = "I")
	private int anInt1596 = 128;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	private int anInt1587 = 0;

	@OriginalMember(owner = "client!id", name = "Cb", descriptor = "I")
	private int anInt1597 = 128;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[S")
	private final short[] aShortArray5 = new short[6];

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
	private int anInt1590 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!la;I)V")
	private void method1051(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1592 = arg1.method1963();
		} else if (arg0 == 2) {
			this.anInt1593 = arg1.method1963();
		} else if (arg0 == 4) {
			this.anInt1596 = arg1.method1963();
		} else if (arg0 == 5) {
			this.anInt1597 = arg1.method1963();
		} else if (arg0 == 6) {
			this.anInt1590 = arg1.method1963();
		} else if (arg0 == 7) {
			this.anInt1587 = arg1.method1936();
		} else if (arg0 == 8) {
			this.anInt1589 = arg1.method1936();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray5[arg0 - 40] = (short) arg1.method1963();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray6[arg0 - 50] = (short) arg1.method1963();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!la;B)V")
	public void method1053(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1936();
			if (local17 == 0) {
				return;
			}
			this.method1051(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1055(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub1_Sub1_Sub4 local18 = (Class3_Sub1_Sub1_Sub4) Static130.aClass17_57.method643((long) this.anInt1586);
		if (local18 == null) {
			@Pc(26) Class3_Sub1_Sub1_Sub7 local26 = Static121.method2242(Static63.aClass25_29, this.anInt1592);
			if (local26 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.aShortArray5[0] != 0) {
					local26.method2233(this.aShortArray5[local32], this.aShortArray6[local32]);
				}
			}
			local18 = local26.method2229(this.anInt1587 + 64, this.anInt1589 + 850, -30, -50, -30);
			Static130.aClass17_57.method644((long) this.anInt1586, local18);
		}
		@Pc(86) Class3_Sub1_Sub1_Sub4 local86;
		if (this.anInt1593 == -1 || arg0 == -1) {
			local86 = local18.method629(true);
		} else {
			local86 = Static109.method2054(this.anInt1593).method1591(arg0, local18);
		}
		if (this.anInt1596 != 128 || this.anInt1597 != 128) {
			local86.method632(this.anInt1596, this.anInt1597, this.anInt1596);
		}
		if (this.anInt1590 != 0) {
			if (this.anInt1590 == 90) {
				local86.method633();
			}
			if (this.anInt1590 == 180) {
				local86.method633();
				local86.method633();
			}
			if (this.anInt1590 == 270) {
				local86.method633();
				local86.method633();
				local86.method633();
			}
		}
		return local86;
	}
}
