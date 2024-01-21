import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EEUUOAGX")
public final class Class10 {

	@OriginalMember(owner = "client!EEUUOAGX", name = "a", descriptor = "I")
	private static int anInt239;

	@OriginalMember(owner = "client!EEUUOAGX", name = "b", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!EEUUOAGX", name = "c", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!EEUUOAGX", name = "d", descriptor = "I")
	private static int anInt240;

	@OriginalMember(owner = "client!EEUUOAGX", name = "e", descriptor = "[Lclient!EEUUOAGX;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!EEUUOAGX", name = "f", descriptor = "I")
	private static int anInt241;

	@OriginalMember(owner = "client!EEUUOAGX", name = "g", descriptor = "[I")
	private static int[] anIntArray31;

	@OriginalMember(owner = "client!EEUUOAGX", name = "h", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!EEUUOAGX", name = "i", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!EEUUOAGX", name = "j", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!EEUUOAGX", name = "m", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!EEUUOAGX", name = "o", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!EEUUOAGX", name = "p", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!EEUUOAGX", name = "k", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!EEUUOAGX", name = "l", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!EEUUOAGX", name = "n", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!EEUUOAGX", name = "q", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!EEUUOAGX", name = "r", descriptor = "I")
	private int anInt247 = -1;

	@OriginalMember(owner = "client!EEUUOAGX", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method145(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method491("varp.dat", null), anInt239);
			anInt241 = 0;
			anInt240 = local8.method361();
			if (aClass10Array1 == null) {
				aClass10Array1 = new Class10[anInt240];
			}
			if (anIntArray31 == null) {
				anIntArray31 = new int[anInt240];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt240; local25++) {
				if (aClass10Array1[local25] == null) {
					aClass10Array1[local25] = new Class10();
				}
				aClass10Array1[local25].method146(aBoolean54, local8, local25);
			}
			if (local8.anInt443 != local8.aByteArray6.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("89602, " + 68 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EEUUOAGX", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!EEUUOAGX", name = "a", descriptor = "(ZLclient!LDILQFVA;I)V")
	private void method146(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg0) {
				while (true) {
					@Pc(7) int local7 = arg1.method359();
					if (local7 == 0) {
						return;
					}
					if (local7 == 1) {
						this.anInt242 = arg1.method359();
					} else if (local7 == 2) {
						this.anInt243 = arg1.method359();
					} else if (local7 == 3) {
						this.aBoolean55 = true;
						anIntArray31[anInt241++] = arg2;
					} else if (local7 == 4) {
						this.aBoolean56 = false;
					} else if (local7 == 5) {
						this.anInt244 = arg1.method361();
					} else if (local7 == 6) {
						this.aBoolean57 = true;
					} else if (local7 == 7) {
						this.anInt245 = arg1.method364();
					} else if (local7 == 8) {
						this.anInt246 = 1;
						this.aBoolean58 = true;
					} else if (local7 == 10) {
						this.aString4 = arg1.method366();
					} else if (local7 == 11) {
						this.aBoolean58 = true;
					} else if (local7 == 12) {
						this.anInt247 = arg1.method364();
					} else if (local7 == 13) {
						this.anInt246 = 2;
					} else {
						System.out.println("Error unrecognised config code: " + local7);
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("75548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
