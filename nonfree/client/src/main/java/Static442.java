import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
	public static final int[] anIntArray500 = new int[500];

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[50][];

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_101 = new Class218(80, -1);

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_15 = new Class104(9, 0, 4, 1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIZII)V")
	public static void method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg1 < 0 || Static394.anInt7540 - 1 <= arg3 || arg1 >= Static462.anInt8391 - 1) {
			return;
		}
		if (Static170.aClass106ArrayArrayArray1 == null) {
			return;
		}
		@Pc(44) Interface18 local44;
		if (arg2 == 0) {
			local44 = (Interface18) Static639.method8624(arg5, arg3, arg1);
			@Pc(50) Interface18 local50 = (Interface18) Static324.method5448(arg5, arg3, arg1);
			if (local44 != null && arg6 != 2) {
				if (local44 instanceof Class2_Sub3_Sub2_Sub2) {
					((Class2_Sub3_Sub2_Sub2) local44).aClass361_2.method8357(arg4);
				} else {
					Static567.method7984(arg0, arg6, arg1, arg3, arg4, arg2, arg5, local44.method8587());
				}
			}
			if (local50 != null) {
				if (local50 instanceof Class2_Sub3_Sub2_Sub2) {
					((Class2_Sub3_Sub2_Sub2) local50).aClass361_2.method8357(arg4);
					return;
				}
				Static567.method7984(arg0, arg6, arg1, arg3, arg4, arg2, arg5, local50.method8587());
				return;
			}
			return;
		}
		if (arg2 != 1) {
			if (arg2 == 2) {
				local44 = (Interface18) Static17.method258(arg5, arg3, arg1, op.class);
				if (local44 != null) {
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local44 instanceof Class2_Sub3_Sub1_Sub4) {
						((Class2_Sub3_Sub1_Sub4) local44).aClass361_3.method8357(arg4);
						return;
					}
					Static567.method7984(arg0, arg6, arg1, arg3, arg4, arg2, arg5, local44.method8587());
					return;
				}
			} else if (arg2 == 3) {
				local44 = (Interface18) Static439.method6676(arg5, arg3, arg1);
				if (local44 == null) {
					return;
				}
				if (!(local44 instanceof Class2_Sub3_Sub5_Sub1)) {
					Static567.method7984(arg0, arg6, arg1, arg3, arg4, arg2, arg5, local44.method8587());
					return;
				}
				((Class2_Sub3_Sub5_Sub1) local44).aClass361_4.method8357(arg4);
			} else {
				return;
			}
			return;
		}
		local44 = (Interface18) Static359.method7955(arg5, arg3, arg1);
		if (local44 == null) {
			return;
		}
		if (local44 instanceof Class2_Sub3_Sub3_Sub1) {
			((Class2_Sub3_Sub3_Sub1) local44).aClass361_1.method8357(arg4);
			return;
		}
		@Pc(213) int local213 = local44.method8587();
		if (arg6 == 4 || arg6 == 5) {
			Static567.method7984(arg0, 4, arg1, arg3, arg4, arg2, arg5, local213);
		} else if (arg6 == 6) {
			Static567.method7984(arg0 + 4, 4, arg1, arg3, arg4, arg2, arg5, local213);
			return;
		} else if (arg6 == 7) {
			Static567.method7984((arg0 + 2 & 0x3) + 4, 4, arg1, arg3, arg4, arg2, arg5, local213);
			return;
		} else if (arg6 == 8) {
			Static567.method7984(arg0 + 4, 4, arg1, arg3, arg4, arg2, arg5, local213);
			Static567.method7984((arg0 + 2 & 0x3) + 4, 4, arg1, arg3, arg4, arg2, arg5, local213);
			return;
		}
		return;
	}
}
