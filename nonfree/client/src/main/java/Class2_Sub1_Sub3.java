import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
	public int anInt292 = -1;

	@OriginalMember(owner = "client!ba", name = "yb", descriptor = "[I")
	private final int[] anIntArray36 = new int[6];

	@OriginalMember(owner = "client!ba", name = "tb", descriptor = "[I")
	private final int[] anIntArray35 = new int[6];

	@OriginalMember(owner = "client!ba", name = "Eb", descriptor = "[I")
	private final int[] anIntArray37 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ba", name = "Fb", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!fe;B)V")
	public void method146(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1410();
			if (local15 == 0) {
				return;
			}
			this.method156(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)Z")
	public boolean method147() {
		if (this.anIntArray34 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray34.length; local14++) {
			if (!Static30.aClass33_14.method1140(0, this.anIntArray34[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)Z")
	public boolean method148() {
		@Pc(3) boolean local3 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray37[local16] != -1 && !Static30.aClass33_14.method1140(0, this.anIntArray37[local16])) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method155() {
		@Pc(16) Class2_Sub1_Sub1_Sub6[] local16 = new Class2_Sub1_Sub1_Sub6[5];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
			if (this.anIntArray37[local20] != -1) {
				local16[local18++] = Static86.method1543(Static30.aClass33_14, this.anIntArray37[local20]);
			}
		}
		@Pc(50) Class2_Sub1_Sub1_Sub6 local50 = new Class2_Sub1_Sub1_Sub6(local16, local18);
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray35[local52] != 0; local52++) {
			local50.method1515(this.anIntArray35[local52], this.anIntArray36[local52]);
		}
		return local50;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!fe;)V")
	private void method156(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt292 = arg1.method1410();
		} else if (arg0 == 2) {
			@Pc(27) int local27 = arg1.method1410();
			this.anIntArray34 = new int[local27];
			for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
				this.anIntArray34[local33] = arg1.method1396();
			}
		} else if (arg0 == 3) {
			this.aBoolean22 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray35[arg0 - 40] = arg1.method1396();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray36[arg0 - 50] = arg1.method1396();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray37[arg0 - 60] = arg1.method1396();
		}
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method157() {
		if (this.anIntArray34 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub6[] local15 = new Class2_Sub1_Sub1_Sub6[this.anIntArray34.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray34.length; local17++) {
			local15[local17] = Static86.method1543(Static30.aClass33_14, this.anIntArray34[local17]);
		}
		@Pc(53) Class2_Sub1_Sub1_Sub6 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class2_Sub1_Sub1_Sub6(local15, local15.length);
		}
		for (@Pc(64) int local64 = 0; local64 < 6 && this.anIntArray35[local64] != 0; local64++) {
			local53.method1515(this.anIntArray35[local64], this.anIntArray36[local64]);
		}
		return local53;
	}
}
