import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_90 = new Class244(33, 11);

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	public static int anInt6050 = -1;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
	public static final int[] anIntArray649 = new int[14];

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "Lclient!vs;")
	public static final Class3_Sub42 aClass3_Sub42_2 = new Class3_Sub42(0, -1);

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	public static int method5391() {
		try {
			if (Static255.anInt4584 == 0) {
				if (Static288.method4512() - 5000L < Static207.aLong82) {
					return 0;
				}
				Static2.aClass133_1 = Static61.aClass156_1.method3642(Static165.aString29, Static253.anInt4563);
				Static352.aLong214 = Static288.method4512();
				Static255.anInt4584 = 1;
			}
			if (Static288.method4512() > Static352.aLong214 + 30000L) {
				return Static210.method3276(1000);
			}
			@Pc(78) int local78;
			@Pc(116) int local116;
			if (Static255.anInt4584 == 1) {
				if (Static2.aClass133_1.anInt3257 == 2) {
					return Static210.method3276(1001);
				}
				if (Static2.aClass133_1.anInt3257 != 1) {
					return -1;
				}
				Static12.aClass145_2 = new Class145((Socket) Static2.aClass133_1.anObject3, Static61.aClass156_1);
				Static2.aClass133_1 = null;
				local78 = 0;
				Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
				if (Static52.aBoolean58) {
					local78 = Static91.anInt2991;
				}
				Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_9.anInt1930);
				Static23.aClass3_Sub5_Sub1_1.method2782(local78);
				Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				local116 = Static12.aClass145_2.method3137();
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				if (local116 != 0) {
					return Static210.method3276(local116);
				}
				Static255.anInt4584 = 2;
			}
			if (Static255.anInt4584 == 2) {
				if (Static12.aClass145_2.method3139() < 2) {
					return -1;
				}
				Static187.anInt3397 = Static12.aClass145_2.method3137();
				Static187.anInt3397 <<= 0x8;
				Static187.anInt3397 += Static12.aClass145_2.method3137();
				Static302.anInt5248 = 0;
				Static255.anInt4584 = 3;
				Static198.aByteArray50 = new byte[Static187.anInt3397];
			}
			if (Static255.anInt4584 != 3) {
				return -1;
			}
			local78 = Static12.aClass145_2.method3139();
			if (local78 < 1) {
				return -1;
			}
			if (local78 > Static187.anInt3397 - Static302.anInt5248) {
				local78 = Static187.anInt3397 - Static302.anInt5248;
			}
			Static12.aClass145_2.method3141(Static302.anInt5248, Static198.aByteArray50, local78);
			Static302.anInt5248 += local78;
			if (Static187.anInt3397 > Static302.anInt5248) {
				return -1;
			} else if (Static82.method1366(Static198.aByteArray50)) {
				Static97.aClass23_Sub1Array1 = new Class23_Sub1[Static76.anInt1626];
				local116 = 0;
				for (@Pc(231) int local231 = Static374.anInt6249; local231 <= Static382.anInt6411; local231++) {
					@Pc(237) Class23_Sub1 local237 = Static144.method2280(local231);
					if (local237 != null) {
						Static97.aClass23_Sub1Array1[local116++] = local237;
					}
				}
				Static197.anInt3538 = 0;
				Static113.aClass3_Sub2_1 = null;
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
				Static251.anInt4511 = 0;
				Static198.aByteArray50 = null;
				Static255.anInt4584 = 0;
				Static207.aLong82 = Static288.method4512();
				return 0;
			} else {
				return Static210.method3276(1002);
			}
		} catch (@Pc(281) IOException local281) {
			return Static210.method3276(1003);
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Lclient!sh;")
	public static Class213 method5392(@OriginalArg(0) int arg0) {
		@Pc(13) Class213[] local13 = Static315.method4829();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class213 local21 = local13[local15];
			if (arg0 == local21.anInt5406) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!b;Lclient!b;I)V")
	public static void method5395(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		Static160.aClass20_79 = arg1;
		Static287.aClass20_69 = arg0;
	}
}
