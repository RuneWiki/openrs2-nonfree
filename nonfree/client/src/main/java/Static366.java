import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	public static int anInt6320;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Lclient!qca;")
	public static Class16_Sub1_Sub3 method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass16_Sub1_Sub3_1 == null ? null : local7.aClass16_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5447(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(3, arg0);
		local8.method925();
		local8.aString7 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V")
	public static void method5448() {
		if (Static141.aClass13_27.method8134()) {
			Static141.aClass13_27.method8156(Static150.aCanvas4);
			Static314.method4857();
			if (Static148.aBoolean241) {
				Static292.method4624(Static150.aCanvas4);
			} else {
				@Pc(33) Dimension local33 = Static150.aCanvas4.getSize();
				Static141.aClass13_27.method8146(Static150.aCanvas4, local33.width, local33.height);
			}
			Static141.aClass13_27.method8124(Static150.aCanvas4);
		} else {
			Static99.method1936(false, Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687());
		}
		Static569.method7932();
		Static578.aBoolean673 = true;
	}
}
