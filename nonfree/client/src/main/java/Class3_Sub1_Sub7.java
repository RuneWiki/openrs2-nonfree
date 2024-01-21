import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "[I")
	private final int[] anIntArray147 = new int[6];

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
	private final int[] anIntArray148 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "[I")
	private final int[] anIntArray146 = new int[6];

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
	public int anInt1244 = -1;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method834() {
		@Pc(8) Class3_Sub1_Sub1_Sub6[] local8 = new Class3_Sub1_Sub1_Sub6[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray148[local17] != -1) {
				local8[local15++] = Static107.method1799(Static85.aClass11_48, this.anIntArray148[local17]);
			}
		}
		@Pc(46) Class3_Sub1_Sub1_Sub6 local46 = new Class3_Sub1_Sub1_Sub6(local8, local15);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray146[local48] != 0; local48++) {
			local46.method1821(this.anIntArray146[local48], this.anIntArray147[local48]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Z")
	public boolean method835() {
		if (this.anIntArray149 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray149.length; local14++) {
			if (!Static85.aClass11_48.method1872(0, this.anIntArray149[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method838() {
		if (this.anIntArray149 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub1_Sub6[] local15 = new Class3_Sub1_Sub1_Sub6[this.anIntArray149.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray149.length; local24++) {
			local15[local24] = Static107.method1799(Static85.aClass11_48, this.anIntArray149[local24]);
		}
		@Pc(53) Class3_Sub1_Sub1_Sub6 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class3_Sub1_Sub1_Sub6(local15, local15.length);
		}
		for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray146[local61] != 0; local61++) {
			local53.method1821(this.anIntArray146[local61], this.anIntArray147[local61]);
		}
		return local53;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
	public boolean method839() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray148[local14] != -1 && !Static85.aClass11_48.method1872(0, this.anIntArray148[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!m;)V")
	public void method840(@OriginalArg(1) Class3_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1587();
			if (local5 == 0) {
				return;
			}
			this.method841(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!m;)V")
	private void method841(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt1244 = arg1.method1587();
		} else if (arg0 == 2) {
			@Pc(82) int local82 = arg1.method1587();
			this.anIntArray149 = new int[local82];
			for (@Pc(88) int local88 = 0; local88 < local82; local88++) {
				this.anIntArray149[local88] = arg1.method1603();
			}
		} else if (arg0 == 3) {
			this.aBoolean62 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray146[arg0 - 40] = arg1.method1603();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray147[arg0 - 50] = arg1.method1603();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray148[arg0 - 60] = arg1.method1603();
		}
	}
}
