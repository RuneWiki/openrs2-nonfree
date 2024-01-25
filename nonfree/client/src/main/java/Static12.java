import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public static int anInt145 = -1;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_1 = new Class83(6, 0, 4, 2);

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "Lclient!kk;")
	public static Class7_Sub29 aClass7_Sub29_2 = null;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method103() {
		@Pc(1) Class126 local1 = Static281.aClass126_61;
		synchronized (Static281.aClass126_61) {
			Static281.aClass126_61.method2827();
		}
		local1 = Static36.aClass126_4;
		synchronized (Static36.aClass126_4) {
			Static36.aClass126_4.method2827();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
	public static void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg4; local11 <= arg0; local11++) {
			Static404.method5769(Static353.anIntArrayArray48[local11], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V")
	public static void method106(@OriginalArg(0) long arg0) {
		Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
		Static255.aClass7_Sub14_Sub1_2.method3970(Class22_Sub7.aClass188_8.anInt5048);
		Static255.aClass7_Sub14_Sub1_2.method3934(arg0);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static5.anInt20);
		Static364.anInt2000 = 0;
		Static179.anInt7441 = -3;
		Static196.anInt3465 = 1;
		Static419.anInt6675 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLclient!go;)Ljava/lang/String;")
	public static String method107(@OriginalArg(1) Class95 arg0) {
		if (Static52.method725(arg0).method1903() == 0) {
			return null;
		} else if (arg0.aString29 == null || arg0.aString29.trim().length() == 0) {
			return Static283.aBoolean297 ? "Hidden-use" : null;
		} else {
			return arg0.aString29;
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public static void method109() {
		Static310.aClass130_1.method5066();
		Static154.aClass50_1.method1862();
		if (Static98.aClass111_1 != null) {
			Static98.aClass111_1.method3571(Static95.aCanvas3);
		}
		Static129.aClient1.method708();
		Static95.aCanvas3.setBackground(Color.black);
		Static44.anInt726 = -1;
		Static310.aClass130_1 = Static410.method5163(Static95.aCanvas3);
		Static154.aClass50_1 = Static398.method5052(Static95.aCanvas3);
		if (Static98.aClass111_1 != null) {
			Static98.aClass111_1.method3574(Static95.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method111() {
		Static179.method5739(false);
		if (Static431.anInt7201 >= 0 && Static431.anInt7201 != 0) {
			Static90.method1613(Static431.anInt7201);
			Static431.anInt7201 = -1;
		}
	}
}
