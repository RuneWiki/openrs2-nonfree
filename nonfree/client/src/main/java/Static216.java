import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
	public static int anInt4416;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "Lclient!ir;")
	public static Class100 aClass100_87;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_39 = new Class198(64);

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_40 = new Class198(50);

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "[I")
	public static final int[] anIntArray358 = new int[4];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public static void method3747() {
		if (Static267.aBoolean336) {
			return;
		}
		if (Static165.aBoolean173) {
			Static46.aFloat2 = (int) Static46.aFloat2 + 47 & 0xFFFFFFF0;
		} else {
			Static352.aFloat78 += (12.0F - Static352.aFloat78) / 2.0F;
		}
		Static105.aBoolean110 = true;
		Static267.aBoolean336 = true;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lclient!a;")
	public static Class1 method3748(@OriginalArg(1) int arg0) {
		@Pc(10) Class1 local10 = (Class1) Static290.aClass198_53.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static69.aClass100_24.method2319(4, arg0);
		local10 = new Class1();
		if (local25 != null) {
			local10.method7(arg0, new Class3_Sub4(local25));
		}
		local10.method5(arg0);
		Static290.aClass198_53.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public static void method3750() {
		if (Static59.anInt1274 != 3) {
			Static287.anInt5784 = -1;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIII)I")
	public static int method3751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}
}
