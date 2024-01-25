import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_32 = new Class362(45, 0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
	public static void method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg2, 10);
		local8.method7133();
		local8.anInt8738 = arg0;
		local8.anInt8739 = arg3;
		local8.anInt8736 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!r;)V")
	public static void method990(@OriginalArg(1) Class44 arg0) {
		if (Static49.aBoolean36) {
			Static313.method4151(arg0);
		} else {
			Static115.method2464(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public static int method992(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}
}
