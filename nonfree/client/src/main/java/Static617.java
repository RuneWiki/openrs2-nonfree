import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IBI)I")
	public static int method8379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static130.anInt3199 == -1) {
			return 1;
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != arg0) {
			Static402.method6832(true, Static287.aClass176_13.method4986(Static380.anInt7247), arg0);
			if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(39) Dimension local39 = Static177.aCanvas10.getSize();
			Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_13.method4986(Static380.anInt7247));
			@Pc(55) Class142 local55 = Static579.method8023(Static130.anInt3199, Static412.aClass181_78);
			@Pc(58) long local58 = Static444.method6719();
			Static47.aClass33_3.la();
			Static39.aClass47_1.method7863(0, Static510.anInt8986, 0);
			Static47.aClass33_3.method6233(Static39.aClass47_1);
			Static47.aClass33_3.DA(local39.width / 2, local39.height / 2, 512, 512);
			Static47.aClass33_3.xa(1.0F);
			Static47.aClass33_3.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(99) Class128 local99 = Static47.aClass33_3.method6157(local55, 2048, 64, 64, 768);
			@Pc(101) int local101 = 0;
			label41: for (@Pc(103) int local103 = 0; local103 < 500; local103++) {
				Static47.aClass33_3.GA(0);
				Static47.aClass33_3.ya();
				for (@Pc(112) int local112 = 15; local112 >= 0; local112--) {
					for (@Pc(116) int local116 = 0; local116 <= local112; local116++) {
						Static456.aClass47_9.method7863((int) (((float) local116 - (float) local112 / 2.0F) * (float) Static325.anInt6512), 0, Static325.anInt6512 * (local112 + 1));
						local101++;
						local99.method6281(Static456.aClass47_9, null, 0);
						if (Static444.method6719() - local58 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static47.aClass33_3.method6167();
			@Pc(189) long local189 = (long) (local101 * 1000) / (Static444.method6719() - local58);
			Static47.aClass33_3.GA(0);
			Static47.aClass33_3.ya();
			return (int) local189;
		} catch (@Pc(198) Throwable local198) {
			local198.printStackTrace();
			return -1;
		}
	}
}
