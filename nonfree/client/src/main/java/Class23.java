import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private static int anInt581;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private static int anInt582;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	private static int anInt583;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	private int anInt585;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "B")
	private byte aByte33 = 3;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method392(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method516("varp.dat", null), aBoolean149);
			anInt583 = 0;
			anInt582 = local9.method374();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt582];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt582];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt582; local30++) {
				if (aClass23Array1[local30] == null) {
					aClass23Array1[local30] = new Class23();
				}
				aClass23Array1[local30].method393((byte) 3, local9, local30);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("20688, " + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!kb;I)V")
	private void method393(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aByte33 == 3) {
				@Pc(7) boolean local7 = false;
				while (true) {
					@Pc(13) int local13 = arg1.method372();
					if (local13 == 0) {
						return;
					}
					if (local13 == 1) {
						this.anInt584 = arg1.method372();
					} else if (local13 == 2) {
						this.anInt585 = arg1.method372();
					} else if (local13 == 3) {
						this.aBoolean150 = true;
						anIntArray194[anInt583++] = arg2;
					} else if (local13 == 4) {
						this.aBoolean151 = false;
					} else if (local13 == 5) {
						this.anInt586 = arg1.method374();
					} else if (local13 == 6) {
						this.aBoolean152 = true;
					} else if (local13 == 7) {
						this.anInt587 = arg1.method377();
					} else if (local13 == 8) {
						this.aBoolean153 = true;
					} else if (local13 == 10) {
						this.aString24 = arg1.method379();
					} else {
						System.out.println("Error unrecognised config code: " + local13);
					}
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("73068, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}
}
