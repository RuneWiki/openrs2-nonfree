import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!wo;")
	public static Class269 aClass269_1;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!fj;")
	public static Class79 aClass79_10;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!tn;")
	public static final Class240 aClass240_8 = new Class240();

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(CI)C")
	public static char method5994(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
	public static void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(6, arg1);
		local8.method5345();
		local8.anInt6806 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[B")
	public static byte[] method5996(@OriginalArg(0) int arg0) {
		@Pc(17) Class10_Sub1_Sub14 local17 = (Class10_Sub1_Sub14) Static457.aClass52_3.method1350((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static434.method5743(local28, local52);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class10_Sub1_Sub14(local22);
			Static457.aClass52_3.method1347((long) arg0, local17);
		}
		return local17.aByteArray61;
	}
}
