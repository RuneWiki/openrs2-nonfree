import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	public static int anInt8299;

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Lclient!wq;")
	public static final Class381 aClass381_11 = new Class381();

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
	public static int anInt8297 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I[BZ)V")
	public static void method7155(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static233.aClass6_Sub40_4 == null) {
			Static233.aClass6_Sub40_4 = new Class6_Sub40(20000);
		}
		Static233.aClass6_Sub40_4.method8562(0, arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static184.method3350(Static233.aClass6_Sub40_4.aByteArray113);
		Static187.aClass51_Sub1Array1 = new Class51_Sub1[Static270.anInt5361];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = Static550.anInt9388; local42 <= Static320.anInt6122; local42++) {
			@Pc(48) Class51_Sub1 local48 = Static499.method7445(local42);
			if (local48 != null) {
				Static187.aClass51_Sub1Array1[local40++] = local48;
			}
		}
		Static396.aBoolean501 = false;
		Static257.aLong128 = Static32.method595();
		Static233.aClass6_Sub40_4 = null;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!rg;IB)V")
	public static void method7157(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(1) int arg1) {
		if (Static406.aClass73_4 == null) {
			return;
		}
		try {
			Static406.aClass73_4.method1970(0L);
			Static406.aClass73_4.method1963(24, arg1, arg0.aByteArray113);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
