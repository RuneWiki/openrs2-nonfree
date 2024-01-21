import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KTJKDKKM")
public final class Class17 {

	@OriginalMember(owner = "client!KTJKDKKM", name = "b", descriptor = "I")
	private static int anInt365;

	@OriginalMember(owner = "client!KTJKDKKM", name = "c", descriptor = "[Lclient!KTJKDKKM;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!KTJKDKKM", name = "d", descriptor = "I")
	private static int anInt366;

	@OriginalMember(owner = "client!KTJKDKKM", name = "e", descriptor = "[I")
	private static int[] anIntArray120;

	@OriginalMember(owner = "client!KTJKDKKM", name = "f", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!KTJKDKKM", name = "g", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!KTJKDKKM", name = "h", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!KTJKDKKM", name = "k", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!KTJKDKKM", name = "m", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!KTJKDKKM", name = "n", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!KTJKDKKM", name = "a", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!KTJKDKKM", name = "i", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!KTJKDKKM", name = "j", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!KTJKDKKM", name = "l", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!KTJKDKKM", name = "o", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!KTJKDKKM", name = "p", descriptor = "I")
	private int anInt372 = -1;

	@OriginalMember(owner = "client!KTJKDKKM", name = "q", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!KTJKDKKM", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method167(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(true, arg0.method140("varp.dat", null));
			anInt366 = 0;
			anInt365 = local10.method202();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt365];
			}
			if (anIntArray120 == null) {
				anIntArray120 = new int[anInt365];
			}
			for (@Pc(37) int local37 = 0; local37 < anInt365; local37++) {
				if (aClass17Array1[local37] == null) {
					aClass17Array1[local37] = new Class17();
				}
				aClass17Array1[local37].method168(local37, local10);
			}
			if (local10.anInt429 != local10.aByteArray14.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("46305, " + arg0 + ", " + 3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTJKDKKM", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!KTJKDKKM", name = "a", descriptor = "(IILclient!MLYYHULT;)V")
	private void method168(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(15) int local15 = arg1.method200();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt367 = arg1.method200();
				} else if (local15 == 2) {
					this.anInt368 = arg1.method200();
				} else if (local15 == 3) {
					this.aBoolean80 = true;
					anIntArray120[anInt366++] = arg0;
				} else if (local15 == 4) {
					this.aBoolean81 = false;
				} else if (local15 == 5) {
					this.anInt369 = arg1.method202();
				} else if (local15 == 6) {
					this.aBoolean82 = true;
				} else if (local15 == 7) {
					this.anInt370 = arg1.method205();
				} else if (local15 == 8) {
					this.anInt371 = 1;
					this.aBoolean83 = true;
				} else if (local15 == 10) {
					this.aString11 = arg1.method207();
				} else if (local15 == 11) {
					this.aBoolean83 = true;
				} else if (local15 == 12) {
					this.anInt372 = arg1.method205();
				} else if (local15 == 13) {
					this.anInt371 = 2;
					this.aBoolean83 = true;
				} else if (local15 == 14) {
					this.aBoolean84 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("61460, " + 10762 + ", " + arg0 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
