import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[Lclient!aga;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt8826;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7369(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(3, arg1);
		local8.method6098();
		local8.aString64 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public static void method7371() {
		Static347.anInt6255 = 0;
		Static375.aClass8_38.method220();
		Static375.aClass8_38.method212(Static376.aClass2_Sub5_2);
		Static347.anInt6255++;
	}
}
