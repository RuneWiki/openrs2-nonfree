import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[Lclient!ffa;")
	public static Class107[] aClass107Array1;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!kca;")
	public static final Class182 aClass182_3 = new Class182(2);

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt2567 = 999999;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method2411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class3_Sub40 local7 = null;
		for (@Pc(14) Class3_Sub40 local14 = (Class3_Sub40) Static229.aClass223_18.method5874(); local14 != null; local14 = (Class3_Sub40) Static229.aClass223_18.method5870()) {
			if (local14.anInt7263 == arg3 && local14.anInt7269 == arg0 && arg6 == local14.anInt7265 && local14.anInt7270 == arg5) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub40();
			local7.anInt7263 = arg3;
			local7.anInt7265 = arg6;
			local7.anInt7270 = arg5;
			local7.anInt7269 = arg0;
			if (arg0 >= 0 && arg6 >= 0 && Static634.anInt10129 > arg0 && Static638.anInt10172 > arg6) {
				Static331.method5404(local7);
			}
			Static229.aClass223_18.method5868(local7);
		}
		local7.anInt7272 = -1;
		local7.anInt7264 = arg1;
		local7.anInt7266 = arg4;
		local7.anInt7273 = arg2;
		local7.anInt7262 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
	public static boolean method2413() {
		return Static522.method7730("jaclib") ? Static522.method7730("hw3d") : false;
	}
}
