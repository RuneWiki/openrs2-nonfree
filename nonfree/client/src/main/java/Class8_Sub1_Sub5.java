import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class8_Sub1_Sub5 extends Class8_Sub1 {

	@OriginalMember(owner = "client!da", name = "W", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!da", name = "rb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!da", name = "db", descriptor = "I")
	private int anInt645 = 0;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public int anInt638 = -1;

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
	private int anInt649 = 128;

	@OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
	private int anInt650 = 0;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
	private int anInt652 = 128;

	@OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
	private int anInt651 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method381(@OriginalArg(1) int arg0) {
		@Pc(13) Class8_Sub1_Sub1_Sub6 local13 = (Class8_Sub1_Sub1_Sub6) Static49.aClass48_26.method1100((long) this.anInt647);
		if (local13 == null) {
			@Pc(21) Class8_Sub1_Sub1_Sub3 local21 = Static26.method472(Static14.aClass14_2, this.anInt646);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray7 != null) {
				for (local30 = 0; local30 < this.aShortArray7.length; local30++) {
					local21.method490(this.aShortArray7[local30], this.aShortArray8[local30]);
				}
			}
			if (this.aShortArray9 != null) {
				for (local30 = 0; local30 < this.aShortArray9.length; local30++) {
					local21.method485(this.aShortArray9[local30], this.aShortArray10[local30]);
				}
			}
			local13 = local21.method479(this.anInt651 + 64, this.anInt650 + 850, -30, -50, -30);
			Static49.aClass48_26.method1097(local13, (long) this.anInt647);
		}
		@Pc(115) Class8_Sub1_Sub1_Sub6 local115;
		if (this.anInt638 == -1 || arg0 == -1) {
			local115 = local13.method1273(true);
		} else {
			local115 = Static47.method733(this.anInt638).method416(arg0, local13);
		}
		if (this.anInt652 != 128 || this.anInt649 != 128) {
			local115.method1290(this.anInt652, this.anInt649, this.anInt652);
		}
		if (this.anInt645 != 0) {
			if (this.anInt645 == 90) {
				local115.method1281();
			}
			if (this.anInt645 == 180) {
				local115.method1281();
				local115.method1281();
			}
			if (this.anInt645 == 270) {
				local115.method1281();
				local115.method1281();
				local115.method1281();
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method382(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt646 = arg0.method1839();
		} else if (arg1 == 2) {
			this.anInt638 = arg0.method1839();
		} else if (arg1 == 4) {
			this.anInt652 = arg0.method1839();
		} else if (arg1 == 5) {
			this.anInt649 = arg0.method1839();
		} else if (arg1 == 6) {
			this.anInt645 = arg0.method1839();
		} else if (arg1 == 7) {
			this.anInt651 = arg0.method1872();
		} else if (arg1 == 8) {
			this.anInt650 = arg0.method1872();
		} else {
			@Pc(68) int local68;
			@Pc(78) int local78;
			if (arg1 == 40) {
				local68 = arg0.method1872();
				this.aShortArray7 = new short[local68];
				this.aShortArray8 = new short[local68];
				for (local78 = 0; local78 < local68; local78++) {
					this.aShortArray7[local78] = (short) arg0.method1839();
					this.aShortArray8[local78] = (short) arg0.method1839();
				}
			} else if (arg1 == 41) {
				local68 = arg0.method1872();
				this.aShortArray9 = new short[local68];
				this.aShortArray10 = new short[local68];
				for (local78 = 0; local78 < local68; local78++) {
					this.aShortArray9[local78] = (short) arg0.method1839();
					this.aShortArray10[local78] = (short) arg0.method1839();
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!wd;)V")
	public void method386(@OriginalArg(1) Class8_Sub20 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1872();
			if (local16 == 0) {
				return;
			}
			this.method382(arg0, local16);
		}
	}
}
