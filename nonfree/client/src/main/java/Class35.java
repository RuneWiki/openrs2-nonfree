import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt890;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt891;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt892;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private int anInt888 = 2;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method536(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(45427, arg0.method678("varbit.dat", null));
			anInt889 = local12.method500();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt889];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt889; local22++) {
				if (aClass35Array1[local22] == null) {
					aClass35Array1[local22] = new Class35();
				}
				aClass35Array1[local22].method537(local12, local22);
			}
			if (local12.anInt796 != local12.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("34684, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method537(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method498();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt890 = arg0.method500();
					this.anInt891 = arg0.method498();
					this.anInt892 = arg0.method498();
				} else if (local9 == 10) {
					this.aString28 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("11334, " + arg0 + ", " + arg1 + ", " + 312 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
