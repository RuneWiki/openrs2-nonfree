import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "[I")
	private final int[] anIntArray100 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
	public int anInt868 = -1;

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "[S")
	private final short[] aShortArray5 = new short[6];

	@OriginalMember(owner = "client!ff", name = "rb", descriptor = "[S")
	private final short[] aShortArray4 = new short[6];

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method610() {
		if (this.anIntArray101 == null) {
			return null;
		}
		@Pc(15) Class2_Sub2_Sub2_Sub7[] local15 = new Class2_Sub2_Sub2_Sub7[this.anIntArray101.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray101.length; local17++) {
			local15[local17] = Static94.method1414(Static101.aClass26_26, this.anIntArray101[local17]);
		}
		@Pc(47) Class2_Sub2_Sub2_Sub7 local47;
		if (local15.length == 1) {
			local47 = local15[0];
		} else {
			local47 = new Class2_Sub2_Sub2_Sub7(local15, local15.length);
		}
		for (@Pc(63) int local63 = 0; local63 < 6 && this.aShortArray5[local63] != 0; local63++) {
			local47.method1415(this.aShortArray5[local63], this.aShortArray4[local63]);
		}
		return local47;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method613() {
		@Pc(8) Class2_Sub2_Sub2_Sub7[] local8 = new Class2_Sub2_Sub2_Sub7[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray100[local12] != -1) {
				local8[local10++] = Static94.method1414(Static101.aClass26_26, this.anIntArray100[local12]);
			}
		}
		@Pc(49) Class2_Sub2_Sub2_Sub7 local49 = new Class2_Sub2_Sub2_Sub7(local8, local10);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.aShortArray5[local51] != 0; local51++) {
			local49.method1415(this.aShortArray5[local51], this.aShortArray4[local51]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
	public boolean method614() {
		if (this.anIntArray101 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray101.length; local14++) {
			if (!Static101.aClass26_26.method1375(0, this.anIntArray101[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLclient!ic;)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt868 = arg1.method1514();
		} else if (arg0 == 2) {
			@Pc(23) int local23 = arg1.method1514();
			this.anIntArray101 = new int[local23];
			for (@Pc(29) int local29 = 0; local29 < local23; local29++) {
				this.anIntArray101[local29] = arg1.method1517();
			}
		} else if (arg0 == 3) {
			this.aBoolean30 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray5[arg0 - 40] = (short) arg1.method1517();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray4[arg0 - 50] = (short) arg1.method1517();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray100[arg0 - 60] = arg1.method1517();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ic;Z)V")
	public void method616(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1514();
			if (local11 == 0) {
				return;
			}
			this.method615(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)Z")
	public boolean method617() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray100[local9] != -1 && !Static101.aClass26_26.method1375(0, this.anIntArray100[local9])) {
				local7 = false;
			}
		}
		return local7;
	}
}
