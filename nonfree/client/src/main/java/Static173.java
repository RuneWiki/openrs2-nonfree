import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "Lclient!hw;")
	public static Class151 aClass151_4;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_119 = new Class179(42, -2);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)Z")
	public static boolean method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(III)Z")
	public static boolean method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static394.method5591(arg1, arg0) | (arg0 & 0x800) != 0 || Static307.method4407(arg0, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!iv;")
	public static Class170 method2467(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class170_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!sha;)V")
	public static void method2468(@OriginalArg(1) Class321 arg0) {
		if (!Static291.aBoolean314) {
			return;
		}
		if (arg0.anObjectArray13 != null) {
			@Pc(18) Class321 local18 = Static640.method8748(Static663.anInt9822, Static672.anInt10372);
			if (local18 != null) {
				@Pc(24) Class6_Sub49 local24 = new Class6_Sub49();
				local24.aClass321_43 = local18;
				local24.aClass321_44 = arg0;
				local24.anObjectArray35 = arg0.anObjectArray13;
				Static295.method4226(local24);
			}
		}
		@Pc(41) Class6_Sub26 local41 = Static268.method3981(Static377.aClass15_2, Static62.aClass289_21);
		local41.aClass6_Sub23_Sub1_2.method8364(arg0.anInt9040);
		local41.aClass6_Sub23_Sub1_2.method8338(Static489.anInt8324);
		local41.aClass6_Sub23_Sub1_2.method8342(arg0.anInt9061);
		local41.aClass6_Sub23_Sub1_2.method8352(Static663.anInt9822);
		local41.aClass6_Sub23_Sub1_2.method8347(arg0.anInt9048);
		local41.aClass6_Sub23_Sub1_2.method8342(Static672.anInt10372);
		Static670.method9077(local41);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V")
	public static void method2469() {
		@Pc(19) Class6_Sub26 local19 = Static268.method3981(Static377.aClass15_2, Static224.aClass289_56);
		Static670.method9077(local19);
		for (@Pc(27) Class6_Sub51 local27 = (Class6_Sub51) Static262.aClass209_35.method5037(); local27 != null; local27 = (Class6_Sub51) Static262.aClass209_35.method5036()) {
			if (!local27.method9176()) {
				local27 = (Class6_Sub51) Static262.aClass209_35.method5037();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt9358 == 0) {
				Static199.method2913(true, true, local27);
			}
		}
		if (Static590.aClass321_53 != null) {
			Static293.method4206(Static590.aClass321_53);
			Static590.aClass321_53 = null;
		}
	}
}
