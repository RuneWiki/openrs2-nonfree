import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	public static int anInt4163;

	@OriginalMember(owner = "client!is", name = "L", descriptor = "I")
	public static int anInt4164;

	@OriginalMember(owner = "client!is", name = "R", descriptor = "[Lclient!hca;")
	public static final Class134[] aClass134Array1 = new Class134[35];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Z")
	public static boolean method3711(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(IBI)V")
	public static void method3712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg1, 5);
		local8.method7133();
		local8.anInt8736 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZLclient!jn;IBIII)V")
	public static void method3714(@OriginalArg(1) Class176 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static472.anInt8704 = 2;
		Static480.anInt10083 = arg1;
		Static451.aClass176_108 = arg0;
		Static544.anInt9651 = 0;
		Static450.aBoolean599 = false;
		Static280.aClass4_Sub7_Sub3_2 = null;
		Static353.anInt6872 = arg2;
		Static342.anInt6643 = 1;
	}
}
