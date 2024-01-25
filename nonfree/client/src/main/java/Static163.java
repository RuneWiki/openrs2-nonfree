import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_4 = new Class379("", 15);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_6 = new Class178(0, 2, 2, 1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!uv;II)V")
	public static void method2789(@OriginalArg(1) Class344 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray21 != null) {
			@Pc(13) Class3_Sub36 local13 = new Class3_Sub36();
			local13.anObjectArray1 = arg0.anObjectArray21;
			local13.aClass344_6 = arg0;
			Static400.method6288(local13);
		}
		Static425.aBoolean536 = true;
		Static632.anInt10065 = arg1;
		Static95.anInt1910 = arg2;
		Static551.anInt9151 = arg0.anInt9584;
		Static260.anInt5074 = arg0.anInt9586;
		Static80.anInt1600 = arg0.anInt9581;
		Static174.anInt3360 = arg0.anInt9567;
		Static491.anInt8353 = arg0.anInt9571;
		Static605.method8323(arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)I")
	public static int method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static268.anInt5214 == -1) {
			return 1;
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != arg1) {
			Static12.method220(arg1, Static369.aClass235_16.method5893(Static455.anInt7738), true);
			if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = Static617.aCanvas13.getSize();
			Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_16.method5893(Static455.anInt7738), Static240.aClass93_4, Static266.aClass82_8);
			@Pc(59) Class359 local59 = Static11.method201(Static638.aClass343_270, Static268.anInt5214);
			@Pc(62) long local62 = Static191.method3071();
			Static266.aClass82_8.la();
			Static570.aClass31_14.method7921(0, Static493.anInt8365, 0);
			Static266.aClass82_8.method6160(Static570.aClass31_14);
			Static266.aClass82_8.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static266.aClass82_8.xa(1.0F);
			Static266.aClass82_8.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(103) Class75 local103 = Static266.aClass82_8.method6176(local59, 2048, 64, 64, 768);
			@Pc(105) int local105 = 0;
			label41: for (@Pc(107) int local107 = 0; local107 < 500; local107++) {
				Static266.aClass82_8.GA(0);
				Static266.aClass82_8.ya();
				for (@Pc(116) int local116 = 15; local116 >= 0; local116--) {
					for (@Pc(120) int local120 = 0; local120 <= local116; local120++) {
						Static292.aClass31_20.method7921((int) ((float) Static188.anInt3555 * ((float) local120 - (float) local116 / 2.0F)), 0, (local116 + 1) * Static188.anInt3555);
						local105++;
						local103.method6799(Static292.aClass31_20, (Class9_Sub5) null, 0);
						if (Static191.method3071() - local62 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static266.aClass82_8.method6157();
			@Pc(185) long local185 = (long) (local105 * 1000) / (Static191.method3071() - local62);
			Static266.aClass82_8.GA(0);
			Static266.aClass82_8.ya();
			return (int) local185;
		} catch (@Pc(199) Throwable local199) {
			local199.printStackTrace();
			return -1;
		}
	}
}
