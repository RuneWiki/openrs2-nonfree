import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WBROSLMK")
public final class Class42 {

	@OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "Z")
	private static boolean aBoolean173;

	@OriginalMember(owner = "client!WBROSLMK", name = "c", descriptor = "I")
	private static int anInt665;

	@OriginalMember(owner = "client!WBROSLMK", name = "d", descriptor = "[Lclient!WBROSLMK;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!WBROSLMK", name = "e", descriptor = "I")
	private static int anInt666;

	@OriginalMember(owner = "client!WBROSLMK", name = "f", descriptor = "[I")
	private static int[] anIntArray133;

	@OriginalMember(owner = "client!WBROSLMK", name = "g", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!WBROSLMK", name = "h", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!WBROSLMK", name = "i", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!WBROSLMK", name = "l", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!WBROSLMK", name = "n", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!WBROSLMK", name = "o", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!WBROSLMK", name = "b", descriptor = "I")
	private int anInt664 = 635;

	@OriginalMember(owner = "client!WBROSLMK", name = "j", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!WBROSLMK", name = "k", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!WBROSLMK", name = "m", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!WBROSLMK", name = "p", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!WBROSLMK", name = "q", descriptor = "I")
	private int anInt672 = -1;

	@OriginalMember(owner = "client!WBROSLMK", name = "r", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method413(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method117("varp.dat", null), -46859);
			anInt666 = 0;
			anInt665 = local8.method342();
			if (aClass42Array1 == null) {
				aClass42Array1 = new Class42[anInt665];
			}
			if (anIntArray133 == null) {
				anIntArray133 = new int[anInt665];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt665; local33++) {
				if (aClass42Array1[local33] == null) {
					aClass42Array1[local33] = new Class42();
				}
				aClass42Array1[local33].method414(local33, local8);
			}
			if (local8.anInt556 != local8.aByteArray17.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("85559, " + true + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBROSLMK", name = "<init>", descriptor = "()V")
	private Class42() {
	}

	@OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "(IILclient!RSWRPCHR;)V")
	private void method414(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method340();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt667 = arg1.method340();
				} else if (local7 == 2) {
					this.anInt668 = arg1.method340();
				} else if (local7 == 3) {
					this.aBoolean174 = true;
					anIntArray133[anInt666++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean175 = false;
				} else if (local7 == 5) {
					this.anInt669 = arg1.method342();
				} else if (local7 == 6) {
					this.aBoolean176 = true;
				} else if (local7 == 7) {
					this.anInt670 = arg1.method345();
				} else if (local7 == 8) {
					this.anInt671 = 1;
					this.aBoolean177 = true;
				} else if (local7 == 10) {
					this.aString15 = arg1.method347();
				} else if (local7 == 11) {
					this.aBoolean177 = true;
				} else if (local7 == 12) {
					this.anInt672 = arg1.method345();
				} else if (local7 == 13) {
					this.anInt671 = 2;
					this.aBoolean177 = true;
				} else if (local7 == 14) {
					this.aBoolean178 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("54708, " + arg0 + ", " + 635 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
