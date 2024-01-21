import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_736 = Static161.method2971("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!dd;")
	private static Class13 aClass13_737 = Static161.method2971("Checking for updates )2 ");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_738 = Static161.method2971("lila:");

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_739 = Static161.method2971("Neuer Benutzer");

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_740 = aClass13_737;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1590(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static36.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(25) Throwable local25) {
			}
		}
		arg0.addKeyListener(Static99.aClass23_1);
		arg0.addFocusListener(Static99.aClass23_1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
	public static int method1591() {
		@Pc(12) int local12 = 3;
		if (Static104.anInt2874 < 310) {
			@Pc(19) int local19 = Static22.anInt2236 >> 7;
			@Pc(23) int local23 = Static7.anInt3157 >> 7;
			@Pc(28) int local28 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7;
			if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][local19][local23] & 0x4) != 0) {
				local12 = Static156.anInt3696;
			}
			@Pc(45) int local45 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7;
			@Pc(53) int local53;
			if (local28 > local19) {
				local53 = local28 - local19;
			} else {
				local53 = local19 - local28;
			}
			@Pc(68) int local68;
			if (local45 > local23) {
				local68 = local45 - local23;
			} else {
				local68 = local23 - local45;
			}
			@Pc(86) int local86;
			@Pc(80) int local80;
			if (local68 >= local53) {
				local80 = 32768;
				local86 = local53 * 65536 / local68;
				while (local23 != local45) {
					local80 += local86;
					if (local23 < local45) {
						local23++;
					} else if (local45 < local23) {
						local23--;
					}
					if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][local19][local23] & 0x4) != 0) {
						local12 = Static156.anInt3696;
					}
					if (local80 >= 65536) {
						if (local19 < local28) {
							local19++;
						} else if (local28 < local19) {
							local19--;
						}
						if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][local19][local23] & 0x4) != 0) {
							local12 = Static156.anInt3696;
						}
						local80 -= 65536;
					}
				}
			} else {
				local86 = local68 * 65536 / local53;
				local80 = 32768;
				while (local19 != local28) {
					if (local19 < local28) {
						local19++;
					} else if (local28 < local19) {
						local19--;
					}
					local80 += local86;
					if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][local19][local23] & 0x4) != 0) {
						local12 = Static156.anInt3696;
					}
					if (local80 >= 65536) {
						local80 -= 65536;
						if (local45 > local23) {
							local23++;
						} else if (local23 > local45) {
							local23--;
						}
						if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][local19][local23] & 0x4) != 0) {
							local12 = Static156.anInt3696;
						}
					}
				}
			}
		}
		if ((Static35.aByteArrayArrayArray20[Static156.anInt3696][Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7][Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7] & 0x4) != 0) {
			local12 = Static156.anInt3696;
		}
		return local12;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	public static void method1592() {
		Static175.anImage3 = null;
		Static61.aFontMetrics1 = null;
		Static95.aFont1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1593() {
		aClass13_739 = null;
		aClass13_738 = null;
		aClass13_740 = null;
		aClass13_737 = null;
		aClass13_736 = null;
	}
}
