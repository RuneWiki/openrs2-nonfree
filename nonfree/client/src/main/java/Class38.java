import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt873;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt874;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt875;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray234;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method541(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(16, arg0.method678("varp.dat", null));
			anInt875 = 0;
			anInt874 = local12.method500();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt874];
			}
			if (anIntArray234 == null) {
				anIntArray234 = new int[anInt874];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt874; local29++) {
				if (aClass38Array1[local29] == null) {
					aClass38Array1[local29] = new Class38();
				}
				aClass38Array1[local29].method542(local12, local29);
			}
			if (local12.anInt776 != local12.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("26727, " + true + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method542(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method498();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt876 = arg0.method498();
				} else if (local8 == 2) {
					this.anInt877 = arg0.method498();
				} else if (local8 == 3) {
					this.aBoolean235 = true;
					anIntArray234[anInt875++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean236 = false;
				} else if (local8 == 5) {
					this.anInt878 = arg0.method500();
				} else if (local8 == 6) {
					this.aBoolean237 = true;
				} else if (local8 == 7) {
					this.anInt879 = arg0.method503();
				} else if (local8 == 8) {
					this.aBoolean238 = true;
					this.aBoolean239 = true;
				} else if (local8 == 10) {
					this.aString29 = arg0.method505();
				} else if (local8 == 11) {
					this.aBoolean239 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("96258, " + arg0 + ", " + -40834 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
