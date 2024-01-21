import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt907;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt910;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt913 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method589(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(-49365, arg0.method666("varp.dat", null));
			anInt907 = 0;
			anInt906 = local8.method482();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt906];
			}
			if (anIntArray247 == null) {
				anIntArray247 = new int[anInt906];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt906; local28++) {
				if (aClass39Array1[local28] == null) {
					aClass39Array1[local28] = new Class39();
				}
				aClass39Array1[local28].method590(local8, local28);
			}
			if (local8.anInt763 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17220, " + arg0 + ", " + false + ", " + local62.toString());
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
				@Pc(14) int local14 = arg0.method480();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt908 = arg0.method480();
				} else if (local14 == 2) {
					this.anInt909 = arg0.method480();
				} else if (local14 == 3) {
					this.aBoolean224 = true;
					anIntArray247[anInt907++] = arg1;
				} else if (local14 == 4) {
					this.aBoolean225 = false;
				} else if (local14 == 5) {
					this.anInt910 = arg0.method482();
				} else if (local14 == 6) {
					this.aBoolean226 = true;
				} else if (local14 == 7) {
					this.anInt911 = arg0.method485();
				} else if (local14 == 8) {
					this.anInt912 = 1;
					this.aBoolean227 = true;
				} else if (local14 == 10) {
					this.aString28 = arg0.method487();
				} else if (local14 == 11) {
					this.aBoolean227 = true;
				} else if (local14 == 12) {
					this.anInt913 = arg0.method485();
				} else if (local14 == 13) {
					this.anInt912 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("4968, " + true + ", " + arg0 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
