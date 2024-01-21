import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KHDRIUSF")
public final class Class17 {

	@OriginalMember(owner = "client!KHDRIUSF", name = "b", descriptor = "I")
	private static int anInt199;

	@OriginalMember(owner = "client!KHDRIUSF", name = "c", descriptor = "[Lclient!KHDRIUSF;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!KHDRIUSF", name = "d", descriptor = "I")
	private static int anInt200;

	@OriginalMember(owner = "client!KHDRIUSF", name = "e", descriptor = "[I")
	private static int[] anIntArray97;

	@OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "Z")
	private static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!KHDRIUSF", name = "f", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!KHDRIUSF", name = "g", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!KHDRIUSF", name = "h", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!KHDRIUSF", name = "k", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!KHDRIUSF", name = "m", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!KHDRIUSF", name = "n", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!KHDRIUSF", name = "i", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!KHDRIUSF", name = "j", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!KHDRIUSF", name = "l", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!KHDRIUSF", name = "o", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!KHDRIUSF", name = "p", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!KHDRIUSF", name = "q", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method187(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(arg0.method515("varp.dat", null), true);
			anInt200 = 0;
			anInt199 = local8.method407();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt199];
			}
			if (anIntArray97 == null) {
				anIntArray97 = new int[anInt199];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt199; local34++) {
				if (aClass17Array1[local34] == null) {
					aClass17Array1[local34] = new Class17();
				}
				aClass17Array1[local34].method188(local34, local8);
			}
			if (local8.anInt624 != local8.aByteArray16.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("69839, " + arg0 + ", " + 24414 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KHDRIUSF", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "(IZLclient!SVWJKJVI;)V")
	private void method188(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method405();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt201 = arg1.method405();
				} else if (local7 == 2) {
					this.anInt202 = arg1.method405();
				} else if (local7 == 3) {
					this.aBoolean47 = true;
					anIntArray97[anInt200++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean48 = false;
				} else if (local7 == 5) {
					this.anInt203 = arg1.method407();
				} else if (local7 == 6) {
					this.aBoolean49 = true;
				} else if (local7 == 7) {
					this.anInt204 = arg1.method410();
				} else if (local7 == 8) {
					this.anInt205 = 1;
					this.aBoolean50 = true;
				} else if (local7 == 10) {
					this.aString4 = arg1.method412();
				} else if (local7 == 11) {
					this.aBoolean50 = true;
				} else if (local7 == 12) {
					this.anInt206 = arg1.method410();
				} else if (local7 == 13) {
					this.anInt205 = 2;
					this.aBoolean50 = true;
				} else if (local7 == 14) {
					this.aBoolean51 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("63181, " + arg0 + ", " + false + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
