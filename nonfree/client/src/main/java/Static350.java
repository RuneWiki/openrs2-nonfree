import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_16 = new Class118(11);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
	public static final int[] anIntArray376 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;ZIILclient!dga;I)V")
	public static void method4845(@OriginalArg(0) Class145 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class46 local9 = Static591.aClass351_6.method8334(arg3.anInt1877);
		if (local9.anInt1011 == -1) {
			return;
		}
		if (arg3.aBoolean221) {
			@Pc(28) int local28 = arg1 + arg3.anInt1878;
			arg1 = local28 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(40) Class43 local40 = local9.method910(arg1, arg3.aBoolean213, arg0);
		if (local40 == null) {
			return;
		}
		@Pc(47) int local47 = arg3.anInt1902;
		@Pc(50) int local50 = arg3.anInt1881;
		if ((arg1 & 0x1) == 1) {
			local47 = arg3.anInt1881;
			local50 = arg3.anInt1902;
		}
		@Pc(71) int local71 = local40.method9587();
		@Pc(74) int local74 = local40.method9600();
		if (local9.aBoolean123) {
			local71 = local47 * 4;
			local74 = local50 * 4;
		}
		if (local9.anInt1008 == 0) {
			local40.method9589(arg4, arg2 + 4 - local50 * 4, local71, local74);
		} else {
			local40.method9584(arg4, arg2 + 4 - local50 * 4, local71, local74, 0, local9.anInt1008 | 0xFF000000, 1);
		}
	}
}
