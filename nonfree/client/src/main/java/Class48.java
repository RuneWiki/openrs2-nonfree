import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XESCWZPS")
public final class Class48 {

	@OriginalMember(owner = "client!XESCWZPS", name = "a", descriptor = "Z")
	private static boolean aBoolean188;

	@OriginalMember(owner = "client!XESCWZPS", name = "b", descriptor = "I")
	private static int anInt742;

	@OriginalMember(owner = "client!XESCWZPS", name = "c", descriptor = "[Lclient!XESCWZPS;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!XESCWZPS", name = "d", descriptor = "I")
	private static int anInt743;

	@OriginalMember(owner = "client!XESCWZPS", name = "e", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!XESCWZPS", name = "f", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!XESCWZPS", name = "g", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!XESCWZPS", name = "h", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!XESCWZPS", name = "k", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!XESCWZPS", name = "m", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!XESCWZPS", name = "n", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!XESCWZPS", name = "i", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!XESCWZPS", name = "j", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!XESCWZPS", name = "l", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!XESCWZPS", name = "o", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!XESCWZPS", name = "p", descriptor = "I")
	private int anInt749 = -1;

	@OriginalMember(owner = "client!XESCWZPS", name = "q", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!XESCWZPS", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method532(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg1.method464("varp.dat", null), 0);
			if (arg0 < 3 || arg0 > 3) {
				aBoolean188 = !aBoolean188;
			}
			anInt743 = 0;
			anInt742 = local8.method242();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt742];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt742];
			}
			for (@Pc(37) int local37 = 0; local37 < anInt742; local37++) {
				if (aClass48Array1[local37] == null) {
					aClass48Array1[local37] = new Class48();
				}
				aClass48Array1[local37].method533(local37, local8);
			}
			if (local8.anInt429 != local8.aByteArray16.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("45499, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XESCWZPS", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!XESCWZPS", name = "a", descriptor = "(ILclient!PKHWFJLM;I)V")
	private void method533(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method240();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt744 = arg1.method240();
				} else if (local7 == 2) {
					this.anInt745 = arg1.method240();
				} else if (local7 == 3) {
					this.aBoolean189 = true;
					anIntArray194[anInt743++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean190 = false;
				} else if (local7 == 5) {
					this.anInt746 = arg1.method242();
				} else if (local7 == 6) {
					this.aBoolean191 = true;
				} else if (local7 == 7) {
					this.anInt747 = arg1.method245();
				} else if (local7 == 8) {
					this.anInt748 = 1;
					this.aBoolean192 = true;
				} else if (local7 == 10) {
					this.aString15 = arg1.method247();
				} else if (local7 == 11) {
					this.aBoolean192 = true;
				} else if (local7 == 12) {
					this.anInt749 = arg1.method245();
				} else if (local7 == 13) {
					this.anInt748 = 2;
					this.aBoolean192 = true;
				} else if (local7 == 14) {
					this.aBoolean193 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("36678, " + arg0 + ", " + arg1 + ", " + -376 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
