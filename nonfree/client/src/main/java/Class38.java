import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UNSYPSHF")
public final class Class38 {

	@OriginalMember(owner = "client!UNSYPSHF", name = "a", descriptor = "I")
	private static int anInt680;

	@OriginalMember(owner = "client!UNSYPSHF", name = "b", descriptor = "[Lclient!UNSYPSHF;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!UNSYPSHF", name = "c", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!UNSYPSHF", name = "d", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!UNSYPSHF", name = "e", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!UNSYPSHF", name = "f", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!UNSYPSHF", name = "i", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!UNSYPSHF", name = "g", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!UNSYPSHF", name = "h", descriptor = "I")
	private int anInt684 = -1;

	@OriginalMember(owner = "client!UNSYPSHF", name = "j", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!UNSYPSHF", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method454(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(19) Class6_Sub2_Sub3 local19 = new Class6_Sub2_Sub3(741, arg0.method381("varbit.dat", null));
			anInt680 = local19.method404();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt680];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt680; local29++) {
				if (aClass38Array1[local29] == null) {
					aClass38Array1[local29] = new Class38();
				}
				aClass38Array1[local29].method455(local19, local29);
				if (aClass38Array1[local29].aBoolean176) {
					Class35.aClass35Array1[aClass38Array1[local29].anInt681].aBoolean152 = true;
				}
			}
			if (local19.anInt609 != local19.aByteArray17.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("26430, " + 0 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UNSYPSHF", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!UNSYPSHF", name = "a", descriptor = "(Lclient!UAWAYCTK;II)V")
	private void method455(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method402();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt681 = arg0.method404();
					this.anInt682 = arg0.method402();
					this.anInt683 = arg0.method402();
				} else if (local7 == 10) {
					this.aString16 = arg0.method409();
				} else if (local7 == 2) {
					this.aBoolean176 = true;
				} else if (local7 == 3) {
					this.anInt684 = arg0.method407();
				} else if (local7 == 4) {
					this.anInt685 = arg0.method407();
				} else if (local7 == 5) {
					this.aBoolean177 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("88502, " + arg0 + ", " + 593 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
