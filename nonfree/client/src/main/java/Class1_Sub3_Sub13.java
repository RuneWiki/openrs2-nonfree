import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "[I")
	private final int[] anIntArray334 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "[S")
	private final short[] aShortArray10 = new short[6];

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
	public int anInt2197 = -1;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rd;B)V")
	public void method1523(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2053();
			if (local9 == 0) {
				return;
			}
			this.method1532(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
	public boolean method1527() {
		if (this.anIntArray333 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray333.length; local14++) {
			if (!Static21.aClass41_1.method1722(this.anIntArray333[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)Z")
	public boolean method1529() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray334[local9] != -1 && !Static21.aClass41_1.method1722(this.anIntArray334[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(B)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method1530() {
		if (this.anIntArray333 == null) {
			return null;
		}
		@Pc(15) Class1_Sub3_Sub4_Sub1[] local15 = new Class1_Sub3_Sub4_Sub1[this.anIntArray333.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray333.length; local17++) {
			local15[local17] = Static14.method357(Static21.aClass41_1, this.anIntArray333[local17]);
		}
		@Pc(57) Class1_Sub3_Sub4_Sub1 local57;
		if (local15.length == 1) {
			local57 = local15[0];
		} else {
			local57 = new Class1_Sub3_Sub4_Sub1(local15, local15.length);
		}
		for (@Pc(65) int local65 = 0; local65 < 6 && this.aShortArray10[local65] != 0; local65++) {
			local57.method347(this.aShortArray10[local65], this.aShortArray11[local65]);
		}
		return local57;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method1531() {
		@Pc(13) Class1_Sub3_Sub4_Sub1[] local13 = new Class1_Sub3_Sub4_Sub1[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray334[local17] != -1) {
				local13[local15++] = Static14.method357(Static21.aClass41_1, this.anIntArray334[local17]);
			}
		}
		@Pc(47) Class1_Sub3_Sub4_Sub1 local47 = new Class1_Sub3_Sub4_Sub1(local13, local15);
		for (@Pc(49) int local49 = 0; local49 < 6 && this.aShortArray10[local49] != 0; local49++) {
			local47.method347(this.aShortArray10[local49], this.aShortArray11[local49]);
		}
		return local47;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!rd;)V")
	private void method1532(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt2197 = arg1.method2053();
		} else if (arg0 == 2) {
			@Pc(91) int local91 = arg1.method2053();
			this.anIntArray333 = new int[local91];
			for (@Pc(97) int local97 = 0; local97 < local91; local97++) {
				this.anIntArray333[local97] = arg1.method2087();
			}
		} else if (arg0 == 3) {
			this.aBoolean76 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray10[arg0 - 40] = (short) arg1.method2087();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray11[arg0 - 50] = (short) arg1.method2087();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray334[arg0 - 60] = arg1.method2087();
		}
	}
}
