import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private static int anInt589;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	private static int anInt590;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "B")
	private static byte aByte48 = 4;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "B")
	private static byte aByte49 = 9;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt593;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "B")
	private byte aByte50 = 9;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method403(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method528(aByte48, "varp.dat", null), 0);
			anInt590 = 0;
			anInt589 = local11.method385();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt589];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt589];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt589; local28++) {
				if (aClass23Array1[local28] == null) {
					aClass23Array1[local28] = new Class23();
				}
				aClass23Array1[local28].method404(local11, local28, aByte49);
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("43906, " + 4 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!kb;IB)V")
	private void method404(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(11) int local11;
			if (arg2 == this.aByte50) {
				@Pc(7) boolean local7 = false;
			} else {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			while (true) {
				local11 = arg0.method383();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt591 = arg0.method383();
				} else if (local11 == 2) {
					this.anInt592 = arg0.method383();
				} else if (local11 == 3) {
					this.aBoolean145 = true;
					anIntArray194[anInt590++] = arg1;
				} else if (local11 == 4) {
					this.aBoolean146 = false;
				} else if (local11 == 5) {
					this.anInt593 = arg0.method385();
				} else if (local11 == 6) {
					this.aBoolean147 = true;
				} else if (local11 == 7) {
					this.anInt594 = arg0.method388();
				} else if (local11 == 8) {
					this.aBoolean148 = true;
				} else if (local11 == 10) {
					this.aString25 = arg0.method390();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("5807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
