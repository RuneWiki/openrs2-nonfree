import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JMEOMLFD")
public final class Class17 {

	@OriginalMember(owner = "client!JMEOMLFD", name = "a", descriptor = "I")
	private static int anInt373;

	@OriginalMember(owner = "client!JMEOMLFD", name = "b", descriptor = "[Lclient!JMEOMLFD;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!JMEOMLFD", name = "c", descriptor = "I")
	private static int anInt374;

	@OriginalMember(owner = "client!JMEOMLFD", name = "d", descriptor = "[I")
	private static int[] anIntArray111;

	@OriginalMember(owner = "client!JMEOMLFD", name = "e", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!JMEOMLFD", name = "f", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!JMEOMLFD", name = "g", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!JMEOMLFD", name = "j", descriptor = "I")
	public int anInt377;

	@OriginalMember(owner = "client!JMEOMLFD", name = "l", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!JMEOMLFD", name = "m", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!JMEOMLFD", name = "h", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!JMEOMLFD", name = "i", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!JMEOMLFD", name = "k", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!JMEOMLFD", name = "n", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!JMEOMLFD", name = "o", descriptor = "I")
	private int anInt380 = -1;

	@OriginalMember(owner = "client!JMEOMLFD", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method264(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub2 local11 = new Class1_Sub1_Sub2(false, arg0.method340("varp.dat", null));
			anInt374 = 0;
			anInt373 = local11.method24();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt373];
			}
			if (anIntArray111 == null) {
				anIntArray111 = new int[anInt373];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt373; local28++) {
				if (aClass17Array1[local28] == null) {
					aClass17Array1[local28] = new Class17();
				}
				aClass17Array1[local28].method265(local11, local28);
			}
			if (local11.anInt10 != local11.aByteArray1.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("40233, " + arg0 + ", " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JMEOMLFD", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!JMEOMLFD", name = "a", descriptor = "(Lclient!BJPWOXRJ;II)V")
	private void method265(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method22();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt375 = arg0.method22();
				} else if (local13 == 2) {
					this.anInt376 = arg0.method22();
				} else if (local13 == 3) {
					this.aBoolean89 = true;
					anIntArray111[anInt374++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean90 = false;
				} else if (local13 == 5) {
					this.anInt377 = arg0.method24();
				} else if (local13 == 6) {
					this.aBoolean91 = true;
				} else if (local13 == 7) {
					this.anInt378 = arg0.method27();
				} else if (local13 == 8) {
					this.anInt379 = 1;
					this.aBoolean92 = true;
				} else if (local13 == 10) {
					this.aString10 = arg0.method29();
				} else if (local13 == 11) {
					this.aBoolean92 = true;
				} else if (local13 == 12) {
					this.anInt380 = arg0.method27();
				} else if (local13 == 13) {
					this.anInt379 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("70574, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
