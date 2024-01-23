import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
	private int anInt458 = 128;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	private int anInt455 = 128;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
	private int anInt461 = 0;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	public int anInt456 = -1;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt466 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!nc;I)V")
	public void method325(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method328(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!cf;")
	public Class9_Sub2 method326(@OriginalArg(0) int arg0) {
		@Pc(15) Class9_Sub2 local15 = (Class9_Sub2) Static121.aClass27_68.method965((long) this.anInt469);
		if (local15 == null) {
			@Pc(23) Class9_Sub1 local23 = Static14.method275(Static173.aClass7_34, this.anInt462);
			if (local23 == null) {
				return null;
			}
			@Pc(32) int local32;
			if (this.aShortArray13 != null) {
				for (local32 = 0; local32 < this.aShortArray13.length; local32++) {
					local23.method276(this.aShortArray13[local32], this.aShortArray14[local32]);
				}
			}
			if (this.aShortArray12 != null) {
				for (local32 = 0; local32 < this.aShortArray12.length; local32++) {
					local23.method282(this.aShortArray12[local32], this.aShortArray15[local32]);
				}
			}
			local15 = local23.method288(this.anInt461 + 64, this.anInt466 + 850, -30, -50, -30);
			Static121.aClass27_68.method961(local15, (long) this.anInt469);
		}
		@Pc(111) Class9_Sub2 local111;
		if (this.anInt456 == -1 || arg0 == -1) {
			local111 = local15.method1699(true, true);
		} else {
			local111 = Static74.method1343(this.anInt456).method2617(arg0, local15);
		}
		if (this.anInt458 != 128 || this.anInt455 != 128) {
			local111.method1696(this.anInt458, this.anInt455, this.anInt458);
		}
		if (this.anInt468 != 0) {
			if (this.anInt468 == 90) {
				local111.method1701();
			}
			if (this.anInt468 == 180) {
				local111.method1708();
			}
			if (this.anInt468 == 270) {
				local111.method1704();
			}
		}
		return local111;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!nc;)V")
	private void method328(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt462 = arg1.method946();
		} else if (arg0 == 2) {
			this.anInt456 = arg1.method946();
		} else if (arg0 == 4) {
			this.anInt458 = arg1.method946();
		} else if (arg0 == 5) {
			this.anInt455 = arg1.method946();
		} else if (arg0 == 6) {
			this.anInt468 = arg1.method946();
		} else if (arg0 == 7) {
			this.anInt461 = arg1.method895();
		} else if (arg0 == 8) {
			this.anInt466 = arg1.method895();
		} else if (arg0 == 9) {
			this.aBoolean37 = true;
		} else {
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (arg0 == 40) {
				local65 = arg1.method895();
				this.aShortArray14 = new short[local65];
				this.aShortArray13 = new short[local65];
				for (local75 = 0; local75 < local65; local75++) {
					this.aShortArray13[local75] = (short) arg1.method946();
					this.aShortArray14[local75] = (short) arg1.method946();
				}
			} else if (arg0 == 41) {
				local65 = arg1.method895();
				this.aShortArray12 = new short[local65];
				this.aShortArray15 = new short[local65];
				for (local75 = 0; local75 < local65; local75++) {
					this.aShortArray12[local75] = (short) arg1.method946();
					this.aShortArray15[local75] = (short) arg1.method946();
				}
			}
		}
	}
}
