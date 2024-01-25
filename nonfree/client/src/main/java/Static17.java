import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!pja;")
	public static Class6_Sub4_Sub12 aClass6_Sub4_Sub12_1;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!oja;")
	public static final Class257 aClass257_1 = new Class257();

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[Lclient!g;")
	public static final Class6_Sub4_Sub4[] aClass6_Sub4_Sub4Array1 = new Class6_Sub4_Sub4[14];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZIIIII)V")
	public static void method470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static308.anInt5227 = arg3;
		Static302.anInt5166 = arg5;
		Static359.anInt6155 = arg1;
		Static526.anInt8690 = arg2;
		Static16.anInt451 = arg0;
		Static242.anInt4298 = arg4;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method471() {
		Static621.aClass207_37 = null;
		Static627.anInt10200 = -1;
		Static309.anIntArray138 = null;
		Static467.aClass207_29 = null;
		Static155.anInterface16Array1 = null;
		Static32.aClass207_6 = null;
		Static367.aClass132_7 = null;
		Static675.anInterface16_1 = null;
		Static353.anInt6019 = -1;
		Static383.anInt6432 = -1;
		Static59.anInt1160 = -1;
		Static502.aClass115_11.method2465();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method472(@OriginalArg(0) Class132 arg0) {
		if (Static479.aClass362_55.method8533() == 0) {
			return;
		}
		@Pc(59) Class6_Sub48 local59;
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 0) {
			for (local59 = (Class6_Sub48) Static479.aClass362_55.method8538(); local59 != null; local59 = (Class6_Sub48) Static479.aClass362_55.method8530()) {
				Static340.aClass121_1.method2649(arg0, false, local59.anInt9145, local59.anInt9144, local59.anInt9148, arg0, false, Static494.aClass19_12, local59.aBoolean666 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null, local59.anInt9149, local59.anInt9147);
				local59.method9174();
			}
			Static509.method7248();
			return;
		}
		if (Static461.aClass132_12 == null) {
			@Pc(29) Canvas local29 = new Canvas();
			local29.setSize(36, 32);
			Static461.aClass132_12 = Static513.method7271(Static630.aClass8_97, Static251.anInterface6_5, 0, 0, local29);
			Static176.aClass19_6 = Static461.aClass132_12.method7518(Static462.method6858(Static466.aClass8_114, Static270.anInt4693), Static681.method2323(Static624.aClass8_139, Static270.anInt4693));
		}
		for (local59 = (Class6_Sub48) Static479.aClass362_55.method8538(); local59 != null; local59 = (Class6_Sub48) Static479.aClass362_55.method8530()) {
			Static340.aClass121_1.method2649(arg0, false, local59.anInt9145, local59.anInt9144, local59.anInt9148, Static461.aClass132_12, false, Static176.aClass19_6, local59.aBoolean666 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null, local59.anInt9149, local59.anInt9147);
			local59.method9174();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ae;Lclient!ae;Z)V")
	public static void method474(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		Static622.aClass8_138 = arg0;
		Static596.aClass8_134 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BZIII)V")
	public static void method475(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 0) {
			Static617.method8513(false);
		} else {
			Static611.anInt9972 = Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742();
			Static646.method8805(0, true);
		}
		Static86.aBoolean107 = arg0;
		Static425.anInt7330 = arg1;
		Static477.anInt8197 = arg3;
		Static528.method4534(arg2);
	}
}
