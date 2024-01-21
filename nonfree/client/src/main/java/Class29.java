import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!oc")
public final class Class29 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private static int anInt840;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!oc;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	private static int[] anIntArray221;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public int anInt844;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method493(@OriginalArg(0) Class45 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method644("varp.dat", null), true);
			anInt841 = 0;
			anInt840 = local8.method470();
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt840];
			}
			if (anIntArray221 == null) {
				anIntArray221 = new int[anInt840];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt840; local28++) {
				if (aClass29Array1[local28] == null) {
					aClass29Array1[local28] = new Class29();
				}
				aClass29Array1[local28].method494(565, local28, local8);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("90127, " + arg0 + ", " + 439 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!mb;)V")
	private void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg2.method468();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt842 = arg2.method468();
				} else if (local8 == 2) {
					this.anInt843 = arg2.method468();
				} else if (local8 == 3) {
					this.aBoolean170 = true;
					anIntArray221[anInt841++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean171 = false;
				} else if (local8 == 5) {
					this.anInt844 = arg2.method470();
				} else if (local8 == 6) {
					this.aBoolean172 = true;
				} else if (local8 == 7) {
					this.anInt845 = arg2.method473();
				} else if (local8 == 8) {
					this.aBoolean173 = true;
				} else if (local8 == 10) {
					this.aString28 = arg2.method475();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("41323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}
}
