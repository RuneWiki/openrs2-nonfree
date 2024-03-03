import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "[Lclient!ac;")
	public static Class3_Sub1[] aClass3_Sub1Array1;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V", line = 920)
	public static void method5095() {
		Static61.anIntArray110 = null;
		Static252.anIntArray352 = null;
		Static299.anIntArray404 = null;
		Static242.aBoolean330 = false;
		Static350.anIntArray481 = null;
		Static309.anIntArray428 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nk;ZLclient!nk;)V", line = 952)
	public static void method5097(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class161 arg1) {
		Static85.method1962(Class19.aClass145_110);
		Class14.aClass2_Sub4_Sub2_4.method4814(arg1.anInt4310);
		Class14.aClass2_Sub4_Sub2_4.method4839(arg1.anInt4293);
		Class14.aClass2_Sub4_Sub2_4.method4856(arg1.anInt4290);
		Class14.aClass2_Sub4_Sub2_4.method4806(arg0.anInt4310);
		Class14.aClass2_Sub4_Sub2_4.method4839(arg0.anInt4293);
		Class14.aClass2_Sub4_Sub2_4.method4831(arg0.anInt4290);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I", line = 1031)
	public static int method5100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Lclient!js;", line = 1058)
	public static Class2_Sub2_Sub11 method5101(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub2_Sub11 local15 = (Class2_Sub2_Sub11) Class174.aClass116_7.method3153((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static182.aClass197_54.method5090(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static199.method3746(local25);
			Class174.aClass116_7.method3156(local15, (long) arg0);
			return local15;
		}
	}
}
