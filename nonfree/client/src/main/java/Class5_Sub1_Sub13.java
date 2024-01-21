import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	public int anInt2103;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
	private int anInt2114;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	private int anInt2102 = 128;

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
	private int anInt2111 = 128;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
	private int anInt2109 = 0;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[S")
	private final short[] aShortArray5 = new short[6];

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	private int anInt2115 = 0;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	private int anInt2112 = 0;

	@OriginalMember(owner = "client!qd", name = "ob", descriptor = "[S")
	private final short[] aShortArray6 = new short[6];

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	public int anInt2101 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qe;II)V")
	private void method1428(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2114 = arg0.method1543();
		} else if (arg1 == 2) {
			this.anInt2101 = arg0.method1543();
		} else if (arg1 == 4) {
			this.anInt2111 = arg0.method1543();
		} else if (arg1 == 5) {
			this.anInt2102 = arg0.method1543();
		} else if (arg1 == 6) {
			this.anInt2109 = arg0.method1543();
		} else if (arg1 == 7) {
			this.anInt2112 = arg0.method1546();
		} else if (arg1 == 8) {
			this.anInt2115 = arg0.method1546();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray5[arg1 - 40] = (short) arg0.method1543();
			return;
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray6[arg1 - 50] = (short) arg0.method1543();
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method1432(@OriginalArg(0) Class5_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1546();
			if (local5 == 0) {
				return;
			}
			this.method1428(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1435(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub1_Sub1_Sub2 local9 = (Class5_Sub1_Sub1_Sub2) Static102.aClass54_35.method1397((long) this.anInt2103);
		if (local9 == null) {
			@Pc(21) Class5_Sub1_Sub1_Sub7 local21 = Static120.method1985(Static33.aClass24_11, this.anInt2114);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray5[0] != 0) {
					local21.method1988(this.aShortArray5[local27], this.aShortArray6[local27]);
				}
			}
			local9 = local21.method1987(this.anInt2112 + 64, this.anInt2115 + 850, -30, -50, -30);
			Static102.aClass54_35.method1399(local9, (long) this.anInt2103);
		}
		@Pc(89) Class5_Sub1_Sub1_Sub2 local89;
		if (this.anInt2101 == -1 || arg0 == -1) {
			local89 = local9.method252(true);
		} else {
			local89 = Static57.method1017(this.anInt2101).method1953(local9, arg0);
		}
		if (this.anInt2111 != 128 || this.anInt2102 != 128) {
			local89.method236(this.anInt2111, this.anInt2102, this.anInt2111);
		}
		if (this.anInt2109 != 0) {
			if (this.anInt2109 == 90) {
				local89.method240();
			}
			if (this.anInt2109 == 180) {
				local89.method240();
				local89.method240();
			}
			if (this.anInt2109 == 270) {
				local89.method240();
				local89.method240();
				local89.method240();
			}
		}
		return local89;
	}
}
