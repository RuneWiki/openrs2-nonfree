import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!o", name = "s", descriptor = "Lclient!ph;")
	public static Class138 aClass138_50;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	public static int anInt3920;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt3909 = 0;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
	public static int[] anIntArray319 = new int[100];

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public static int anInt3924 = 0;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	public static int anInt3925 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[B")
	public static byte[] method3129(@OriginalArg(1) int arg0) {
		@Pc(21) Class1_Sub1_Sub17 local21 = (Class1_Sub1_Sub17) Static111.aClass58_11.method1233((long) arg0);
		if (local21 == null) {
			@Pc(27) byte[] local27 = new byte[512];
			@Pc(33) Random local33 = new Random((long) arg0);
			@Pc(35) int local35;
			for (local35 = 0; local35 < 255; local35++) {
				local27[local35] = (byte) local35;
			}
			for (local35 = 0; local35 < 255; local35++) {
				@Pc(58) int local58 = 255 - local35;
				@Pc(63) int local63 = Static165.method2794(local33, local58);
				@Pc(67) byte local67 = local27[local63];
				local27[local63] = local27[local58];
				local27[local58] = local27[511 - local35] = local67;
			}
			local21 = new Class1_Sub1_Sub17(local27);
			Static111.aClass58_11.method1229((long) arg0, local21);
		}
		return local21.aByteArray40;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(IBII)Lclient!mn;")
	public static Class1_Sub1_Sub14 method3134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg0 << 8;
		@Pc(18) Class1_Sub1_Sub14 local18 = (Class1_Sub1_Sub14) Static313.aClass58_15.method1233((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static209.aClass138_57.method3339(Static209.aClass138_57.method3345(local9));
		if (local30 == null) {
			local9 = arg1 + 65536 << 8 | arg2;
			local18 = (Class1_Sub1_Sub14) Static313.aClass58_15.method1233((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static209.aClass138_57.method3339(Static209.aClass138_57.method3345(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class1_Sub1_Sub14) Static313.aClass58_15.method1233((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static209.aClass138_57.method3339(Static209.aClass138_57.method3345(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static145.method2304(local30);
					local18.anInt3625 = arg2;
					Static313.aClass58_15.method1229((long) local9 << 16, local18);
					return local18;
				}
			} else if (local30.length > 1) {
				local18 = Static145.method2304(local30);
				local18.anInt3625 = arg2;
				Static313.aClass58_15.method1229((long) local9 << 16, local18);
				return local18;
			} else {
				return null;
			}
		} else if (local30.length > 1) {
			local18 = Static145.method2304(local30);
			local18.anInt3625 = arg2;
			Static313.aClass58_15.method1229((long) local9 << 16, local18);
			return local18;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)V")
	public static void method3136(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static282.aBooleanArray59[arg0]) {
			return;
		}
		Static62.aClass138_15.method3343(arg0);
		if (Static313.aClass146ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(37) boolean local37 = true;
		for (@Pc(39) int local39 = 0; local39 < Static313.aClass146ArrayArray1[arg0].length; local39++) {
			if (Static313.aClass146ArrayArray1[arg0][local39] != null) {
				if (Static313.aClass146ArrayArray1[arg0][local39].anInt4370 == 2) {
					local37 = false;
				} else {
					Static313.aClass146ArrayArray1[arg0][local39] = null;
				}
			}
		}
		if (local37) {
			Static313.aClass146ArrayArray1[arg0] = null;
		}
		Static282.aBooleanArray59[arg0] = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)I")
	public static int method3137(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method3138(@OriginalArg(1) int arg0) {
		Static96.method1397(Static96.anInt1802, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static96.method1392(-50.0F, -60.0F, -50.0F);
		Static96.method1388(Static96.anInt1801, 0, false);
		Static96.method1390();
	}
}
