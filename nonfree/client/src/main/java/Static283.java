import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "[I")
	public static final int[] anIntArray311 = new int[14];

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString115 = null;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	public static void method4490() {
		Static563.anInt10263 = -1;
		Static480.anInt10343 = 2;
		Static575.anInt10386 = -1;
		Static132.aClass4_Sub21_Sub4_1 = null;
		Static419.anInt7992 = 0;
		Static491.anInt9287 = 1;
		Static221.aClass348_16 = null;
		Static139.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIBILclient!kfa;IZ[B)Lclient!bb;")
	public static Class3_Sub2_Sub1 method4492(@OriginalArg(1) int arg0, @OriginalArg(4) Class7_Sub2 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg1.aBoolean377 || Static32.method1002(arg0) && Static32.method1002(arg2)) {
			return new Class3_Sub2_Sub1(arg1, 3553, 6406, arg0, arg2, false, arg3, 6406);
		} else if (arg1.aBoolean381) {
			return new Class3_Sub2_Sub1(arg1, 34037, 6406, arg0, arg2, false, arg3, 6406);
		} else {
			return new Class3_Sub2_Sub1(arg1, 6406, arg0, arg2, Static488.method7100(arg0), Static488.method7100(arg2), arg3, 6406);
		}
	}
}
