import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public static int anInt2774;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Lclient!qs;")
	public static Class211 aClass211_33;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
	public static int anInt2786;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
	public static int anInt2790;

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "Lclient!ul;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "[Lclient!dl;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array4 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_69 = new Class158("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2047(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static311.method4474(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static223.anInt4457; local23++) {
			@Pc(36) String local36 = Static406.aStringArray30[local23];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static311.method4474(local36);
			if (local36 != null && local36.equals(local18)) {
				Static223.anInt4457--;
				for (@Pc(60) int local60 = local23; local60 < Static223.anInt4457; local60++) {
					Static406.aStringArray30[local60] = Static406.aStringArray30[local60 + 1];
					Static325.aStringArray38[local60] = Static325.aStringArray38[local60 + 1];
					Static244.aStringArray31[local60] = Static244.aStringArray31[local60 + 1];
					Static210.aStringArray28[local60] = Static210.aStringArray28[local60 + 1];
					Static340.aBooleanArray21[local60] = Static340.aBooleanArray21[local60 + 1];
				}
				Static290.anInt5510 = Static175.anInt3842;
				Static32.method677(Static361.aClass177_94);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg0));
				Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
				return;
			}
		}
	}
}
