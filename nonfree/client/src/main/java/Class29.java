import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!oc")
public final class Class29 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private static int anInt833;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!oc;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	private static int anInt834;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	private static int[] anIntArray221;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!yb;B)V")
	public static void method492(@OriginalArg(0) Class45 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(699, arg0.method639("varp.dat", null));
			anInt834 = 0;
			anInt833 = local10.method469();
			@Pc(20) boolean local20 = false;
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt833];
			}
			if (anIntArray221 == null) {
				anIntArray221 = new int[anInt833];
			}
			for (@Pc(35) int local35 = 0; local35 < anInt833; local35++) {
				if (aClass29Array1[local35] == null) {
					aClass29Array1[local35] = new Class29();
				}
				aClass29Array1[local35].method493(local10, local35);
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("86290, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method493(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method467();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt835 = arg0.method467();
				} else if (local13 == 2) {
					this.anInt836 = arg0.method467();
				} else if (local13 == 3) {
					this.aBoolean168 = true;
					anIntArray221[anInt834++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean169 = false;
				} else if (local13 == 5) {
					this.anInt837 = arg0.method469();
				} else if (local13 == 6) {
					this.aBoolean170 = true;
				} else if (local13 == 7) {
					this.anInt838 = arg0.method472();
				} else if (local13 == 8) {
					this.aBoolean171 = true;
				} else if (local13 == 10) {
					this.aString27 = arg0.method474();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("92887, " + arg0 + ", " + arg1 + ", " + -11 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}
}
