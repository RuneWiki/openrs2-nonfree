import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GBMZYMFW")
public final class Class17 {

	@OriginalMember(owner = "client!GBMZYMFW", name = "a", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!GBMZYMFW", name = "b", descriptor = "I")
	private static int anInt287;

	@OriginalMember(owner = "client!GBMZYMFW", name = "c", descriptor = "[Lclient!GBMZYMFW;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!GBMZYMFW", name = "d", descriptor = "I")
	private static int anInt288;

	@OriginalMember(owner = "client!GBMZYMFW", name = "e", descriptor = "[I")
	private static int[] anIntArray37;

	@OriginalMember(owner = "client!GBMZYMFW", name = "f", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!GBMZYMFW", name = "g", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!GBMZYMFW", name = "h", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!GBMZYMFW", name = "k", descriptor = "I")
	public int anInt291;

	@OriginalMember(owner = "client!GBMZYMFW", name = "m", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!GBMZYMFW", name = "n", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!GBMZYMFW", name = "i", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!GBMZYMFW", name = "j", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!GBMZYMFW", name = "l", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!GBMZYMFW", name = "o", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!GBMZYMFW", name = "p", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!GBMZYMFW", name = "q", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!GBMZYMFW", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method223(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method514("varp.dat", null), false);
			anInt288 = 0;
			anInt287 = local8.method169();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt287];
			}
			if (anIntArray37 == null) {
				anIntArray37 = new int[anInt287];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt287; local33++) {
				if (aClass17Array1[local33] == null) {
					aClass17Array1[local33] = new Class17();
				}
				aClass17Array1[local33].method224(local8, local33);
			}
			if (local8.anInt242 != local8.aByteArray7.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("17826, " + 0 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBMZYMFW", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!GBMZYMFW", name = "a", descriptor = "(Lclient!EGCCHUZS;II)V")
	private void method224(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method167();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt289 = arg0.method167();
				} else if (local13 == 2) {
					this.anInt290 = arg0.method167();
				} else if (local13 == 3) {
					this.aBoolean74 = true;
					anIntArray37[anInt288++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean75 = false;
				} else if (local13 == 5) {
					this.anInt291 = arg0.method169();
				} else if (local13 == 6) {
					this.aBoolean76 = true;
				} else if (local13 == 7) {
					this.anInt292 = arg0.method172();
				} else if (local13 == 8) {
					this.anInt293 = 1;
					this.aBoolean77 = true;
				} else if (local13 == 10) {
					this.aString6 = arg0.method174();
				} else if (local13 == 11) {
					this.aBoolean77 = true;
				} else if (local13 == 12) {
					this.anInt294 = arg0.method172();
				} else if (local13 == 13) {
					this.anInt293 = 2;
					this.aBoolean77 = true;
				} else if (local13 == 14) {
					this.aBoolean78 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("84441, " + arg0 + ", " + 792 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
