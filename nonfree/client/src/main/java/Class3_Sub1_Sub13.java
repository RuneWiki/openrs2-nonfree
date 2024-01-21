import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!n", name = "L", descriptor = "I")
	private int anInt2367;

	@OriginalMember(owner = "client!n", name = "O", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!n", name = "W", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!n", name = "X", descriptor = "I")
	public int anInt2373;

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!n", name = "eb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
	private int anInt2374 = 128;

	@OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
	private int anInt2376 = 0;

	@OriginalMember(owner = "client!n", name = "U", descriptor = "I")
	private int anInt2372 = 0;

	@OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
	public int anInt2378 = -1;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
	private int anInt2375 = 128;

	@OriginalMember(owner = "client!n", name = "db", descriptor = "I")
	private int anInt2377 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ff;I)V")
	private void method1829(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2367 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt2378 = arg0.method1359();
		} else if (arg1 == 4) {
			this.anInt2374 = arg0.method1359();
		} else if (arg1 == 5) {
			this.anInt2375 = arg0.method1359();
		} else if (arg1 == 6) {
			this.anInt2377 = arg0.method1359();
		} else if (arg1 == 7) {
			this.anInt2376 = arg0.method1354();
		} else if (arg1 == 8) {
			this.anInt2372 = arg0.method1354();
		} else {
			@Pc(66) int local66;
			@Pc(76) int local76;
			if (arg1 == 40) {
				local66 = arg0.method1354();
				this.aShortArray26 = new short[local66];
				this.aShortArray29 = new short[local66];
				for (local76 = 0; local76 < local66; local76++) {
					this.aShortArray29[local76] = (short) arg0.method1359();
					this.aShortArray26[local76] = (short) arg0.method1359();
				}
			} else if (arg1 == 41) {
				local66 = arg0.method1354();
				this.aShortArray28 = new short[local66];
				this.aShortArray27 = new short[local66];
				for (local76 = 0; local76 < local66; local76++) {
					this.aShortArray28[local76] = (short) arg0.method1359();
					this.aShortArray27[local76] = (short) arg0.method1359();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ff;B)V")
	public void method1830(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1354();
			if (local7 == 0) {
				return;
			}
			this.method1829(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1831(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub1_Sub4_Sub5 local9 = (Class3_Sub1_Sub4_Sub5) Static112.aClass7_19.method183((long) this.anInt2373);
		if (local9 == null) {
			@Pc(21) Class3_Sub1_Sub4_Sub4 local21 = Static89.method1571(Static141.aClass13_27, this.anInt2367);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray29 != null) {
				for (local30 = 0; local30 < this.aShortArray29.length; local30++) {
					local21.method1552(this.aShortArray29[local30], this.aShortArray26[local30]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local30 = 0; local30 < this.aShortArray28.length; local30++) {
					local21.method1565(this.aShortArray28[local30], this.aShortArray27[local30]);
				}
			}
			local9 = local21.method1558(this.anInt2376 + 64, this.anInt2372 + 850, -30, -50, -30, true);
			Static112.aClass7_19.method186(local9, (long) this.anInt2373);
		}
		@Pc(120) Class3_Sub1_Sub4_Sub5 local120;
		if (this.anInt2378 == -1 || arg0 == -1) {
			local120 = local9.method1883(true);
		} else {
			local120 = Static98.method1697(this.anInt2378).method985(local9, arg0);
		}
		if (this.anInt2374 != 128 || this.anInt2375 != 128) {
			local120.method1885(this.anInt2374, this.anInt2375, this.anInt2374);
		}
		if (this.anInt2377 != 0) {
			if (this.anInt2377 == 90) {
				local120.method1892();
			}
			if (this.anInt2377 == 180) {
				local120.method1892();
				local120.method1892();
			}
			if (this.anInt2377 == 270) {
				local120.method1892();
				local120.method1892();
				local120.method1892();
			}
		}
		return local120;
	}
}
