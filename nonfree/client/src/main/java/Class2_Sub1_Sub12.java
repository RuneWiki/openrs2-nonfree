import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "[I")
	private final int[] anIntArray340 = new int[6];

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
	public int anInt2418 = -1;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "[I")
	private final int[] anIntArray342 = new int[6];

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "[I")
	private final int[] anIntArray343 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1514() {
		if (this.anIntArray341 == null) {
			return null;
		}
		@Pc(23) Class2_Sub1_Sub4_Sub5[] local23 = new Class2_Sub1_Sub4_Sub5[this.anIntArray341.length];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray341.length; local25++) {
			local23[local25] = Static35.method896(Static91.aClass11_22, this.anIntArray341[local25]);
		}
		@Pc(56) Class2_Sub1_Sub4_Sub5 local56;
		if (local23.length == 1) {
			local56 = local23[0];
		} else {
			local56 = new Class2_Sub1_Sub4_Sub5(local23, local23.length);
		}
		for (@Pc(64) int local64 = 0; local64 < 6 && this.anIntArray342[local64] != 0; local64++) {
			local56.method924(this.anIntArray342[local64], this.anIntArray340[local64]);
		}
		return local56;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!pd;)V")
	private void method1515(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2418 = arg1.method665();
		} else if (arg0 == 2) {
			@Pc(84) int local84 = arg1.method665();
			this.anIntArray341 = new int[local84];
			for (@Pc(90) int local90 = 0; local90 < local84; local90++) {
				this.anIntArray341[local90] = arg1.method627();
			}
		} else if (arg0 == 3) {
			this.aBoolean124 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray342[arg0 - 40] = arg1.method627();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray340[arg0 - 50] = arg1.method627();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray343[arg0 - 60] = arg1.method627();
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
	public boolean method1517() {
		if (this.anIntArray341 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray341.length; local14++) {
			if (!Static91.aClass11_22.method347(0, this.anIntArray341[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Z")
	public boolean method1518() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray343[local17] != -1 && !Static91.aClass11_22.method347(0, this.anIntArray343[local17])) {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1519() {
		@Pc(4) Class2_Sub1_Sub4_Sub5[] local4 = new Class2_Sub1_Sub4_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray343[local12] != -1) {
				local4[local10++] = Static35.method896(Static91.aClass11_22, this.anIntArray343[local12]);
			}
		}
		@Pc(51) Class2_Sub1_Sub4_Sub5 local51 = new Class2_Sub1_Sub4_Sub5(local4, local10);
		for (@Pc(53) int local53 = 0; local53 < 6 && this.anIntArray342[local53] != 0; local53++) {
			local51.method924(this.anIntArray342[local53], this.anIntArray340[local53]);
		}
		return local51;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1520(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method665();
			if (local15 == 0) {
				return;
			}
			this.method1515(local15, arg0);
		}
	}
}
