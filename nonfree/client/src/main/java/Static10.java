import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array2;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!af", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method149(@OriginalArg(0) String arg0) {
		return Static315.method4621(qga.class, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Z")
	public static boolean method150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static547.method7285(arg0, arg1) | (arg0 & 0x70000) != 0 || Static321.method4673(arg1, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!wp;I)Ljava/lang/String;")
	public static String method154(@OriginalArg(0) Class361 arg0) {
		if (Static71.method1520(arg0).method5121() == 0) {
			return null;
		} else if (arg0.aString97 == null || arg0.aString97.trim().length() == 0) {
			return Static425.aBoolean541 ? "Hidden-use" : null;
		} else {
			return arg0.aString97;
		}
	}
}
