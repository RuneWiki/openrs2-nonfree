import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt865;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt866;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt872 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method589(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("varp.dat", null), (byte) -93);
			anInt866 = 0;
			anInt865 = local8.method482();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt865];
			}
			if (anIntArray247 == null) {
				anIntArray247 = new int[anInt865];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt865; local28++) {
				if (aClass39Array1[local28] == null) {
					aClass39Array1[local28] = new Class39();
				}
				aClass39Array1[local28].method590(local28, local8);
			}
			if (local8.anInt720 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("80747, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(15) int local15 = arg1.method480();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt867 = arg1.method480();
				} else if (local15 == 2) {
					this.anInt868 = arg1.method480();
				} else if (local15 == 3) {
					this.aBoolean231 = true;
					anIntArray247[anInt866++] = arg0;
				} else if (local15 == 4) {
					this.aBoolean232 = false;
				} else if (local15 == 5) {
					this.anInt869 = arg1.method482();
				} else if (local15 == 6) {
					this.aBoolean233 = true;
				} else if (local15 == 7) {
					this.anInt870 = arg1.method485();
				} else if (local15 == 8) {
					this.anInt871 = 1;
					this.aBoolean234 = true;
				} else if (local15 == 10) {
					this.aString28 = arg1.method487();
				} else if (local15 == 11) {
					this.aBoolean234 = true;
				} else if (local15 == 12) {
					this.anInt872 = arg1.method485();
				} else if (local15 == 13) {
					this.anInt871 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("65978, " + arg0 + ", " + arg1 + ", " + -45931 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
