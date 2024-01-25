import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_103 = new Class131(27, 3);

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public static void method3276(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class39_Sub1 local7 = new Class39_Sub1();
		local7.anInt863 = arg3;
		local7.anInt858 = arg5 + Static403.anInt6978;
		local7.aString5 = arg1;
		local7.anInt859 = arg6;
		local7.anInt862 = arg2;
		local7.anInt864 = arg0;
		local7.anInt861 = arg4;
		Static129.aClass188_2.method4538(local7);
	}
}
