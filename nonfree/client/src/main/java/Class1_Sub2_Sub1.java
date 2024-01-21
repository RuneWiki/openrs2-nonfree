import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!aa", name = "fb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "[I")
	private final int[] anIntArray8 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	public int anInt62 = -1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)Z")
	public boolean method44() {
		@Pc(7) boolean local7 = true;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray8[local19] != -1 && !Static53.aClass60_12.method2317(this.anIntArray8[local19], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)Lclient!ai;")
	public Class6_Sub1 method45() {
		@Pc(8) Class6_Sub1[] local8 = new Class6_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray8[local12] != -1) {
				local8[local10++] = Static10.method193(Static53.aClass60_12, this.anIntArray8[local12]);
			}
		}
		@Pc(42) Class6_Sub1 local42 = new Class6_Sub1(local8, local10);
		@Pc(47) int local47;
		if (this.aShortArray4 != null) {
			for (local47 = 0; local47 < this.aShortArray4.length; local47++) {
				local42.method199(this.aShortArray4[local47], this.aShortArray1[local47]);
			}
		}
		if (this.aShortArray3 != null) {
			for (local47 = 0; local47 < this.aShortArray3.length; local47++) {
				local42.method192(this.aShortArray3[local47], this.aShortArray2[local47]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!wa;B)V")
	private void method46(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt62 = arg1.method1738();
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg0 == 2) {
			local35 = arg1.method1738();
			this.anIntArray7 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray7[local45] = arg1.method1753();
			}
		} else if (arg0 == 3) {
			this.aBoolean2 = true;
		} else if (arg0 == 40) {
			local35 = arg1.method1738();
			this.aShortArray4 = new short[local35];
			this.aShortArray1 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray4[local45] = (short) arg1.method1753();
				this.aShortArray1[local45] = (short) arg1.method1753();
			}
		} else if (arg0 == 41) {
			local35 = arg1.method1738();
			this.aShortArray2 = new short[local35];
			this.aShortArray3 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray3[local45] = (short) arg1.method1753();
				this.aShortArray2[local45] = (short) arg1.method1753();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray8[arg0 - 60] = arg1.method1753();
			return;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Lclient!ai;")
	public Class6_Sub1 method47() {
		if (this.anIntArray7 == null) {
			return null;
		}
		@Pc(20) Class6_Sub1[] local20 = new Class6_Sub1[this.anIntArray7.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray7.length; local22++) {
			local20[local22] = Static10.method193(Static53.aClass60_12, this.anIntArray7[local22]);
		}
		@Pc(50) Class6_Sub1 local50;
		if (local20.length == 1) {
			local50 = local20[0];
		} else {
			local50 = new Class6_Sub1(local20, local20.length);
		}
		@Pc(64) int local64;
		if (this.aShortArray4 != null) {
			for (local64 = 0; local64 < this.aShortArray4.length; local64++) {
				local50.method199(this.aShortArray4[local64], this.aShortArray1[local64]);
			}
		}
		if (this.aShortArray3 != null) {
			for (local64 = 0; local64 < this.aShortArray3.length; local64++) {
				local50.method192(this.aShortArray3[local64], this.aShortArray2[local64]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(B)Z")
	public boolean method52() {
		if (this.anIntArray7 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray7.length; local19++) {
			if (!Static53.aClass60_12.method2317(this.anIntArray7[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!wa;)V")
	public void method53(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1738();
			if (local8 == 0) {
				return;
			}
			this.method46(local8, arg0);
		}
	}
}
