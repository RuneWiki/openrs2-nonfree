import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private static int anInt883;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
	private static int[] anIntArray246;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private static boolean aBoolean225 = true;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt881 = 810;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private int anInt880 = -550;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	private int anInt889 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method585(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg0.method662("varp.dat", null), 15787);
			anInt883 = 0;
			anInt882 = local16.method478();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt882];
			}
			if (anIntArray246 == null) {
				anIntArray246 = new int[anInt882];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt882; local33++) {
				if (aClass39Array1[local33] == null) {
					aClass39Array1[local33] = new Class39();
				}
				aClass39Array1[local33].method586(anInt881, local33, local16);
			}
			if (local16.anInt734 != local16.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("51793, " + true + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			if (arg0 <= 0) {
				this.anInt880 = 68;
			}
			while (true) {
				@Pc(9) int local9 = arg2.method476();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt884 = arg2.method476();
				} else if (local9 == 2) {
					this.anInt885 = arg2.method476();
				} else if (local9 == 3) {
					this.aBoolean226 = true;
					anIntArray246[anInt883++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean227 = false;
				} else if (local9 == 5) {
					this.anInt886 = arg2.method478();
				} else if (local9 == 6) {
					this.aBoolean228 = true;
				} else if (local9 == 7) {
					this.anInt887 = arg2.method481();
				} else if (local9 == 8) {
					this.anInt888 = 1;
					this.aBoolean229 = true;
				} else if (local9 == 10) {
					this.aString28 = arg2.method483();
				} else if (local9 == 11) {
					this.aBoolean229 = true;
				} else if (local9 == 12) {
					this.anInt889 = arg2.method481();
				} else if (local9 == 13) {
					this.anInt888 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("69668, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
