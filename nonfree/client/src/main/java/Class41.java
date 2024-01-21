import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class41 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean213;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[Lclient!sc;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
	private static int[] anIntArray259;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt901 = 6771;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt902 = -45991;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public int anInt907;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	private int anInt910 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method615(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method689("varp.dat", null), true);
			anInt904 = 0;
			anInt903 = local8.method505();
			if (anInt901 != 6771) {
				anInt902 = -12;
			}
			if (aClass41Array1 == null) {
				aClass41Array1 = new Class41[anInt903];
			}
			if (anIntArray259 == null) {
				anIntArray259 = new int[anInt903];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt903; local30++) {
				if (aClass41Array1[local30] == null) {
					aClass41Array1[local30] = new Class41();
				}
				aClass41Array1[local30].method616(local8, local30, aBoolean213);
			}
			if (local8.anInt766 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("81146, " + 6771 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	private Class41() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;IZ)V")
	private void method616(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (!arg2) {
				while (true) {
					@Pc(7) int local7 = arg0.method503();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt905 = arg0.method503();
					} else if (local7 == 2) {
						this.anInt906 = arg0.method503();
					} else if (local7 == 3) {
						this.aBoolean214 = true;
						anIntArray259[anInt904++] = arg1;
					} else if (local7 == 4) {
						this.aBoolean215 = false;
					} else if (local7 == 5) {
						this.anInt907 = arg0.method505();
					} else if (local7 == 6) {
						this.aBoolean216 = true;
					} else if (local7 == 7) {
						this.anInt908 = arg0.method508();
					} else if (local7 == 8) {
						this.anInt909 = 1;
						this.aBoolean217 = true;
					} else if (local7 == 10) {
						this.aString28 = arg0.method510();
					} else if (local7 == 11) {
						this.aBoolean217 = true;
					} else if (local7 == 12) {
						this.anInt910 = arg0.method508();
					} else if (local7 == 13) {
						this.anInt909 = 2;
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("50315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
