import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt858;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method536(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method678("varbit.dat", null), 337);
			anInt858 = local10.method500();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt858];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt858; local20++) {
				if (aClass35Array1[local20] == null) {
					aClass35Array1[local20] = new Class35();
				}
				aClass35Array1[local20].method537(local20, local10);
			}
			if (local10.anInt768 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("2359, " + arg0 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!mb;)V")
	private void method537(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method498();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt859 = arg1.method500();
					this.anInt860 = arg1.method498();
					this.anInt861 = arg1.method498();
				} else if (local13 == 10) {
					this.aString28 = arg1.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("74440, " + -448 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
