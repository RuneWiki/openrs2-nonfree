import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt861;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt862;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private static int[] anIntArray244;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt868 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method581(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("varp.dat", null));
			anInt862 = 0;
			anInt861 = local10.method474();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt861];
			}
			if (anIntArray244 == null) {
				anIntArray244 = new int[anInt861];
			}
			for (@Pc(36) int local36 = 0; local36 < anInt861; local36++) {
				if (aClass39Array1[local36] == null) {
					aClass39Array1[local36] = new Class39();
				}
				aClass39Array1[local36].method582(local36, local10);
			}
			if (local10.anInt715 != local10.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("21414, " + 645 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!lb;)V")
	private void method582(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method472();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt863 = arg1.method472();
				} else if (local13 == 2) {
					this.anInt864 = arg1.method472();
				} else if (local13 == 3) {
					this.aBoolean232 = true;
					anIntArray244[anInt862++] = arg0;
				} else if (local13 == 4) {
					this.aBoolean233 = false;
				} else if (local13 == 5) {
					this.anInt865 = arg1.method474();
				} else if (local13 == 6) {
					this.aBoolean234 = true;
				} else if (local13 == 7) {
					this.anInt866 = arg1.method477();
				} else if (local13 == 8) {
					this.anInt867 = 1;
					this.aBoolean235 = true;
				} else if (local13 == 10) {
					this.aString28 = arg1.method479();
				} else if (local13 == 11) {
					this.aBoolean235 = true;
				} else if (local13 == 12) {
					this.anInt868 = arg1.method477();
				} else if (local13 == 13) {
					this.anInt867 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("34082, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
