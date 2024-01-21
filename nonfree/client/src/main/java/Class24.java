import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LPMARHLZ")
public final class Class24 {

	@OriginalMember(owner = "client!LPMARHLZ", name = "a", descriptor = "I")
	private static int anInt472;

	@OriginalMember(owner = "client!LPMARHLZ", name = "b", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!LPMARHLZ", name = "c", descriptor = "I")
	private static int anInt473;

	@OriginalMember(owner = "client!LPMARHLZ", name = "d", descriptor = "[Lclient!LPMARHLZ;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!LPMARHLZ", name = "e", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!LPMARHLZ", name = "f", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!LPMARHLZ", name = "g", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!LPMARHLZ", name = "h", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!LPMARHLZ", name = "k", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!LPMARHLZ", name = "i", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!LPMARHLZ", name = "j", descriptor = "I")
	private int anInt477 = -1;

	@OriginalMember(owner = "client!LPMARHLZ", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method427(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method491("varbit.dat", null), anInt472);
			anInt473 = local8.method361();
			@Pc(15) boolean local15 = true;
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt473];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt473; local22++) {
				if (aClass24Array1[local22] == null) {
					aClass24Array1[local22] = new Class24();
				}
				aClass24Array1[local22].method428(aBoolean130, local8, local22);
				if (aClass24Array1[local22].aBoolean131) {
					Class10.aClass10Array1[aClass24Array1[local22].anInt474].aBoolean58 = true;
				}
			}
			if (local8.anInt443 != local8.aByteArray6.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("41662, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPMARHLZ", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!LPMARHLZ", name = "a", descriptor = "(ZLclient!LDILQFVA;I)V")
	private void method428(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg0) {
				while (true) {
					@Pc(7) int local7 = arg1.method359();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt474 = arg1.method361();
						this.anInt475 = arg1.method359();
						this.anInt476 = arg1.method359();
					} else if (local7 == 10) {
						this.aString7 = arg1.method366();
					} else if (local7 == 2) {
						this.aBoolean131 = true;
					} else if (local7 == 3) {
						this.anInt477 = arg1.method364();
					} else if (local7 == 4) {
						this.anInt478 = arg1.method364();
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("53556, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
