import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "S", descriptor = "I")
	public static int anInt215;

	@OriginalMember(owner = "client!al", name = "X", descriptor = "Lclient!gh;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!al", name = "P", descriptor = "Lclient!os;")
	public static final Class182 aClass182_10 = new Class182("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!al", name = "T", descriptor = "[Lclient!sd;")
	public static final Class220[] aClass220Array1 = new Class220[4];

	@OriginalMember(owner = "client!al", name = "Y", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!gh;I)Ljava/lang/String;")
	public static String method162(@OriginalArg(0) Class89 arg0) {
		if (Static56.method1002(arg0).method4502() == 0) {
			return null;
		} else if (arg0.aString20 == null || arg0.aString20.trim().length() == 0) {
			return Static372.aBoolean418 ? "Hidden-use" : null;
		} else {
			return arg0.aString20;
		}
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
	public static void method164() {
		for (@Pc(6) Class40_Sub6 local6 = (Class40_Sub6) Static364.aClass240_5.method5227(); local6 != null; local6 = (Class40_Sub6) Static364.aClass240_5.method5230()) {
			local6.method4098();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
	public static void method165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class10_Sub1_Sub17 local13 = Static154.method2630(1, arg1);
		local13.method5345();
		local13.anInt6806 = arg0;
	}
}
