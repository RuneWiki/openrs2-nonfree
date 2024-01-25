import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "Lclient!tq;")
	public static Class191 aClass191_72;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_72 = new Class119(200);

	@OriginalMember(owner = "client!gq", name = "X", descriptor = "[I")
	public static int[] anIntArray224 = new int[2];

	@OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
	public static final int anInt2450 = 12;

	@OriginalMember(owner = "client!gq", name = "bb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public static void method2387() {
		aClass119_72.method3315(50);
		Static250.aClass119_154.method3315(50);
		Static29.aClass119_16.method3315(50);
		Static98.aClass119_58.method3315(50);
		Static126.aClass119_83.method3315(50);
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
	public static void method2391() {
		if (Static198.anInt3877 == 0) {
			return;
		}
		try {
			if (++Static156.anInt3177 > 1500) {
				if (Static157.aClass173_1 != null) {
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
				}
				if (Static220.anInt4245 >= 1) {
					Static198.anInt3877 = 0;
					Static211.anInt4078 = -5;
					return;
				}
				Static156.anInt3177 = 0;
				Static220.anInt4245++;
				if (Static109.anInt2409 == Static34.anInt599) {
					Static34.anInt599 = Static275.anInt5623;
				} else {
					Static34.anInt599 = Static109.anInt2409;
				}
				Static198.anInt3877 = 1;
			}
			if (Static198.anInt3877 == 1) {
				Static107.aClass193_2 = Static177.aClass168_2.method4848(Static149.aString26, Static34.anInt599);
				Static198.anInt3877 = 2;
			}
			@Pc(115) int local115;
			if (Static198.anInt3877 == 2) {
				if (Static107.aClass193_2.anInt6293 == 2) {
					throw new IOException();
				}
				if (Static107.aClass193_2.anInt6293 != 1) {
					return;
				}
				Static157.aClass173_1 = new Class173((Socket) Static107.aClass193_2.anObject7, Static177.aClass168_2);
				Static107.aClass193_2 = null;
				Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				local115 = Static157.aClass173_1.method5028();
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				if (local115 != 101) {
					Static211.anInt4078 = local115;
					Static198.anInt3877 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				}
				Static198.anInt3877 = 3;
			}
			if (Static198.anInt3877 == 3) {
				if (Static157.aClass173_1.method5024() < 2) {
					return;
				}
				local115 = Static157.aClass173_1.method5028() << 8 | Static157.aClass173_1.method5028();
				Static350.method5850(local115);
				if (Static261.anInt5114 == -1) {
					Static211.anInt4078 = 6;
					Static198.anInt3877 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				}
				Static198.anInt3877 = 0;
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
				Static40.method946();
				return;
			}
		} catch (@Pc(191) IOException local191) {
			if (Static157.aClass173_1 != null) {
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
			}
			if (Static220.anInt4245 < 1) {
				Static220.anInt4245++;
				Static198.anInt3877 = 1;
				Static156.anInt3177 = 0;
				if (Static109.anInt2409 == Static34.anInt599) {
					Static34.anInt599 = Static275.anInt5623;
				} else {
					Static34.anInt599 = Static109.anInt2409;
				}
			} else {
				Static198.anInt3877 = 0;
				Static211.anInt4078 = -4;
			}
		}
	}
}
