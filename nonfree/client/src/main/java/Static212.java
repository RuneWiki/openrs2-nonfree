import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!haa", name = "D", descriptor = "I")
	public static int anInt3897;

	@OriginalMember(owner = "client!haa", name = "ib", descriptor = "Lclient!lv;")
	public static Class232 aClass232_2;

	@OriginalMember(owner = "client!haa", name = "sb", descriptor = "[S")
	public static short[] aShortArray85 = new short[256];

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)[Lclient!mb;")
	public static Class234[] method3357() {
		if (Static181.aClass234Array1 == null) {
			@Pc(16) Class234[] local16 = Static563.method7677(Static499.aClass231_4);
			@Pc(20) Class234[] local20 = new Class234[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static227.aClass3_Sub15_11.aClass17_Sub8_1.method3305();
			@Pc(82) int local82;
			@Pc(88) Class234 local88;
			label69: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class234 local35 = local16[local29];
				if ((local35.anInt6409 <= 0 || local35.anInt6409 >= 24) && local35.anInt6403 >= 800 && local35.anInt6402 >= 600 && (local27 != 2 || local35.anInt6403 <= 800 && local35.anInt6402 <= 600) && (local27 != 1 || local35.anInt6403 <= 1024 && local35.anInt6402 <= 768)) {
					for (local82 = 0; local82 < local22; local82++) {
						local88 = local20[local82];
						if (local35.anInt6403 == local88.anInt6403 && local35.anInt6402 == local88.anInt6402) {
							if (local88.anInt6409 < local35.anInt6409) {
								local20[local82] = local35;
							}
							continue label69;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static181.aClass234Array1 = new Class234[local22];
			Static689.method8053(local20, 0, Static181.aClass234Array1, 0, local22);
			@Pc(152) int[] local152 = new int[Static181.aClass234Array1.length];
			for (local82 = 0; local82 < Static181.aClass234Array1.length; local82++) {
				local88 = Static181.aClass234Array1[local82];
				local152[local82] = local88.anInt6403 * local88.anInt6402;
			}
			Static171.method2813(Static181.aClass234Array1, local152);
		}
		return Static181.aClass234Array1;
	}

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "(I)V")
	public static void method3371() {
		if (Static499.aClass231_4.aBoolean484) {
			Static595.anInt9375 = 96;
			return;
		}
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("maxMemory");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Long local30 = (Long) local20.invoke(local24, (Object[]) null);
					Static595.anInt9375 = (int) (local30 / 1048576L) + 1;
				} catch (@Pc(40) Throwable local40) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
