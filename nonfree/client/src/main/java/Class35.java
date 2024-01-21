import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RRCEOPDB")
public final class Class35 {

	@OriginalMember(owner = "client!RRCEOPDB", name = "a", descriptor = "I")
	private static int anInt572;

	@OriginalMember(owner = "client!RRCEOPDB", name = "b", descriptor = "[Lclient!RRCEOPDB;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!RRCEOPDB", name = "c", descriptor = "I")
	private static int anInt573;

	@OriginalMember(owner = "client!RRCEOPDB", name = "d", descriptor = "[I")
	private static int[] anIntArray135;

	@OriginalMember(owner = "client!RRCEOPDB", name = "e", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!RRCEOPDB", name = "f", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!RRCEOPDB", name = "g", descriptor = "I")
	private int anInt575;

	@OriginalMember(owner = "client!RRCEOPDB", name = "j", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!RRCEOPDB", name = "l", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!RRCEOPDB", name = "m", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!RRCEOPDB", name = "h", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!RRCEOPDB", name = "i", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!RRCEOPDB", name = "k", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!RRCEOPDB", name = "n", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!RRCEOPDB", name = "o", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!RRCEOPDB", name = "p", descriptor = "Z")
	private boolean aBoolean153 = true;

	@OriginalMember(owner = "client!RRCEOPDB", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method378(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(10) Class6_Sub2_Sub3 local10 = new Class6_Sub2_Sub3(741, arg0.method381("varp.dat", null));
			anInt573 = 0;
			anInt572 = local10.method404();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt572];
			}
			if (anIntArray135 == null) {
				anIntArray135 = new int[anInt572];
			}
			for (@Pc(36) int local36 = 0; local36 < anInt572; local36++) {
				if (aClass35Array1[local36] == null) {
					aClass35Array1[local36] = new Class35();
				}
				aClass35Array1[local36].method379(local10, local36);
			}
			if (local10.anInt609 != local10.aByteArray17.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("93476, " + 0 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RRCEOPDB", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!RRCEOPDB", name = "a", descriptor = "(Lclient!UAWAYCTK;II)V")
	private void method379(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method402();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt574 = arg0.method402();
				} else if (local13 == 2) {
					this.anInt575 = arg0.method402();
				} else if (local13 == 3) {
					this.aBoolean149 = true;
					anIntArray135[anInt573++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean150 = false;
				} else if (local13 == 5) {
					this.anInt576 = arg0.method404();
				} else if (local13 == 6) {
					this.aBoolean151 = true;
				} else if (local13 == 7) {
					this.anInt577 = arg0.method407();
				} else if (local13 == 8) {
					this.anInt578 = 1;
					this.aBoolean152 = true;
				} else if (local13 == 10) {
					this.aString13 = arg0.method409();
				} else if (local13 == 11) {
					this.aBoolean152 = true;
				} else if (local13 == 12) {
					this.anInt579 = arg0.method407();
				} else if (local13 == 13) {
					this.anInt578 = 2;
					this.aBoolean152 = true;
				} else if (local13 == 14) {
					this.aBoolean153 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("85393, " + arg0 + ", " + 593 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
