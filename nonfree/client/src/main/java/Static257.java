import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array12;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[50][];

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_24 = new Class18();

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public static int anInt4476 = 0;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString163 = "cyan:";

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method4005() {
		Static353.method5961();
		Static229.method4041();
		Static92.method2161();
		Static332.method5724();
		Static292.method5003();
		Static242.method4278();
		Static221.method3974();
		Static278.method4715();
		Static216.method3895();
		Static37.method904();
		Static294.method5024();
		Static346.method5897();
		Static305.method5313();
		Static28.method720();
		Static140.method2818();
		Static138.method2794();
		Static283.method4785();
		Static17.method399();
		Static158.method3094();
		Static61.method1354();
		Static329.method5659();
		Static136.method2753();
		Static254.method4385();
		Static124.aClass11_61.method214();
		Static321.aClass11_136.method214();
		Static47.aClass11_25.method214();
		Static234.aClass11_98.method214();
		Static10.aClass11_3.method214();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIZ)I")
	public static int method4006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class14_Sub3_Sub34.anIntArray546[arg3 * 8192 / arg1] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (arg0 * local21 >> 16);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!no;)V")
	public static void method4008(@OriginalArg(1) Class14_Sub23 arg0) {
		if (!Static302.aBoolean409) {
			arg0.method5986();
			Static41.anInt980--;
		}
	}
}
