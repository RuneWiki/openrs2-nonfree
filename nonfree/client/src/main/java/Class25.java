import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OQTNTOVY")
public final class Class25 {

	@OriginalMember(owner = "client!OQTNTOVY", name = "c", descriptor = "I")
	public static int anInt487;

	@OriginalMember(owner = "client!OQTNTOVY", name = "d", descriptor = "[Lclient!OQTNTOVY;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "I")
	private static int anInt485 = 2;

	@OriginalMember(owner = "client!OQTNTOVY", name = "f", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!OQTNTOVY", name = "b", descriptor = "I")
	private int anInt486 = 153;

	@OriginalMember(owner = "client!OQTNTOVY", name = "e", descriptor = "I")
	public int anInt488 = -1;

	@OriginalMember(owner = "client!OQTNTOVY", name = "g", descriptor = "[I")
	private int[] anIntArray66 = new int[6];

	@OriginalMember(owner = "client!OQTNTOVY", name = "h", descriptor = "[I")
	private int[] anIntArray67 = new int[6];

	@OriginalMember(owner = "client!OQTNTOVY", name = "i", descriptor = "[I")
	private int[] anIntArray68 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!OQTNTOVY", name = "j", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method287(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method489("idk.dat", null), -990);
			anInt487 = local8.method81();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt487];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt487; local18++) {
				if (aClass25Array1[local18] == null) {
					aClass25Array1[local18] = new Class25();
				}
				aClass25Array1[local18].method288(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("59904, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method288(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method79();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt488 = arg0.method79();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method79();
					this.anIntArray65 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray65[local38] = arg0.method81();
					}
				} else if (local14 == 3) {
					this.aBoolean115 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray66[local14 - 40] = arg0.method81();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray67[local14 - 50] = arg0.method81();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray68[local14 - 60] = arg0.method81();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("49972, " + -11 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(I)Z")
	public boolean method289() {
		try {
			if (this.anIntArray65 == null) {
				return true;
			}
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray65.length; local18++) {
				if (!Class2_Sub1_Sub1_Sub6.method513(this.anIntArray65[local18])) {
					local16 = false;
				}
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("17974, " + -422 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method290() {
		try {
			if (this.anIntArray65 == null) {
				return null;
			}
			@Pc(11) Class2_Sub1_Sub1_Sub6[] local11 = new Class2_Sub1_Sub1_Sub6[this.anIntArray65.length];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray65.length; local20++) {
				local11[local20] = Class2_Sub1_Sub1_Sub6.method512(this.anIntArray65[local20]);
			}
			@Pc(44) Class2_Sub1_Sub1_Sub6 local44;
			if (local11.length == 1) {
				local44 = local11[0];
			} else {
				local44 = new Class2_Sub1_Sub1_Sub6(local11, 273, local11.length);
			}
			for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray66[local56] != 0; local56++) {
				local44.method526(this.anIntArray66[local56], this.anIntArray67[local56]);
			}
			return local44;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("92699, " + 107 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "b", descriptor = "(I)Z")
	public boolean method291() {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray68[local15] != -1 && !Class2_Sub1_Sub1_Sub6.method513(this.anIntArray68[local15])) {
					local3 = false;
				}
			}
			return local3;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("65466, " + -8240 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTNTOVY", name = "c", descriptor = "(I)Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method292(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class2_Sub1_Sub1_Sub6[] local4 = new Class2_Sub1_Sub1_Sub6[5];
			@Pc(6) int local6 = 0;
			if (arg0 != 0) {
				this.anInt486 = 294;
			}
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray68[local13] != -1) {
					local4[local6++] = Class2_Sub1_Sub1_Sub6.method512(this.anIntArray68[local13]);
				}
			}
			@Pc(41) Class2_Sub1_Sub1_Sub6 local41 = new Class2_Sub1_Sub1_Sub6(local4, 273, local6);
			for (@Pc(43) int local43 = 0; local43 < 6 && this.anIntArray66[local43] != 0; local43++) {
				local41.method526(this.anIntArray66[local43], this.anIntArray67[local43]);
			}
			return local41;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("56076, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
