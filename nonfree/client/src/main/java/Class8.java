import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DQSOHZWU")
public final class Class8 {

	@OriginalMember(owner = "client!DQSOHZWU", name = "e", descriptor = "I")
	public static int anInt121;

	@OriginalMember(owner = "client!DQSOHZWU", name = "f", descriptor = "[Lclient!DQSOHZWU;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!DQSOHZWU", name = "a", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!DQSOHZWU", name = "h", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!DQSOHZWU", name = "b", descriptor = "I")
	private int anInt120 = 9;

	@OriginalMember(owner = "client!DQSOHZWU", name = "c", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!DQSOHZWU", name = "d", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!DQSOHZWU", name = "g", descriptor = "I")
	public int anInt122 = -1;

	@OriginalMember(owner = "client!DQSOHZWU", name = "i", descriptor = "[I")
	private int[] anIntArray26 = new int[6];

	@OriginalMember(owner = "client!DQSOHZWU", name = "j", descriptor = "[I")
	private int[] anIntArray27 = new int[6];

	@OriginalMember(owner = "client!DQSOHZWU", name = "k", descriptor = "[I")
	private int[] anIntArray28 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!DQSOHZWU", name = "l", descriptor = "Z")
	public boolean aBoolean43 = false;

	@OriginalMember(owner = "client!DQSOHZWU", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method131(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method220("idk.dat", null), 8);
			anInt121 = local10.method240();
			if (aClass8Array1 == null) {
				aClass8Array1 = new Class8[anInt121];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt121; local29++) {
				if (aClass8Array1[local29] == null) {
					aClass8Array1[local29] = new Class8();
				}
				aClass8Array1[local29].method132(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("32135, " + 309 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "<init>", descriptor = "()V")
	private Class8() {
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private void method132(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method238();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt122 = arg0.method238();
				} else if (local9 == 2) {
					@Pc(27) int local27 = arg0.method238();
					this.anIntArray25 = new int[local27];
					for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
						this.anIntArray25[local33] = arg0.method240();
					}
				} else if (local9 == 3) {
					this.aBoolean43 = true;
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray26[local9 - 40] = arg0.method240();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray27[local9 - 50] = arg0.method240();
				} else if (local9 >= 60 && local9 < 70) {
					this.anIntArray28[local9 - 60] = arg0.method240();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("65132, " + arg0 + ", " + 0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "a", descriptor = "(Z)Z")
	public boolean method133() {
		try {
			if (this.anIntArray25 == null) {
				return true;
			}
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray25.length; local13++) {
				if (!Class1_Sub1_Sub2_Sub6.method416(this.anIntArray25[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("21076, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	public Class1_Sub1_Sub2_Sub6 method134() {
		try {
			if (this.anIntArray25 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub2_Sub6[] local22 = new Class1_Sub1_Sub2_Sub6[this.anIntArray25.length];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray25.length; local24++) {
				local22[local24] = Class1_Sub1_Sub2_Sub6.method415(this.anIntArray25[local24]);
			}
			@Pc(49) Class1_Sub1_Sub2_Sub6 local49;
			if (local22.length == 1) {
				local49 = local22[0];
			} else {
				local49 = new Class1_Sub1_Sub2_Sub6(local22.length, local22, this.anInt119);
			}
			for (@Pc(62) int local62 = 0; local62 < 6 && this.anIntArray26[local62] != 0; local62++) {
				local49.method429(this.anIntArray26[local62], this.anIntArray27[local62]);
			}
			return local49;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("89260, " + 23345 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "b", descriptor = "(I)Z")
	public boolean method135() {
		try {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
				if (this.anIntArray28[local12] != -1 && !Class1_Sub1_Sub2_Sub6.method416(this.anIntArray28[local12])) {
					local10 = false;
				}
			}
			return local10;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("12723, " + -884 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQSOHZWU", name = "b", descriptor = "(Z)Lclient!RTQSBWRH;")
	public Class1_Sub1_Sub2_Sub6 method136() {
		try {
			@Pc(4) Class1_Sub1_Sub2_Sub6[] local4 = new Class1_Sub1_Sub2_Sub6[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray28[local14] != -1) {
					local4[local12++] = Class1_Sub1_Sub2_Sub6.method415(this.anIntArray28[local14]);
				}
			}
			@Pc(44) Class1_Sub1_Sub2_Sub6 local44 = new Class1_Sub1_Sub2_Sub6(local12, local4, this.anInt119);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray26[local46] != 0; local46++) {
				local44.method429(this.anIntArray26[local46], this.anIntArray27[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("90398, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
