import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IFGHRSOU")
public final class Class14 {

	@OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "I")
	private static int anInt135;

	@OriginalMember(owner = "client!IFGHRSOU", name = "b", descriptor = "[Lclient!IFGHRSOU;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!IFGHRSOU", name = "c", descriptor = "I")
	private static int anInt136;

	@OriginalMember(owner = "client!IFGHRSOU", name = "d", descriptor = "[I")
	private static int[] anIntArray23;

	@OriginalMember(owner = "client!IFGHRSOU", name = "e", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!IFGHRSOU", name = "f", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!IFGHRSOU", name = "g", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!IFGHRSOU", name = "j", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!IFGHRSOU", name = "l", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!IFGHRSOU", name = "m", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!IFGHRSOU", name = "h", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!IFGHRSOU", name = "i", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!IFGHRSOU", name = "k", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!IFGHRSOU", name = "n", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!IFGHRSOU", name = "o", descriptor = "I")
	private int anInt142 = -1;

	@OriginalMember(owner = "client!IFGHRSOU", name = "p", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method190(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(11) Class4_Sub1_Sub3 local11 = new Class4_Sub1_Sub3(arg0.method7("varp.dat", null), (byte) 3);
			anInt136 = 0;
			anInt135 = local11.method104();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt135];
			}
			if (anIntArray23 == null) {
				anIntArray23 = new int[anInt135];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt135; local28++) {
				if (aClass14Array1[local28] == null) {
					aClass14Array1[local28] = new Class14();
				}
				aClass14Array1[local28].method191(local28, local11);
			}
			if (local11.anInt101 != local11.aByteArray3.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("81122, " + true + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IFGHRSOU", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!IFGHRSOU", name = "a", descriptor = "(ILclient!FTMSICIZ;I)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method102();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt137 = arg1.method102();
				} else if (local8 == 2) {
					this.anInt138 = arg1.method102();
				} else if (local8 == 3) {
					this.aBoolean58 = true;
					anIntArray23[anInt136++] = arg0;
				} else if (local8 == 4) {
					this.aBoolean59 = false;
				} else if (local8 == 5) {
					this.anInt139 = arg1.method104();
				} else if (local8 == 6) {
					this.aBoolean60 = true;
				} else if (local8 == 7) {
					this.anInt140 = arg1.method107();
				} else if (local8 == 8) {
					this.anInt141 = 1;
					this.aBoolean61 = true;
				} else if (local8 == 10) {
					this.aString1 = arg1.method109();
				} else if (local8 == 11) {
					this.aBoolean61 = true;
				} else if (local8 == 12) {
					this.anInt142 = arg1.method107();
				} else if (local8 == 13) {
					this.anInt141 = 2;
					this.aBoolean61 = true;
				} else if (local8 == 14) {
					this.aBoolean62 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("53845, " + arg0 + ", " + arg1 + ", " + -5817 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}
}
