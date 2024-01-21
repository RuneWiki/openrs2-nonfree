import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
	public int anInt1612;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	private int anInt1619;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	private int anInt1622 = 128;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	private int anInt1618 = 0;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public int anInt1625 = -1;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	private int anInt1623 = 128;

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	private int anInt1624 = 0;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
	private int anInt1626 = 0;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method1224(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub1_Sub1_Sub7 local18 = (Class2_Sub1_Sub1_Sub7) Static42.aClass8_28.method172((long) this.anInt1612);
		if (local18 == null) {
			@Pc(26) Class2_Sub1_Sub1_Sub2 local26 = Static27.method559(Static48.aClass56_20, this.anInt1619);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray15 != null) {
				for (local35 = 0; local35 < this.aShortArray15.length; local35++) {
					local26.method544(this.aShortArray15[local35], this.aShortArray17[local35]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local35 = 0; local35 < this.aShortArray18.length; local35++) {
					local26.method555(this.aShortArray18[local35], this.aShortArray16[local35]);
				}
			}
			local18 = local26.method542(this.anInt1618 + 64, this.anInt1624 + 850, -30, -50, -30);
			Static42.aClass8_28.method176((long) this.anInt1612, local18);
		}
		@Pc(116) Class2_Sub1_Sub1_Sub7 local116;
		if (this.anInt1625 == -1 || arg0 == -1) {
			local116 = local18.method1999(true);
		} else {
			local116 = Static23.method1313(this.anInt1625).method123(arg0, local18);
		}
		if (this.anInt1622 != 128 || this.anInt1623 != 128) {
			local116.method2007(this.anInt1622, this.anInt1623, this.anInt1622);
		}
		if (this.anInt1626 != 0) {
			if (this.anInt1626 == 90) {
				local116.method2008();
			}
			if (this.anInt1626 == 180) {
				local116.method2008();
				local116.method2008();
			}
			if (this.anInt1626 == 270) {
				local116.method2008();
				local116.method2008();
				local116.method2008();
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!be;B)V")
	public void method1225(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method933();
			if (local12 == 0) {
				return;
			}
			this.method1230(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLclient!be;)V")
	private void method1230(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1619 = arg1.method896();
		} else if (arg0 == 2) {
			this.anInt1625 = arg1.method896();
		} else if (arg0 == 4) {
			this.anInt1622 = arg1.method896();
		} else if (arg0 == 5) {
			this.anInt1623 = arg1.method896();
		} else if (arg0 == 6) {
			this.anInt1626 = arg1.method896();
		} else if (arg0 == 7) {
			this.anInt1618 = arg1.method933();
		} else if (arg0 == 8) {
			this.anInt1624 = arg1.method933();
		} else {
			@Pc(53) int local53;
			@Pc(63) int local63;
			if (arg0 == 40) {
				local53 = arg1.method933();
				this.aShortArray15 = new short[local53];
				this.aShortArray17 = new short[local53];
				for (local63 = 0; local63 < local53; local63++) {
					this.aShortArray15[local63] = (short) arg1.method896();
					this.aShortArray17[local63] = (short) arg1.method896();
				}
			} else if (arg0 == 41) {
				local53 = arg1.method933();
				this.aShortArray18 = new short[local53];
				this.aShortArray16 = new short[local53];
				for (local63 = 0; local63 < local53; local63++) {
					this.aShortArray18[local63] = (short) arg1.method896();
					this.aShortArray16[local63] = (short) arg1.method896();
				}
			}
		}
	}
}
