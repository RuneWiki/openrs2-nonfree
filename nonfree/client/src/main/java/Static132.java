import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!rg;")
	public static Class310 aClass310_32;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!rg;")
	public static Class310 aClass310_33;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public static int anInt2080 = 0;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public static int anInt2081 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!pi;IBI)Lclient!hr;")
	public static Class161_Sub1_Sub1 method2014(@OriginalArg(0) int arg0, @OriginalArg(1) Class144_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean556 || Static670.method9288(85, arg3) && Static670.method9288(215 - 122, arg0)) {
			return new Class161_Sub1_Sub1(arg1, 3553, arg2, arg3, arg0);
		} else if (arg1.aBoolean575) {
			return new Class161_Sub1_Sub1(arg1, 34037, arg2, arg3, arg0);
		} else {
			return new Class161_Sub1_Sub1(arg1, arg2, arg3, arg0, Static255.method4294(arg3), Static255.method4294(arg0));
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method2016() {
		Static127.aClass144_17.xa(((float) Static181.aClass14_Sub26_9.aClass43_Sub22_1.method6272() * 0.1F + 0.7F) * 1.1523438F);
		Static127.aClass144_17.ZA(Static133.anInt2088, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static127.aClass144_17.L(Static234.anInt4559, -1, 0);
		Static127.aClass144_17.method6927(Static629.aClass47_4);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!g;")
	public static Class126 method2017() {
		return new Class126(1, false);
	}
}
