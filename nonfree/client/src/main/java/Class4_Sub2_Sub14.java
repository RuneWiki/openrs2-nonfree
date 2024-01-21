import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "I")
	public int anInt2752 = -1;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "[I")
	private final int[] anIntArray304 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "[S")
	private final short[] aShortArray10 = new short[6];

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!s;)V")
	private void method1946(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt2752 = arg1.method1474();
		} else if (arg0 == 2) {
			@Pc(92) int local92 = arg1.method1474();
			this.anIntArray303 = new int[local92];
			for (@Pc(98) int local98 = 0; local98 < local92; local98++) {
				this.anIntArray303[local98] = arg1.method1490();
			}
		} else if (arg0 == 3) {
			this.aBoolean137 = true;
			return;
		} else if (arg0 < 40 || arg0 >= 50) {
			if (arg0 >= 50 && arg0 < 60) {
				this.aShortArray11[arg0 - 50] = (short) arg1.method1490();
				return;
			}
			if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray304[arg0 - 60] = arg1.method1490();
				return;
			}
		} else {
			this.aShortArray10[arg0 - 40] = (short) arg1.method1490();
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method1951() {
		@Pc(8) Class4_Sub2_Sub1_Sub4[] local8 = new Class4_Sub2_Sub1_Sub4[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray304[local17] != -1) {
				local8[local15++] = Static95.method1747(Static25.aClass20_62, this.anIntArray304[local17]);
			}
		}
		@Pc(46) Class4_Sub2_Sub1_Sub4 local46 = new Class4_Sub2_Sub1_Sub4(local8, local15);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.aShortArray10[local48] != 0; local48++) {
			local46.method1731(this.aShortArray10[local48], this.aShortArray11[local48]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
	public boolean method1953() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray304[local15] != -1 && !Static25.aClass20_62.method491(this.anIntArray304[local15], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Z")
	public boolean method1955() {
		if (this.anIntArray303 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray303.length; local19++) {
			if (!Static25.aClass20_62.method491(this.anIntArray303[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!s;)V")
	public void method1958(@OriginalArg(1) Class4_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1474();
			if (local5 == 0) {
				return;
			}
			this.method1946(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "(I)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method1960() {
		if (this.anIntArray303 == null) {
			return null;
		}
		@Pc(15) Class4_Sub2_Sub1_Sub4[] local15 = new Class4_Sub2_Sub1_Sub4[this.anIntArray303.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray303.length; local17++) {
			local15[local17] = Static95.method1747(Static25.aClass20_62, this.anIntArray303[local17]);
		}
		@Pc(48) Class4_Sub2_Sub1_Sub4 local48;
		if (local15.length == 1) {
			local48 = local15[0];
		} else {
			local48 = new Class4_Sub2_Sub1_Sub4(local15, local15.length);
		}
		for (@Pc(61) int local61 = 0; local61 < 6 && this.aShortArray10[local61] != 0; local61++) {
			local48.method1731(this.aShortArray10[local61], this.aShortArray11[local61]);
		}
		return local48;
	}
}
