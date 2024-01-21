import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt902;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt909 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(false, arg1.method666("varp.dat", null));
			if (arg0 == 35102) {
				anInt903 = 0;
				anInt902 = local8.method482();
				if (aClass39Array1 == null) {
					aClass39Array1 = new Class39[anInt902];
				}
				if (anIntArray247 == null) {
					anIntArray247 = new int[anInt902];
				}
				for (@Pc(29) int local29 = 0; local29 < anInt902; local29++) {
					if (aClass39Array1[local29] == null) {
						aClass39Array1[local29] = new Class39();
					}
					aClass39Array1[local29].method590(local8, local29);
				}
				if (local8.anInt757 != local8.aByteArray9.length) {
					System.out.println("varptype load mismatch");
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("87295, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method590(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method480();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt904 = arg0.method480();
				} else if (local8 == 2) {
					this.anInt905 = arg0.method480();
				} else if (local8 == 3) {
					this.aBoolean214 = true;
					anIntArray247[anInt903++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean215 = false;
				} else if (local8 == 5) {
					this.anInt906 = arg0.method482();
				} else if (local8 == 6) {
					this.aBoolean216 = true;
				} else if (local8 == 7) {
					this.anInt907 = arg0.method485();
				} else if (local8 == 8) {
					this.anInt908 = 1;
					this.aBoolean217 = true;
				} else if (local8 == 10) {
					this.aString28 = arg0.method487();
				} else if (local8 == 11) {
					this.aBoolean217 = true;
				} else if (local8 == 12) {
					this.anInt909 = arg0.method485();
				} else if (local8 == 13) {
					this.anInt908 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("8033, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
