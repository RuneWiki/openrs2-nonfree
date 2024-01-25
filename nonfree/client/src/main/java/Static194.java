import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	public static int anInt3816;

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "Lclient!tq;")
	public static Class191 aClass191_124;

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lclient!gq;")
	public static Class2_Sub11_Sub6 aClass2_Sub11_Sub6_3;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "[I")
	public static final int[] anIntArray303 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static43.method1051(arg1, arg3, arg0, 0, arg2, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)C")
	public static char method3503(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static47.aCharArray3[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)Lclient!gf;")
	public static Class2_Sub11_Sub5 method3506(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub11_Sub5 local10 = (Class2_Sub11_Sub5) Static75.aClass179_3.method5092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static152.aClass191_97.method5459(Static228.method1032(arg0), Static121.method2513(arg0));
		local10 = new Class2_Sub11_Sub5();
		if (local24 != null) {
			local10.method2275(new Class2_Sub10(local24));
		}
		Static75.aClass179_3.method5085(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Lclient!ci;")
	public static Class32 method3507(@OriginalArg(0) int arg0) {
		@Pc(10) Class32 local10 = (Class32) Static97.aClass119_209.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static320.aClass191_198.method5459(1, arg0);
		local10 = new Class32();
		local10.anInt787 = arg0;
		if (local20 != null) {
			local10.method940(new Class2_Sub10(local20));
		}
		local10.method937();
		if (local10.anInt782 == 2 && Static219.aClass199_22.method5751((long) arg0) == null) {
			Static219.aClass199_22.method5749(new Class2_Sub42(Static29.anInt549), (long) arg0);
			Static287.aClass32Array1[Static29.anInt549++] = local10;
		}
		Static97.aClass119_209.method3308(local10, (long) arg0);
		return local10;
	}
}
