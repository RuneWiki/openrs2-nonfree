import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public static int anInt5062 = 104;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
	public static boolean aBoolean370 = true;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString55 = "";

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([Lclient!aa;B)V")
	public static void method4181(@OriginalArg(0) Class2[] arg0) {
		Static34.anInt3344 = arg0.length;
		Static39.anIntArray31 = new int[Static34.anInt3344 + 10];
		Static306.aClass2Array15 = new Class2[Static34.anInt3344 + 10];
		Static466.method203(arg0, 0, Static306.aClass2Array15, 0, Static34.anInt3344);
		for (@Pc(26) int local26 = 0; local26 < Static34.anInt3344; local26++) {
			Static39.anIntArray31[local26] = Static306.aClass2Array15[local26].ga();
		}
		for (@Pc(50) int local50 = Static34.anInt3344; local50 < Static306.aClass2Array15.length; local50++) {
			Static39.anIntArray31[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!nq;I)V")
	public static void method4182(@OriginalArg(0) Class167_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static247.anObject10 == null) {
			@Pc(9) Class74_Sub1_Sub1 local9 = new Class74_Sub1_Sub1();
			local16 = local9.method5071();
			Static247.anObject10 = Static350.method4879(local16);
		}
		if (Static315.anObject8 == null) {
			@Pc(27) Class74_Sub2_Sub1 local27 = new Class74_Sub2_Sub1();
			local16 = local27.method5130();
			Static315.anObject8 = Static350.method4879(local16);
		}
		@Pc(42) Class205 local42 = arg0.aClass205_1;
		if (local42.method4878() && Static119.anObject2 == null) {
			local16 = Static431.method5862(0.6F, 4.0F, 0.5F, 4.0F, new Class6_Sub1(419684), 16.0F);
			Static119.anObject2 = Static350.method4879(local16);
		}
	}
}
