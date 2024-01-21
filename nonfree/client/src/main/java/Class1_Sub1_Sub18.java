import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt4681;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public int anInt4682;

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
	private int anInt4677 = 128;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	private int anInt4672 = 0;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
	private int anInt4671 = 0;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
	public int anInt4678 = -1;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	private int anInt4680 = 0;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	private int anInt4675 = 128;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IZ)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method3152(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub5_Sub4 local13 = (Class1_Sub1_Sub5_Sub4) Static156.aClass66_19.method2599((long) this.anInt4682);
		if (local13 == null) {
			@Pc(21) Class1_Sub1_Sub5_Sub5 local21 = Static70.method1483(Static152.aClass16_28, this.anInt4681);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray37 != null) {
				for (local30 = 0; local30 < this.aShortArray37.length; local30++) {
					local21.method1489(this.aShortArray37[local30], this.aShortArray36[local30]);
				}
			}
			if (this.aShortArray35 != null) {
				for (local30 = 0; local30 < this.aShortArray35.length; local30++) {
					local21.method1479(this.aShortArray35[local30], this.aShortArray34[local30]);
				}
			}
			local13 = local21.method1472(this.anInt4680 + 64, this.anInt4672 + 850, -30, -50, -30, true);
			Static156.aClass66_19.method2597((long) this.anInt4682, local13);
		}
		@Pc(114) Class1_Sub1_Sub5_Sub4 local114;
		if (this.anInt4678 == -1 || arg0 == -1) {
			local114 = local13.method995(true);
		} else {
			local114 = Static121.method2378(this.anInt4678).method2400(local13, arg0);
		}
		if (this.anInt4677 != 128 || this.anInt4675 != 128) {
			local114.method1005(this.anInt4677, this.anInt4675, this.anInt4677);
		}
		if (this.anInt4671 != 0) {
			if (this.anInt4671 == 90) {
				local114.method1006();
			}
			if (this.anInt4671 == 180) {
				local114.method1006();
				local114.method1006();
			}
			if (this.anInt4671 == 270) {
				local114.method1006();
				local114.method1006();
				local114.method1006();
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!hc;I)V")
	public void method3153(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method544();
			if (local7 == 0) {
				return;
			}
			this.method3154(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BILclient!hc;)V")
	private void method3154(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt4681 = arg1.method546();
		} else if (arg0 == 2) {
			this.anInt4678 = arg1.method546();
		} else if (arg0 == 4) {
			this.anInt4677 = arg1.method546();
		} else if (arg0 == 5) {
			this.anInt4675 = arg1.method546();
		} else if (arg0 == 6) {
			this.anInt4671 = arg1.method546();
		} else if (arg0 == 7) {
			this.anInt4680 = arg1.method544();
		} else if (arg0 == 8) {
			this.anInt4672 = arg1.method544();
		} else {
			@Pc(76) int local76;
			@Pc(86) int local86;
			if (arg0 == 40) {
				local76 = arg1.method544();
				this.aShortArray37 = new short[local76];
				this.aShortArray36 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray37[local86] = (short) arg1.method546();
					this.aShortArray36[local86] = (short) arg1.method546();
				}
			} else if (arg0 == 41) {
				local76 = arg1.method544();
				this.aShortArray35 = new short[local76];
				this.aShortArray34 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray35[local86] = (short) arg1.method546();
					this.aShortArray34[local86] = (short) arg1.method546();
				}
			}
		}
	}
}
