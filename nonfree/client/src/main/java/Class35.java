import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private static boolean aBoolean214;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt863;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method536(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg0.method678("varbit.dat", null), (byte) 3);
			anInt863 = local16.method500();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt863];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt863; local26++) {
				if (aClass35Array1[local26] == null) {
					aClass35Array1[local26] = new Class35();
				}
				aClass35Array1[local26].method537(local26, 890, local16);
			}
			if (local16.anInt777 != local16.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("14450, " + true + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!mb;)V")
	private void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg2.method498();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt864 = arg2.method500();
					this.anInt865 = arg2.method498();
					this.anInt866 = arg2.method498();
				} else if (local8 == 10) {
					this.aString28 = arg2.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("18008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
