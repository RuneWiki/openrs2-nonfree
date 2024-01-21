import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CJICJSIY")
public final class Class5 {

	@OriginalMember(owner = "client!CJICJSIY", name = "b", descriptor = "I")
	private static int anInt56;

	@OriginalMember(owner = "client!CJICJSIY", name = "c", descriptor = "[Lclient!CJICJSIY;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!CJICJSIY", name = "d", descriptor = "I")
	private static int anInt57;

	@OriginalMember(owner = "client!CJICJSIY", name = "e", descriptor = "[I")
	private static int[] anIntArray14;

	@OriginalMember(owner = "client!CJICJSIY", name = "f", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!CJICJSIY", name = "g", descriptor = "I")
	private int anInt58;

	@OriginalMember(owner = "client!CJICJSIY", name = "h", descriptor = "I")
	private int anInt59;

	@OriginalMember(owner = "client!CJICJSIY", name = "k", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!CJICJSIY", name = "m", descriptor = "I")
	private int anInt61;

	@OriginalMember(owner = "client!CJICJSIY", name = "n", descriptor = "I")
	private int anInt62;

	@OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "Z")
	private boolean aBoolean12 = true;

	@OriginalMember(owner = "client!CJICJSIY", name = "i", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!CJICJSIY", name = "j", descriptor = "Z")
	private boolean aBoolean14 = true;

	@OriginalMember(owner = "client!CJICJSIY", name = "l", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!CJICJSIY", name = "o", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!CJICJSIY", name = "p", descriptor = "I")
	private int anInt63 = -1;

	@OriginalMember(owner = "client!CJICJSIY", name = "q", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method14(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(888, arg0.method518("varp.dat", (byte[]) null));
			anInt57 = 0;
			anInt56 = local10.method241();
			if (aClass5Array1 == null) {
				aClass5Array1 = new Class5[anInt56];
			}
			if (anIntArray14 == null) {
				anIntArray14 = new int[anInt56];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt56; local27++) {
				if (aClass5Array1[local27] == null) {
					aClass5Array1[local27] = new Class5();
				}
				aClass5Array1[local27].method15(local10, local27);
			}
			if (local10.anInt390 != local10.aByteArray12.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("52412, " + -82 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJICJSIY", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!CJICJSIY", name = "a", descriptor = "(ILclient!PQBRPYKE;I)V")
	private void method15(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(16) int local16 = arg0.method239();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					this.anInt58 = arg0.method239();
				} else if (local16 == 2) {
					this.anInt59 = arg0.method239();
				} else if (local16 == 3) {
					this.aBoolean13 = true;
					anIntArray14[anInt57++] = arg1;
				} else if (local16 == 4) {
					this.aBoolean14 = false;
				} else if (local16 == 5) {
					this.anInt60 = arg0.method241();
				} else if (local16 == 6) {
					this.aBoolean15 = true;
				} else if (local16 == 7) {
					this.anInt61 = arg0.method244();
				} else if (local16 == 8) {
					this.anInt62 = 1;
					this.aBoolean16 = true;
				} else if (local16 == 10) {
					this.aString6 = arg0.method246();
				} else if (local16 == 11) {
					this.aBoolean16 = true;
				} else if (local16 == 12) {
					this.anInt63 = arg0.method244();
				} else if (local16 == 13) {
					this.anInt62 = 2;
					this.aBoolean16 = true;
				} else if (local16 == 14) {
					this.aBoolean17 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local16);
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("4480, " + -609 + ", " + arg0 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}
}
