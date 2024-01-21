import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WEUDDWZB")
public final class Class44 {

	@OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "I")
	private static int anInt613;

	@OriginalMember(owner = "client!WEUDDWZB", name = "b", descriptor = "[Lclient!WEUDDWZB;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!WEUDDWZB", name = "c", descriptor = "I")
	private static int anInt614;

	@OriginalMember(owner = "client!WEUDDWZB", name = "d", descriptor = "[I")
	private static int[] anIntArray173;

	@OriginalMember(owner = "client!WEUDDWZB", name = "e", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!WEUDDWZB", name = "f", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!WEUDDWZB", name = "g", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!WEUDDWZB", name = "j", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!WEUDDWZB", name = "l", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!WEUDDWZB", name = "m", descriptor = "I")
	private int anInt619;

	@OriginalMember(owner = "client!WEUDDWZB", name = "h", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!WEUDDWZB", name = "i", descriptor = "Z")
	private boolean aBoolean148 = true;

	@OriginalMember(owner = "client!WEUDDWZB", name = "k", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!WEUDDWZB", name = "n", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!WEUDDWZB", name = "o", descriptor = "I")
	private int anInt620 = -1;

	@OriginalMember(owner = "client!WEUDDWZB", name = "p", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method414(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("varp.dat", null));
			anInt614 = 0;
			anInt613 = local8.method313();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt613];
			}
			if (anIntArray173 == null) {
				anIntArray173 = new int[anInt613];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt613; local29++) {
				if (aClass44Array1[local29] == null) {
					aClass44Array1[local29] = new Class44();
				}
				aClass44Array1[local29].method415(local29, local8);
			}
			if (local8.anInt428 != local8.aByteArray12.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("10762, " + arg0 + ", " + 36135 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WEUDDWZB", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "(IILclient!MFMVIYHT;)V")
	private void method415(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method311();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt615 = arg1.method311();
				} else if (local7 == 2) {
					this.anInt616 = arg1.method311();
				} else if (local7 == 3) {
					this.aBoolean147 = true;
					anIntArray173[anInt614++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean148 = false;
				} else if (local7 == 5) {
					this.anInt617 = arg1.method313();
				} else if (local7 == 6) {
					this.aBoolean149 = true;
				} else if (local7 == 7) {
					this.anInt618 = arg1.method316();
				} else if (local7 == 8) {
					this.anInt619 = 1;
					this.aBoolean150 = true;
				} else if (local7 == 10) {
					this.aString11 = arg1.method318();
				} else if (local7 == 11) {
					this.aBoolean150 = true;
				} else if (local7 == 12) {
					this.anInt620 = arg1.method316();
				} else if (local7 == 13) {
					this.anInt619 = 2;
					this.aBoolean150 = true;
				} else if (local7 == 14) {
					this.aBoolean151 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("68575, " + -954 + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
