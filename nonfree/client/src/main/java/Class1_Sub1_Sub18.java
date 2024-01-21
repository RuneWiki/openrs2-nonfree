import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
	public int anInt4561;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	private int anInt4555 = 0;

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	private int anInt4558 = 128;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	private int anInt4554 = 128;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
	public int anInt4556 = -1;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
	private int anInt4551 = 0;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	private int anInt4550 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!fa;)V")
	public void method3507(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1234();
			if (local7 == 0) {
				return;
			}
			this.method3509(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILclient!fa;)V")
	private void method3509(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt4559 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt4556 = arg1.method1280();
		} else if (arg0 == 4) {
			this.anInt4554 = arg1.method1280();
		} else if (arg0 == 5) {
			this.anInt4558 = arg1.method1280();
		} else if (arg0 == 6) {
			this.anInt4551 = arg1.method1280();
		} else if (arg0 == 7) {
			this.anInt4550 = arg1.method1234();
		} else if (arg0 == 8) {
			this.anInt4555 = arg1.method1234();
		} else {
			@Pc(62) int local62;
			@Pc(72) int local72;
			if (arg0 == 40) {
				local62 = arg1.method1234();
				this.aShortArray47 = new short[local62];
				this.aShortArray50 = new short[local62];
				for (local72 = 0; local72 < local62; local72++) {
					this.aShortArray47[local72] = (short) arg1.method1280();
					this.aShortArray50[local72] = (short) arg1.method1280();
				}
			} else if (arg0 == 41) {
				local62 = arg1.method1234();
				this.aShortArray49 = new short[local62];
				this.aShortArray48 = new short[local62];
				for (local72 = 0; local72 < local62; local72++) {
					this.aShortArray48[local72] = (short) arg1.method1280();
					this.aShortArray49[local72] = (short) arg1.method1280();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method3510(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub1_Sub4_Sub1 local18 = (Class1_Sub1_Sub4_Sub1) Static32.aClass25_4.method1302((long) this.anInt4561);
		if (local18 == null) {
			@Pc(26) Class1_Sub1_Sub4_Sub3 local26 = Static46.method1144(Static63.aClass76_55, this.anInt4559);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray47 != null) {
				for (local35 = 0; local35 < this.aShortArray47.length; local35++) {
					local26.method1146(this.aShortArray47[local35], this.aShortArray50[local35]);
				}
			}
			if (this.aShortArray48 != null) {
				for (local35 = 0; local35 < this.aShortArray48.length; local35++) {
					local26.method1149(this.aShortArray48[local35], this.aShortArray49[local35]);
				}
			}
			local18 = local26.method1135(this.anInt4550 + 64, 850 - -this.anInt4555, -30, -50, -30, true);
			Static32.aClass25_4.method1299(local18, (long) this.anInt4561);
		}
		@Pc(126) Class1_Sub1_Sub4_Sub1 local126;
		if (this.anInt4556 == -1 || arg0 == -1) {
			local126 = local18.method724(true);
		} else {
			local126 = Static90.method1962(this.anInt4556).method2878(local18, arg0);
		}
		if (this.anInt4554 != 128 || this.anInt4558 != 128) {
			local126.method719(this.anInt4554, this.anInt4558, this.anInt4554);
		}
		if (this.anInt4551 != 0) {
			if (this.anInt4551 == 90) {
				local126.method726();
			}
			if (this.anInt4551 == 180) {
				local126.method726();
				local126.method726();
			}
			if (this.anInt4551 == 270) {
				local126.method726();
				local126.method726();
				local126.method726();
			}
		}
		return local126;
	}
}
