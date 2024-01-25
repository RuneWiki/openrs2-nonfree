import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
	public static int anInt3545 = -1;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBI)I")
	public static int method3253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static577.anInt9007 == -1) {
			return 1;
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != arg1) {
			Static492.method6899(-5, true, arg1, Static184.aClass131_14.method3168(Static375.anInt7800));
			if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(40) Dimension local40 = Static357.aCanvas8.getSize();
			Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_14.method3168(Static375.anInt7800), Static414.aClass70_6);
			@Pc(56) Class197 local56 = Static485.method8979(Static570.aClass126_258, Static577.anInt9007);
			@Pc(66) long local66 = Static480.method6763();
			Static273.aClass100_6.la();
			Static155.aClass10_2.method4214(0, Static377.anInt6337, 0);
			Static273.aClass100_6.method8590(Static155.aClass10_2);
			Static273.aClass100_6.DA(local40.width / 2, local40.height / 2, 512, 512);
			Static273.aClass100_6.xa(1.0F);
			Static273.aClass100_6.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(107) Class43 local107 = Static273.aClass100_6.method8588(local56, 2048, 64, 64, 768);
			@Pc(109) int local109 = 0;
			label41: for (@Pc(111) int local111 = 0; local111 < 500; local111++) {
				Static273.aClass100_6.GA(0);
				Static273.aClass100_6.ya();
				for (@Pc(122) int local122 = 15; local122 >= 0; local122--) {
					for (@Pc(126) int local126 = 0; local126 <= local122; local126++) {
						Static196.aClass10_3.method4214((int) ((float) Static492.anInt7972 * ((float) local126 - (float) local122 / 2.0F)), 0, Static492.anInt7972 * (local122 + 1));
						local109++;
						local107.method8849(Static196.aClass10_3, (Class4_Sub8) null, 0);
						if ((long) arg0 <= Static480.method6763() - local66) {
							break label41;
						}
					}
				}
			}
			Static273.aClass100_6.method8601();
			@Pc(215) long local215 = (long) (local109 * 1000) / (Static480.method6763() - local66);
			Static273.aClass100_6.GA(0);
			Static273.aClass100_6.ya();
			return (int) local215;
		} catch (@Pc(226) Throwable local226) {
			local226.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BI)I")
	public static int method3256(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
