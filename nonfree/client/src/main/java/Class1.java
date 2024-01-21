import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AJLKWPFL")
public final class Class1 {

	@OriginalMember(owner = "client!AJLKWPFL", name = "b", descriptor = "Z")
	private static boolean aBoolean2;

	@OriginalMember(owner = "client!AJLKWPFL", name = "d", descriptor = "I")
	private static int anInt1;

	@OriginalMember(owner = "client!AJLKWPFL", name = "e", descriptor = "[Lclient!AJLKWPFL;")
	public static Class1[] aClass1Array1;

	@OriginalMember(owner = "client!AJLKWPFL", name = "f", descriptor = "I")
	private static int anInt2;

	@OriginalMember(owner = "client!AJLKWPFL", name = "g", descriptor = "[I")
	private static int[] anIntArray1;

	@OriginalMember(owner = "client!AJLKWPFL", name = "h", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!AJLKWPFL", name = "i", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AJLKWPFL", name = "j", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!AJLKWPFL", name = "m", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!AJLKWPFL", name = "o", descriptor = "I")
	private int anInt6;

	@OriginalMember(owner = "client!AJLKWPFL", name = "p", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!AJLKWPFL", name = "c", descriptor = "B")
	private byte aByte1 = 28;

	@OriginalMember(owner = "client!AJLKWPFL", name = "k", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!AJLKWPFL", name = "l", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!AJLKWPFL", name = "n", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!AJLKWPFL", name = "q", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!AJLKWPFL", name = "r", descriptor = "I")
	private int anInt8 = -1;

	@OriginalMember(owner = "client!AJLKWPFL", name = "s", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method1(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(17) Class2_Sub1_Sub2 local17 = new Class2_Sub1_Sub2(arg0.method485("varp.dat", null), (byte) 3);
			anInt2 = 0;
			anInt1 = local17.method96();
			if (aClass1Array1 == null) {
				aClass1Array1 = new Class1[anInt1];
			}
			if (anIntArray1 == null) {
				anIntArray1 = new int[anInt1];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt1; local34++) {
				if (aClass1Array1[local34] == null) {
					aClass1Array1[local34] = new Class1();
				}
				aClass1Array1[local34].method2(local17, local34);
			}
			if (local17.anInt81 != local17.aByteArray1.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("62877, " + arg0 + ", " + -29636 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AJLKWPFL", name = "<init>", descriptor = "()V")
	private Class1() {
	}

	@OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "(BLclient!BSNPYLEV;I)V")
	private void method2(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte1 != 28) {
				this.aBoolean1 = !this.aBoolean1;
			}
			while (true) {
				@Pc(16) int local16 = arg0.method94();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					this.anInt3 = arg0.method94();
				} else if (local16 == 2) {
					this.anInt4 = arg0.method94();
				} else if (local16 == 3) {
					this.aBoolean3 = true;
					anIntArray1[anInt2++] = arg1;
				} else if (local16 == 4) {
					this.aBoolean4 = false;
				} else if (local16 == 5) {
					this.anInt5 = arg0.method96();
				} else if (local16 == 6) {
					this.aBoolean5 = true;
				} else if (local16 == 7) {
					this.anInt6 = arg0.method99();
				} else if (local16 == 8) {
					this.anInt7 = 1;
					this.aBoolean6 = true;
				} else if (local16 == 10) {
					this.aString1 = arg0.method101();
				} else if (local16 == 11) {
					this.aBoolean6 = true;
				} else if (local16 == 12) {
					this.anInt8 = arg0.method99();
				} else if (local16 == 13) {
					this.anInt7 = 2;
					this.aBoolean6 = true;
				} else if (local16 == 14) {
					this.aBoolean7 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local16);
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("80982, " + 28 + ", " + arg0 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}
}
