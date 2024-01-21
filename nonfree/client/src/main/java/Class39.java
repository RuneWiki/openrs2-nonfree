import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt888;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt892;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method666("varp.dat", null), -26728);
			anInt889 = 0;
			if (arg0 == 0) {
				anInt888 = local8.method482();
				if (aClass39Array1 == null) {
					aClass39Array1 = new Class39[anInt888];
				}
				if (anIntArray247 == null) {
					anIntArray247 = new int[anInt888];
				}
				for (@Pc(28) int local28 = 0; local28 < anInt888; local28++) {
					if (aClass39Array1[local28] == null) {
						aClass39Array1[local28] = new Class39();
					}
					aClass39Array1[local28].method590(local28, local8);
				}
				if (local8.anInt742 != local8.aByteArray9.length) {
					System.out.println("varptype load mismatch");
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("88054, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method480();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt890 = arg1.method480();
				} else if (local8 == 2) {
					this.anInt891 = arg1.method480();
				} else if (local8 == 3) {
					this.aBoolean217 = true;
					anIntArray247[anInt889++] = arg0;
				} else if (local8 == 4) {
					this.aBoolean218 = false;
				} else if (local8 == 5) {
					this.anInt892 = arg1.method482();
				} else if (local8 == 6) {
					this.aBoolean219 = true;
				} else if (local8 == 7) {
					this.anInt893 = arg1.method485();
				} else if (local8 == 8) {
					this.anInt894 = 1;
					this.aBoolean220 = true;
				} else if (local8 == 10) {
					this.aString28 = arg1.method487();
				} else if (local8 == 11) {
					this.aBoolean220 = true;
				} else if (local8 == 12) {
					this.anInt895 = arg1.method485();
				} else if (local8 == 13) {
					this.anInt894 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("54006, " + arg0 + ", " + 39196 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
