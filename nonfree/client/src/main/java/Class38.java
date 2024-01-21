import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
	private static boolean aBoolean215;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt875;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt876;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray234;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method541(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method678("varp.dat", null), (byte) 3);
			anInt876 = 0;
			anInt875 = local8.method500();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt875];
			}
			if (anIntArray234 == null) {
				anIntArray234 = new int[anInt875];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt875; local25++) {
				if (aClass38Array1[local25] == null) {
					aClass38Array1[local25] = new Class38();
				}
				aClass38Array1[local25].method542(local25, local8);
			}
			if (local8.anInt777 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("86069, " + true + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!mb;)V")
	private void method542(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method498();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt877 = arg1.method498();
				} else if (local13 == 2) {
					this.anInt878 = arg1.method498();
				} else if (local13 == 3) {
					this.aBoolean216 = true;
					anIntArray234[anInt876++] = arg0;
				} else if (local13 == 4) {
					this.aBoolean217 = false;
				} else if (local13 == 5) {
					this.anInt879 = arg1.method500();
				} else if (local13 == 6) {
					this.aBoolean218 = true;
				} else if (local13 == 7) {
					this.anInt880 = arg1.method503();
				} else if (local13 == 8) {
					this.aBoolean219 = true;
					this.aBoolean220 = true;
				} else if (local13 == 10) {
					this.aString29 = arg1.method505();
				} else if (local13 == 11) {
					this.aBoolean220 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("78907, " + arg0 + ", " + 890 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}
}
