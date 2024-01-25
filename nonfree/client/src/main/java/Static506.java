import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_8 = new Class146(2, 2);

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_9 = new Class146(7, 2);

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	public static int anInt8740 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!td;Lclient!aa;IIILclient!qk;I)V")
	public static void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class279 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static305.anInt5422 == 4) {
			local18 = (int) Static401.aFloat165 & 0x3FFF;
		} else {
			local18 = (int) Static401.aFloat165 + Static226.anInt1879 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg6.anInt8153 / 2, arg6.anInt8141 / 2) + 10;
		@Pc(48) int local48 = arg3 * arg3 + arg4 * arg4;
		if (local48 > local39 * local39) {
			return;
		}
		@Pc(58) int local58 = Class21.anIntArray656[local18];
		@Pc(62) int local62 = Class21.anIntArray655[local18];
		if (Static305.anInt5422 != 4) {
			local62 = local62 * 256 / (Static517.anInt8961 + 256);
			local58 = local58 * 256 / (Static517.anInt8961 + 256);
		}
		@Pc(93) int local93 = local62 * arg3 + arg4 * local58 >> 14;
		@Pc(104) int local104 = arg4 * local62 - arg3 * local58 >> 14;
		arg1.method8574(arg0 + arg6.anInt8153 / 2 + local93 - arg1.method8576() / 2, arg6.anInt8141 / 2 + arg5 - local104 + -(arg1.method8573() / 2), arg2, arg0, arg5);
	}
}
