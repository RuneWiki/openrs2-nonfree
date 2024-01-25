import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	public static int anInt549;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	public static int anInt550;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
	public static int anInt552;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_2 = new Class284(2, 3);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method519(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static268.aClass56_4 != null) {
			@Pc(24) int local24;
			try {
				Static268.aClass56_4.method1123(0L);
				Static268.aClass56_4.method1122(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method5985(local12, 24);
	}
}
