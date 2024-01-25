import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "Lclient!cv;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIB)I")
	public static int method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static132.anInt2869 == -1) {
			return 1;
		}
		if (arg0 != Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687()) {
			Static333.method5065(true, arg0, Static573.aClass345_15.method7951(Static496.anInt7407));
			if (arg0 != Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687()) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static150.aCanvas4.getSize();
			Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_15.method7951(Static496.anInt7407));
			@Pc(50) Class212 local50 = Static532.method7368(Static72.aClass238_40, Static132.anInt2869);
			@Pc(53) long local53 = Static48.method1203();
			Static141.aClass13_27.la();
			Static46.aClass51_5.method6705(0, Static620.anInt10145, 0);
			Static141.aClass13_27.method8138(Static46.aClass51_5);
			Static141.aClass13_27.DA(local34.width / 2, local34.height / 2, 512, 512);
			Static141.aClass13_27.xa(1.0F);
			Static141.aClass13_27.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(99) Class193 local99 = Static141.aClass13_27.method8161(local50, 2048, 64, 64, 768);
			@Pc(101) int local101 = 0;
			label41: for (@Pc(103) int local103 = 0; local103 < 500; local103++) {
				Static141.aClass13_27.GA(0);
				Static141.aClass13_27.ya();
				for (@Pc(111) int local111 = 15; local111 >= 0; local111--) {
					for (@Pc(114) int local114 = 0; local114 <= local111; local114++) {
						Static113.aClass51_3.method6705((int) (((float) local114 - (float) local111 / 2.0F) * (float) Static519.anInt8387), 0, Static519.anInt8387 * (local111 + 1));
						local99.method6612(Static113.aClass51_3, (Class16_Sub10) null, 0);
						local101++;
						if (Static48.method1203() - local53 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static141.aClass13_27.method8110();
			@Pc(180) long local180 = (long) (local101 * 1000) / (Static48.method1203() - local53);
			Static141.aClass13_27.GA(0);
			Static141.aClass13_27.ya();
			return (int) local180;
		} catch (@Pc(189) Throwable local189) {
			local189.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!sl;I)Lclient!ek;")
	public static Class56_Sub1 method2246(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) Class56 local7 = Static316.method4866(arg0);
		@Pc(11) int local11 = arg0.method2825();
		@Pc(15) int local15 = arg0.method2825();
		@Pc(19) int local19 = arg0.method2825();
		@Pc(23) int local23 = arg0.method2825();
		@Pc(27) int local27 = arg0.method2825();
		@Pc(31) int local31 = arg0.method2825();
		return new Class56_Sub1(local7.aClass97_15, local7.aClass252_11, local7.anInt9417, local7.anInt9419, local7.anInt9422, local7.anInt9414, local7.anInt9421, local7.anInt9415, local7.anInt9412, local11, local15, local19, local23, local27, local31);
	}
}
