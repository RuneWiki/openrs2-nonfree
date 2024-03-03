import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[B")
	public static byte[] aByteArray27;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 4)
	public static void method2424() {
		if (Static142.anInt2769 < 0) {
			Class2_Sub10.anInt1761 = -1;
			Class163.anInt4321 = -1;
			Static142.anInt2769 = 0;
		}
		if (Static321.anInt6044 < Static142.anInt2769) {
			Class2_Sub10.anInt1761 = -1;
			Class163.anInt4321 = -1;
			Static142.anInt2769 = Static321.anInt6044;
		}
		if (Static89.anInt2001 < 0) {
			Class2_Sub10.anInt1761 = -1;
			Static89.anInt2001 = 0;
			Class163.anInt4321 = -1;
		}
		if (Static89.anInt2001 > Static321.anInt6040) {
			Class2_Sub10.anInt1761 = -1;
			Static89.anInt2001 = Static321.anInt6040;
			Class163.anInt4321 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nh;)V", line = 46)
	public static void method2425(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub19 local11 = (Class2_Sub19) Class160.aClass4_86.method90((long) arg0.anInt4610);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub12_Sub4_3 != null) {
			Static211.aClass2_Sub12_Sub2_2.method2083(local11.aClass2_Sub12_Sub4_3);
			local11.aClass2_Sub12_Sub4_3 = null;
		}
		local11.method6469();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z", line = 87)
	public static boolean method2427(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 46 || arg0 == 58 || arg0 == 6 || arg0 == 21) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLclient!r;I)Lclient!pr;", line = 106)
	public static Class185 method2428(@OriginalArg(2) Class197 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5090(0, arg1);
		return local9 == null ? null : new Class185(local9);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I", line = 122)
	public static int method2429(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
