import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public static int anInt1339;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public static int anInt1341 = 0;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public static int anInt1346 = -1;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!rp;Z)V")
	public static void method1156(@OriginalArg(0) Class3_Sub5 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static16.aClass246_1 != null) {
			@Pc(20) int local20;
			try {
				Static16.aClass246_1.method5681(0L);
				Static16.aClass246_1.method5685(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method2742(local8, 24);
	}
}
