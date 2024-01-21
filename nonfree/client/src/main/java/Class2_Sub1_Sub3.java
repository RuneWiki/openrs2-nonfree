import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!be", name = "T", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "[I")
	private final int[] anIntArray30 = new int[6];

	@OriginalMember(owner = "client!be", name = "X", descriptor = "[I")
	private final int[] anIntArray33 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!be", name = "W", descriptor = "[I")
	private final int[] anIntArray32 = new int[6];

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	public int anInt247 = -1;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z")
	public boolean method160() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray33[local9] != -1 && !Static100.aClass36_69.method1768(0, this.anIntArray33[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method161() {
		@Pc(8) Class2_Sub1_Sub2_Sub2[] local8 = new Class2_Sub1_Sub2_Sub2[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray33[local17] != -1) {
				local8[local15++] = Static32.method722(Static100.aClass36_69, this.anIntArray33[local17]);
			}
		}
		@Pc(46) Class2_Sub1_Sub2_Sub2 local46 = new Class2_Sub1_Sub2_Sub2(local8, local15);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray32[local48] != 0; local48++) {
			local46.method716(this.anIntArray32[local48], this.anIntArray30[local48]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!g;I)V")
	private void method163(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt247 = arg0.method1281();
		} else if (arg1 == 2) {
			@Pc(88) int local88 = arg0.method1281();
			this.anIntArray31 = new int[local88];
			for (@Pc(94) int local94 = 0; local94 < local88; local94++) {
				this.anIntArray31[local94] = arg0.method1273();
			}
		} else if (arg1 == 3) {
			this.aBoolean9 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray32[arg1 - 40] = arg0.method1273();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray30[arg1 - 50] = arg0.method1273();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray33[arg1 - 60] = arg0.method1273();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!g;)V")
	public void method164(@OriginalArg(1) Class2_Sub5 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1281();
			if (local11 == 0) {
				return;
			}
			this.method163(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method166() {
		if (this.anIntArray31 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub2_Sub2[] local15 = new Class2_Sub1_Sub2_Sub2[this.anIntArray31.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray31.length; local17++) {
			local15[local17] = Static32.method722(Static100.aClass36_69, this.anIntArray31[local17]);
		}
		@Pc(50) Class2_Sub1_Sub2_Sub2 local50;
		if (local15.length == 1) {
			local50 = local15[0];
		} else {
			local50 = new Class2_Sub1_Sub2_Sub2(local15, local15.length);
		}
		for (@Pc(58) int local58 = 0; local58 < 6 && this.anIntArray32[local58] != 0; local58++) {
			local50.method716(this.anIntArray32[local58], this.anIntArray30[local58]);
		}
		return local50;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)Z")
	public boolean method168() {
		if (this.anIntArray31 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray31.length; local21++) {
			if (!Static100.aClass36_69.method1768(0, this.anIntArray31[local21])) {
				local12 = false;
			}
		}
		return local12;
	}
}
