import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public static int anInt7606 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBILclient!kh;)V")
	public static void method6368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class208 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray20 != null) {
			@Pc(21) Class3_Sub13 local21 = new Class3_Sub13();
			local21.anObjectArray1 = arg2.anObjectArray20;
			local21.aClass208_2 = arg2;
			Static543.method7498(local21);
		}
		Static395.anInt6819 = arg2.anInt5653;
		Static452.anInt7746 = arg2.anInt5608;
		Static104.anInt2203 = arg0;
		Static158.anInt2968 = arg2.anInt5646;
		Static329.aBoolean166 = true;
		Static267.anInt5035 = arg2.anInt5640;
		Static7.anInt94 = arg1;
		Static169.anInt3050 = arg2.anInt5645;
		Static374.method5525(arg2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)Z")
	public static boolean method6369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
