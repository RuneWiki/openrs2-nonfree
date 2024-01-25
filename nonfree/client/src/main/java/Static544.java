import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_231 = new Class251(79, 8);

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_239 = new Class160(88, -2);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lclient!vv;")
	public static Class14_Sub54 method8199() {
		return Static170.anInt2634 == 0 ? new Class14_Sub54() : Static637.aClass14_Sub54Array1[--Static170.anInt2634];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8201(@OriginalArg(0) Class144 arg0) {
		Static474.aClass68_9 = Static105.method8322(true, true, Static191.anInt3328, arg0);
		Static343.aClass350_4 = Static607.method8543(arg0, Static191.anInt3328);
		Static446.aClass68_8 = Static105.method8322(true, true, Static564.anInt9377, arg0);
		Static372.aClass350_5 = Static607.method8543(arg0, Static564.anInt9377);
		Static255.aClass68_4 = Static105.method8322(true, true, Static161.anInt1416, arg0);
		Static497.aClass350_9 = Static607.method8543(arg0, Static161.anInt1416);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method8202(@OriginalArg(1) File arg0) {
		return Static573.method8186(arg0, (int) arg0.length());
	}
}
