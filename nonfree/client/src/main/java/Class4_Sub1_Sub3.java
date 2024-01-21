import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
	public int anInt323 = -1;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "[I")
	private final int[] anIntArray30 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method179() {
		if (this.anIntArray29 == null) {
			return null;
		}
		@Pc(15) Class4_Sub1_Sub1_Sub6[] local15 = new Class4_Sub1_Sub1_Sub6[this.anIntArray29.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray29.length; local23++) {
			local15[local23] = Static51.method1003(Static183.aClass62_17, this.anIntArray29[local23]);
		}
		@Pc(49) Class4_Sub1_Sub1_Sub6 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class4_Sub1_Sub1_Sub6(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray3 != null) {
			for (local63 = 0; local63 < this.aShortArray3.length; local63++) {
				local49.method1011(this.aShortArray3[local63], this.aShortArray1[local63]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local63 = 0; local63 < this.aShortArray4.length; local63++) {
				local49.method1010(this.aShortArray4[local63], this.aShortArray2[local63]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Z")
	public boolean method180() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray30[local9] != -1 && !Static183.aClass62_17.method2872(0, this.anIntArray30[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method181() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class4_Sub1_Sub1_Sub6[] local10 = new Class4_Sub1_Sub1_Sub6[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray30[local17] != -1) {
				local10[local7++] = Static51.method1003(Static183.aClass62_17, this.anIntArray30[local17]);
			}
		}
		@Pc(47) Class4_Sub1_Sub1_Sub6 local47 = new Class4_Sub1_Sub1_Sub6(local10, local7);
		@Pc(52) int local52;
		if (this.aShortArray3 != null) {
			for (local52 = 0; local52 < this.aShortArray3.length; local52++) {
				local47.method1011(this.aShortArray3[local52], this.aShortArray1[local52]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local52 = 0; local52 < this.aShortArray4.length; local52++) {
				local47.method1010(this.aShortArray4[local52], this.aShortArray2[local52]);
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)Z")
	public boolean method182() {
		if (this.anIntArray29 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray29.length; local14++) {
			if (!Static183.aClass62_17.method2872(0, this.anIntArray29[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!h;)V")
	public void method183(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1253();
			if (local15 == 0) {
				return;
			}
			this.method185(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!h;I)V")
	private void method185(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt323 = arg0.method1253();
			return;
		}
		@Pc(65) int local65;
		@Pc(75) int local75;
		if (arg1 == 2) {
			local65 = arg0.method1253();
			this.anIntArray29 = new int[local65];
			for (local75 = 0; local75 < local65; local75++) {
				this.anIntArray29[local75] = arg0.method1252();
			}
		} else if (arg1 == 3) {
			this.aBoolean18 = true;
		} else if (arg1 == 40) {
			local65 = arg0.method1253();
			this.aShortArray3 = new short[local65];
			this.aShortArray1 = new short[local65];
			for (local75 = 0; local75 < local65; local75++) {
				this.aShortArray3[local75] = (short) arg0.method1252();
				this.aShortArray1[local75] = (short) arg0.method1252();
			}
		} else if (arg1 == 41) {
			local65 = arg0.method1253();
			this.aShortArray2 = new short[local65];
			this.aShortArray4 = new short[local65];
			for (local75 = 0; local75 < local65; local75++) {
				this.aShortArray4[local75] = (short) arg0.method1252();
				this.aShortArray2[local75] = (short) arg0.method1252();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray30[arg1 - 60] = arg0.method1252();
		}
	}
}
