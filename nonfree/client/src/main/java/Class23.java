import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt609;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private static int anInt610;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private static int anInt608 = 3;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	private boolean aBoolean135 = true;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method403(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(0, arg0.method528("varp.dat", null));
			anInt610 = 0;
			anInt609 = local9.method385();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt609];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt609];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt609; local26++) {
				if (aClass23Array1[local26] == null) {
					aClass23Array1[local26] = new Class23();
				}
				aClass23Array1[local26].method404(local9, local26, (byte) 6);
			}
			if (anInt608 > 3 || anInt608 < 3) {
				anInt608 = 167;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("80715, " + arg0 + ", " + 3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!kb;IB)V")
	private void method404(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(18) int local18 = arg0.method383();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt611 = arg0.method383();
				} else if (local18 == 2) {
					this.anInt612 = arg0.method383();
				} else if (local18 == 3) {
					this.aBoolean134 = true;
					anIntArray194[anInt610++] = arg1;
				} else if (local18 == 4) {
					this.aBoolean135 = false;
				} else if (local18 == 5) {
					this.anInt613 = arg0.method385();
				} else if (local18 == 6) {
					this.aBoolean136 = true;
				} else if (local18 == 7) {
					this.anInt614 = arg0.method388();
				} else if (local18 == 8) {
					this.aBoolean137 = true;
				} else if (local18 == 10) {
					this.aString25 = arg0.method390();
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("38232, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}
}
