import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!vba;")
	public static final Class386 aClass386_27 = new Class386(true);

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_7 = new Class390(4, 1);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3508(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			if (arg1 > -82) {
				return null;
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(69) long local69 = arg0;
				arg0 /= 37L;
				local65.append(Static672.aCharArray11[(int) (local69 - arg0 * 37L)]);
			}
			return local65.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
	public static void method3510() {
		Static13.method500();
		@Pc(12) int local12 = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499();
		if (local12 == 2) {
			Static423.method5617(Static681.anInt10652, Static153.aClass22_4, Static76.anInt1720);
		} else if (local12 == 3) {
			Static439.method5849(Static76.anInt1720, Static153.aClass22_4, Static681.anInt10652, Static8.anInt234, Static324.anInt5245);
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4500()) {
			Static308.method4569(Static508.aCanvas8);
		}
		if (Static153.aClass22_4 != null) {
			Static648.method8530();
		}
		Static444.aBoolean451 = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499() != 0;
		Static347.aBoolean360 = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4500();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)Lclient!id;")
	public static Class3_Sub29 method3511() {
		@Pc(6) Class3_Sub29 local6 = Static426.method5676();
		local6.anInt4152 = 0;
		local6.aClass144_44 = null;
		local6.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(5000);
		return local6;
	}
}
