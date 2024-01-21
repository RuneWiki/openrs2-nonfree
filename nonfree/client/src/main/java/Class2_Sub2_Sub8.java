import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[I")
	private final int[] anIntArray171 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	public int anInt1462 = -1;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method1175() {
		@Pc(8) Class2_Sub2_Sub3_Sub6[] local8 = new Class2_Sub2_Sub3_Sub6[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray171[local17] != -1) {
				local8[local15++] = Static119.method2029(Static104.aClass11_86, this.anIntArray171[local17]);
			}
		}
		@Pc(49) Class2_Sub2_Sub3_Sub6 local49 = new Class2_Sub2_Sub3_Sub6(local8, local15);
		@Pc(54) int local54;
		if (this.aShortArray5 != null) {
			for (local54 = 0; local54 < this.aShortArray5.length; local54++) {
				local49.method2025(this.aShortArray5[local54], this.aShortArray7[local54]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local54 = 0; local54 < this.aShortArray6.length; local54++) {
				local49.method2034(this.aShortArray6[local54], this.aShortArray8[local54]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method1176() {
		if (this.anIntArray172 == null) {
			return null;
		}
		@Pc(15) Class2_Sub2_Sub3_Sub6[] local15 = new Class2_Sub2_Sub3_Sub6[this.anIntArray172.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray172.length; local17++) {
			local15[local17] = Static119.method2029(Static104.aClass11_86, this.anIntArray172[local17]);
		}
		@Pc(46) Class2_Sub2_Sub3_Sub6 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class2_Sub2_Sub3_Sub6(local15, local15.length);
		}
		@Pc(57) int local57;
		if (this.aShortArray5 != null) {
			for (local57 = 0; local57 < this.aShortArray5.length; local57++) {
				local46.method2025(this.aShortArray5[local57], this.aShortArray7[local57]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local57 = 0; local57 < this.aShortArray6.length; local57++) {
				local46.method2034(this.aShortArray6[local57], this.aShortArray8[local57]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!ja;)V")
	private void method1177(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1462 = arg1.method2962();
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (arg0 == 2) {
			local39 = arg1.method2962();
			this.anIntArray172 = new int[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray172[local49] = arg1.method2933();
			}
		} else if (arg0 == 3) {
			this.aBoolean60 = true;
		} else if (arg0 == 40) {
			local39 = arg1.method2962();
			this.aShortArray5 = new short[local39];
			this.aShortArray7 = new short[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.aShortArray5[local49] = (short) arg1.method2933();
				this.aShortArray7[local49] = (short) arg1.method2933();
			}
		} else if (arg0 == 41) {
			local39 = arg1.method2962();
			this.aShortArray6 = new short[local39];
			this.aShortArray8 = new short[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.aShortArray6[local49] = (short) arg1.method2933();
				this.aShortArray8[local49] = (short) arg1.method2933();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray171[arg0 - 60] = arg1.method2933();
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)Z")
	public boolean method1178() {
		if (this.anIntArray172 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray172.length; local20++) {
			if (!Static104.aClass11_86.method2063(0, this.anIntArray172[local20])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z")
	public boolean method1180() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray171[local9] != -1 && !Static104.aClass11_86.method2063(0, this.anIntArray171[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ja;)V")
	public void method1181(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method1177(local5, arg0);
		}
	}
}
