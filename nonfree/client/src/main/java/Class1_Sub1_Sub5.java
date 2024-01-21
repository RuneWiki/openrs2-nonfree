import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "[S")
	private final short[] aShortArray2 = new short[6];

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "[I")
	private final int[] anIntArray113 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
	public int anInt1134 = -1;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method670() {
		@Pc(8) Class1_Sub1_Sub1_Sub4[] local8 = new Class1_Sub1_Sub1_Sub4[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray113[local12] != -1) {
				local8[local10++] = Static83.method1412(Static99.aClass35_26, this.anIntArray113[local12]);
			}
		}
		@Pc(41) Class1_Sub1_Sub1_Sub4 local41 = new Class1_Sub1_Sub1_Sub4(local8, local10);
		for (@Pc(43) int local43 = 0; local43 < 6 && this.aShortArray2[local43] != 0; local43++) {
			local41.method1415(this.aShortArray2[local43], this.aShortArray3[local43]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Z")
	public boolean method672() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray113[local17] != -1 && !Static99.aClass35_26.method1561(0, this.anIntArray113[local17])) {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method673() {
		if (this.anIntArray114 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub1_Sub4[] local15 = new Class1_Sub1_Sub1_Sub4[this.anIntArray114.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray114.length; local22++) {
			local15[local22] = Static83.method1412(Static99.aClass35_26, this.anIntArray114[local22]);
		}
		@Pc(57) Class1_Sub1_Sub1_Sub4 local57;
		if (local15.length == 1) {
			local57 = local15[0];
		} else {
			local57 = new Class1_Sub1_Sub1_Sub4(local15, local15.length);
		}
		for (@Pc(65) int local65 = 0; local65 < 6 && this.aShortArray2[local65] != 0; local65++) {
			local57.method1415(this.aShortArray2[local65], this.aShortArray3[local65]);
		}
		return local57;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!of;I)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt1134 = arg1.method2072();
		} else if (arg0 == 2) {
			@Pc(29) int local29 = arg1.method2072();
			this.anIntArray114 = new int[local29];
			for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
				this.anIntArray114[local35] = arg1.method2051();
			}
		} else if (arg0 == 3) {
			this.aBoolean66 = true;
		} else if (arg0 < 40 || arg0 >= 50) {
			if (arg0 >= 50 && arg0 < 60) {
				this.aShortArray3[arg0 - 50] = (short) arg1.method2051();
				return;
			}
			if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray113[arg0 - 60] = arg1.method2051();
				return;
			}
		} else {
			this.aShortArray2[arg0 - 40] = (short) arg1.method2051();
			return;
		}
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Z")
	public boolean method677() {
		if (this.anIntArray114 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray114.length; local14++) {
			if (!Static99.aClass35_26.method1561(0, this.anIntArray114[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!of;)V")
	public void method678(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2072();
			if (local15 == 0) {
				return;
			}
			this.method676(local15, arg0);
		}
	}
}
