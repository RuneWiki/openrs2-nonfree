import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_9;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1445 = Static161.method2971("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1446 = Static161.method2971(" <col=ffffff>");

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1447 = Static161.method2971("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Ljava/util/Random;")
	public static Random aRandom3 = new Random();

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1448 = Static161.method2971("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1449 = null;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public static int anInt4156 = -1;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	public static int anInt4159 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method3038() {
		aClass13_1446 = null;
		aClass1_Sub2_Sub1_Sub3_9 = null;
		aClass13_1449 = null;
		aClass13_1447 = null;
		aRandom3 = null;
		aClass13_1445 = null;
		aClass13_1448 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!o;ILclient!hb;B)V")
	public static void method3044(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class82 local14 = Static64.aClass82_5;
		synchronized (Static64.aClass82_5) {
			for (@Pc(21) Class1_Sub18 local21 = (Class1_Sub18) Static64.aClass82_5.method2849(); local21 != null; local21 = (Class1_Sub18) Static64.aClass82_5.method2855()) {
				if ((long) arg1 == local21.aLong158 && arg2 == local21.aClass28_3 && local21.anInt3531 == 0) {
					local12 = local21.aByteArray32;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(68) byte[] local68 = arg2.method1444(arg1);
			arg0.method2272(arg2, true, arg1, local68);
		} else {
			arg0.method2272(arg2, true, arg1, local12);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)I")
	public static int method3050(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method3051() {
		Static24.aClass47_4.method1995();
		Static29.aClass47_7.method1995();
	}
}
