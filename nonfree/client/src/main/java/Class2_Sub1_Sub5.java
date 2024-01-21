import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "E", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "I")
	private int anInt771 = 128;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "I")
	private int anInt772 = 0;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "I")
	private int anInt776 = 128;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public int anInt783 = -1;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
	private int anInt786 = 0;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	private int anInt781 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!va;I)V")
	public void method611(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1461();
			if (local7 == 0) {
				return;
			}
			this.method613(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method612(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub3_Sub3 local13 = (Class2_Sub1_Sub3_Sub3) Static64.aClass72_14.method2259((long) this.anInt780);
		if (local13 == null) {
			@Pc(21) Class2_Sub1_Sub3_Sub7 local21 = Static166.method2551(Static137.aClass29_59, this.anInt775);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray8 != null) {
				for (local30 = 0; local30 < this.aShortArray8.length; local30++) {
					local21.method2566(this.aShortArray8[local30], this.aShortArray10[local30]);
				}
			}
			if (this.aShortArray7 != null) {
				for (local30 = 0; local30 < this.aShortArray7.length; local30++) {
					local21.method2567(this.aShortArray7[local30], this.aShortArray9[local30]);
				}
			}
			local13 = local21.method2565(this.anInt786 + 64, this.anInt772 + 850, -30, -50, -30, true);
			Static64.aClass72_14.method2254(local13, (long) this.anInt780);
		}
		@Pc(107) Class2_Sub1_Sub3_Sub3 local107;
		if (this.anInt783 == -1 || arg0 == -1) {
			local107 = local13.method819(true);
		} else {
			local107 = Static19.method325(this.anInt783).method1365(arg0, local13);
		}
		if (this.anInt776 != 128 || this.anInt771 != 128) {
			local107.method821(this.anInt776, this.anInt771, this.anInt776);
		}
		if (this.anInt781 != 0) {
			if (this.anInt781 == 90) {
				local107.method817();
			}
			if (this.anInt781 == 180) {
				local107.method817();
				local107.method817();
			}
			if (this.anInt781 == 270) {
				local107.method817();
				local107.method817();
				local107.method817();
			}
		}
		return local107;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!va;)V")
	private void method613(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt775 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt783 = arg1.method1456();
		} else if (arg0 == 4) {
			this.anInt776 = arg1.method1456();
		} else if (arg0 == 5) {
			this.anInt771 = arg1.method1456();
		} else if (arg0 == 6) {
			this.anInt781 = arg1.method1456();
		} else if (arg0 == 7) {
			this.anInt786 = arg1.method1461();
		} else if (arg0 == 8) {
			this.anInt772 = arg1.method1461();
		} else {
			@Pc(59) int local59;
			@Pc(69) int local69;
			if (arg0 == 40) {
				local59 = arg1.method1461();
				this.aShortArray10 = new short[local59];
				this.aShortArray8 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray8[local69] = (short) arg1.method1456();
					this.aShortArray10[local69] = (short) arg1.method1456();
				}
				return;
			}
			if (arg0 == 41) {
				local59 = arg1.method1461();
				this.aShortArray7 = new short[local59];
				this.aShortArray9 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray7[local69] = (short) arg1.method1456();
					this.aShortArray9[local69] = (short) arg1.method1456();
				}
				return;
			}
		}
	}
}
