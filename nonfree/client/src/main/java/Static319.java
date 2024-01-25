import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!lia", name = "mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "Lclient!sea;")
	public static final Class304 aClass304_4 = new Class304();

	@OriginalMember(owner = "client!lia", name = "fb", descriptor = "Lclient!us;")
	public static final Class344 aClass344_77 = new Class344(6, 3);

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)I")
	public static int method5424(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!lia", name = "j", descriptor = "(I)V")
	public static void method5425() {
		if (Static379.aClass228_6.aBoolean613) {
			Static6.anInt66 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = (aClass1 == null ? (aClass1 = Class2.a("java.lang.Runtime")) : aClass1).getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static6.anInt66 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BII)I")
	public static int method5426(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}
}
