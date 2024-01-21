import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SVMLNUSB")
public final class Class34 {

	@OriginalMember(owner = "client!SVMLNUSB", name = "b", descriptor = "I")
	private static int anInt668;

	@OriginalMember(owner = "client!SVMLNUSB", name = "c", descriptor = "[Lclient!SVMLNUSB;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!SVMLNUSB", name = "d", descriptor = "I")
	private static int anInt669;

	@OriginalMember(owner = "client!SVMLNUSB", name = "e", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "I")
	private static int anInt667 = 685;

	@OriginalMember(owner = "client!SVMLNUSB", name = "f", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!SVMLNUSB", name = "g", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!SVMLNUSB", name = "h", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!SVMLNUSB", name = "k", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!SVMLNUSB", name = "m", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!SVMLNUSB", name = "n", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!SVMLNUSB", name = "i", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!SVMLNUSB", name = "j", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!SVMLNUSB", name = "l", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!SVMLNUSB", name = "o", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!SVMLNUSB", name = "p", descriptor = "I")
	private int anInt675 = -1;

	@OriginalMember(owner = "client!SVMLNUSB", name = "q", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method489(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method278("varp.dat", null), 0);
			anInt669 = 0;
			anInt668 = local8.method157();
			if (aClass34Array1 == null) {
				aClass34Array1 = new Class34[anInt668];
			}
			if (anIntArray167 == null) {
				anIntArray167 = new int[anInt668];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt668; local29++) {
				if (aClass34Array1[local29] == null) {
					aClass34Array1[local29] = new Class34();
				}
				aClass34Array1[local29].method490(local29, local8);
			}
			if (local8.anInt301 != local8.aByteArray2.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("1205, " + arg0 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVMLNUSB", name = "<init>", descriptor = "()V")
	private Class34() {
	}

	@OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "(ILclient!EYMNCFMK;I)V")
	private void method490(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg1.method155();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt670 = arg1.method155();
				} else if (local14 == 2) {
					this.anInt671 = arg1.method155();
				} else if (local14 == 3) {
					this.aBoolean138 = true;
					anIntArray167[anInt669++] = arg0;
				} else if (local14 == 4) {
					this.aBoolean139 = false;
				} else if (local14 == 5) {
					this.anInt672 = arg1.method157();
				} else if (local14 == 6) {
					this.aBoolean140 = true;
				} else if (local14 == 7) {
					this.anInt673 = arg1.method160();
				} else if (local14 == 8) {
					this.anInt674 = 1;
					this.aBoolean141 = true;
				} else if (local14 == 10) {
					this.aString9 = arg1.method162();
				} else if (local14 == 11) {
					this.aBoolean141 = true;
				} else if (local14 == 12) {
					this.anInt675 = arg1.method160();
				} else if (local14 == 13) {
					this.anInt674 = 2;
					this.aBoolean141 = true;
				} else if (local14 == 14) {
					this.aBoolean142 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("97421, " + arg0 + ", " + arg1 + ", " + 24145 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
