import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_2 = new Class373("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean297 = true;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!sl;I)V")
	public static void method3464(@OriginalArg(0) Class2_Sub17 arg0) {
		if (arg0.aByteArray26.length - arg0.anInt3378 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2859();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray26.length - arg0.anInt3378 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method2825();
		if (arg0.aByteArray26.length - arg0.anInt3378 < local44 * 6) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local44; local62++) {
			@Pc(70) int local70 = arg0.method2825();
			@Pc(74) int local74 = arg0.method2881();
			if (local70 < Static450.anIntArray501.length && Static226.aBooleanArray6[local70] && (Static317.aClass256_1.method6036(local70).aChar1 != '1' || local74 >= -1 && local74 <= 1)) {
				Static450.anIntArray501[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!nd;B)V")
	public static void method3466(@OriginalArg(0) Class238 arg0) {
		Static18.aClass238_12 = arg0;
	}
}
