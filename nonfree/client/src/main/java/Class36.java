import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt838;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method527(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg0.method666("varbit.dat", null), 58);
			anInt838 = local15.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt838];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt838; local25++) {
				if (aClass36Array1[local25] == null) {
					aClass36Array1[local25] = new Class36();
				}
				aClass36Array1[local25].method528(local15, local25);
				if (aClass36Array1[local25].aBoolean211) {
					Class39.aClass39Array1[aClass36Array1[local25].anInt839].aBoolean220 = true;
				}
			}
			if (local15.anInt742 != local15.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("57794, " + arg0 + ", " + -30 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!lb;I)V")
	private void method528(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method480();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt839 = arg0.method482();
					this.anInt840 = arg0.method480();
					this.anInt841 = arg0.method480();
				} else if (local14 == 10) {
					this.aString27 = arg0.method487();
				} else if (local14 == 2) {
					this.aBoolean211 = true;
				} else if (local14 == 3) {
					this.anInt842 = arg0.method485();
				} else if (local14 == 4) {
					this.anInt843 = arg0.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("53822, " + true + ", " + arg0 + ", " + arg1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
