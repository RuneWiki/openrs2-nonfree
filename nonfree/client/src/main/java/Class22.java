import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OIEBXCSN")
public final class Class22 {

	@OriginalMember(owner = "client!OIEBXCSN", name = "b", descriptor = "I")
	private static int anInt528;

	@OriginalMember(owner = "client!OIEBXCSN", name = "c", descriptor = "[Lclient!OIEBXCSN;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!OIEBXCSN", name = "a", descriptor = "I")
	private static int anInt527 = 8;

	@OriginalMember(owner = "client!OIEBXCSN", name = "d", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!OIEBXCSN", name = "e", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!OIEBXCSN", name = "f", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!OIEBXCSN", name = "g", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!OIEBXCSN", name = "j", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!OIEBXCSN", name = "h", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!OIEBXCSN", name = "i", descriptor = "I")
	private int anInt532 = -1;

	@OriginalMember(owner = "client!OIEBXCSN", name = "k", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!OIEBXCSN", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method311(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub2 local8 = new Class3_Sub1_Sub2(-527, arg0.method30("varbit.dat", null));
			anInt528 = local8.method91();
			if (aClass22Array1 == null) {
				aClass22Array1 = new Class22[anInt528];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt528; local23++) {
				if (aClass22Array1[local23] == null) {
					aClass22Array1[local23] = new Class22();
				}
				aClass22Array1[local23].method312(local23, local8);
				if (aClass22Array1[local23].aBoolean115) {
					Class28.aClass28Array1[aClass22Array1[local23].anInt529].aBoolean146 = true;
				}
			}
			if (local8.anInt257 != local8.aByteArray3.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("10040, " + arg0 + ", " + 1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OIEBXCSN", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!OIEBXCSN", name = "a", descriptor = "(IILclient!GHHPHSRU;)V")
	private void method312(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method89();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt529 = arg1.method91();
					this.anInt530 = arg1.method89();
					this.anInt531 = arg1.method89();
				} else if (local7 == 10) {
					this.aString12 = arg1.method96();
				} else if (local7 == 2) {
					this.aBoolean115 = true;
				} else if (local7 == 3) {
					this.anInt532 = arg1.method94();
				} else if (local7 == 4) {
					this.anInt533 = arg1.method94();
				} else if (local7 == 5) {
					this.aBoolean116 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("92368, " + 95 + ", " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
