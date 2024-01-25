import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!of", name = "I", descriptor = "I")
	public static int anInt5044;

	@OriginalMember(owner = "client!of", name = "S", descriptor = "Lclient!ph;")
	public static Class187 aClass187_89;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "I")
	public static final int anInt5048 = 1401;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "Lclient!s;")
	public static final Class217 aClass217_113 = new Class217(44, -1);

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	public static void method4072() {
		@Pc(10) Class10_Sub16 local10 = (Class10_Sub16) Static173.aClass163_29.method3620();
		@Pc(18) boolean local18 = Static458.aClass89_14 != null || Static443.anInt7416 > 0;
		if (local18) {
			Static81.anInt1731 = 1;
		}
		if (Static106.aBoolean134 && Static197.aClass245_1.method5907(81) && Static207.anInt4055 > 2) {
			if (local18) {
				Static60.aClass10_Sub45_3 = (Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264.aClass10_264;
			} else {
				Static437.method5688((Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264.aClass10_264, local10.method1921(), local10.method1923());
			}
		} else if (local18) {
			Static60.aClass10_Sub45_3 = (Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264;
		} else {
			Static437.method5688((Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264, local10.method1921(), local10.method1923());
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZI)I")
	public static int method4073(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
