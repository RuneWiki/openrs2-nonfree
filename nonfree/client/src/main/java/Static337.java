import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "Lclient!kea;")
	public static Class161 aClass161_70;

	@OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
	public static int anInt6396 = -1;

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_111 = new Class133(6, 5);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!kea;B)V")
	public static void method5392(@OriginalArg(0) Class161 arg0) {
		Static464.anInt8336 = arg0.method4240("titlebg");
		Static146.anInt2947 = arg0.method4240("logo");
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class4_Sub2 local7 = new Class4_Sub2();
		local7.anInt3711 = arg3;
		local7.aString32 = arg2;
		local7.anInt3709 = arg5;
		local7.anInt3708 = arg0 + Static223.anInt4829;
		local7.anInt3713 = arg6;
		local7.anInt3707 = arg1;
		local7.anInt3710 = arg4;
		Static226.aClass90_10.method2322(local7);
	}
}
