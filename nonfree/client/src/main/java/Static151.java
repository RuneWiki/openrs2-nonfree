import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "I")
	public static int anInt2973 = 0;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!l", name = "K", descriptor = "[I")
	public static int[] anIntArray241 = new int[14];

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(II)Lclient!pb;")
	public static Class4_Sub2_Sub16 method2388(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub16 local12 = (Class4_Sub2_Sub16) Static107.aClass111_6.method2890((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static269.aClass22_95.method665(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class4_Sub2_Sub16();
		@Pc(41) Class4_Sub24 local41 = new Class4_Sub24(local22);
		local41.anInt3822 = local41.aByteArray47.length - 2;
		@Pc(52) int local52 = local41.method3085();
		@Pc(63) int local63 = local41.aByteArray47.length - local52 - 12 - 2;
		local41.anInt3822 = local63;
		@Pc(70) int local70 = local41.method3084();
		local12.anInt4042 = local41.method3085();
		local12.anInt4046 = local41.method3085();
		local12.anInt4044 = local41.method3085();
		local12.anInt4043 = local41.method3085();
		@Pc(94) int local94 = local41.method3110();
		@Pc(106) int local106;
		@Pc(117) int local117;
		if (local94 > 0) {
			local12.aClass163Array1 = new Class163[local94];
			for (local106 = 0; local106 < local94; local106++) {
				local117 = local41.method3085();
				@Pc(124) Class163 local124 = new Class163(Static308.method4715(local117));
				local12.aClass163Array1[local106] = local124;
				while (local117-- > 0) {
					@Pc(136) int local136 = local41.method3084();
					@Pc(140) int local140 = local41.method3084();
					local124.method4181((long) local136, new Class4_Sub25(local140));
				}
			}
		}
		local41.anInt3822 = 0;
		local12.aString140 = local41.method3075();
		local12.anIntArray337 = new int[local70];
		local12.anIntArray335 = new int[local70];
		local12.aStringArray27 = new String[local70];
		local106 = 0;
		while (local63 > local41.anInt3822) {
			local117 = local41.method3085();
			if (local117 == 3) {
				local12.aStringArray27[local106] = local41.method3111().intern();
			} else if (local117 >= 100 || local117 == 21 || local117 == 38 || local117 == 39) {
				local12.anIntArray337[local106] = local41.method3110();
			} else {
				local12.anIntArray337[local106] = local41.method3084();
			}
			local12.anIntArray335[local106++] = local117;
		}
		Static107.aClass111_6.method2886((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(II)I")
	public static int method2390(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	public static int method2391() {
		if (Static209.aClass100_3 == null) {
			return -1;
		}
		while (Static209.aClass100_3.anInt3236 > Static135.anInt2670) {
			if (Static209.aClass100_3.method2546(Static135.anInt2670)) {
				return Static135.anInt2670++;
			}
			Static135.anInt2670++;
		}
		return -1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!we;Ljava/lang/Object;B)V")
	public static void method2392(@OriginalArg(0) Class184 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 50 && arg0.anEventQueue1.peekEvent() != null; local13++) {
			Static193.method3169(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2395(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = Static22.method456(arg0);
		return local15 == -1 ? "" : Static64.method1170(" ", Static209.aClass100_3.aStringArray22[local15], "<br>");
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(II)Lclient!nl;")
	public static Class118 method2396(@OriginalArg(0) int arg0) {
		@Pc(6) Class118 local6 = (Class118) Static297.aClass172_44.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static64.aClass22_27.method665(1, arg0);
		local6 = new Class118();
		if (local22 != null) {
			local6.method2977(new Class4_Sub24(local22), arg0);
		}
		Static297.aClass172_44.method4345(local6, (long) arg0);
		return local6;
	}
}
