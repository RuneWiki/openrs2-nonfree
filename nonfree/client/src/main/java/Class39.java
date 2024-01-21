import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt885;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	private static int anInt886;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
	private static int[] anIntArray244;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt884 = -643;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "B")
	private static byte aByte41 = 6;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt889;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	private int anInt892 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method582(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("varp.dat", null), (byte) 1);
			anInt886 = 0;
			anInt885 = local8.method475();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt885];
			}
			if (anIntArray244 == null) {
				anIntArray244 = new int[anInt885];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt885; local25++) {
				if (aClass39Array1[local25] == null) {
					aClass39Array1[local25] = new Class39();
				}
				aClass39Array1[local25].method583(local8, aByte41, local25);
			}
			if (local8.anInt743 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("89348, " + false + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method583(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(10) int local10;
			if (arg1 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			while (true) {
				local10 = arg0.method473();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt887 = arg0.method473();
				} else if (local10 == 2) {
					this.anInt888 = arg0.method473();
				} else if (local10 == 3) {
					this.aBoolean212 = true;
					anIntArray244[anInt886++] = arg2;
				} else if (local10 == 4) {
					this.aBoolean213 = false;
				} else if (local10 == 5) {
					this.anInt889 = arg0.method475();
				} else if (local10 == 6) {
					this.aBoolean214 = true;
				} else if (local10 == 7) {
					this.anInt890 = arg0.method478();
				} else if (local10 == 8) {
					this.anInt891 = 1;
					this.aBoolean215 = true;
				} else if (local10 == 10) {
					this.aString28 = arg0.method480();
				} else if (local10 == 11) {
					this.aBoolean215 = true;
				} else if (local10 == 12) {
					this.anInt892 = arg0.method478();
				} else if (local10 == 13) {
					this.anInt891 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("80170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
