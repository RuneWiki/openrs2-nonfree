import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "Lclient!av;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_51 = new Class55("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	public static int anInt2229 = -50;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Z")
	public static boolean method1888(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class7_Sub39 local15 = (Class7_Sub39) Static237.aClass85_26.method2010(); local15 != null; local15 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			if (Static300.method4007(local15.anInt5893) && (long) arg0 == local15.aLong186) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)Z")
	public static boolean method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public static void method1890(@OriginalArg(1) int arg0) {
		if (!Static130.aClass153_Sub1_1.aBoolean353) {
			arg0 = -1;
		}
		if (Static44.anInt726 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class39 local24 = Static23.aClass29_1.method516(arg0);
			@Pc(28) Class246 local28 = local24.method609();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static230.aClass61_4.method1451(local28.method5138(), new Point(local24.anInt742, local24.anInt743), local28.method5140(), Static95.aCanvas3, local28.method5149());
				Static44.anInt726 = arg0;
			}
		}
		if (arg0 == -1 && Static44.anInt726 != -1) {
			Static230.aClass61_4.method1451(null, new Point(), -1, Static95.aCanvas3, -1);
			Static44.anInt726 = -1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZII)V")
	public static void method1891(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static252.method3355(arg2)) {
			Static147.method2250(arg1, Static294.aClass95ArrayArray3[arg2], arg3, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZ)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = Static130.aClass153_Sub1_1.anInt5240 * arg0 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static96.method1689(arg2, Static236.aClass178_67, local6);
			Static226.aBoolean244 = true;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z[I[J)V")
	public static void method1894(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static411.method5166(arg1, arg1.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;IZZ)I")
	public static int method1895(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(85) int local85;
			if (local43 >= '0' && local43 <= '9') {
				local85 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local85 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local85 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local85 >= arg1) {
				throw new NumberFormatException();
			}
			if (local28) {
				local85 = -local85;
			}
			@Pc(121) int local121 = local85 + local32 * arg1;
			if (local121 / arg1 != local32) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local121;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
