import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt881;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method589(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method666("varp.dat", null), 58);
			anInt882 = 0;
			anInt881 = local11.method482();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt881];
			}
			if (anIntArray247 == null) {
				anIntArray247 = new int[anInt881];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt881; local28++) {
				if (aClass39Array1[local28] == null) {
					aClass39Array1[local28] = new Class39();
				}
				aClass39Array1[local28].method590(local11, local28);
			}
			if (local11.anInt742 != local11.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17915, " + arg0 + ", " + -30 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!lb;I)V")
	private void method590(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method480();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt883 = arg0.method480();
				} else if (local7 == 2) {
					this.anInt884 = arg0.method480();
				} else if (local7 == 3) {
					this.aBoolean217 = true;
					anIntArray247[anInt882++] = arg1;
				} else if (local7 == 4) {
					this.aBoolean218 = false;
				} else if (local7 == 5) {
					this.anInt885 = arg0.method482();
				} else if (local7 == 6) {
					this.aBoolean219 = true;
				} else if (local7 == 7) {
					this.anInt886 = arg0.method485();
				} else if (local7 == 8) {
					this.anInt887 = 1;
					this.aBoolean220 = true;
				} else if (local7 == 10) {
					this.aString28 = arg0.method487();
				} else if (local7 == 11) {
					this.aBoolean220 = true;
				} else if (local7 == 12) {
					this.anInt888 = arg0.method485();
				} else if (local7 == 13) {
					this.anInt887 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("88238, " + true + ", " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
