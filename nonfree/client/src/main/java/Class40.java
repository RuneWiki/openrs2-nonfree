import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TMMXBYBU")
public final class Class40 {

	@OriginalMember(owner = "client!TMMXBYBU", name = "b", descriptor = "I")
	public static int anInt508;

	@OriginalMember(owner = "client!TMMXBYBU", name = "c", descriptor = "[Lclient!TMMXBYBU;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!TMMXBYBU", name = "e", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!TMMXBYBU", name = "d", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!TMMXBYBU", name = "f", descriptor = "[I")
	private int[] anIntArray148 = new int[6];

	@OriginalMember(owner = "client!TMMXBYBU", name = "g", descriptor = "[I")
	private int[] anIntArray149 = new int[6];

	@OriginalMember(owner = "client!TMMXBYBU", name = "h", descriptor = "[I")
	private int[] anIntArray150 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!TMMXBYBU", name = "i", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method395(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(15) Class6_Sub2_Sub3 local15 = new Class6_Sub2_Sub3(-587, arg0.method358("idk.dat", null));
			anInt508 = local15.method264();
			if (aClass40Array1 == null) {
				aClass40Array1 = new Class40[anInt508];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt508; local25++) {
				if (aClass40Array1[local25] == null) {
					aClass40Array1[local25] = new Class40();
				}
				aClass40Array1[local25].method396(local15);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("5131, " + arg0 + ", " + -332 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method396(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method262();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt509 = arg0.method262();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method262();
					this.anIntArray147 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray147[local38] = arg0.method264();
					}
				} else if (local14 == 3) {
					this.aBoolean166 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray148[local14 - 40] = arg0.method264();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray149[local14 - 50] = arg0.method264();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray150[local14 - 60] = arg0.method264();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("22693, " + 6 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(B)Z")
	public boolean method397() {
		try {
			if (this.anIntArray147 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray147.length; local15++) {
				if (!Class6_Sub2_Sub1_Sub3.method134(this.anIntArray147[local15])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("61725, " + -64 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(Z)Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method398() {
		try {
			if (this.anIntArray147 == null) {
				return null;
			}
			@Pc(11) Class6_Sub2_Sub1_Sub3[] local11 = new Class6_Sub2_Sub1_Sub3[this.anIntArray147.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray147.length; local13++) {
				local11[local13] = Class6_Sub2_Sub1_Sub3.method133(this.anIntArray147[local13]);
			}
			@Pc(37) Class6_Sub2_Sub1_Sub3 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class6_Sub2_Sub1_Sub3(local11.length, 6, local11);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray148[local49] != 0; local49++) {
				local37.method147(this.anIntArray148[local49], this.anIntArray149[local49]);
			}
			return local37;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("1961, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(I)Z")
	public boolean method399() {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray150[local13] != -1 && !Class6_Sub2_Sub1_Sub3.method134(this.anIntArray150[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("63140, " + 887 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMMXBYBU", name = "b", descriptor = "(B)Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method400(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) Class6_Sub2_Sub1_Sub3[] local15 = new Class6_Sub2_Sub1_Sub3[5];
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray150[local19] != -1) {
					local15[local17++] = Class6_Sub2_Sub1_Sub3.method133(this.anIntArray150[local19]);
				}
			}
			@Pc(47) Class6_Sub2_Sub1_Sub3 local47 = new Class6_Sub2_Sub1_Sub3(local17, 6, local15);
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray148[local49] != 0; local49++) {
				local47.method147(this.anIntArray148[local49], this.anIntArray149[local49]);
			}
			return local47;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("37028, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
