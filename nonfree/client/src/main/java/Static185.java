import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array12;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	public static int anInt4465;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1274 = Static158.method3034("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1275 = Static158.method3034("Wordpack geladen)3");

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1276 = Static158.method3034("Walk here");

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1277 = aClass60_1276;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1278 = Static158.method3034("::gc");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!ob;")
	public static Class60 method3428(@OriginalArg(0) int arg0) {
		@Pc(12) Class60 local12 = new Class60();
		local12.aByteArray39 = new byte[arg0];
		local12.anInt3466 = 0;
		return local12;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BJ)V")
	public static void method3429(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static88.anInt2600; local14++) {
			if (Static138.aLongArray2[local14] == arg0) {
				Static88.anInt2600--;
				for (@Pc(32) int local32 = local14; local32 < Static88.anInt2600; local32++) {
					Static138.aLongArray2[local32] = Static138.aLongArray2[local32 + 1];
					Static149.aClass60Array21[local32] = Static149.aClass60Array21[local32 + 1];
				}
				Static1.anInt4 = Static157.anInt3990;
				Static7.aClass2_Sub3_Sub1_43.method244(73);
				Static7.aClass2_Sub3_Sub1_43.method205(arg0);
				break;
			}
		}
	}
}
