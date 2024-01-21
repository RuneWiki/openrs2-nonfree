import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KVOIHOSF")
public final class Class25 {

	@OriginalMember(owner = "client!KVOIHOSF", name = "b", descriptor = "I")
	private static int anInt382;

	@OriginalMember(owner = "client!KVOIHOSF", name = "c", descriptor = "[Lclient!KVOIHOSF;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!KVOIHOSF", name = "d", descriptor = "I")
	private static int anInt383;

	@OriginalMember(owner = "client!KVOIHOSF", name = "e", descriptor = "[I")
	private static int[] anIntArray73;

	@OriginalMember(owner = "client!KVOIHOSF", name = "a", descriptor = "Z")
	private static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!KVOIHOSF", name = "f", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!KVOIHOSF", name = "g", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!KVOIHOSF", name = "h", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!KVOIHOSF", name = "k", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!KVOIHOSF", name = "m", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!KVOIHOSF", name = "n", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!KVOIHOSF", name = "i", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!KVOIHOSF", name = "j", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!KVOIHOSF", name = "l", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!KVOIHOSF", name = "o", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!KVOIHOSF", name = "p", descriptor = "I")
	private int anInt389 = -1;

	@OriginalMember(owner = "client!KVOIHOSF", name = "q", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!KVOIHOSF", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method194(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg0.method227("varp.dat", null), -82);
			anInt383 = 0;
			anInt382 = local8.method439();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt382];
			}
			if (anIntArray73 == null) {
				anIntArray73 = new int[anInt382];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt382; local28++) {
				if (aClass25Array1[local28] == null) {
					aClass25Array1[local28] = new Class25();
				}
				aClass25Array1[local28].method195(local28, local8);
			}
			if (local8.anInt755 != local8.aByteArray20.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("53565, " + true + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KVOIHOSF", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!KVOIHOSF", name = "a", descriptor = "(IILclient!XGRGMPUQ;)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(12) int local12 = arg1.method437();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt384 = arg1.method437();
				} else if (local12 == 2) {
					this.anInt385 = arg1.method437();
				} else if (local12 == 3) {
					this.aBoolean114 = true;
					anIntArray73[anInt383++] = arg0;
				} else if (local12 == 4) {
					this.aBoolean115 = false;
				} else if (local12 == 5) {
					this.anInt386 = arg1.method439();
				} else if (local12 == 6) {
					this.aBoolean116 = true;
				} else if (local12 == 7) {
					this.anInt387 = arg1.method442();
				} else if (local12 == 8) {
					this.anInt388 = 1;
					this.aBoolean117 = true;
				} else if (local12 == 10) {
					this.aString7 = arg1.method444();
				} else if (local12 == 11) {
					this.aBoolean117 = true;
				} else if (local12 == 12) {
					this.anInt389 = arg1.method442();
				} else if (local12 == 13) {
					this.anInt388 = 2;
					this.aBoolean117 = true;
				} else if (local12 == 14) {
					this.aBoolean118 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("41521, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
