import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method3646() {
		Static497.aClass42_9.E(Static173.anInt3935, Static208.aClass12_Sub10_Sub1_1.aBoolean174 ? Static372.anInt6881 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3647(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static391.aStringArray45.length; local7++) {
			if (Static391.aStringArray45[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)I")
	public static int method3648() {
		@Pc(5) Class42 local5 = Static243.aClass42_4;
		@Pc(7) boolean local7 = false;
		if (Static148.anInt6867 != 0) {
			@Pc(13) Canvas local13 = new Canvas();
			local13.setSize(100, 100);
			local7 = true;
			local5 = Static391.method5858(0, local13, 0, null, null);
		}
		@Pc(30) long local30 = Static76.method1679();
		for (@Pc(32) int local32 = 0; local32 < 10000; local32++) {
			local5.method5844();
		}
		@Pc(62) int local62 = (int) (Static76.method1679() - local30);
		local5.method5866(0, 100, 100, -16777216, 0);
		if (local7) {
			local5.method5807();
		}
		return local62;
	}
}
