import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "Lclient!lm;")
	public static Class134 aClass134_155;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_112 = new Class37(30);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public static void method5861() {
		@Pc(7) Class122[] local7 = Class1_Sub2_Sub7.aClass122Array3;
		synchronized (Class1_Sub2_Sub7.aClass122Array3) {
			for (@Pc(11) int local11 = 0; local11 < Class1_Sub2_Sub7.aClass122Array3.length; local11++) {
				Class1_Sub2_Sub7.aClass122Array3[local11] = new Class122();
				Static321.anIntArray644[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)V")
	public static void method5862() {
		Static48.aClass37_22.method919();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lclient!rj;")
	public static Class177 method5863(@OriginalArg(1) int arg0) {
		@Pc(5) Class37 local5 = Static129.aClass37_44;
		@Pc(23) Class177 local23;
		synchronized (Static129.aClass37_44) {
			local23 = (Class177) Static129.aClass37_44.method915((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(45) byte[] local45 = Static305.aClass134_134.method3009(Static229.method4152(arg0), Static9.method114(arg0));
		local23 = new Class177();
		local23.anInt5423 = arg0;
		if (local45 != null) {
			local23.method4741(new Class1_Sub21(local45));
		}
		local23.method4738();
		local5 = Static129.aClass37_44;
		synchronized (Static129.aClass37_44) {
			Static129.aClass37_44.method922((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)I")
	public static int method5864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static152.anIntArray303[arg1 & 0x3] : Static117.anIntArray194[arg1 & 0x3];
	}
}
