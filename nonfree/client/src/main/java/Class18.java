import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HGYXNEJH")
public final class Class18 {

	@OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "I")
	private static int anInt216;

	@OriginalMember(owner = "client!HGYXNEJH", name = "b", descriptor = "[Lclient!HGYXNEJH;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!HGYXNEJH", name = "c", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!HGYXNEJH", name = "d", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!HGYXNEJH", name = "e", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!HGYXNEJH", name = "f", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!HGYXNEJH", name = "i", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!HGYXNEJH", name = "g", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!HGYXNEJH", name = "h", descriptor = "I")
	private int anInt220 = -1;

	@OriginalMember(owner = "client!HGYXNEJH", name = "j", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method129(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(20) Class6_Sub1_Sub4 local20 = new Class6_Sub1_Sub4(888, arg0.method518("varbit.dat", (byte[]) null));
			anInt216 = local20.method241();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt216];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt216; local30++) {
				if (aClass18Array1[local30] == null) {
					aClass18Array1[local30] = new Class18();
				}
				aClass18Array1[local30].method130(local20, local30);
				if (aClass18Array1[local30].aBoolean64) {
					Class5.aClass5Array1[aClass18Array1[local30].anInt217].aBoolean16 = true;
				}
			}
			if (local20.anInt390 != local20.aByteArray12.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("54849, " + -82 + ", " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGYXNEJH", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "(ILclient!PQBRPYKE;I)V")
	private void method130(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method239();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt217 = arg0.method241();
					this.anInt218 = arg0.method239();
					this.anInt219 = arg0.method239();
				} else if (local7 == 10) {
					this.aString8 = arg0.method246();
				} else if (local7 == 2) {
					this.aBoolean64 = true;
				} else if (local7 == 3) {
					this.anInt220 = arg0.method244();
				} else if (local7 == 4) {
					this.anInt221 = arg0.method244();
				} else if (local7 == 5) {
					this.aBoolean65 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("70374, " + -609 + ", " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
