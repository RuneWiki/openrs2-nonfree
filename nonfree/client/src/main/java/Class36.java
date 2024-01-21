import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private static int anInt843;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "B")
	private static byte aByte38 = 6;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	private static boolean aBoolean206 = true;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt844;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method520(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("varbit.dat", null), (byte) 1);
			anInt843 = local8.method475();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt843];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt843; local26++) {
				if (aClass36Array1[local26] == null) {
					aClass36Array1[local26] = new Class36();
				}
				aClass36Array1[local26].method521(local8, aByte38, local26);
			}
			if (local8.anInt743 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("45745, " + false + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method521(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg1 != 6) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			while (true) {
				local6 = arg0.method473();
				if (local6 == 0) {
					return;
				}
				if (local6 == 1) {
					this.anInt844 = arg0.method475();
					this.anInt845 = arg0.method473();
					this.anInt846 = arg0.method473();
				} else if (local6 == 10) {
					this.aString27 = arg0.method480();
				} else {
					System.out.println("Error unrecognised config code: " + local6);
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("17129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
