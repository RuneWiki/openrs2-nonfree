import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	public static final int[] anIntArray582 = new int[1000];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BZ)V")
	public static void method6486(@OriginalArg(1) boolean arg0) {
		Static482.method6632();
		if (!Static230.method4063(Static557.anInt9206)) {
			return;
		}
		Static133.anInt2978++;
		if (Static133.anInt2978 < 50 && !arg0) {
			return;
		}
		Static133.anInt2978 = 0;
		if (!Static283.aBoolean380 && Static563.aClass127_2 != null) {
			@Pc(45) Class6_Sub31 local45 = Static114.method2007(Static596.aClass47_155, Static337.aClass324_1);
			Static534.method7251(local45);
			try {
				Static278.method4563();
			} catch (@Pc(52) IOException local52) {
				Static283.aBoolean380 = true;
			}
		}
		Static482.method6632();
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
	public static void method6492() {
		for (@Pc(14) Class6_Sub41 local14 = (Class6_Sub41) Static413.aClass361_53.method7838(); local14 != null; local14 = (Class6_Sub41) Static413.aClass361_53.method7845()) {
			if (local14.anInt8203 > 0) {
				local14.anInt8203--;
			}
			if (local14.anInt8203 != 0) {
				if (local14.anInt8211 > 0) {
					local14.anInt8211--;
				}
				if (local14.anInt8211 == 0 && local14.anInt8201 >= 1 && local14.anInt8205 >= 1 && local14.anInt8201 <= Static473.anInt8075 - 2 && Static165.anInt6749 - 2 >= local14.anInt8205 && (local14.anInt8199 < 0 || Static253.method4295(local14.anInt8207, local14.anInt8199))) {
					Static552.method7484(local14.anInt8201, local14.anInt8207, local14.anInt8205, local14.anInt8199, local14.anInt8210, -1, local14.anInt8202, local14.anInt8200);
					local14.anInt8211 = -1;
					if (local14.anInt8199 == local14.anInt8208 && local14.anInt8208 == -1) {
						local14.method7804();
					} else if (local14.anInt8199 == local14.anInt8208 && local14.anInt8204 == local14.anInt8200 && local14.anInt8207 == local14.anInt8213) {
						local14.method7804();
					}
				}
			} else if (local14.anInt8208 < 0 || Static253.method4295(local14.anInt8213, local14.anInt8208)) {
				Static552.method7484(local14.anInt8201, local14.anInt8213, local14.anInt8205, local14.anInt8208, local14.anInt8210, -1, local14.anInt8202, local14.anInt8204);
				local14.method7804();
			}
		}
	}
}
