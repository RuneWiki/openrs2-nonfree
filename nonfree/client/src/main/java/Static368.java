import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!da;")
	public static Class55 aClass55_11;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt6139;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public static int anInt6140;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_32 = new Class330();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5444(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method5445() {
		if (Static93.aFileOutputStream1 != null) {
			try {
				Static93.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static93.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ofa;I)V")
	public static void method5448(@OriginalArg(0) Class5_Sub22 arg0) {
		if (arg0.aByteArray71.length - arg0.anInt6629 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5966();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray71.length - arg0.anInt6629 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method5968();
		if (arg0.aByteArray71.length - arg0.anInt6629 < local46 * 6) {
			return;
		}
		for (@Pc(69) int local69 = 0; local69 < local46; local69++) {
			@Pc(75) int local75 = arg0.method5968();
			@Pc(79) int local79 = arg0.method5913();
			if (local75 < Static320.anIntArray291.length && Static578.aBooleanArray15[local75] && (Static17.aClass367_1.method8689(local75).aChar2 != '1' || local79 >= -1 && local79 <= 1)) {
				Static320.anIntArray291[local75] = local79;
			}
		}
	}
}
