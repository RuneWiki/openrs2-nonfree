import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt819;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 3, arg1.method658("varbit.dat", null));
			@Pc(12) boolean local12 = false;
			anInt819 = local8.method474();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt819];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt819; local22++) {
				if (aClass36Array1[local22] == null) {
					aClass36Array1[local22] = new Class36();
				}
				aClass36Array1[local22].method520(local22, local8);
			}
			if (local8.anInt715 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("84919, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method520(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg1.method472();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt820 = arg1.method474();
					this.anInt821 = arg1.method472();
					this.anInt822 = arg1.method472();
				} else if (local14 == 10) {
					this.aString27 = arg1.method479();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("33106, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
