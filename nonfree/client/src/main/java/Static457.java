import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public static int anInt8187;

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
	public static int anInt8214;

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
	public static int anInt8209 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)I")
	public static int method7338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static310.anInt5608 == -1) {
			return 1;
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != arg1) {
			Static626.method9304(Static205.aClass134_13.method3906(Static204.anInt8130), true, arg1);
			if (arg1 != Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907()) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = Static641.aCanvas13.getSize();
			Static543.method8319(Static205.aClass134_13.method3906(Static204.anInt8130), Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
			@Pc(59) Class159 local59 = Static452.method7285(Static21.aClass124_7, Static310.anInt5608);
			@Pc(62) long local62 = Static99.method1701();
			Static607.aClass101_15.la();
			Static435.aClass76_13.method9639(0, Static124.anInt2431, 0);
			Static607.aClass101_15.method8067(Static435.aClass76_13);
			Static607.aClass101_15.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static607.aClass101_15.xa(1.0F);
			Static607.aClass101_15.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(108) Class14 local108 = Static607.aClass101_15.method8064(local59, 2048, 64, 64, 768);
			@Pc(110) int local110 = 0;
			label41: for (@Pc(112) int local112 = 0; local112 < 500; local112++) {
				Static607.aClass101_15.GA(0);
				Static607.aClass101_15.ya();
				for (@Pc(121) int local121 = 15; local121 >= 0; local121--) {
					for (@Pc(125) int local125 = 0; local125 <= local121; local125++) {
						Static92.aClass76_16.method9639((int) ((-((float) local121 / 2.0F) + (float) local125) * (float) Static536.anInt4502), 0, (local121 + 1) * Static536.anInt4502);
						local110++;
						local108.method8641(Static92.aClass76_16, (Class15_Sub6) null, 0);
						if (Static99.method1701() - local62 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static607.aClass101_15.method8107();
			@Pc(190) long local190 = (long) (local110 * 1000) / (Static99.method1701() - local62);
			Static607.aClass101_15.GA(0);
			Static607.aClass101_15.ya();
			return (int) local190;
		} catch (@Pc(199) Throwable local199) {
			local199.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZII)V")
	public static void method7345(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub42 local10 = Static47.method979(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray350.length; local15++) {
				local10.anIntArray350[local15] = -1;
				local10.anIntArray351[local15] = 0;
			}
		}
	}
}
