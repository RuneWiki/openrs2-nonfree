import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!r", name = "B", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	private int anInt3263;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	private int anInt3254 = 0;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "I")
	private int anInt3256 = 128;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	private int anInt3261 = 128;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	public int anInt3259 = -1;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	private int anInt3258 = 0;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	private int anInt3262 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!me;B)V")
	public void method2153(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1402();
			if (local17 == 0) {
				return;
			}
			this.method2156(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!me;)V")
	private void method2156(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt3263 = arg1.method1397();
		} else if (arg0 == 2) {
			this.anInt3259 = arg1.method1397();
		} else if (arg0 == 4) {
			this.anInt3256 = arg1.method1397();
		} else if (arg0 == 5) {
			this.anInt3261 = arg1.method1397();
		} else if (arg0 == 6) {
			this.anInt3258 = arg1.method1397();
		} else if (arg0 == 7) {
			this.anInt3254 = arg1.method1402();
		} else if (arg0 == 8) {
			this.anInt3262 = arg1.method1402();
		} else {
			@Pc(73) int local73;
			@Pc(83) int local83;
			if (arg0 == 40) {
				local73 = arg1.method1402();
				this.aShortArray28 = new short[local73];
				this.aShortArray26 = new short[local73];
				for (local83 = 0; local83 < local73; local83++) {
					this.aShortArray28[local83] = (short) arg1.method1397();
					this.aShortArray26[local83] = (short) arg1.method1397();
				}
				return;
			}
			if (arg0 == 41) {
				local73 = arg1.method1402();
				this.aShortArray27 = new short[local73];
				this.aShortArray29 = new short[local73];
				for (local83 = 0; local83 < local73; local83++) {
					this.aShortArray29[local83] = (short) arg1.method1397();
					this.aShortArray27[local83] = (short) arg1.method1397();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method2157(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub3_Sub5_Sub7 local18 = (Class2_Sub3_Sub5_Sub7) Static126.aClass17_17.method505((long) this.anInt3253);
		if (local18 == null) {
			@Pc(26) Class2_Sub3_Sub5_Sub3 local26 = Static99.method1637(Static49.aClass10_52, this.anInt3263);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray28 != null) {
				for (local35 = 0; local35 < this.aShortArray28.length; local35++) {
					local26.method1644(this.aShortArray28[local35], this.aShortArray26[local35]);
				}
			}
			if (this.aShortArray29 != null) {
				for (local35 = 0; local35 < this.aShortArray29.length; local35++) {
					local26.method1648(this.aShortArray29[local35], this.aShortArray27[local35]);
				}
			}
			local18 = local26.method1642(this.anInt3254 + 64, this.anInt3262 + 850, -30, -50, -30, true);
			Static126.aClass17_17.method508((long) this.anInt3253, local18);
		}
		@Pc(121) Class2_Sub3_Sub5_Sub7 local121;
		if (this.anInt3259 == -1 || arg0 == -1) {
			local121 = local18.method2306(true);
		} else {
			local121 = Static129.method2790(this.anInt3259).method1071(local18, arg0);
		}
		if (this.anInt3256 != 128 || this.anInt3261 != 128) {
			local121.method2309(this.anInt3256, this.anInt3261, this.anInt3256);
		}
		if (this.anInt3258 != 0) {
			if (this.anInt3258 == 90) {
				local121.method2304();
			}
			if (this.anInt3258 == 180) {
				local121.method2304();
				local121.method2304();
			}
			if (this.anInt3258 == 270) {
				local121.method2304();
				local121.method2304();
				local121.method2304();
			}
		}
		return local121;
	}
}
