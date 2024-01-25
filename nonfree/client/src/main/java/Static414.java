import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
	public static int anInt7475;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	public static int anInt7473 = 999999;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	public static int anInt7474 = 0;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "[B")
	public static final byte[] aByteArray120 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!cd;ILclient!qa;Z)V")
	public static void method6103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class167 arg4) {
		@Pc(14) Class17 local14 = Static462.aClass182_4.method4369(arg2.anInt793);
		if (local14.anInt309 == -1) {
			return;
		}
		if (arg2.aBoolean45) {
			@Pc(32) int local32 = arg3 + arg2.anInt798;
			arg3 = local32 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(44) Class2 local44 = local14.method336(arg3, arg4, arg2.aBoolean53);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg2.anInt786;
		@Pc(53) int local53 = arg2.anInt784;
		if ((arg3 & 0x1) == 1) {
			local50 = arg2.anInt784;
			local53 = arg2.anInt786;
		}
		@Pc(67) int local67 = local44.d();
		@Pc(70) int local70 = local44.ga();
		if (local14.aBoolean18) {
			local67 = local50 * 4;
			local70 = local53 * 4;
		}
		if (local14.anInt314 == 0) {
			local44.method5835(arg1, arg0 - (local53 - 1) * 4, local67, local70);
		} else {
			local44.XA(arg1, arg0 - (local53 - 1) * 4, local67, local70, 0, local14.anInt314 | 0xFF000000, 1);
		}
	}
}
