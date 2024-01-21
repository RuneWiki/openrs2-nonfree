import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray244;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt888 = -474;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt893;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt896 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method583(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method660("varp.dat", null), 185);
			anInt890 = 0;
			anInt889 = local10.method476();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt889];
			}
			if (anIntArray244 == null) {
				anIntArray244 = new int[anInt889];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt889; local27++) {
				if (aClass39Array1[local27] == null) {
					aClass39Array1[local27] = new Class39();
				}
				aClass39Array1[local27].method584(local27, local10);
			}
			if (local10.anInt738 != local10.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("84776, " + arg0 + ", " + -474 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method584(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method474();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt891 = arg1.method474();
				} else if (local8 == 2) {
					this.anInt892 = arg1.method474();
				} else if (local8 == 3) {
					this.aBoolean221 = true;
					anIntArray244[anInt890++] = arg0;
				} else if (local8 == 4) {
					this.aBoolean222 = false;
				} else if (local8 == 5) {
					this.anInt893 = arg1.method476();
				} else if (local8 == 6) {
					this.aBoolean223 = true;
				} else if (local8 == 7) {
					this.anInt894 = arg1.method479();
				} else if (local8 == 8) {
					this.anInt895 = 1;
					this.aBoolean224 = true;
				} else if (local8 == 10) {
					this.aString28 = arg1.method481();
				} else if (local8 == 11) {
					this.aBoolean224 = true;
				} else if (local8 == 12) {
					this.anInt896 = arg1.method479();
				} else if (local8 == 13) {
					this.anInt895 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("56830, " + arg0 + ", " + arg1 + ", " + 6454 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
