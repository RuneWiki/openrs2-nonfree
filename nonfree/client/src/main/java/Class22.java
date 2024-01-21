import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LVQCDTJA")
public final class Class22 {

	@OriginalMember(owner = "client!LVQCDTJA", name = "b", descriptor = "I")
	private static int anInt437;

	@OriginalMember(owner = "client!LVQCDTJA", name = "c", descriptor = "[Lclient!LVQCDTJA;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!LVQCDTJA", name = "a", descriptor = "Z")
	private static boolean aBoolean105 = true;

	@OriginalMember(owner = "client!LVQCDTJA", name = "d", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!LVQCDTJA", name = "e", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!LVQCDTJA", name = "f", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!LVQCDTJA", name = "g", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!LVQCDTJA", name = "j", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!LVQCDTJA", name = "h", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!LVQCDTJA", name = "i", descriptor = "I")
	private int anInt441 = -1;

	@OriginalMember(owner = "client!LVQCDTJA", name = "k", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!LVQCDTJA", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method258(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 91 / arg1;
			@Pc(12) Class2_Sub1_Sub4 local12 = new Class2_Sub1_Sub4(arg0.method165("varbit.dat", null), aBoolean105);
			anInt437 = local12.method96();
			if (aClass22Array1 == null) {
				aClass22Array1 = new Class22[anInt437];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt437; local22++) {
				if (aClass22Array1[local22] == null) {
					aClass22Array1[local22] = new Class22();
				}
				aClass22Array1[local22].method259(local12, local22, (byte) 1);
				if (aClass22Array1[local22].aBoolean106) {
					Class40.aClass40Array1[aClass22Array1[local22].anInt438].aBoolean158 = true;
				}
			}
			if (local12.anInt166 != local12.aByteArray2.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("98208, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVQCDTJA", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!LVQCDTJA", name = "a", descriptor = "(Lclient!DNRIFKTO;IB)V")
	private void method259(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(12) int local12 = arg0.method94();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt438 = arg0.method96();
					this.anInt439 = arg0.method94();
					this.anInt440 = arg0.method94();
				} else if (local12 == 10) {
					this.aString13 = arg0.method101();
				} else if (local12 == 2) {
					this.aBoolean106 = true;
				} else if (local12 == 3) {
					this.anInt441 = arg0.method99();
				} else if (local12 == 4) {
					this.anInt442 = arg0.method99();
				} else if (local12 == 5) {
					this.aBoolean107 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("19560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
