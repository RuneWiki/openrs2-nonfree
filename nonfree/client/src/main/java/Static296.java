import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_83 = new Class349(81, -1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method4267(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([BIZ)V")
	public static void method4269(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static552.aClass2_Sub7_7 == null) {
			Static552.aClass2_Sub7_7 = new Class2_Sub7(20000);
		}
		Static552.aClass2_Sub7_7.method4498(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static119.method1055(Static552.aClass2_Sub7_7.aByteArray52);
		Static495.aClass86_Sub1Array2 = new Class86_Sub1[Static17.anInt4840];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static162.anInt2511; local33 <= Static434.anInt6972; local33++) {
			@Pc(41) Class86_Sub1 local41 = Static51.method871(local33);
			if (local41 != null) {
				Static495.aClass86_Sub1Array2[local31++] = local41;
			}
		}
		Static477.aBoolean651 = false;
		Static421.aLong190 = Static362.method5133();
		Static552.aClass2_Sub7_7 = null;
	}
}
