import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!l;")
	public static Class11 aClass11_18;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!ns;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	public static void method4444(@OriginalArg(0) int arg0) {
		@Pc(12) Class7_Sub4_Sub14 local12 = Static54.method750(arg0, 9);
		local12.method4710();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIC)I")
	public static int method4445(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZ)I")
	public static int method4447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!oo;")
	public static Class181 method4448(@OriginalArg(0) int arg0) {
		@Pc(13) Class181[] local13 = Static222.method3120();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class181 local21 = local13[local15];
			if (local21.anInt4883 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method4450() {
		if (Static64.anInt1229 == 5) {
			Static64.anInt1229 = 6;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg4 + arg1 && arg1 < arg0 + arg2) {
			return arg3 < arg7 + arg5 && arg6 + arg3 > arg5;
		} else {
			return false;
		}
	}
}
