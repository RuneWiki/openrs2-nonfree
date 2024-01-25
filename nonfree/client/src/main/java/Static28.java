import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!ij;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
	public static final int[] anIntArray42 = new int[3];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BII)I")
	public static int method382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static519.aClass132_1.anInt3156 == -1) {
			return 1;
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != arg0) {
			Static706.method9435(true, arg0, Static289.aClass191_13.method4067(Static414.anInt9485));
			if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(47) Dimension local47 = Static316.aCanvas1.getSize();
			Static271.method3803(Static289.aClass191_13.method4067(Static414.anInt9485), true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
			@Pc(64) Class229 local64 = Static594.method8178(Static519.aClass132_1.anInt3156, Static700.aClass254_167);
			@Pc(67) long local67 = Static567.method7863();
			Static396.aClass145_6.la();
			Static359.aClass86_2.method7026(0, Static328.anInt5032, 0);
			Static396.aClass145_6.method9656(Static359.aClass86_2);
			Static396.aClass145_6.DA(local47.width / 2, local47.height / 2, 512, 512);
			Static396.aClass145_6.xa(1.0F);
			Static396.aClass145_6.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(108) Class45 local108 = Static396.aClass145_6.method9700(local64, 2048, 64, 64, 768);
			@Pc(110) int local110 = 0;
			label41: for (@Pc(112) int local112 = 0; local112 < 500; local112++) {
				Static396.aClass145_6.GA(0);
				Static396.aClass145_6.ya();
				for (@Pc(123) int local123 = 15; local123 >= 0; local123--) {
					for (@Pc(127) int local127 = 0; local127 <= local123; local127++) {
						Static390.aClass86_3.method7026((int) ((float) Static60.anInt1042 * (-((float) local123 / 2.0F) + (float) local127)), 0, Static60.anInt1042 * (local123 + 1));
						local108.method5769(Static390.aClass86_3, (Class4_Sub6) null, 0);
						local110++;
						if ((long) arg1 <= Static567.method7863() - local67) {
							break label41;
						}
					}
				}
			}
			Static396.aClass145_6.method9667();
			@Pc(217) long local217 = (long) (local110 * 1000) / (Static567.method7863() - local67);
			Static396.aClass145_6.GA(0);
			Static396.aClass145_6.ya();
			return (int) local217;
		} catch (@Pc(228) Throwable local228) {
			local228.printStackTrace();
			return -1;
		}
	}
}
