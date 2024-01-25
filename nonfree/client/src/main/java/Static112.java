import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!ke;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
	public static final int[] anIntArray140 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZBLclient!ir;Lclient!ir;)V")
	public static void method1932(@OriginalArg(2) Class100 arg0, @OriginalArg(3) Class100 arg1) {
		Static74.aClass100_29 = arg0;
		Static111.aBoolean122 = true;
		Static181.aClass100_19 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fb;B)V")
	public static void method1933(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static4.aClass36_2 != null) {
			@Pc(25) int local25;
			try {
				Static4.aClass36_2.method833(0L);
				Static4.aClass36_2.method841(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method3662(24, local13);
	}
}
