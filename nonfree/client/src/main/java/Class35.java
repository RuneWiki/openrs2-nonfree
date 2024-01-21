import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt861;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method536(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(16, arg0.method678("varbit.dat", null));
			anInt861 = local10.method500();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt861];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt861; local29++) {
				if (aClass35Array1[local29] == null) {
					aClass35Array1[local29] = new Class35();
				}
				aClass35Array1[local29].method537(local10, local29);
			}
			if (local10.anInt776 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("94280, " + true + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method537(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method498();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt862 = arg0.method500();
					this.anInt863 = arg0.method498();
					this.anInt864 = arg0.method498();
				} else if (local8 == 10) {
					this.aString28 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("33073, " + arg0 + ", " + -40834 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
