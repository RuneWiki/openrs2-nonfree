import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!rg;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public static int anInt3278;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	public static int anInt3283;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_7 = new Class46(5);

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_969 = Static81.method1507("Malformed login packet)3");

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Lclient!dj;")
	public static Class24 aClass24_970 = aClass24_969;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	public static int anInt3282 = -1;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "[J")
	public static final long[] aLongArray29 = new long[100];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZBLclient!ve;ILclient!ve;)Lclient!wh;")
	public static Class1_Sub2_Sub25 method2534(@OriginalArg(2) Class69 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class69 arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(15) int[] local15 = arg2.method2225(arg1);
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(26) byte[] local26 = arg2.method2204(local15[local17], arg1);
			if (local26 == null) {
				local10 = false;
			} else {
				@Pc(45) int local45 = (local26[0] & 0xFF) << 8 | local26[1] & 0xFF;
				@Pc(60) byte[] local60 = arg0.method2204(0, local45);
				if (local60 == null) {
					local10 = false;
				}
			}
		}
		if (!local10) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub25(arg2, arg0, arg1, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public static void method2536() {
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) Static185.aClass87_28.method2827(); local8 != null; local8 = (Class1_Sub15) Static185.aClass87_28.method2830()) {
			if (local8.anInt2643 == -1) {
				local8.anInt2648 = 0;
				Static57.method1097(local8);
			} else {
				local8.method3563();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
	public static void method2537() {
		if (Static48.anInt1203 > 0) {
			Static34.method663();
		} else {
			Static57.method1099(40);
			Static26.aClass53_1 = Static91.aClass53_2;
			Static91.aClass53_2 = null;
		}
	}
}
