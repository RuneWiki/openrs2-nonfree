import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_39 = new Class12(41, 3);

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_40 = new Class12(52, 8);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method1140(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - Static97.method1513(arg0.charAt(local12)));
		}
		return local10;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!oj;IIBIZI)V")
	public static void method1141(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static234.anInt4174 >= 50 || (arg0 == null || arg0.anIntArrayArray42 == null || arg0.anIntArrayArray42.length <= arg5 || arg0.anIntArrayArray42[arg5] == null)) {
			return;
		}
		@Pc(32) int local32 = arg0.anIntArrayArray42[arg5][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(51) int local51 = local32 & 0x1F;
		@Pc(70) int local70;
		if (arg0.anIntArrayArray42[arg5].length > 1) {
			local70 = (int) (Math.random() * (double) arg0.anIntArrayArray42[arg5].length);
			if (local70 > 0) {
				local36 = arg0.anIntArrayArray42[arg5][local70];
			}
		}
		if (local51 == 0) {
			if (arg4) {
				Static426.method5635(255, local42, 0, local36);
			}
		} else if (Static453.aClass136_Sub1_1.anInt4441 != 0) {
			local70 = arg2 - 64 >> 7;
			@Pc(115) int local115 = arg3 - 64 >> 7;
			Static249.aClass266Array1[Static234.anInt4174++] = new Class266((byte) 1, local36, local42, 0, 255, local51 + (arg1 << 24) + (local70 << 16) + (local115 << 8));
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void method1143(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub5_Sub11 local13 = Static188.method2688(arg0, 4);
		local13.method2667();
	}
}
