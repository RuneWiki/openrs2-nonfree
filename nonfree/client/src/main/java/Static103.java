import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!et", name = "t", descriptor = "Lclient!tl;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[I")
	public static final int[] anIntArray84 = new int[32];

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[B")
	public static final byte[] aByteArray11 = new byte[16384];

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	public static void method1469() {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(17) Class215 local17 = Static41.aClass124_2.method2523("2");
			while (local17.anInt5791 == 0) {
				Static252.method2874(1L);
			}
			if (local17.anInt5791 == 1) {
				local7 = (Class220) local17.anObject10;
				@Pc(42) byte[] local42 = new byte[(int) local7.method4583()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local7.method4585(local44, local42.length - local44, local42);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static383.method4895(new Class1_Sub11(local42));
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method4584();
			}
		} catch (@Pc(93) Exception local93) {
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I")
	public static int method1472() {
		try {
			if (Static374.anInt6278 == 0) {
				if (Static232.method3058() - 5000L < Static20.aLong21) {
					return 0;
				}
				Static175.aClass215_3 = Static41.aClass124_2.method2532(Static428.aString65, Static195.anInt3133);
				Static391.aLong202 = Static232.method3058();
				Static374.anInt6278 = 1;
			}
			if (Static391.aLong202 + 30000L < Static232.method3058()) {
				return Static240.method3128(1000);
			}
			@Pc(79) int local79;
			@Pc(109) int local109;
			if (Static374.anInt6278 == 1) {
				if (Static175.aClass215_3.anInt5791 == 2) {
					return Static240.method3128(1001);
				}
				if (Static175.aClass215_3.anInt5791 != 1) {
					return -1;
				}
				Static48.aClass3_2 = new Class3((Socket) Static175.aClass215_3.anObject10, Static41.aClass124_2);
				Static175.aClass215_3 = null;
				local79 = 0;
				Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
				if (Static54.aBoolean78) {
					local79 = Static312.anInt5175;
				}
				Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_9.anInt1569);
				Static75.aClass1_Sub11_Sub1_1.method4450(local79);
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static218.method4377();
				local109 = Static48.aClass3_2.method57();
				Static218.method4377();
				if (local109 != 0) {
					return Static240.method3128(local109);
				}
				Static374.anInt6278 = 2;
			}
			if (Static374.anInt6278 == 2) {
				if (Static48.aClass3_2.method61() < 2) {
					return -1;
				}
				Static105.anInt1837 = Static48.aClass3_2.method57();
				Static105.anInt1837 <<= 0x8;
				Static105.anInt1837 += Static48.aClass3_2.method57();
				Static336.aByteArray63 = new byte[Static105.anInt1837];
				Static109.anInt1928 = 0;
				Static374.anInt6278 = 3;
			}
			if (Static374.anInt6278 != 3) {
				return -1;
			}
			local79 = Static48.aClass3_2.method61();
			if (local79 < 1) {
				return -1;
			}
			if (Static105.anInt1837 - Static109.anInt1928 < local79) {
				local79 = Static105.anInt1837 - Static109.anInt1928;
			}
			Static48.aClass3_2.method59(Static336.aByteArray63, Static109.anInt1928, local79);
			Static109.anInt1928 += local79;
			if (Static109.anInt1928 < Static105.anInt1837) {
				return -1;
			} else if (Static377.method4841(Static336.aByteArray63)) {
				Static237.aClass114_Sub1Array3 = new Class114_Sub1[Static161.anInt1935];
				local109 = 0;
				for (@Pc(219) int local219 = Static435.anInt7231; local219 <= Static455.anInt7452; local219++) {
					@Pc(225) Class114_Sub1 local225 = Static19.method334(local219);
					if (local225 != null) {
						Static237.aClass114_Sub1Array3[local109++] = local225;
					}
				}
				Static108.anInt1921 = 0;
				Static317.aClass1_Sub10_2 = null;
				Static48.aClass3_2.method63();
				Static72.anInt1356 = 0;
				Static374.anInt6278 = 0;
				Static336.aByteArray63 = null;
				Static48.aClass3_2 = null;
				Static20.aLong21 = Static232.method3058();
				return 0;
			} else {
				return Static240.method3128(1002);
			}
		} catch (@Pc(257) IOException local257) {
			return Static240.method3128(1003);
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	public static void method1475() {
		if (Static54.anIntArray46 != null && Static366.anIntArray375 != null) {
			return;
		}
		Static54.anIntArray46 = new int[256];
		Static366.anIntArray375 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static54.anIntArray46[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static366.anIntArray375[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
