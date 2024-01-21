import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
	private int anInt2207;

	@OriginalMember(owner = "client!s", name = "ub", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
	private int anInt2198 = 128;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
	private int anInt2202 = 128;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
	private final int[] anIntArray280 = new int[6];

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
	private int anInt2197 = 0;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "[I")
	private final int[] anIntArray281 = new int[6];

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	private int anInt2201 = 0;

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "I")
	public int anInt2212 = -1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!gb;I)V")
	private void method1481(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2207 = arg1.method459();
		} else if (arg0 == 2) {
			this.anInt2212 = arg1.method459();
		} else if (arg0 == 4) {
			this.anInt2202 = arg1.method459();
		} else if (arg0 == 5) {
			this.anInt2198 = arg1.method459();
		} else if (arg0 == 6) {
			this.anInt2201 = arg1.method459();
		} else if (arg0 == 7) {
			this.anInt2199 = arg1.method446();
		} else if (arg0 == 8) {
			this.anInt2197 = arg1.method446();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray280[arg0 - 40] = arg1.method459();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray281[arg0 - 50] = arg1.method459();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1484(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub1_Sub1_Sub4 local13 = (Class3_Sub1_Sub1_Sub4) Static7.aClass8_3.method195((long) this.anInt2208);
		if (local13 == null) {
			local13 = Static41.method789(Static98.aClass64_68, this.anInt2207);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray280[0] != 0) {
					local13.method771(this.anIntArray280[local27], this.anIntArray281[local27]);
				}
			}
			local13.method768();
			local13.method781(this.anInt2199 + 64, this.anInt2197 + 850, -30, -50, -30, true);
			Static7.aClass8_3.method199((long) this.anInt2208, local13);
		}
		@Pc(85) Class3_Sub1_Sub1_Sub4 local85;
		if (this.anInt2212 == -1 || arg0 == -1) {
			local85 = local13.method775(true);
		} else {
			local85 = Static67.method1107(this.anInt2212).method1078(local13, arg0);
		}
		if (this.anInt2202 != 128 || this.anInt2198 != 128) {
			local85.method763(this.anInt2202, this.anInt2198, this.anInt2202);
		}
		if (this.anInt2201 != 0) {
			if (this.anInt2201 == 90) {
				local85.method770();
			}
			if (this.anInt2201 == 180) {
				local85.method770();
				local85.method770();
			}
			if (this.anInt2201 == 270) {
				local85.method770();
				local85.method770();
				local85.method770();
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!gb;)V")
	public void method1485(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method446();
			if (local9 == 0) {
				return;
			}
			this.method1481(local9, arg0);
		}
	}
}
