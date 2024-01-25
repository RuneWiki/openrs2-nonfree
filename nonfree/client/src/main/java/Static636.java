import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
	public static int anInt10110;

	@OriginalMember(owner = "client!wj", name = "I", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_14 = new Class178(14, 0, 4, 1);

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	public static void method8566() {
		@Pc(16) Class3_Sub27 local16 = Static59.method1040(Static325.aClass20_2, Static573.aClass314_105);
		local16.aClass3_Sub9_Sub2_2.method5572(Static339.method917());
		local16.aClass3_Sub9_Sub2_2.method5620(Static330.anInt6254);
		local16.aClass3_Sub9_Sub2_2.method5620(Static190.anInt3576);
		local16.aClass3_Sub9_Sub2_2.method5572(Static32.aClass3_Sub41_3.aClass7_Sub26_2.method8128());
		Static148.method2572(local16);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)Lclient!he;")
	public static Class141 method8569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 76724863L ^ (long) arg3 * 986053L ^ (long) arg0 * 475427L ^ (long) arg2 * 67481L ^ (long) arg4 * 97549L ^ (long) arg1 * 32147369L;
		@Pc(39) Class141 local39 = (Class141) Static642.aClass136_73.method3134(local33);
		if (local39 == null) {
			local39 = Static511.aClass82_16.method6168(arg2, arg4, arg0, arg3, arg1, arg5);
			Static642.aClass136_73.method3135(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method8570(@OriginalArg(0) Class3_Sub9 arg0) {
		if (arg0.aByteArray51.length - arg0.anInt6453 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5633();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray51.length - arg0.anInt6453 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method5610();
		if (local44 * 6 > arg0.aByteArray51.length - arg0.anInt6453) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local44; local62++) {
			@Pc(70) int local70 = arg0.method5610();
			@Pc(74) int local74 = arg0.method5585();
			if (local70 < Static584.anIntArray595.length && Static586.aBooleanArray29[local70] && (Static17.aClass318_1.method7783(local70).aChar5 != '1' || local74 >= -1 && local74 <= 1)) {
				Static584.anIntArray595[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	public static void method8571() {
		for (@Pc(1) int local1 = 0; local1 < Static70.aClass301Array1.length; local1++) {
			Static70.aClass301Array1[local1].method7376();
		}
		Static70.aClass301Array1 = null;
	}
}
