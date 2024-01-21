import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
	public int anInt596 = -1;

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "[I")
	private final int[] anIntArray153 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method608() {
		@Pc(6) Class3_Sub2_Sub1_Sub4[] local6 = new Class3_Sub2_Sub1_Sub4[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray153[local17] != -1) {
				local6[local15++] = Static89.method2044(Static51.aClass7_24, this.anIntArray153[local17]);
			}
		}
		@Pc(46) Class3_Sub2_Sub1_Sub4 local46 = new Class3_Sub2_Sub1_Sub4(local6, local15);
		@Pc(51) int local51;
		if (this.aShortArray12 != null) {
			for (local51 = 0; local51 < this.aShortArray12.length; local51++) {
				local46.method2029(this.aShortArray12[local51], this.aShortArray9[local51]);
			}
		}
		if (this.aShortArray11 != null) {
			for (local51 = 0; local51 < this.aShortArray11.length; local51++) {
				local46.method2032(this.aShortArray11[local51], this.aShortArray10[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BILclient!hd;)V")
	private void method610(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt596 = arg1.method1545();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method1545();
			this.anIntArray151 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray151[local25] = arg1.method1510();
			}
		} else if (arg0 == 3) {
			this.aBoolean38 = true;
		} else if (arg0 == 40) {
			local19 = arg1.method1545();
			this.aShortArray9 = new short[local19];
			this.aShortArray12 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray12[local25] = (short) arg1.method1510();
				this.aShortArray9[local25] = (short) arg1.method1510();
			}
		} else if (arg0 == 41) {
			local19 = arg1.method1545();
			this.aShortArray10 = new short[local19];
			this.aShortArray11 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray11[local25] = (short) arg1.method1510();
				this.aShortArray10[local25] = (short) arg1.method1510();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray153[arg0 - 60] = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)Z")
	public boolean method611() {
		@Pc(5) boolean local5 = true;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			if (this.anIntArray153[local7] != -1 && !Static51.aClass7_24.method1014(0, this.anIntArray153[local7])) {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	public boolean method612() {
		if (this.anIntArray151 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray151.length; local18++) {
			if (!Static51.aClass7_24.method1014(0, this.anIntArray151[local18])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)Lclient!lc;")
	public Class3_Sub2_Sub1_Sub4 method614() {
		if (this.anIntArray151 == null) {
			return null;
		}
		@Pc(13) Class3_Sub2_Sub1_Sub4[] local13 = new Class3_Sub2_Sub1_Sub4[this.anIntArray151.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray151.length; local15++) {
			local13[local15] = Static89.method2044(Static51.aClass7_24, this.anIntArray151[local15]);
		}
		@Pc(42) Class3_Sub2_Sub1_Sub4 local42;
		if (local13.length == 1) {
			local42 = local13[0];
		} else {
			local42 = new Class3_Sub2_Sub1_Sub4(local13, local13.length);
		}
		@Pc(55) int local55;
		if (this.aShortArray12 != null) {
			for (local55 = 0; local55 < this.aShortArray12.length; local55++) {
				local42.method2029(this.aShortArray12[local55], this.aShortArray9[local55]);
			}
		}
		if (this.aShortArray11 != null) {
			for (local55 = 0; local55 < this.aShortArray11.length; local55++) {
				local42.method2032(this.aShortArray11[local55], this.aShortArray10[local55]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!hd;B)V")
	public void method615(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1545();
			if (local7 == 0) {
				return;
			}
			this.method610(local7, arg0);
		}
	}
}
