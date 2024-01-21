import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NPQMEWIH")
public final class Class29 {

	@OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "I")
	private static int anInt483;

	@OriginalMember(owner = "client!NPQMEWIH", name = "b", descriptor = "[Lclient!NPQMEWIH;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!NPQMEWIH", name = "c", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!NPQMEWIH", name = "d", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!NPQMEWIH", name = "e", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!NPQMEWIH", name = "f", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!NPQMEWIH", name = "i", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!NPQMEWIH", name = "g", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!NPQMEWIH", name = "h", descriptor = "I")
	private int anInt487 = -1;

	@OriginalMember(owner = "client!NPQMEWIH", name = "j", descriptor = "Z")
	private boolean aBoolean102 = true;

	@OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method346(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(8) Class1_Sub2_Sub3 local8 = new Class1_Sub2_Sub3(arg0.method352("varbit.dat", null), -670);
			anInt483 = local8.method309();
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt483];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt483; local22++) {
				if (aClass29Array1[local22] == null) {
					aClass29Array1[local22] = new Class29();
				}
				aClass29Array1[local22].method347(local8, local22);
				if (aClass29Array1[local22].aBoolean101) {
					Class15.aClass15Array1[aClass29Array1[local22].anInt484].aBoolean48 = true;
				}
			}
			if (local8.anInt474 != local8.aByteArray10.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("42116, " + arg0 + ", " + 24570 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPQMEWIH", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "(Lclient!MNKDCXXG;ZI)V")
	private void method347(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method307();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt484 = arg0.method309();
					this.anInt485 = arg0.method307();
					this.anInt486 = arg0.method307();
				} else if (local7 == 10) {
					this.aString12 = arg0.method314();
				} else if (local7 == 2) {
					this.aBoolean101 = true;
				} else if (local7 == 3) {
					this.anInt487 = arg0.method312();
				} else if (local7 == 4) {
					this.anInt488 = arg0.method312();
				} else if (local7 == 5) {
					this.aBoolean102 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("8677, " + arg0 + ", " + false + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
