import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
	private static boolean aBoolean210;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt893;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt891 = -668;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt892 = 6771;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public int anInt896;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method602(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method689("varbit.dat", null), true);
			if (anInt892 != 6771) {
				anInt891 = -340;
			}
			anInt893 = local8.method505();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt893];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt893; local23++) {
				if (aClass38Array1[local23] == null) {
					aClass38Array1[local23] = new Class38();
				}
				aClass38Array1[local23].method603(local8, local23, aBoolean210);
			}
			if (local8.anInt766 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("61627, " + 6771 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!mb;IZ)V")
	private void method603(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(5) int local5;
			if (arg2) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				local5 = arg0.method503();
				if (local5 == 0) {
					return;
				}
				if (local5 == 1) {
					this.anInt894 = arg0.method505();
					this.anInt895 = arg0.method503();
					this.anInt896 = arg0.method503();
				} else if (local5 == 10) {
					this.aString27 = arg0.method510();
				} else {
					System.out.println("Error unrecognised config code: " + local5);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
