import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ATZMJNZU")
public final class Class4 {

	@OriginalMember(owner = "client!ATZMJNZU", name = "c", descriptor = "I")
	private static int anInt12;

	@OriginalMember(owner = "client!ATZMJNZU", name = "d", descriptor = "[Lclient!ATZMJNZU;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ATZMJNZU", name = "e", descriptor = "I")
	private static int anInt13;

	@OriginalMember(owner = "client!ATZMJNZU", name = "f", descriptor = "[I")
	private static int[] anIntArray2;

	@OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "I")
	private static int anInt10 = 536;

	@OriginalMember(owner = "client!ATZMJNZU", name = "b", descriptor = "I")
	private static int anInt11 = 3;

	@OriginalMember(owner = "client!ATZMJNZU", name = "g", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!ATZMJNZU", name = "h", descriptor = "I")
	private int anInt14;

	@OriginalMember(owner = "client!ATZMJNZU", name = "i", descriptor = "I")
	private int anInt15;

	@OriginalMember(owner = "client!ATZMJNZU", name = "l", descriptor = "I")
	public int anInt16;

	@OriginalMember(owner = "client!ATZMJNZU", name = "n", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!ATZMJNZU", name = "o", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!ATZMJNZU", name = "j", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ATZMJNZU", name = "k", descriptor = "Z")
	private boolean aBoolean11 = true;

	@OriginalMember(owner = "client!ATZMJNZU", name = "m", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ATZMJNZU", name = "p", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ATZMJNZU", name = "q", descriptor = "I")
	private int anInt19 = -1;

	@OriginalMember(owner = "client!ATZMJNZU", name = "r", descriptor = "Z")
	private boolean aBoolean14 = true;

	@OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method19(@OriginalArg(1) Class38 arg0) {
		try {
			if (anInt11 != 3) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(20) Class1_Sub1_Sub3 local20 = new Class1_Sub1_Sub3(arg0.method512("varp.dat", null), anInt10);
			anInt13 = 0;
			anInt12 = local20.method57();
			if (aClass4Array1 == null) {
				aClass4Array1 = new Class4[anInt12];
			}
			if (anIntArray2 == null) {
				anIntArray2 = new int[anInt12];
			}
			for (@Pc(37) int local37 = 0; local37 < anInt12; local37++) {
				if (aClass4Array1[local37] == null) {
					aClass4Array1[local37] = new Class4();
				}
				aClass4Array1[local37].method20(local20, 527, local37);
			}
			if (local20.anInt78 != local20.aByteArray8.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("90109, " + 3 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ATZMJNZU", name = "<init>", descriptor = "()V")
	private Class4() {
	}

	@OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "(Lclient!CMGGUSPR;II)V")
	private void method20(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg0.method55();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt14 = arg0.method55();
				} else if (local8 == 2) {
					this.anInt15 = arg0.method55();
				} else if (local8 == 3) {
					this.aBoolean10 = true;
					anIntArray2[anInt13++] = arg2;
				} else if (local8 == 4) {
					this.aBoolean11 = false;
				} else if (local8 == 5) {
					this.anInt16 = arg0.method57();
				} else if (local8 == 6) {
					this.aBoolean12 = true;
				} else if (local8 == 7) {
					this.anInt17 = arg0.method60();
				} else if (local8 == 8) {
					this.anInt18 = 1;
					this.aBoolean13 = true;
				} else if (local8 == 10) {
					this.aString1 = arg0.method62();
				} else if (local8 == 11) {
					this.aBoolean13 = true;
				} else if (local8 == 12) {
					this.anInt19 = arg0.method60();
				} else if (local8 == 13) {
					this.anInt18 = 2;
					this.aBoolean13 = true;
				} else if (local8 == 14) {
					this.aBoolean14 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("61444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}
}
