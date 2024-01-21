import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ic")
public final class Class17 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	private static int anInt394;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[Lclient!ic;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	private static int anInt395;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	private static int[] anIntArray158;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
	private static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public int anInt398;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method309(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "varp.dat"), 4);
			anInt395 = 0;
			anInt394 = local9.method382();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt394];
			}
			if (anIntArray158 == null) {
				anIntArray158 = new int[anInt394];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt394; local34++) {
				if (aClass17Array1[local34] == null) {
					aClass17Array1[local34] = new Class17();
				}
				aClass17Array1[local34].method310(local34, local9, aBoolean110);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("21895, " + true + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!kb;Z)V")
	private void method310(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg2) {
				while (true) {
					@Pc(7) int local7 = arg1.method380();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt396 = arg1.method380();
					} else if (local7 == 2) {
						this.anInt397 = arg1.method380();
					} else if (local7 == 3) {
						this.aBoolean111 = true;
						anIntArray158[anInt395++] = arg0;
					} else if (local7 == 4) {
						this.aBoolean112 = false;
					} else if (local7 == 5) {
						this.anInt398 = arg1.method382();
					} else if (local7 == 10) {
						this.aString21 = arg1.method387();
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("83759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
