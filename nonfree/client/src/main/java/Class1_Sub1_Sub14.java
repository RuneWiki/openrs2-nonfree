import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "[S")
	private final short[] aShortArray10 = new short[6];

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
	private int anInt2605 = 0;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "[S")
	private final short[] aShortArray9 = new short[6];

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
	private int anInt2612 = 0;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
	private int anInt2606 = 128;

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "I")
	public int anInt2616 = -1;

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
	private int anInt2613 = 0;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
	private int anInt2603 = 128;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qc;I)V")
	public void method1837(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2169();
			if (local9 == 0) {
				return;
			}
			this.method1841(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1840(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub1_Sub2_Sub7 local19 = (Class1_Sub1_Sub2_Sub7) Static47.aClass33_17.method1038((long) this.anInt2608);
		if (local19 == null) {
			@Pc(27) Class1_Sub1_Sub2_Sub5 local27 = Static60.method1097(Static52.aClass62_14, this.anInt2617);
			if (local27 == null) {
				return null;
			}
			for (@Pc(33) int local33 = 0; local33 < 6; local33++) {
				if (this.aShortArray9[0] != 0) {
					local27.method1104(this.aShortArray9[local33], this.aShortArray10[local33]);
				}
			}
			local19 = local27.method1101(this.anInt2613 + 64, this.anInt2605 + 850, -30, -50, -30);
			Static47.aClass33_17.method1042(local19, (long) this.anInt2608);
		}
		@Pc(91) Class1_Sub1_Sub2_Sub7 local91;
		if (this.anInt2616 == -1 || arg0 == -1) {
			local91 = local19.method1379(true);
		} else {
			local91 = Static82.method1398(this.anInt2616).method629(local19, arg0);
		}
		if (this.anInt2603 != 128 || this.anInt2606 != 128) {
			local91.method1383(this.anInt2603, this.anInt2606, this.anInt2603);
		}
		if (this.anInt2612 != 0) {
			if (this.anInt2612 == 90) {
				local91.method1374();
			}
			if (this.anInt2612 == 180) {
				local91.method1374();
				local91.method1374();
			}
			if (this.anInt2612 == 270) {
				local91.method1374();
				local91.method1374();
				local91.method1374();
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!qc;I)V")
	private void method1841(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2617 = arg0.method2156();
		} else if (arg1 == 2) {
			this.anInt2616 = arg0.method2156();
		} else if (arg1 == 4) {
			this.anInt2603 = arg0.method2156();
		} else if (arg1 == 5) {
			this.anInt2606 = arg0.method2156();
		} else if (arg1 == 6) {
			this.anInt2612 = arg0.method2156();
		} else if (arg1 == 7) {
			this.anInt2613 = arg0.method2169();
		} else if (arg1 == 8) {
			this.anInt2605 = arg0.method2169();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray9[arg1 - 40] = (short) arg0.method2156();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray10[arg1 - 50] = (short) arg0.method2156();
		}
	}
}
