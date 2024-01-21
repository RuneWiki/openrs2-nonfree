import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "B")
	private static byte aByte30;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt878;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	private static int anInt879;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	private int anInt885 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method589(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("varp.dat", null), aBoolean229);
			anInt879 = 0;
			anInt878 = local10.method482();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt878];
			}
			if (anIntArray247 == null) {
				anIntArray247 = new int[anInt878];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt878; local27++) {
				if (aClass39Array1[local27] == null) {
					aClass39Array1[local27] = new Class39();
				}
				aClass39Array1[local27].method590(local27, aByte30, local10);
			}
			if (local10.anInt733 != local10.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("92289, " + arg0 + ", " + 5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method590(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(9) int local9;
			if (arg1 == 0) {
				@Pc(5) boolean local5 = false;
			} else {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			while (true) {
				local9 = arg2.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt880 = arg2.method480();
				} else if (local9 == 2) {
					this.anInt881 = arg2.method480();
				} else if (local9 == 3) {
					this.aBoolean230 = true;
					anIntArray247[anInt879++] = arg0;
				} else if (local9 == 4) {
					this.aBoolean231 = false;
				} else if (local9 == 5) {
					this.anInt882 = arg2.method482();
				} else if (local9 == 6) {
					this.aBoolean232 = true;
				} else if (local9 == 7) {
					this.anInt883 = arg2.method485();
				} else if (local9 == 8) {
					this.anInt884 = 1;
					this.aBoolean233 = true;
				} else if (local9 == 10) {
					this.aString28 = arg2.method487();
				} else if (local9 == 11) {
					this.aBoolean233 = true;
				} else if (local9 == 12) {
					this.anInt885 = arg2.method485();
				} else if (local9 == 13) {
					this.anInt884 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("73625, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
