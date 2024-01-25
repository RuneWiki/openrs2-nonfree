import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt3462;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!lg;")
	public static Class60 aClass60_18;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ph;")
	public static Class154 aClass154_56 = new Class154(128);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public static void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) Class17_Sub8 local12 = new Class17_Sub8();
		local12.anInt5730 = arg0 + Static342.anInt6706;
		local12.anInt5729 = arg4;
		local12.aString210 = arg2;
		local12.anInt5737 = arg5;
		local12.anInt5732 = arg3;
		local12.anInt5731 = arg1;
		Static71.aClass204_2.method5365(local12);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)Lclient!gs;")
	public static Class4_Sub1_Sub8 method2994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub1_Sub8 local15 = (Class4_Sub1_Sub8) Static121.aClass198_18.method5261((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class4_Sub1_Sub8(arg1, arg0);
			Static121.aClass198_18.method5267(local15.aLong259, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method2995() {
		Static169.method3178(false);
		if (Static16.anInt353 >= 0 && Static16.anInt353 != 0) {
			Static306.method5196(Static16.anInt353);
			Static16.anInt353 = -1;
		}
	}
}
