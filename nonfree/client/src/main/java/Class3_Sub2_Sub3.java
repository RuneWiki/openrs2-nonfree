import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!c", name = "J", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!c", name = "U", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "I")
	public int anInt507 = -1;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "I")
	private int anInt508 = 128;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
	private int anInt516 = 0;

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
	private int anInt518 = 0;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
	private int anInt517 = 0;

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
	private int anInt519 = 128;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!hd;)V")
	public void method550(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1545();
			if (local3 == 0) {
				return;
			}
			this.method551(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!hd;II)V")
	private void method551(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt513 = arg0.method1510();
		} else if (arg1 == 2) {
			this.anInt507 = arg0.method1510();
		} else if (arg1 == 4) {
			this.anInt508 = arg0.method1510();
		} else if (arg1 == 5) {
			this.anInt519 = arg0.method1510();
		} else if (arg1 == 6) {
			this.anInt516 = arg0.method1510();
		} else if (arg1 == 7) {
			this.anInt518 = arg0.method1545();
		} else if (arg1 == 8) {
			this.anInt517 = arg0.method1545();
		} else {
			@Pc(70) int local70;
			@Pc(80) int local80;
			if (arg1 == 40) {
				local70 = arg0.method1545();
				this.aShortArray3 = new short[local70];
				this.aShortArray5 = new short[local70];
				for (local80 = 0; local80 < local70; local80++) {
					this.aShortArray3[local80] = (short) arg0.method1510();
					this.aShortArray5[local80] = (short) arg0.method1510();
				}
			} else if (arg1 == 41) {
				local70 = arg0.method1545();
				this.aShortArray6 = new short[local70];
				this.aShortArray7 = new short[local70];
				for (local80 = 0; local80 < local70; local80++) {
					this.aShortArray7[local80] = (short) arg0.method1510();
					this.aShortArray6[local80] = (short) arg0.method1510();
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method553(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub2_Sub1_Sub1 local13 = (Class3_Sub2_Sub1_Sub1) Static100.aClass63_17.method2337((long) this.anInt509);
		if (local13 == null) {
			@Pc(21) Class3_Sub2_Sub1_Sub4 local21 = Static89.method2044(Static137.aClass7_57, this.anInt513);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray3 != null) {
				for (local30 = 0; local30 < this.aShortArray3.length; local30++) {
					local21.method2029(this.aShortArray3[local30], this.aShortArray5[local30]);
				}
			}
			if (this.aShortArray7 != null) {
				for (local30 = 0; local30 < this.aShortArray7.length; local30++) {
					local21.method2032(this.aShortArray7[local30], this.aShortArray6[local30]);
				}
			}
			local13 = local21.method2041(this.anInt518 + 64, this.anInt517 + 850, -30, -50, -30, true);
			Static100.aClass63_17.method2338((long) this.anInt509, local13);
		}
		@Pc(115) Class3_Sub2_Sub1_Sub1 local115;
		if (this.anInt507 == -1 || arg0 == -1) {
			local115 = local13.method199(true);
		} else {
			local115 = Static21.method594(this.anInt507).method574(arg0, local13);
		}
		if (this.anInt508 != 128 || this.anInt519 != 128) {
			local115.method203(this.anInt508, this.anInt519, this.anInt508);
		}
		if (this.anInt516 != 0) {
			if (this.anInt516 == 90) {
				local115.method190();
			}
			if (this.anInt516 == 180) {
				local115.method190();
				local115.method190();
			}
			if (this.anInt516 == 270) {
				local115.method190();
				local115.method190();
				local115.method190();
			}
		}
		return local115;
	}
}
