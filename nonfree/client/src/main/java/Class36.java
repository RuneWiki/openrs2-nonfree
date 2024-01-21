import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt845;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	private int anInt849 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1.method666("varbit.dat", null), -26728);
			anInt845 = local10.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt845];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt845; local20++) {
				if (aClass36Array1[local20] == null) {
					aClass36Array1[local20] = new Class36();
				}
				aClass36Array1[local20].method528(local20, local10);
				if (aClass36Array1[local20].aBoolean212) {
					Class39.aClass39Array1[aClass36Array1[local20].anInt846].aBoolean220 = true;
				}
			}
			if (arg0 != 0) {
				for (@Pc(60) int local60 = 1; local60 > 0; local60++) {
				}
			}
			if (local10.anInt742 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("75512, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method480();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt846 = arg1.method482();
					this.anInt847 = arg1.method480();
					this.anInt848 = arg1.method480();
				} else if (local8 == 10) {
					this.aString27 = arg1.method487();
				} else if (local8 == 2) {
					this.aBoolean212 = true;
				} else if (local8 == 3) {
					this.anInt849 = arg1.method485();
				} else if (local8 == 4) {
					this.anInt850 = arg1.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("19731, " + arg0 + ", " + 39196 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
