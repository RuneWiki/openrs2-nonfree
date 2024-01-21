import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pe", name = "Hb", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "[I")
	private final int[] anIntArray268 = new int[6];

	@OriginalMember(owner = "client!pe", name = "Gb", descriptor = "I")
	public int anInt2099 = -1;

	@OriginalMember(owner = "client!pe", name = "Nb", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!pe", name = "Rb", descriptor = "[I")
	private final int[] anIntArray272 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "[I")
	private final int[] anIntArray269 = new int[6];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!ba;)V")
	public void method1458(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method1464(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)Z")
	public boolean method1459() {
		if (this.anIntArray270 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray270.length; local14++) {
			if (!Static54.aClass8_19.method1685(this.anIntArray270[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)Z")
	public boolean method1460() {
		@Pc(1) boolean local1 = true;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			if (this.anIntArray272[local7] != -1 && !Static54.aClass8_19.method1685(this.anIntArray272[local7], 0)) {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ba;II)V")
	private void method1464(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2099 = arg0.method791();
		} else if (arg1 == 2) {
			@Pc(86) int local86 = arg0.method791();
			this.anIntArray270 = new int[local86];
			for (@Pc(92) int local92 = 0; local92 < local86; local92++) {
				this.anIntArray270[local92] = arg0.method792();
			}
		} else if (arg1 == 3) {
			this.aBoolean116 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray268[arg1 - 40] = arg0.method792();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray269[arg1 - 50] = arg0.method792();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray272[arg1 - 60] = arg0.method792();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1465() {
		@Pc(8) Class2_Sub1_Sub1_Sub5[] local8 = new Class2_Sub1_Sub1_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray272[local17] != -1) {
				local8[local10++] = Static75.method1431(Static54.aClass8_19, this.anIntArray272[local17]);
			}
		}
		@Pc(48) Class2_Sub1_Sub1_Sub5 local48 = new Class2_Sub1_Sub1_Sub5(local8, local10);
		for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray268[local50] != 0; local50++) {
			local48.method1404(this.anIntArray268[local50], this.anIntArray269[local50]);
		}
		return local48;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1466() {
		if (this.anIntArray270 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub5[] local15 = new Class2_Sub1_Sub1_Sub5[this.anIntArray270.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray270.length; local17++) {
			local15[local17] = Static75.method1431(Static54.aClass8_19, this.anIntArray270[local17]);
		}
		@Pc(46) Class2_Sub1_Sub1_Sub5 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class2_Sub1_Sub1_Sub5(local15, local15.length);
		}
		for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray268[local59] != 0; local59++) {
			local46.method1404(this.anIntArray268[local59], this.anIntArray269[local59]);
		}
		return local46;
	}
}
