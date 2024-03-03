import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Lclient!ml;BZZ)V", line = 5)
	public static void method4766(@OriginalArg(0) String arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static217.method4096(arg1, 3, arg0);
			return;
		}
		@Pc(32) String local32;
		if (Static200.aString30.startsWith("win") && Class152.anInt3791 != 3) {
			local32 = null;
			if (arg1.anApplet1 != null) {
				local32 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local32 == null || !local32.equals("1")) {
				@Pc(52) Class32 local52 = Static217.method4096(arg1, 0, arg0);
				Static237.aString39 = arg0;
				Static18.aClass32_2 = local52;
				Static17.aClass152_4 = arg1;
				return;
			}
		}
		if (Static200.aString30.startsWith("mac")) {
			local32 = null;
			if (arg1.anApplet1 != null) {
				local32 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local32 != null && local32.equals("1") && arg2) {
				Static217.method4096(arg1, 1, arg0);
				return;
			}
		}
		Static217.method4096(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZZ)V", line = 81)
	public static void method4767(@OriginalArg(1) boolean arg0) {
		Class119_Sub1.anInt3334++;
		Static131.method2624();
		if (arg0) {
			Class11_Sub2.anInt3705++;
			Static104.method2278();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)I", line = 112)
	public static int method4768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static334.aByteArrayArrayArray16[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static334.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
