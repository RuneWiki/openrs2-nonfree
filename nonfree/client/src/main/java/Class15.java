import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!INYZAOQU")
public final class Class15 {

	@OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "I")
	private static int anInt172;

	@OriginalMember(owner = "client!INYZAOQU", name = "b", descriptor = "[Lclient!INYZAOQU;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!INYZAOQU", name = "c", descriptor = "I")
	private static int anInt173;

	@OriginalMember(owner = "client!INYZAOQU", name = "d", descriptor = "[I")
	private static int[] anIntArray78;

	@OriginalMember(owner = "client!INYZAOQU", name = "e", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!INYZAOQU", name = "f", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!INYZAOQU", name = "g", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!INYZAOQU", name = "j", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!INYZAOQU", name = "l", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!INYZAOQU", name = "m", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!INYZAOQU", name = "h", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!INYZAOQU", name = "i", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!INYZAOQU", name = "k", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!INYZAOQU", name = "n", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!INYZAOQU", name = "o", descriptor = "I")
	private int anInt179 = -1;

	@OriginalMember(owner = "client!INYZAOQU", name = "p", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method177(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3(arg0.method218("varp.dat", null), true);
			anInt173 = 0;
			anInt172 = local8.method99();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt172];
			}
			if (anIntArray78 == null) {
				anIntArray78 = new int[anInt172];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt172; local28++) {
				if (aClass15Array1[local28] == null) {
					aClass15Array1[local28] = new Class15();
				}
				aClass15Array1[local28].method178(local8, local28);
			}
			if (local8.anInt136 != local8.aByteArray10.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("94835, " + 0 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INYZAOQU", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "(ZLclient!EMWAMCXW;I)V")
	private void method178(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method97();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt174 = arg0.method97();
				} else if (local7 == 2) {
					this.anInt175 = arg0.method97();
				} else if (local7 == 3) {
					this.aBoolean83 = true;
					anIntArray78[anInt173++] = arg1;
				} else if (local7 == 4) {
					this.aBoolean84 = false;
				} else if (local7 == 5) {
					this.anInt176 = arg0.method99();
				} else if (local7 == 6) {
					this.aBoolean85 = true;
				} else if (local7 == 7) {
					this.anInt177 = arg0.method102();
				} else if (local7 == 8) {
					this.anInt178 = 1;
					this.aBoolean86 = true;
				} else if (local7 == 10) {
					this.aString3 = arg0.method104();
				} else if (local7 == 11) {
					this.aBoolean86 = true;
				} else if (local7 == 12) {
					this.anInt179 = arg0.method102();
				} else if (local7 == 13) {
					this.anInt178 = 2;
					this.aBoolean86 = true;
				} else if (local7 == 14) {
					this.aBoolean87 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("5233, " + false + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
