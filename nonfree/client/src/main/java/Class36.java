import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt858;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt857 = 1000;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt862 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method527(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt857, arg0.method666("varbit.dat", null));
			anInt858 = local8.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt858];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt858; local18++) {
				if (aClass36Array1[local18] == null) {
					aClass36Array1[local18] = new Class36();
				}
				aClass36Array1[local18].method528(local18, local8);
				if (aClass36Array1[local18].aBoolean219) {
					Class39.aClass39Array1[aClass36Array1[local18].anInt859].aBoolean226 = true;
				}
			}
			if (local8.anInt751 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("41980, " + arg0 + ", " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method480();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt859 = arg1.method482();
					this.anInt860 = arg1.method480();
					this.anInt861 = arg1.method480();
				} else if (local8 == 10) {
					this.aString27 = arg1.method487();
				} else if (local8 == 2) {
					this.aBoolean219 = true;
				} else if (local8 == 3) {
					this.anInt862 = arg1.method485();
				} else if (local8 == 4) {
					this.anInt863 = arg1.method485();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("95945, " + arg0 + ", " + arg1 + ", " + 12249 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
