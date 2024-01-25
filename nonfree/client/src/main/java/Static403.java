import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
	public static int anInt6941;

	@OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
	public static int anInt6955;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!ee;)V")
	public static void method6186(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static423.aClass64_4 != null) {
			@Pc(26) int local26;
			try {
				Static423.aClass64_4.method1309(0L);
				Static423.aClass64_4.method1313(local14);
				for (local26 = 0; local26 < 24 && local14[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(53) Exception local53) {
				for (local26 = 0; local26 < 24; local26++) {
					local14[local26] = -1;
				}
			}
		}
		arg0.method8651(0, local14, 24);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z")
	public static boolean method6190(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
