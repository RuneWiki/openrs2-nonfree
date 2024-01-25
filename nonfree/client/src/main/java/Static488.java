import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!wu;")
	public static Class384 aClass384_112;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "[[B")
	public static final byte[][] aByteArrayArray22 = new byte[50][];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Lclient!kb;")
	public static Class182 method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class182 local11 = new Class182();
		local11.anInt4546 = arg1 + 5 + 1;
		local11.anInt4545 = -1;
		local11.anInt4541 = arg0 + 6;
		local11.anInt4560 = -1;
		local11.anIntArrayArray21 = new int[local11.anInt4541][local11.anInt4546];
		local11.method4162();
		return local11;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
	public static boolean method7158(@OriginalArg(0) int arg0) {
		if (arg0 == 16 || arg0 == 4 || arg0 == 49 || arg0 == 10 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)[Lclient!hda;")
	public static Class136[] method7159() {
		return new Class136[] { Static286.aClass136_176, Static36.aClass136_20, Static431.aClass136_27, Static364.aClass136_131, Static240.aClass136_88, Static335.aClass136_121, Static582.aClass136_182, Static355.aClass136_128, Static465.aClass136_145, Static73.aClass136_32, Static289.aClass136_112, Static59.aClass136_29, Static319.aClass136_119, Static356.aClass136_129, Static98.aClass136_94, Static257.aClass136_100, Static582.aClass136_181, Static607.aClass136_188, Static340.aClass136_123, Static262.aClass136_101, Static296.aClass136_114, Static104.aClass136_45, Static83.aClass136_159, Static51.aClass136_28, Static244.aClass136_89, Static347.aClass136_179, Static275.aClass136_167, Static461.aClass136_157, Static124.aClass136_202, Static259.aClass136_59, Static23.aClass136_15, Static244.aClass136_90, Static17.aClass136_13, Static450.aClass136_152, Static492.aClass136_160, Static134.aClass136_61, Static229.aClass136_87, Static37.aClass136_22, Static491.aClass136_91, Static140.aClass136_65, Static19.aClass136_14, Static26.aClass136_16, Static510.aClass136_164, Static215.aClass136_84, Static573.aClass136_177, Static206.aClass136_80, Static47.aClass136_23, Static547.aClass136_173, Static424.aClass136_146, Static454.aClass136_153, Static88.aClass136_39, Static496.aClass136_162, Static499.aClass136_163, Static581.aClass136_180, Static290.aClass136_113, Static465.aClass136_144, Static431.aClass136_26, Static625.aClass136_195, Static580.aClass136_198, Static562.aClass136_175, Static629.aClass136_199, Static457.aClass136_154, Static458.aClass136_156, Static627.aClass136_197, Static277.aClass136_107, Static254.aClass136_98, Static137.aClass136_64, Static574.aClass136_178, Static269.aClass136_36, Static621.aClass136_193, Static287.aClass136_110, Static340.aClass136_122, Static9.aClass136_5, Static356.aClass136_130, Static605.aClass136_187, Static314.aClass136_127, Static370.aClass136_135, Static110.aClass136_47, Static366.aClass136_133, Static597.aClass136_185, Static527.aClass136_189, Static401.aClass136_161, Static269.aClass136_35, Static415.aClass136_143, Static190.aClass136_19, Static530.aClass136_170, Static531.aClass136_171, Static274.aClass136_201, Static98.aClass136_93, Static505.aClass136_126, Static108.aClass136_46, Static481.aClass136_158, Static312.aClass136_118, Static425.aClass136_147, Static61.aClass136_30, Static597.aClass136_184, Static381.aClass136_139, Static277.aClass136_106, Static100.aClass136_42, Static36.aClass136_21, Static150.aClass136_67, Static598.aClass136_186, Static173.aClass136_75, Static540.aClass136_172, Static617.aClass136_192, Static283.aClass136_109, Static173.aClass136_76, Static625.aClass136_194, Static511.aClass136_166, Static288.aClass136_111, Static32.aClass136_165, Static596.aClass136_183, Static334.aClass136_120, Static550.aClass136_138, Static632.aClass136_200, Static390.aClass136_141, Static104.aClass136_44, Static627.aClass136_196, Static259.aClass136_60, Static213.aClass136_82, Static268.aClass136_103, Static447.aClass136_149, Static87.aClass136_38, Static611.aClass136_190 };
	}
}
