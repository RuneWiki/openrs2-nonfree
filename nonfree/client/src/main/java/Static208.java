import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
	public static int anInt4453 = 0;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1181 = Static231.method3737("null");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	public static void method3304() {
		Static189.anInt4167 = 0;
		Static8.anInt258 = 0;
		Static39.method744();
		Static32.method601();
		Static46.method907();
		@Pc(30) int local30;
		for (@Pc(19) int local19 = 0; local19 < Static8.anInt258; local19++) {
			local30 = Static179.anIntArray340[local19];
			if (Static33.aClass5_Sub5_Sub2Array1[local30].anInt3009 != Static128.anInt2802) {
				if (Static33.aClass5_Sub5_Sub2Array1[local30].aClass30_1.method868()) {
					Static190.method3100(Static33.aClass5_Sub5_Sub2Array1[local30]);
				}
				Static33.aClass5_Sub5_Sub2Array1[local30].aClass30_1 = null;
				Static33.aClass5_Sub5_Sub2Array1[local30] = null;
			}
		}
		if (Static194.aClass1_Sub26_Sub1_3.anInt4021 != Static24.anInt450) {
			throw new RuntimeException("gnp1 pos:" + Static194.aClass1_Sub26_Sub1_3.anInt4021 + " psize:" + Static24.anInt450);
		}
		for (local30 = 0; local30 < Static189.anInt4168; local30++) {
			if (Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static189.anInt4168);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Lclient!p;")
	public static Class1_Sub2_Sub14 method3305(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = (Class1_Sub2_Sub14) Static206.aClass8_8.method312((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static113.aClass28_44.method819(arg0, 11);
		local10 = new Class1_Sub2_Sub14();
		if (local20 != null) {
			local10.method2599(new Class1_Sub26(local20));
		}
		Static206.aClass8_8.method304(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	public static void method3306(@OriginalArg(0) int arg0) {
		Static123.aClass120_15.method3567(new Class1_Sub5(arg0));
	}
}
