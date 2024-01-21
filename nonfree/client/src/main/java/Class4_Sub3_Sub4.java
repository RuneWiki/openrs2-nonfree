import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class4_Sub3_Sub4 extends Class4_Sub3 {

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
	public static int[] anIntArray85 = new int[256];

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt787 = 0;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	private int anInt791 = 128;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
	private int anInt788 = 0;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	public int anInt795 = -1;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	private int anInt798 = 128;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	private int anInt796 = 0;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray85[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method417(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub3_Sub1_Sub7 local13 = (Class4_Sub3_Sub1_Sub7) Static128.aClass12_29.method289((long) this.anInt794);
		if (local13 == null) {
			@Pc(21) Class4_Sub3_Sub1_Sub5 local21 = Static89.method1445(Static127.aClass10_15, this.anInt792);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray8 != null) {
				for (local30 = 0; local30 < this.aShortArray8.length; local30++) {
					local21.method1433(this.aShortArray8[local30], this.aShortArray7[local30]);
				}
			}
			if (this.aShortArray9 != null) {
				for (local30 = 0; local30 < this.aShortArray9.length; local30++) {
					local21.method1439(this.aShortArray9[local30], this.aShortArray10[local30]);
				}
			}
			local13 = local21.method1444(this.anInt787 + 64, this.anInt796 + 850, -30, -50, -30);
			Static128.aClass12_29.method290(local13, (long) this.anInt794);
		}
		@Pc(117) Class4_Sub3_Sub1_Sub7 local117;
		if (this.anInt795 == -1 || arg0 == -1) {
			local117 = local13.method1503(true);
		} else {
			local117 = Static7.method63(this.anInt795).method1260(arg0, local13);
		}
		if (this.anInt798 != 128 || this.anInt791 != 128) {
			local117.method1509(this.anInt798, this.anInt791, this.anInt798);
		}
		if (this.anInt788 != 0) {
			if (this.anInt788 == 90) {
				local117.method1507();
			}
			if (this.anInt788 == 180) {
				local117.method1507();
				local117.method1507();
			}
			if (this.anInt788 == 270) {
				local117.method1507();
				local117.method1507();
				local117.method1507();
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!tf;B)V")
	public void method418(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method773();
			if (local5 == 0) {
				return;
			}
			this.method420(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!tf;)V")
	private void method420(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt792 = arg1.method816();
		} else if (arg0 == 2) {
			this.anInt795 = arg1.method816();
		} else if (arg0 == 4) {
			this.anInt798 = arg1.method816();
		} else if (arg0 == 5) {
			this.anInt791 = arg1.method816();
		} else if (arg0 == 6) {
			this.anInt788 = arg1.method816();
		} else if (arg0 == 7) {
			this.anInt787 = arg1.method773();
		} else if (arg0 == 8) {
			this.anInt796 = arg1.method773();
		} else {
			@Pc(56) int local56;
			@Pc(66) int local66;
			if (arg0 == 40) {
				local56 = arg1.method773();
				this.aShortArray7 = new short[local56];
				this.aShortArray8 = new short[local56];
				for (local66 = 0; local66 < local56; local66++) {
					this.aShortArray8[local66] = (short) arg1.method816();
					this.aShortArray7[local66] = (short) arg1.method816();
				}
			} else if (arg0 == 41) {
				local56 = arg1.method773();
				this.aShortArray10 = new short[local56];
				this.aShortArray9 = new short[local56];
				for (local66 = 0; local66 < local56; local66++) {
					this.aShortArray9[local66] = (short) arg1.method816();
					this.aShortArray10[local66] = (short) arg1.method816();
				}
				return;
			}
		}
	}
}
