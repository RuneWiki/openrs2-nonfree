import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
	private final int[] anIntArray251 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "[S")
	private final short[] aShortArray4 = new short[6];

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
	public int anInt2047 = -1;

	@OriginalMember(owner = "client!pd", name = "tb", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Z")
	public boolean method1383() {
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray251[local16] != -1 && !Static59.aClass24_14.method656(this.anIntArray251[local16], 0)) {
				local14 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)Z")
	public boolean method1384() {
		if (this.anIntArray253 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray253.length; local14++) {
			if (!Static59.aClass24_14.method656(this.anIntArray253[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1386() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class5_Sub1_Sub1_Sub7[] local10 = new Class5_Sub1_Sub1_Sub7[5];
		for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
			if (this.anIntArray251[local21] != -1) {
				local10[local7++] = Static120.method1985(Static59.aClass24_14, this.anIntArray251[local21]);
			}
		}
		@Pc(50) Class5_Sub1_Sub1_Sub7 local50 = new Class5_Sub1_Sub1_Sub7(local10, local7);
		for (@Pc(52) int local52 = 0; local52 < 6 && this.aShortArray3[local52] != 0; local52++) {
			local50.method1988(this.aShortArray3[local52], this.aShortArray4[local52]);
		}
		return local50;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!qe;I)V")
	private void method1388(@OriginalArg(1) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2047 = arg0.method1546();
		} else if (arg1 == 2) {
			@Pc(20) int local20 = arg0.method1546();
			this.anIntArray253 = new int[local20];
			for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
				this.anIntArray253[local26] = arg0.method1543();
			}
		} else if (arg1 == 3) {
			this.aBoolean97 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray3[arg1 - 40] = (short) arg0.method1543();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray4[arg1 - 50] = (short) arg0.method1543();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray251[arg1 - 60] = arg0.method1543();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!qe;I)V")
	public void method1389(@OriginalArg(0) Class5_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1546();
			if (local9 == 0) {
				return;
			}
			this.method1388(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1392() {
		if (this.anIntArray253 == null) {
			return null;
		}
		@Pc(15) Class5_Sub1_Sub1_Sub7[] local15 = new Class5_Sub1_Sub1_Sub7[this.anIntArray253.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray253.length; local17++) {
			local15[local17] = Static120.method1985(Static59.aClass24_14, this.anIntArray253[local17]);
		}
		@Pc(52) Class5_Sub1_Sub1_Sub7 local52;
		if (local15.length == 1) {
			local52 = local15[0];
		} else {
			local52 = new Class5_Sub1_Sub1_Sub7(local15, local15.length);
		}
		for (@Pc(63) int local63 = 0; local63 < 6 && this.aShortArray3[local63] != 0; local63++) {
			local52.method1988(this.aShortArray3[local63], this.aShortArray4[local63]);
		}
		return local52;
	}
}
