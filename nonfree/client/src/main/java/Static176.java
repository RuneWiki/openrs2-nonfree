import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Lclient!aa;")
	public static Class2 aClass2_9;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public static int anInt3649 = 0;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public static int anInt3652 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!rg;)Z")
	public static boolean method3460(@OriginalArg(1) Class177 arg0) {
		if (arg0.anInt5204 == 205) {
			Static235.anInt4612 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!eb;Z)V")
	public static void method3461(@OriginalArg(0) Class1_Sub7 arg0) {
		if (arg0.aByteArray58.length - arg0.anInt3368 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method3141();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray58.length - arg0.anInt3368 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method3115();
		if (local43 * 6 != arg0.aByteArray58.length - arg0.anInt3368) {
			return;
		}
		while (true) {
			@Pc(63) int local63;
			@Pc(67) int local67;
			do {
				do {
					do {
						if (arg0.anInt3368 >= arg0.aByteArray58.length) {
							return;
						}
						local63 = arg0.method3115();
						local67 = arg0.method3125();
					} while (local63 >= Static302.anIntArray607.length);
				} while (!Static162.aBooleanArray13[local63]);
			} while (Static205.method3812(local63).aChar1 == '1' && (local67 < -1 || local67 > 1));
			Static302.anIntArray607[local63] = local67;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V")
	public static void method3462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class26 local10 = new Class26(16);
		for (@Pc(15) Class1_Sub39 local15 = (Class1_Sub39) Static52.aClass26_4.method871(); local15 != null; local15 = (Class1_Sub39) Static52.aClass26_4.method878()) {
			local15.method5710();
			@Pc(26) int local26 = (int) (local15.aLong215 >> 28);
			@Pc(36) int local36 = (int) (local15.aLong215 >> 14 & 0x3FFFL) - arg0;
			@Pc(45) int local45 = (int) (local15.aLong215 & 0x3FFFL) - arg1;
			if (local45 >= 0 && local36 >= 0 && Static48.anInt1107 > local45 && Static337.anInt6402 > local36) {
				local10.method877((long) (local45 | local26 << 28 | local36 << 14), local15);
			}
		}
		Static52.aClass26_4 = local10;
	}
}
