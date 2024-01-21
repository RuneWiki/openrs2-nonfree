import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LXLAQKAC")
public final class Class24 {

	@OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "Z")
	private static boolean aBoolean92;

	@OriginalMember(owner = "client!LXLAQKAC", name = "b", descriptor = "I")
	public static int anInt466;

	@OriginalMember(owner = "client!LXLAQKAC", name = "c", descriptor = "[Lclient!LXLAQKAC;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!LXLAQKAC", name = "e", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!LXLAQKAC", name = "d", descriptor = "I")
	public int anInt467 = -1;

	@OriginalMember(owner = "client!LXLAQKAC", name = "f", descriptor = "[I")
	private int[] anIntArray93 = new int[6];

	@OriginalMember(owner = "client!LXLAQKAC", name = "g", descriptor = "[I")
	private int[] anIntArray94 = new int[6];

	@OriginalMember(owner = "client!LXLAQKAC", name = "h", descriptor = "[I")
	private int[] anIntArray95 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!LXLAQKAC", name = "i", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method270(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(0, arg0.method181("idk.dat", null));
			anInt466 = local8.method296();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt466];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt466; local27++) {
				if (aClass24Array1[local27] == null) {
					aClass24Array1[local27] = new Class24();
				}
				aClass24Array1[local27].method271(403, local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("35987, " + 8 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method271(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method294();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt467 = arg1.method294();
					} else if (local8 == 2) {
						@Pc(26) int local26 = arg1.method294();
						this.anIntArray92 = new int[local26];
						for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
							this.anIntArray92[local32] = arg1.method296();
						}
					} else if (local8 == 3) {
						this.aBoolean93 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray93[local8 - 40] = arg1.method296();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray94[local8 - 50] = arg1.method296();
					} else if (local8 >= 60 && local8 < 70) {
						this.anIntArray95[local8 - 60] = arg1.method296();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("78857, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(I)Z")
	public boolean method272() {
		try {
			if (this.anIntArray92 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray92.length; local14++) {
				if (!Class1_Sub1_Sub1_Sub4.method364(this.anIntArray92[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("77399, " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(Z)Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method273() {
		try {
			if (this.anIntArray92 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub4[] local11 = new Class1_Sub1_Sub1_Sub4[this.anIntArray92.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray92.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub4.method363(this.anIntArray92[local13]);
			}
			@Pc(37) Class1_Sub1_Sub1_Sub4 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class1_Sub1_Sub1_Sub4(local11, local11.length, 0);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray93[local49] != 0; local49++) {
				local37.method377(this.anIntArray93[local49], this.anIntArray94[local49]);
			}
			return local37;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("68691, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "b", descriptor = "(I)Z")
	public boolean method274(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray95[local3] != -1 && !Class1_Sub1_Sub1_Sub4.method364(this.anIntArray95[local3])) {
					local1 = false;
				}
			}
			@Pc(27) boolean local27 = false;
			return local1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("91168, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXLAQKAC", name = "c", descriptor = "(I)Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method275() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub4[] local4 = new Class1_Sub1_Sub1_Sub4[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray95[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub4.method363(this.anIntArray95[local8]);
				}
			}
			@Pc(36) Class1_Sub1_Sub1_Sub4 local36 = new Class1_Sub1_Sub1_Sub4(local4, local6, 0);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray93[local46] != 0; local46++) {
				local36.method377(this.anIntArray93[local46], this.anIntArray94[local46]);
			}
			return local36;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("10707, " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
