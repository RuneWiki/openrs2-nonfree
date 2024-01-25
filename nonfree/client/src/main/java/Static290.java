import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	public static int anInt5320;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!om", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray125 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!om", name = "V", descriptor = "I")
	public static int anInt5325 = 0;

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!mv;)V")
	public static void method4264(@OriginalArg(1) Class1_Sub3_Sub3_Sub1 arg0) {
		@Pc(19) Class3_Sub36 local19 = (Class3_Sub36) Static222.aClass127_23.method3246((long) arg0.anInt6066);
		if (local19 == null) {
			return;
		}
		if (local19.aClass3_Sub5_Sub3_3 != null) {
			Static251.aClass3_Sub5_Sub4_1.method5196(local19.aClass3_Sub5_Sub3_3);
			local19.aClass3_Sub5_Sub3_3 = null;
		}
		local19.method5987();
	}
}
