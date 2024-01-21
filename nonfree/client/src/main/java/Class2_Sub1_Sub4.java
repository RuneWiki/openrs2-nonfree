import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[S")
	private final short[] aShortArray1 = new short[6];

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "[S")
	private final short[] aShortArray2 = new short[6];

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	public int anInt290 = -1;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "[I")
	private final int[] anIntArray26 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wb;B)V")
	public void method165(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1780();
			if (local18 == 0) {
				return;
			}
			this.method175(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(Z)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method169() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class2_Sub1_Sub1_Sub6[] local10 = new Class2_Sub1_Sub1_Sub6[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray26[local12] != -1) {
				local10[local7++] = Static26.method540(Static36.aClass11_18, this.anIntArray26[local12]);
			}
		}
		@Pc(49) Class2_Sub1_Sub1_Sub6 local49 = new Class2_Sub1_Sub1_Sub6(local10, local7);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.aShortArray1[local51] != 0; local51++) {
			local49.method559(this.aShortArray1[local51], this.aShortArray2[local51]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)Z")
	public boolean method171() {
		@Pc(5) boolean local5 = true;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			if (this.anIntArray26[local7] != -1 && !Static36.aClass11_18.method384(0, this.anIntArray26[local7])) {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method172() {
		if (this.anIntArray27 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub6[] local15 = new Class2_Sub1_Sub1_Sub6[this.anIntArray27.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray27.length; local17++) {
			local15[local17] = Static26.method540(Static36.aClass11_18, this.anIntArray27[local17]);
		}
		@Pc(46) Class2_Sub1_Sub1_Sub6 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class2_Sub1_Sub1_Sub6(local15, local15.length);
		}
		for (@Pc(54) int local54 = 0; local54 < 6 && this.aShortArray1[local54] != 0; local54++) {
			local46.method559(this.aShortArray1[local54], this.aShortArray2[local54]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!wb;B)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt290 = arg1.method1780();
		} else if (arg0 == 2) {
			@Pc(26) int local26 = arg1.method1780();
			this.anIntArray27 = new int[local26];
			for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
				this.anIntArray27[local32] = arg1.method1783();
			}
		} else if (arg0 == 3) {
			this.aBoolean27 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray1[arg0 - 40] = (short) arg1.method1783();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray2[arg0 - 50] = (short) arg1.method1783();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray26[arg0 - 60] = arg1.method1783();
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Z")
	public boolean method176() {
		if (this.anIntArray27 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray27.length; local19++) {
			if (!Static36.aClass11_18.method384(0, this.anIntArray27[local19])) {
				local12 = false;
			}
		}
		return local12;
	}
}
