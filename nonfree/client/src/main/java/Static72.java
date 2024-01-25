import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_49 = new Class214(77, 12);

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "[Lclient!dh;")
	public static final Class1_Sub11[] aClass1_Sub11Array1 = new Class1_Sub11[2048];

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZLclient!id;IILclient!id;I)I")
	public static int method1138(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class114_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class114_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static264.method3380(arg4, arg2, arg1, arg3);
		if (local15 != 0) {
			return arg1 ? -local15 : local15;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(38) int local38 = Static264.method3380(arg4, arg2, arg0, arg5);
			return arg0 ? -local38 : local38;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIILclient!vg;)V")
	public static void method1140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class250 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray12 != null) {
			@Pc(13) Class1_Sub31 local13 = new Class1_Sub31();
			local13.aClass250_8 = arg2;
			local13.anObjectArray5 = arg2.anObjectArray12;
			Static267.method3402(local13);
		}
		Static234.anInt3782 = arg2.anInt6994;
		Static315.anInt5215 = arg2.anInt7038;
		Static360.aBoolean498 = true;
		Static258.anInt4103 = arg2.anInt6977;
		Static364.anInt6148 = arg2.anInt7030;
		Static161.anInt1936 = arg2.anInt6991;
		Static20.anInt436 = arg0;
		Static331.anInt5403 = arg1;
		Static94.method1357(arg2);
	}
}
