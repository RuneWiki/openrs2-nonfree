import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class122 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	private int anInt4603 = 0;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	public int anInt4605 = -1;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt4608 = 0;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	private int anInt4611 = 0;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private int anInt4609 = 128;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	private int anInt4606 = 128;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!k;II)V")
	private void method3605(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4604 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt4605 = arg0.method3805();
		} else if (arg1 == 4) {
			this.anInt4609 = arg0.method3805();
		} else if (arg1 == 5) {
			this.anInt4606 = arg0.method3805();
		} else if (arg1 == 6) {
			this.anInt4608 = arg0.method3805();
		} else if (arg1 == 7) {
			this.anInt4611 = arg0.method3793();
		} else if (arg1 == 8) {
			this.anInt4603 = arg0.method3793();
		} else if (arg1 == 9) {
			this.aBoolean209 = true;
		} else {
			@Pc(69) int local69;
			@Pc(79) int local79;
			if (arg1 == 40) {
				local69 = arg0.method3793();
				this.aShortArray56 = new short[local69];
				this.aShortArray55 = new short[local69];
				for (local79 = 0; local79 < local69; local79++) {
					this.aShortArray55[local79] = (short) arg0.method3805();
					this.aShortArray56[local79] = (short) arg0.method3805();
				}
			} else if (arg1 == 41) {
				local69 = arg0.method3793();
				this.aShortArray58 = new short[local69];
				this.aShortArray57 = new short[local69];
				for (local79 = 0; local79 < local69; local79++) {
					this.aShortArray58[local79] = (short) arg0.method3805();
					this.aShortArray57[local79] = (short) arg0.method3805();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!k;)V")
	public void method3606(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3793();
			if (local9 == 0) {
				return;
			}
			this.method3605(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lclient!ei;")
	public Class5_Sub2 method3608(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2 local13 = (Class5_Sub2) Static68.aClass53_13.method1501((long) this.anInt4610);
		if (local13 == null) {
			@Pc(21) Class5_Sub6 local21 = Static215.method3571(Static21.aClass70_8, this.anInt4604);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray55 != null) {
				for (local30 = 0; local30 < this.aShortArray55.length; local30++) {
					local21.method3566(this.aShortArray55[local30], this.aShortArray56[local30]);
				}
			}
			if (this.aShortArray58 != null) {
				for (local30 = 0; local30 < this.aShortArray58.length; local30++) {
					local21.method3564(this.aShortArray58[local30], this.aShortArray57[local30]);
				}
			}
			local13 = local21.method3582(this.anInt4611 + 64, this.anInt4603 + 850, -30, -50, -30);
			Static68.aClass53_13.method1497(local13, (long) this.anInt4610);
		}
		@Pc(113) Class5_Sub2 local113;
		if (this.anInt4605 == -1 || arg0 == -1) {
			local113 = local13.method2916(true, true);
		} else {
			local113 = Static32.method546(this.anInt4605).method937(arg0, local13);
		}
		if (this.anInt4609 != 128 || this.anInt4606 != 128) {
			local113.method2922(this.anInt4609, this.anInt4606, this.anInt4609);
		}
		if (this.anInt4608 != 0) {
			if (this.anInt4608 == 90) {
				local113.method2928();
			}
			if (this.anInt4608 == 180) {
				local113.method2921();
			}
			if (this.anInt4608 == 270) {
				local113.method2924();
			}
		}
		return local113;
	}
}
