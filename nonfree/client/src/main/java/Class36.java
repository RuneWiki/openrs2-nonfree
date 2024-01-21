import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt821;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private int anInt820 = 45800;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt825 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method527(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("varbit.dat", null), (byte) -93);
			anInt821 = local10.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt821];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt821; local29++) {
				if (aClass36Array1[local29] == null) {
					aClass36Array1[local29] = new Class36();
				}
				aClass36Array1[local29].method528(local29, local10);
				if (aClass36Array1[local29].aBoolean225) {
					Class39.aClass39Array1[aClass36Array1[local29].anInt822].aBoolean234 = true;
				}
			}
			if (local10.anInt720 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("95773, " + false + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(10) int local10 = arg1.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt822 = arg1.method482();
					this.anInt823 = arg1.method480();
					this.anInt824 = arg1.method480();
				} else if (local10 == 10) {
					this.aString27 = arg1.method487();
				} else if (local10 == 2) {
					this.aBoolean225 = true;
				} else if (local10 == 3) {
					this.anInt825 = arg1.method485();
				} else if (local10 == 4) {
					this.anInt826 = arg1.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("4929, " + arg0 + ", " + arg1 + ", " + -45931 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
