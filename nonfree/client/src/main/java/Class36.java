import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt834;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt833 = 810;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt838 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method523(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method662("varbit.dat", null), 15787);
			anInt834 = local11.method478();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt834];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt834; local21++) {
				if (aClass36Array1[local21] == null) {
					aClass36Array1[local21] = new Class36();
				}
				aClass36Array1[local21].method524(anInt833, local21, local11);
				if (aClass36Array1[local21].aBoolean221) {
					Class39.aClass39Array1[aClass36Array1[local21].anInt835].aBoolean229 = true;
				}
			}
			if (local11.anInt734 != local11.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("10921, " + true + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) int local5 = 55 / arg0;
			while (true) {
				@Pc(8) int local8 = arg2.method476();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt835 = arg2.method478();
					this.anInt836 = arg2.method476();
					this.anInt837 = arg2.method476();
				} else if (local8 == 10) {
					this.aString27 = arg2.method483();
				} else if (local8 == 2) {
					this.aBoolean221 = true;
				} else if (local8 == 3) {
					this.anInt838 = arg2.method481();
				} else if (local8 == 4) {
					this.anInt839 = arg2.method481();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("19355, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
