import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Z")
	public static boolean aBoolean650 = false;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "J")
	public static long aLong180 = -1L;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_45 = new Class112(20);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kha;ZLclient!d;)V")
	public static void method6378(@OriginalArg(0) Class181 arg0, @OriginalArg(2) Interface5 arg1) {
		Static527.aClass181_110 = arg0;
		Static283.anInterface5_9 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6380(@OriginalArg(0) String arg0) {
		Static97.method2492("", "", 0, "", 0, arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method6381(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub21 local10 = Static57.method8561(arg0, 1);
		local10.method8628();
	}
}
