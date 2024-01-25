import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "Lclient!kh;")
	public static Class208 aClass208_4;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "Lclient!sh;")
	public static Class3_Sub48 aClass3_Sub48_1;

	@OriginalMember(owner = "client!ip", name = "I", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_12 = new Class201(7, 16);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class208 local8 = Static108.method2085(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray3 != null) {
			@Pc(18) Class3_Sub13 local18 = new Class3_Sub13();
			local18.aClass208_2 = local8;
			local18.anInt2325 = arg3;
			local18.aString27 = arg2;
			local18.anObjectArray1 = local8.anObjectArray3;
			Static543.method7498(local18);
		}
		if (Static520.anInt6836 != 10 || !Static82.method1754(local8).method38(arg3 - 1)) {
			return;
		}
		@Pc(69) Class3_Sub44 local69;
		if (arg3 == 1) {
			local69 = Static275.method5689(Static13.aClass376_3, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 2) {
			local69 = Static275.method5689(Static308.aClass376_77, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 3) {
			local69 = Static275.method5689(Static376.aClass376_93, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 4) {
			local69 = Static275.method5689(Static506.aClass376_119, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 5) {
			local69 = Static275.method5689(Static498.aClass376_118, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 6) {
			local69 = Static275.method5689(Static266.aClass376_61, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 7) {
			local69 = Static275.method5689(Static162.aClass376_42, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 8) {
			local69 = Static275.method5689(Static325.aClass376_83, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 9) {
			local69 = Static275.method5689(Static218.aClass376_54, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
		if (arg3 == 10) {
			local69 = Static275.method5689(Static285.aClass376_72, Static540.aClass282_4);
			Static673.method6557(arg0, local69, local8.anInt5645, arg1);
			Static616.method8089(local69);
		}
	}
}
