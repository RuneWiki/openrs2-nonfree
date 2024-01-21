import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	private int anInt3997 = 128;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	private int anInt3998 = 0;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	private int anInt3995 = 0;

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
	private int anInt4001 = 0;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
	public int anInt4000 = -1;

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
	private int anInt4003 = 128;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!ug;")
	public Class7_Sub7 method2759(@OriginalArg(1) int arg0) {
		@Pc(18) Class7_Sub7 local18 = (Class7_Sub7) Static60.aClass79_5.method2352((long) this.anInt3999);
		if (local18 == null) {
			@Pc(26) Class7_Sub3 local26 = Static70.method975(Static22.aClass71_4, this.anInt3993);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray140 != null) {
				for (local35 = 0; local35 < this.aShortArray140.length; local35++) {
					local26.method974(this.aShortArray140[local35], this.aShortArray142[local35]);
				}
			}
			if (this.aShortArray141 != null) {
				for (local35 = 0; local35 < this.aShortArray141.length; local35++) {
					local26.method963(this.aShortArray141[local35], this.aShortArray139[local35]);
				}
			}
			local18 = local26.method979(this.anInt3998 + 64, this.anInt3995 + 850, -30, -50, -30);
			Static60.aClass79_5.method2349((long) this.anInt3999, local18);
		}
		@Pc(112) Class7_Sub7 local112;
		if (this.anInt4000 == -1 || arg0 == -1) {
			local112 = local18.method3164(true);
		} else {
			local112 = Static90.method27(this.anInt4000).method3054(local18, arg0);
		}
		if (this.anInt4003 != 128 || this.anInt3997 != 128) {
			local112.method3161(this.anInt4003, this.anInt3997, this.anInt4003);
		}
		if (this.anInt4001 != 0) {
			if (this.anInt4001 == 90) {
				local112.method3165();
			}
			if (this.anInt4001 == 180) {
				local112.method3158();
			}
			if (this.anInt4001 == 270) {
				local112.method3163();
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!kd;)V")
	public void method2760(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1534();
			if (local17 == 0) {
				return;
			}
			this.method2763(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!kd;I)V")
	private void method2763(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3993 = arg0.method1557();
		} else if (arg1 == 2) {
			this.anInt4000 = arg0.method1557();
		} else if (arg1 == 4) {
			this.anInt4003 = arg0.method1557();
		} else if (arg1 == 5) {
			this.anInt3997 = arg0.method1557();
		} else if (arg1 == 6) {
			this.anInt4001 = arg0.method1557();
		} else if (arg1 == 7) {
			this.anInt3998 = arg0.method1534();
		} else if (arg1 == 8) {
			this.anInt3995 = arg0.method1534();
		} else if (arg1 == 9) {
			this.aBoolean177 = true;
		} else {
			@Pc(76) int local76;
			@Pc(86) int local86;
			if (arg1 == 40) {
				local76 = arg0.method1534();
				this.aShortArray140 = new short[local76];
				this.aShortArray142 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray140[local86] = (short) arg0.method1557();
					this.aShortArray142[local86] = (short) arg0.method1557();
				}
			} else if (arg1 == 41) {
				local76 = arg0.method1534();
				this.aShortArray141 = new short[local76];
				this.aShortArray139 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray141[local86] = (short) arg0.method1557();
					this.aShortArray139[local86] = (short) arg0.method1557();
				}
			}
		}
	}
}
