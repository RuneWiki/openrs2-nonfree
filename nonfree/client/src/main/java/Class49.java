import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class49 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
	private int[] anIntArray140 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public int anInt1477 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	public boolean method1228() {
		if (this.anIntArray141 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray141.length; local14++) {
			if (!Static45.aClass22_24.method653(0, this.anIntArray141[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Z")
	public boolean method1230() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray140[local9] != -1 && !Static45.aClass22_24.method653(0, this.anIntArray140[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Lclient!ud;")
	public Class13_Sub7 method1231() {
		if (this.anIntArray141 == null) {
			return null;
		}
		@Pc(15) Class13_Sub7[] local15 = new Class13_Sub7[this.anIntArray141.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray141.length; local17++) {
			local15[local17] = Static271.method4293(Static45.aClass22_24, this.anIntArray141[local17]);
		}
		@Pc(50) Class13_Sub7 local50;
		if (local15.length == 1) {
			local50 = local15[0];
		} else {
			local50 = new Class13_Sub7(local15, local15.length);
		}
		@Pc(68) int local68;
		if (this.aShortArray28 != null) {
			for (local68 = 0; local68 < this.aShortArray28.length; local68++) {
				local50.method4274(this.aShortArray28[local68], this.aShortArray29[local68]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local68 = 0; local68 < this.aShortArray31.length; local68++) {
				local50.method4291(this.aShortArray31[local68], this.aShortArray30[local68]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!pi;Z)V")
	public void method1232(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3110();
			if (local17 == 0) {
				return;
			}
			this.method1234(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!pi;)V")
	private void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt1477 = arg1.method3110();
			return;
		}
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (arg0 == 2) {
			local28 = arg1.method3110();
			this.anIntArray141 = new int[local28];
			for (local34 = 0; local34 < local28; local34++) {
				this.anIntArray141[local34] = arg1.method3085();
			}
		} else if (arg0 == 3) {
			this.aBoolean84 = true;
		} else if (arg0 == 40) {
			local28 = arg1.method3110();
			this.aShortArray28 = new short[local28];
			this.aShortArray29 = new short[local28];
			for (local34 = 0; local34 < local28; local34++) {
				this.aShortArray28[local34] = (short) arg1.method3085();
				this.aShortArray29[local34] = (short) arg1.method3085();
			}
		} else if (arg0 == 41) {
			local28 = arg1.method3110();
			this.aShortArray30 = new short[local28];
			this.aShortArray31 = new short[local28];
			for (local34 = 0; local34 < local28; local34++) {
				this.aShortArray31[local34] = (short) arg1.method3085();
				this.aShortArray30[local34] = (short) arg1.method3085();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray140[arg0 - 60] = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Lclient!ud;")
	public Class13_Sub7 method1235() {
		@Pc(14) Class13_Sub7[] local14 = new Class13_Sub7[5];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray140[local18] != -1) {
				local14[local16++] = Static271.method4293(Static45.aClass22_24, this.anIntArray140[local18]);
			}
		}
		@Pc(50) Class13_Sub7 local50 = new Class13_Sub7(local14, local16);
		@Pc(56) int local56;
		if (this.aShortArray28 != null) {
			for (local56 = 0; local56 < this.aShortArray28.length; local56++) {
				local50.method4274(this.aShortArray28[local56], this.aShortArray29[local56]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local56 = 0; local56 < this.aShortArray31.length; local56++) {
				local50.method4291(this.aShortArray31[local56], this.aShortArray30[local56]);
			}
		}
		return local50;
	}
}
