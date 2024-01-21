import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DOOZRHTX")
public final class Class9 {

	@OriginalMember(owner = "client!DOOZRHTX", name = "e", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!DOOZRHTX", name = "f", descriptor = "[Lclient!DOOZRHTX;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!DOOZRHTX", name = "d", descriptor = "Z")
	private static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!DOOZRHTX", name = "h", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!DOOZRHTX", name = "b", descriptor = "I")
	private int anInt158 = 12272;

	@OriginalMember(owner = "client!DOOZRHTX", name = "c", descriptor = "I")
	private int anInt159 = -34;

	@OriginalMember(owner = "client!DOOZRHTX", name = "g", descriptor = "I")
	public int anInt161 = -1;

	@OriginalMember(owner = "client!DOOZRHTX", name = "i", descriptor = "[I")
	private int[] anIntArray41 = new int[6];

	@OriginalMember(owner = "client!DOOZRHTX", name = "j", descriptor = "[I")
	private int[] anIntArray42 = new int[6];

	@OriginalMember(owner = "client!DOOZRHTX", name = "k", descriptor = "[I")
	private int[] anIntArray43 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!DOOZRHTX", name = "l", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method65(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(17) Class8_Sub1_Sub3 local17 = new Class8_Sub1_Sub3(arg0.method364("idk.dat", null), -631);
			anInt160 = local17.method408();
			if (aClass9Array1 == null) {
				aClass9Array1 = new Class9[anInt160];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt160; local27++) {
				if (aClass9Array1[local27] == null) {
					aClass9Array1[local27] = new Class9();
				}
				aClass9Array1[local27].method66(local17);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("33946, " + -109 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method66(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(18) int local18 = arg0.method406();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt161 = arg0.method406();
				} else if (local18 == 2) {
					@Pc(36) int local36 = arg0.method406();
					this.anIntArray40 = new int[local36];
					for (@Pc(42) int local42 = 0; local42 < local36; local42++) {
						this.anIntArray40[local42] = arg0.method408();
					}
				} else if (local18 == 3) {
					this.aBoolean28 = true;
				} else if (local18 >= 40 && local18 < 50) {
					this.anIntArray41[local18 - 40] = arg0.method408();
				} else if (local18 >= 50 && local18 < 60) {
					this.anIntArray42[local18 - 50] = arg0.method408();
				} else if (local18 >= 60 && local18 < 70) {
					this.anIntArray43[local18 - 60] = arg0.method408();
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("65173, " + 3 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(I)Z")
	public boolean method67() {
		try {
			if (this.anIntArray40 == null) {
				return true;
			}
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray40.length; local20++) {
				if (!Class8_Sub1_Sub1_Sub3.method137(this.anIntArray40[local20])) {
					local18 = false;
				}
			}
			return local18;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("13454, " + 2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(Z)Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method68() {
		try {
			if (this.anIntArray40 == null) {
				return null;
			}
			@Pc(20) Class8_Sub1_Sub1_Sub3[] local20 = new Class8_Sub1_Sub1_Sub3[this.anIntArray40.length];
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray40.length; local22++) {
				local20[local22] = Class8_Sub1_Sub1_Sub3.method136(this.anIntArray40[local22]);
			}
			@Pc(46) Class8_Sub1_Sub1_Sub3 local46;
			if (local20.length == 1) {
				local46 = local20[0];
			} else {
				local46 = new Class8_Sub1_Sub1_Sub3(local20, local20.length, this.anInt158);
			}
			for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray41[local59] != 0; local59++) {
				local46.method150(this.anIntArray41[local59], this.anIntArray42[local59]);
			}
			return local46;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("55209, " + false + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "b", descriptor = "(I)Z")
	public boolean method69(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray43[local3] != -1 && !Class8_Sub1_Sub1_Sub3.method137(this.anIntArray43[local3])) {
					local1 = false;
				}
			}
			if (arg0 != 0) {
				this.anInt159 = 373;
			}
			return local1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("88135, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DOOZRHTX", name = "c", descriptor = "(I)Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method70() {
		try {
			@Pc(4) Class8_Sub1_Sub1_Sub3[] local4 = new Class8_Sub1_Sub1_Sub3[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray43[local8] != -1) {
					local4[local6++] = Class8_Sub1_Sub1_Sub3.method136(this.anIntArray43[local8]);
				}
			}
			@Pc(37) Class8_Sub1_Sub1_Sub3 local37 = new Class8_Sub1_Sub1_Sub3(local4, local6, this.anInt158);
			for (@Pc(39) int local39 = 0; local39 < 6 && this.anIntArray41[local39] != 0; local39++) {
				local37.method150(this.anIntArray41[local39], this.anIntArray42[local39]);
			}
			return local37;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("37983, " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
