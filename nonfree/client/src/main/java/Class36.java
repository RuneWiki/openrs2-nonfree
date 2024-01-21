import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "B")
	private static byte aByte28;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private static int anInt833;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt837 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method527(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg0.method666("varbit.dat", null), aBoolean223);
			anInt833 = local15.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt833];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt833; local25++) {
				if (aClass36Array1[local25] == null) {
					aClass36Array1[local25] = new Class36();
				}
				aClass36Array1[local25].method528(local25, aByte28, local15);
				if (aClass36Array1[local25].aBoolean224) {
					Class39.aClass39Array1[aClass36Array1[local25].anInt834].aBoolean233 = true;
				}
			}
			if (local15.anInt733 != local15.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("6489, " + arg0 + ", " + 5 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			if (arg1 == 0) {
				while (true) {
					@Pc(7) int local7 = arg2.method480();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt834 = arg2.method482();
						this.anInt835 = arg2.method480();
						this.anInt836 = arg2.method480();
					} else if (local7 == 10) {
						this.aString27 = arg2.method487();
					} else if (local7 == 2) {
						this.aBoolean224 = true;
					} else if (local7 == 3) {
						this.anInt837 = arg2.method485();
					} else if (local7 == 4) {
						this.anInt838 = arg2.method485();
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("82525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
