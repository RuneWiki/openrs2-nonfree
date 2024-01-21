import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private static int anInt861;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	private static boolean aBoolean215 = true;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private int anInt860 = -30133;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt865 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method527(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(-49365, arg0.method666("varbit.dat", null));
			anInt861 = local8.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt861];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt861; local26++) {
				if (aClass36Array1[local26] == null) {
					aClass36Array1[local26] = new Class36();
				}
				aClass36Array1[local26].method528(local8, local26);
				if (aClass36Array1[local26].aBoolean216) {
					Class39.aClass39Array1[aClass36Array1[local26].anInt862].aBoolean227 = true;
				}
			}
			if (local8.anInt763 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("85445, " + arg0 + ", " + false + ", " + local73.toString());
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
				@Pc(9) int local9 = arg0.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt862 = arg0.method482();
					this.anInt863 = arg0.method480();
					this.anInt864 = arg0.method480();
				} else if (local9 == 10) {
					this.aString27 = arg0.method487();
				} else if (local9 == 2) {
					this.aBoolean216 = true;
				} else if (local9 == 3) {
					this.anInt865 = arg0.method485();
				} else if (local9 == 4) {
					this.anInt866 = arg0.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("90959, " + true + ", " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
