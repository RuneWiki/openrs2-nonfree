import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EINNWKRR")
public final class Class12 {

	@OriginalMember(owner = "client!EINNWKRR", name = "a", descriptor = "I")
	private static int anInt132;

	@OriginalMember(owner = "client!EINNWKRR", name = "b", descriptor = "[Lclient!EINNWKRR;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!EINNWKRR", name = "c", descriptor = "I")
	private static int anInt133;

	@OriginalMember(owner = "client!EINNWKRR", name = "d", descriptor = "[I")
	private static int[] anIntArray29;

	@OriginalMember(owner = "client!EINNWKRR", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!EINNWKRR", name = "f", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!EINNWKRR", name = "g", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!EINNWKRR", name = "j", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!EINNWKRR", name = "l", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!EINNWKRR", name = "m", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!EINNWKRR", name = "h", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!EINNWKRR", name = "i", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!EINNWKRR", name = "k", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!EINNWKRR", name = "n", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!EINNWKRR", name = "o", descriptor = "I")
	private int anInt139 = -1;

	@OriginalMember(owner = "client!EINNWKRR", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method141(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method220("varp.dat", null), 8);
			@Pc(12) boolean local12 = false;
			anInt133 = 0;
			anInt132 = local8.method240();
			if (aClass12Array1 == null) {
				aClass12Array1 = new Class12[anInt132];
			}
			if (anIntArray29 == null) {
				anIntArray29 = new int[anInt132];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt132; local29++) {
				if (aClass12Array1[local29] == null) {
					aClass12Array1[local29] = new Class12();
				}
				aClass12Array1[local29].method142(local29, local8);
			}
			if (local8.anInt352 != local8.aByteArray3.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("93733, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EINNWKRR", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!EINNWKRR", name = "a", descriptor = "(IILclient!JHKSAGUC;)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method238();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt134 = arg1.method238();
				} else if (local13 == 2) {
					this.anInt135 = arg1.method238();
				} else if (local13 == 3) {
					this.aBoolean44 = true;
					anIntArray29[anInt133++] = arg0;
				} else if (local13 == 4) {
					this.aBoolean45 = false;
				} else if (local13 == 5) {
					this.anInt136 = arg1.method240();
				} else if (local13 == 6) {
					this.aBoolean46 = true;
				} else if (local13 == 7) {
					this.anInt137 = arg1.method243();
				} else if (local13 == 8) {
					this.anInt138 = 1;
					this.aBoolean47 = true;
				} else if (local13 == 10) {
					this.aString2 = arg1.method245();
				} else if (local13 == 11) {
					this.aBoolean47 = true;
				} else if (local13 == 12) {
					this.anInt139 = arg1.method243();
				} else if (local13 == 13) {
					this.anInt138 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("17591, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
