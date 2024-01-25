import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lha", name = "i", descriptor = "[Lclient!qp;")
	public static Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZLclient!sba;)V")
	public static void method5326(@OriginalArg(1) Class302 arg0) {
		if (!Static141.aBoolean262) {
			return;
		}
		if (arg0.anObjectArray10 != null) {
			@Pc(14) Class302 local14 = Static454.method6884(Static350.anInt6854, Static541.anInt9362);
			if (local14 != null) {
				@Pc(20) Class6_Sub29 local20 = new Class6_Sub29();
				local20.aClass302_6 = local14;
				local20.aClass302_7 = arg0;
				local20.anObjectArray1 = arg0.anObjectArray10;
				Static435.method6669(local20);
			}
		}
		@Pc(45) Class6_Sub17 local45 = Static330.method7824(Static90.aClass185_24, Static569.aClass134_2);
		local45.aClass6_Sub8_Sub1_2.method8202(arg0.anInt8867);
		local45.aClass6_Sub8_Sub1_2.method8241(Static541.anInt9362);
		local45.aClass6_Sub8_Sub1_2.method8212(arg0.anInt8899);
		local45.aClass6_Sub8_Sub1_2.method8241(arg0.anInt8898);
		local45.aClass6_Sub8_Sub1_2.method8202(Static350.anInt6854);
		local45.aClass6_Sub8_Sub1_2.method8255(Static641.anInt10722);
		Static452.method6867(local45);
	}
}
