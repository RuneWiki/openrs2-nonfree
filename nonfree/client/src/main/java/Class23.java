import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ONRKYVGF")
public final class Class23 {

	@OriginalMember(owner = "client!ONRKYVGF", name = "c", descriptor = "I")
	private static int anInt472;

	@OriginalMember(owner = "client!ONRKYVGF", name = "d", descriptor = "[Lclient!ONRKYVGF;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!ONRKYVGF", name = "e", descriptor = "I")
	private static int anInt473;

	@OriginalMember(owner = "client!ONRKYVGF", name = "f", descriptor = "[I")
	private static int[] anIntArray64;

	@OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "I")
	private static int anInt470 = -21443;

	@OriginalMember(owner = "client!ONRKYVGF", name = "g", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!ONRKYVGF", name = "h", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!ONRKYVGF", name = "i", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!ONRKYVGF", name = "l", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!ONRKYVGF", name = "n", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!ONRKYVGF", name = "o", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!ONRKYVGF", name = "b", descriptor = "I")
	private int anInt471 = -585;

	@OriginalMember(owner = "client!ONRKYVGF", name = "j", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ONRKYVGF", name = "k", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!ONRKYVGF", name = "m", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ONRKYVGF", name = "p", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ONRKYVGF", name = "q", descriptor = "I")
	private int anInt479 = -1;

	@OriginalMember(owner = "client!ONRKYVGF", name = "r", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method285(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method489("varp.dat", null), -990);
			anInt473 = 0;
			anInt472 = local8.method81();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt472];
			}
			if (anIntArray64 == null) {
				anIntArray64 = new int[anInt472];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt472; local25++) {
				if (aClass23Array1[local25] == null) {
					aClass23Array1[local25] = new Class23();
				}
				aClass23Array1[local25].method286(local25, local8);
			}
			if (local8.anInt123 != local8.aByteArray1.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("78363, " + true + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONRKYVGF", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!ONRKYVGF", name = "a", descriptor = "(ILclient!BFQIDHPO;I)V")
	private void method286(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method79();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt474 = arg1.method79();
				} else if (local7 == 2) {
					this.anInt475 = arg1.method79();
				} else if (local7 == 3) {
					this.aBoolean110 = true;
					anIntArray64[anInt473++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean111 = false;
				} else if (local7 == 5) {
					this.anInt476 = arg1.method81();
				} else if (local7 == 6) {
					this.aBoolean112 = true;
				} else if (local7 == 7) {
					this.anInt477 = arg1.method84();
				} else if (local7 == 8) {
					this.anInt478 = 1;
					this.aBoolean113 = true;
				} else if (local7 == 10) {
					this.aString12 = arg1.method86();
				} else if (local7 == 11) {
					this.aBoolean113 = true;
				} else if (local7 == 12) {
					this.anInt479 = arg1.method84();
				} else if (local7 == 13) {
					this.anInt478 = 2;
					this.aBoolean113 = true;
				} else if (local7 == 14) {
					this.aBoolean114 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("53346, " + arg0 + ", " + arg1 + ", " + -585 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
