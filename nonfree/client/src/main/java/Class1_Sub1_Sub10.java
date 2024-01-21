import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kb", name = "rb", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "[I")
	private final int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "[I")
	private final int[] anIntArray204 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "[I")
	private final int[] anIntArray201 = new int[6];

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	public int anInt1375 = -1;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method962() {
		if (this.anIntArray206 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub8_Sub3[] local15 = new Class1_Sub1_Sub8_Sub3[this.anIntArray206.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray206.length; local17++) {
			local15[local17] = Static76.method1372(Static17.aClass33_6, this.anIntArray206[local17]);
		}
		@Pc(45) Class1_Sub1_Sub8_Sub3 local45;
		if (local15.length == 1) {
			local45 = local15[0];
		} else {
			local45 = new Class1_Sub1_Sub8_Sub3(local15, local15.length);
		}
		for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray201[local56] != 0; local56++) {
			local45.method1383(this.anIntArray201[local56], this.anIntArray202[local56]);
		}
		return local45;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ka;Z)V")
	public void method965(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1186();
			if (local16 == 0) {
				return;
			}
			this.method969(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)Z")
	public boolean method967() {
		if (this.anIntArray206 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray206.length; local20++) {
			if (!Static17.aClass33_6.method1310(0, this.anIntArray206[local20])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)Z")
	public boolean method968() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray204[local14] != -1 && !Static17.aClass33_6.method1310(0, this.anIntArray204[local14])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!ka;I)V")
	private void method969(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1375 = arg0.method1186();
		} else if (arg1 == 2) {
			@Pc(80) int local80 = arg0.method1186();
			this.anIntArray206 = new int[local80];
			for (@Pc(86) int local86 = 0; local86 < local80; local86++) {
				this.anIntArray206[local86] = arg0.method1199();
			}
		} else if (arg1 == 3) {
			this.aBoolean81 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray201[arg1 - 40] = arg0.method1199();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray202[arg1 - 50] = arg0.method1199();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray204[arg1 - 60] = arg0.method1199();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method970() {
		@Pc(13) Class1_Sub1_Sub8_Sub3[] local13 = new Class1_Sub1_Sub8_Sub3[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray204[local17] != -1) {
				local13[local15++] = Static76.method1372(Static17.aClass33_6, this.anIntArray204[local17]);
			}
		}
		@Pc(46) Class1_Sub1_Sub8_Sub3 local46 = new Class1_Sub1_Sub8_Sub3(local13, local15);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray201[local48] != 0; local48++) {
			local46.method1383(this.anIntArray201[local48], this.anIntArray202[local48]);
		}
		return local46;
	}
}
