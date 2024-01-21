import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class36 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt845;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt844 = -474;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt849 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method521(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method660("varbit.dat", null), 185);
			anInt845 = local10.method476();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt845];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt845; local29++) {
				if (aClass36Array1[local29] == null) {
					aClass36Array1[local29] = new Class36();
				}
				aClass36Array1[local29].method522(local29, local10);
				if (aClass36Array1[local29].aBoolean215) {
					Class39.aClass39Array1[aClass36Array1[local29].anInt846].aBoolean224 = true;
				}
			}
			if (local10.anInt738 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("85643, " + arg0 + ", " + -474 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method522(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg1.method474();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt846 = arg1.method476();
					this.anInt847 = arg1.method474();
					this.anInt848 = arg1.method474();
				} else if (local9 == 10) {
					this.aString27 = arg1.method481();
				} else if (local9 == 2) {
					this.aBoolean215 = true;
				} else if (local9 == 3) {
					this.anInt849 = arg1.method479();
				} else if (local9 == 4) {
					this.anInt850 = arg1.method479();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("57324, " + arg0 + ", " + arg1 + ", " + 6454 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
