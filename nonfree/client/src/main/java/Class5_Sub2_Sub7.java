import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!hb", name = "kb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	private int anInt1205 = 0;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	private int anInt1207 = 128;

	@OriginalMember(owner = "client!hb", name = "hb", descriptor = "I")
	private int anInt1212 = 128;

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
	private int anInt1211 = 0;

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
	private int anInt1209 = 0;

	@OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
	public int anInt1213 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method850(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub2_Sub6 local13 = (Class5_Sub2_Sub2_Sub6) Static37.aClass29_9.method766((long) this.anInt1206);
		if (local13 == null) {
			@Pc(21) Class5_Sub2_Sub2_Sub1 local21 = Static15.method341(Static115.aClass26_30, this.anInt1214);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray15 != null) {
				for (local30 = 0; local30 < this.aShortArray15.length; local30++) {
					local21.method329(this.aShortArray15[local30], this.aShortArray17[local30]);
				}
			}
			if (this.aShortArray14 != null) {
				for (local30 = 0; local30 < this.aShortArray14.length; local30++) {
					local21.method343(this.aShortArray14[local30], this.aShortArray16[local30]);
				}
			}
			local13 = local21.method342(this.anInt1205 + 64, this.anInt1211 + 850, -30, -50, -30);
			Static37.aClass29_9.method762(local13, (long) this.anInt1206);
		}
		@Pc(118) Class5_Sub2_Sub2_Sub6 local118;
		if (this.anInt1213 == -1 || arg0 == -1) {
			local118 = local13.method2152(true);
		} else {
			local118 = Static106.method1769(this.anInt1213).method2058(arg0, local13);
		}
		if (this.anInt1212 != 128 || this.anInt1207 != 128) {
			local118.method2148(this.anInt1212, this.anInt1207, this.anInt1212);
		}
		if (this.anInt1209 != 0) {
			if (this.anInt1209 == 90) {
				local118.method2140();
			}
			if (this.anInt1209 == 180) {
				local118.method2140();
				local118.method2140();
			}
			if (this.anInt1209 == 270) {
				local118.method2140();
				local118.method2140();
				local118.method2140();
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!pa;I)V")
	private void method851(@OriginalArg(1) Class5_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1214 = arg0.method1478();
		} else if (arg1 == 2) {
			this.anInt1213 = arg0.method1478();
		} else if (arg1 == 4) {
			this.anInt1212 = arg0.method1478();
		} else if (arg1 == 5) {
			this.anInt1207 = arg0.method1478();
		} else if (arg1 == 6) {
			this.anInt1209 = arg0.method1478();
		} else if (arg1 == 7) {
			this.anInt1205 = arg0.method1471();
		} else if (arg1 == 8) {
			this.anInt1211 = arg0.method1471();
		} else {
			@Pc(78) int local78;
			@Pc(88) int local88;
			if (arg1 == 40) {
				local78 = arg0.method1471();
				this.aShortArray15 = new short[local78];
				this.aShortArray17 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray15[local88] = (short) arg0.method1478();
					this.aShortArray17[local88] = (short) arg0.method1478();
				}
			} else if (arg1 == 41) {
				local78 = arg0.method1471();
				this.aShortArray16 = new short[local78];
				this.aShortArray14 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray14[local88] = (short) arg0.method1478();
					this.aShortArray16[local88] = (short) arg0.method1478();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!pa;)V")
	public void method854(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1471();
			if (local14 == 0) {
				return;
			}
			this.method851(arg0, local14);
		}
	}
}
