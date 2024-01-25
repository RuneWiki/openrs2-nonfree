import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!in;")
	public static final Class169 aClass169_202 = new Class169(54, 3);

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_10 = new Class146(11, 0, 1, 2);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V")
	public static void method7506(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class15_Sub8 local7 = new Class15_Sub8();
		local7.anInt10063 = arg3;
		local7.anInt10061 = arg6;
		local7.anInt10067 = arg4;
		local7.anInt10064 = arg5;
		local7.anInt10068 = arg1;
		local7.aString118 = arg0;
		local7.anInt10062 = arg2 + Static62.anInt1184;
		Static183.aClass60_5.method1551(local7);
	}
}
