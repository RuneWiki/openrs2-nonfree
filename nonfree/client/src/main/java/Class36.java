import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt857;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt861 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(false, arg1.method666("varbit.dat", null));
			anInt857 = local8.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt857];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt857; local18++) {
				if (aClass36Array1[local18] == null) {
					aClass36Array1[local18] = new Class36();
				}
				aClass36Array1[local18].method528(local8, local18);
				if (aClass36Array1[local18].aBoolean208) {
					Class39.aClass39Array1[aClass36Array1[local18].anInt858].aBoolean217 = true;
				}
			}
			if (arg0 == 35102 && local8.anInt757 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("43496, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method528(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method480();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt858 = arg0.method482();
					this.anInt859 = arg0.method480();
					this.anInt860 = arg0.method480();
				} else if (local15 == 10) {
					this.aString27 = arg0.method487();
				} else if (local15 == 2) {
					this.aBoolean208 = true;
				} else if (local15 == 3) {
					this.anInt861 = arg0.method485();
				} else if (local15 == 4) {
					this.anInt862 = arg0.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("18917, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
