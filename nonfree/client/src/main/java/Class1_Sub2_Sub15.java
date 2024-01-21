import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	private int anInt2078;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
	public int anInt2083 = -1;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	private int anInt2076 = 0;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "[S")
	private final short[] aShortArray8 = new short[6];

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
	private int anInt2077 = 128;

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
	private int anInt2085 = 128;

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
	private int anInt2080 = 0;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
	private int anInt2082 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1553(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub3_Sub2 local13 = (Class1_Sub2_Sub3_Sub2) Static99.aClass63_19.method1517((long) this.anInt2074);
		if (local13 == null) {
			@Pc(21) Class1_Sub2_Sub3_Sub7 local21 = Static117.method1886(Static13.aClass56_14, this.anInt2078);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray8[0] != 0) {
					local21.method1888(this.aShortArray8[local27], this.aShortArray7[local27]);
				}
			}
			local13 = local21.method1893(this.anInt2076 + 64, 850 - -this.anInt2080, -30, -50, -30);
			Static99.aClass63_19.method1520(local13, (long) this.anInt2074);
		}
		@Pc(92) Class1_Sub2_Sub3_Sub2 local92;
		if (this.anInt2083 == -1 || arg0 == -1) {
			local92 = local13.method463(true);
		} else {
			local92 = Static34.method755(this.anInt2083).method1680(arg0, local13);
		}
		if (this.anInt2077 != 128 || this.anInt2085 != 128) {
			local92.method473(this.anInt2077, this.anInt2085, this.anInt2077);
		}
		if (this.anInt2082 != 0) {
			if (this.anInt2082 == 90) {
				local92.method467();
			}
			if (this.anInt2082 == 180) {
				local92.method467();
				local92.method467();
			}
			if (this.anInt2082 == 270) {
				local92.method467();
				local92.method467();
				local92.method467();
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!dc;Z)V")
	public void method1557(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method672();
			if (local9 == 0) {
				return;
			}
			this.method1558(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method1558(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2078 = arg1.method651();
		} else if (arg0 == 2) {
			this.anInt2083 = arg1.method651();
		} else if (arg0 == 4) {
			this.anInt2077 = arg1.method651();
		} else if (arg0 == 5) {
			this.anInt2085 = arg1.method651();
		} else if (arg0 == 6) {
			this.anInt2082 = arg1.method651();
		} else if (arg0 == 7) {
			this.anInt2076 = arg1.method672();
		} else if (arg0 == 8) {
			this.anInt2080 = arg1.method672();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray8[arg0 - 40] = (short) arg1.method651();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray7[arg0 - 50] = (short) arg1.method651();
		}
	}
}
