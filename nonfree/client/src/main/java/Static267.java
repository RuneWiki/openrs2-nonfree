import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!bi;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 4)
	public static void method5024(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(2, arg0);
		local8.method2314();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 39)
	public static void method5026() {
		Class150.anInt3781 = 0;
		@Pc(17) int local17 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7) + Static154.anInt3136;
		@Pc(24) int local24 = Static139.anInt2716 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Class150.anInt3781 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Class150.anInt3781 = 1;
		}
		if (Class150.anInt3781 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Class150.anInt3781 = 0;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 72)
	public static void method5027() {
		Static85.method1962(Class11_Sub1_Sub1.aClass145_18);
		Class14.aClass2_Sub4_Sub2_4.method4843(0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!bt;)Lclient!gr;", line = 86)
	public static Class86 method5028(@OriginalArg(1) Class2_Sub4 arg0) {
		@Pc(15) Class86 local15 = new Class86();
		local15.anInt2374 = arg0.method4830();
		local15.aClass2_Sub2_Sub16_1 = Static137.method2701(local15.anInt2374);
		return local15;
	}
}
