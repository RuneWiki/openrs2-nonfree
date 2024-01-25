import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qp", name = "J", descriptor = "Lclient!la;")
	public static Class46 aClass46_10;

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "Lclient!ga;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!qp", name = "S", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_78 = new Class215(67, 7);

	@OriginalMember(owner = "client!qp", name = "U", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_268 = new Class22(85, 6);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIILclient!uu;)V")
	public static void method4515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class247 arg2) {
		@Pc(8) Class145 local8 = arg2.method5312(Static122.aClass19_16);
		if (local8 == null) {
			return;
		}
		Static122.aClass19_16.OA(arg0, arg1, arg0 + arg2.anInt6833, arg2.anInt6805 + arg1);
		if (Static184.anInt3532 < 3) {
			Static163.aClass57_16.method5533((float) arg0 + (float) arg2.anInt6833 / 2.0F, (float) arg1 + (float) arg2.anInt6805 / 2.0F, ((int) -Static368.aFloat192 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static122.aClass19_16.ca(-16777216, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIILclient!fd;)Lclient!ps;")
	public static Class6_Sub1_Sub1 method4516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub2 arg4) {
		if (arg4.aBoolean213 || Static424.method5413(arg3) && Static424.method5413(arg1)) {
			return new Class6_Sub1_Sub1(arg4, 3553, arg2, arg0, arg3, arg1, true);
		} else if (arg4.aBoolean207) {
			return new Class6_Sub1_Sub1(arg4, 34037, arg2, arg0, arg3, arg1, true);
		} else {
			return new Class6_Sub1_Sub1(arg4, arg2, arg0, arg3, arg1, Static370.method4949(arg3), Static370.method4949(arg1), true);
		}
	}
}
