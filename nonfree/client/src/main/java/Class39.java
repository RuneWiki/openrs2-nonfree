import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt905;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt903 = 1000;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt909;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private int anInt904 = -47594;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	private int anInt912 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method589(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt903, arg0.method666("varp.dat", null));
			anInt906 = 0;
			anInt905 = local8.method482();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt905];
			}
			if (anIntArray247 == null) {
				anIntArray247 = new int[anInt905];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt905; local25++) {
				if (aClass39Array1[local25] == null) {
					aClass39Array1[local25] = new Class39();
				}
				aClass39Array1[local25].method590(local25, local8);
			}
			if (local8.anInt751 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("72848, " + arg0 + ", " + 0 + ", " + local64.toString());
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
				@Pc(10) int local10 = arg1.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt907 = arg1.method480();
				} else if (local10 == 2) {
					this.anInt908 = arg1.method480();
				} else if (local10 == 3) {
					this.aBoolean223 = true;
					anIntArray247[anInt906++] = arg0;
				} else if (local10 == 4) {
					this.aBoolean224 = false;
				} else if (local10 == 5) {
					this.anInt909 = arg1.method482();
				} else if (local10 == 6) {
					this.aBoolean225 = true;
				} else if (local10 == 7) {
					this.anInt910 = arg1.method485();
				} else if (local10 == 8) {
					this.anInt911 = 1;
					this.aBoolean226 = true;
				} else if (local10 == 10) {
					this.aString28 = arg1.method487();
				} else if (local10 == 11) {
					this.aBoolean226 = true;
				} else if (local10 == 12) {
					this.anInt912 = arg1.method485();
				} else if (local10 == 13) {
					this.anInt911 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("86312, " + arg0 + ", " + arg1 + ", " + 12249 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
