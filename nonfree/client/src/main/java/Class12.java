import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EMWMNDZQ")
public final class Class12 {

	@OriginalMember(owner = "client!EMWMNDZQ", name = "b", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "c", descriptor = "[Lclient!EMWMNDZQ;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "d", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "e", descriptor = "I")
	public int anInt248;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "f", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "g", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "j", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "a", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "h", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "i", descriptor = "I")
	private int anInt251 = -1;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "k", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!EMWMNDZQ", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method205(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(10) Class4_Sub1_Sub3 local10 = new Class4_Sub1_Sub3(arg0.method514("varbit.dat", null), false);
			anInt247 = local10.method169();
			if (aClass12Array1 == null) {
				aClass12Array1 = new Class12[anInt247];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt247; local20++) {
				if (aClass12Array1[local20] == null) {
					aClass12Array1[local20] = new Class12();
				}
				aClass12Array1[local20].method206(local10, local20);
				if (aClass12Array1[local20].aBoolean65) {
					Class17.aClass17Array1[aClass12Array1[local20].anInt248].aBoolean77 = true;
				}
			}
			if (local10.anInt242 != local10.aByteArray7.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("89186, " + 0 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWMNDZQ", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!EMWMNDZQ", name = "a", descriptor = "(Lclient!EGCCHUZS;II)V")
	private void method206(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method167();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt248 = arg0.method169();
					this.anInt249 = arg0.method167();
					this.anInt250 = arg0.method167();
				} else if (local14 == 10) {
					this.aString5 = arg0.method174();
				} else if (local14 == 2) {
					this.aBoolean65 = true;
				} else if (local14 == 3) {
					this.anInt251 = arg0.method172();
				} else if (local14 == 4) {
					this.anInt252 = arg0.method172();
				} else if (local14 == 5) {
					this.aBoolean66 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("76036, " + arg0 + ", " + 792 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
