import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!oh;")
	public static Class237 aClass237_100;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
	public static int anInt7049;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public static int anInt7031 = -1;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[8];

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!mha;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "[[B")
	public static final byte[][] aByteArrayArray116 = new byte[250][];

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!tp;ILclient!tp;)V")
	public static void method5802(@OriginalArg(0) Class331 arg0, @OriginalArg(2) Class331 arg1) {
		@Pc(12) Class8_Sub31 local12 = Static51.method1418(Static401.aClass257_78, Static608.aClass336_1);
		local12.aClass8_Sub8_Sub2_1.method8523(arg1.anInt9578);
		local12.aClass8_Sub8_Sub2_1.method8546(arg0.anInt9535);
		local12.aClass8_Sub8_Sub2_1.method8523(arg0.anInt9578);
		local12.aClass8_Sub8_Sub2_1.method8546(arg0.anInt9570);
		local12.aClass8_Sub8_Sub2_1.method8551(arg1.anInt9570);
		local12.aClass8_Sub8_Sub2_1.method8548(arg1.anInt9535);
		Static262.method4604(local12);
	}
}
