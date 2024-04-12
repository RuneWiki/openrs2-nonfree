import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!p;")
	public static Class45 aClass45_21;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!rd;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 18)
	public static void method787(@OriginalArg(0) boolean arg0) {
		if (Static29.aClass25_48 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(4);
			local11.method1703(arg0 ? 2 : 3);
			local11.method1688(0);
			Static29.aClass25_48.method731(local11.aByteArray24, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static29.aClass25_48.method730();
			} catch (@Pc(37) Exception local37) {
			}
			Static29.aClass25_48 = null;
			Class61.anInt2401++;
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 109)
	public static void method790() {
		aClass45_21 = null;
		Class2_Sub2_Sub11.aClass40_333 = null;
		Class2_Sub2_Sub11.aClass40_334 = null;
		aClass2_Sub2_Sub2_Sub4Array6 = null;
		Class2_Sub2_Sub11.aClass40_335 = null;
		aClass52_1 = null;
		Class2_Sub2_Sub11.aClass40_331 = null;
		Class2_Sub2_Sub11.aClass40_330 = null;
		Class2_Sub2_Sub11.aClass40_332 = null;
	}
}
