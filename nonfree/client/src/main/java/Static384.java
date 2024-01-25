import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	public static int anInt6820 = 1;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
	public static void method5550(@OriginalArg(0) int arg0) {
		Static535.anInt7160 = arg0;
		Static392.aClass207_44.method4392();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5555(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub9 local14 = Static123.method2194(Static469.aClass235_2, Static155.aClass208_34);
		local14.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0) + 1);
		local14.aClass1_Sub3_Sub1_1.method7920(arg0);
		local14.aClass1_Sub3_Sub1_1.method7933(arg1);
		Static42.method746(local14);
	}
}
