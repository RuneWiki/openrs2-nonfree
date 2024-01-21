import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FZDJIIMM")
public final class Class14 {

	@OriginalMember(owner = "client!FZDJIIMM", name = "c", descriptor = "I")
	private static int anInt240;

	@OriginalMember(owner = "client!FZDJIIMM", name = "d", descriptor = "[Lclient!FZDJIIMM;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!FZDJIIMM", name = "e", descriptor = "I")
	private static int anInt241;

	@OriginalMember(owner = "client!FZDJIIMM", name = "f", descriptor = "[I")
	private static int[] anIntArray55;

	@OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "I")
	private static int anInt239 = 440;

	@OriginalMember(owner = "client!FZDJIIMM", name = "g", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!FZDJIIMM", name = "h", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!FZDJIIMM", name = "i", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!FZDJIIMM", name = "l", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!FZDJIIMM", name = "n", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!FZDJIIMM", name = "o", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!FZDJIIMM", name = "b", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!FZDJIIMM", name = "j", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!FZDJIIMM", name = "k", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!FZDJIIMM", name = "m", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!FZDJIIMM", name = "p", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!FZDJIIMM", name = "q", descriptor = "I")
	private int anInt247 = -1;

	@OriginalMember(owner = "client!FZDJIIMM", name = "r", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method118(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(16) Class6_Sub2_Sub3 local16 = new Class6_Sub2_Sub3(-587, arg0.method358("varp.dat", null));
			anInt241 = 0;
			anInt240 = local16.method264();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt240];
			}
			if (anIntArray55 == null) {
				anIntArray55 = new int[anInt240];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt240; local33++) {
				if (aClass14Array1[local33] == null) {
					aClass14Array1[local33] = new Class14();
				}
				aClass14Array1[local33].method119(local16, local33);
			}
			if (local16.anInt404 != local16.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("79010, " + arg0 + ", " + -332 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FZDJIIMM", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!FZDJIIMM", name = "a", descriptor = "(Lclient!NQUAUMDT;II)V")
	private void method119(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method262();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt242 = arg0.method262();
				} else if (local15 == 2) {
					this.anInt243 = arg0.method262();
				} else if (local15 == 3) {
					this.aBoolean64 = true;
					anIntArray55[anInt241++] = arg1;
				} else if (local15 == 4) {
					this.aBoolean65 = false;
				} else if (local15 == 5) {
					this.anInt244 = arg0.method264();
				} else if (local15 == 6) {
					this.aBoolean66 = true;
				} else if (local15 == 7) {
					this.anInt245 = arg0.method267();
				} else if (local15 == 8) {
					this.anInt246 = 1;
					this.aBoolean67 = true;
				} else if (local15 == 10) {
					this.aString4 = arg0.method269();
				} else if (local15 == 11) {
					this.aBoolean67 = true;
				} else if (local15 == 12) {
					this.anInt247 = arg0.method267();
				} else if (local15 == 13) {
					this.anInt246 = 2;
					this.aBoolean67 = true;
				} else if (local15 == 14) {
					this.aBoolean68 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("78309, " + arg0 + ", " + 29883 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
