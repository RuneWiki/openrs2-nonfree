import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!us", name = "D", descriptor = "J")
	public static long aLong213 = -1L;

	@OriginalMember(owner = "client!us", name = "E", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_200 = new Class158("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!us", name = "J", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_201 = new Class158("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)[Lclient!vv;")
	public static Class263[] method5675() {
		return new Class263[] { Static227.aClass263_99, Static19.aClass263_14, Static341.aClass263_147, Static429.aClass263_173, Class257.lb, Static341.aClass263_149, Static442.aClass263_176, Static451.aClass263_178, Static424.aClass263_170, Static204.aClass263_91, Static154.aClass263_81, Static168.aClass263_33, Static460.aClass263_139, Static103.aClass263_57, Static225.aClass263_97, Static70.aClass263_41, Static322.aClass263_142, Static145.aClass263_79, Static237.aClass263_104, Static259.aClass263_116, Static356.aClass263_167, Static82.aClass263_45, Static168.aClass263_34, Static343.aClass263_150, Static195.aClass263_88, Static345.aClass263_151, Static200.aClass263_89, Static215.aClass263_93, Static285.aClass263_129, Static21.aClass263_158, Static273.aClass263_125, Static133.aClass263_72, Static394.aClass263_162, Static364.aClass263_157, Static426.aClass263_28, Static87.aClass263_48, Static87.aClass263_49, Static251.aClass263_111, Static241.aClass263_106, Static296.aClass263_133, Static119.aClass263_66, Static312.aClass263_140, Static302.aClass263_134, Static266.aClass263_121, Static376.aClass263_159, Static176.aClass263_84, Static226.aClass263_98, Static267.aClass263_122, Static290.aClass263_132, Static379.aClass263_160, Static216.aClass263_94, Static186.aClass263_115, Static135.aClass263_77, Static70.aClass263_40, Static200.aClass263_90, Static279.aClass263_131, Static62.aClass263_31, Static430.aClass263_169, Static6.aClass263_3, Static72.aClass263_42, Static92.aClass263_51, Static255.aClass263_114, Static316.aClass263_141, Static110.aClass263_166, Static62.aClass263_32, Static89.aClass263_181, Static3.aClass263_1, Static118.aClass263_69, Static45.aClass263_24, Static170.aClass263_83, Static121.aClass263_175, Static303.aClass263_135, Static340.aClass263_145, Static266.aClass263_120, Static61.aClass263_30, Static247.aClass263_108, Static346.aClass263_152, Static268.aClass263_123, Static165.aClass263_82, Static93.aClass263_155, Static274.aClass263_127, Static65.aClass263_37, Static80.aClass263_177, Static88.aClass263_50, Static307.aClass263_137, Static31.aClass263_46, Static451.aClass263_179, Static262.aClass263_70, Static89.aClass263_180, Static274.aClass263_126, Static184.aClass263_86, Static435.aClass263_174, Static428.aClass263_172, Static304.aClass263_136, Static184.aClass263_85, Static265.aClass263_119, Static232.aClass263_102, Static263.aClass263_118, Static116.aClass263_65, Static460.aClass263_138, Static54.aClass263_26, Static239.aClass263_105, Static341.aClass263_148, Static418.aClass263_168, Static137.aClass263_78, Static120.aClass263_67, Static225.aClass263_96, Static59.aClass263_29, Static31.aClass263_47, Static188.aClass263_87, Static3.aClass263_2, Static427.aClass263_171, Static243.aClass263_107 };
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
	public static void method5676() {
		for (@Pc(9) Class41_Sub1 local9 = (Class41_Sub1) Static30.aClass117_1.method2967(); local9 != null; local9 = (Class41_Sub1) Static30.aClass117_1.method2970()) {
			local9.method881();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!go;")
	public static Class87 method5677(@OriginalArg(0) Component arg0) {
		return new Class87_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I")
	public static int method5678(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}
}
