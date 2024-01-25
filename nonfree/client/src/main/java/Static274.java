import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "Lclient!qs;")
	public static final Class273 aClass273_1 = new Class273();

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_85 = new Class287(47, 7);

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!ri;Ljava/lang/String;Z)Lclient!ck;")
	public static Class57 method4157(@OriginalArg(1) Class284 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) int local15 = arg0.method6333(arg1);
		if (local15 == -1) {
			return new Class57(0);
		}
		@Pc(28) int[] local28 = arg0.method6324(local15);
		@Pc(34) Class57 local34 = new Class57(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt1840) {
				@Pc(52) Class3_Sub26 local52 = new Class3_Sub26(arg0.method6331(local15, local28[local38++]));
				@Pc(56) int local56 = local52.method6816();
				@Pc(60) int local60 = local52.method6811();
				@Pc(64) int local64 = local52.method6814();
				if (!arg2 && local64 == 1) {
					local34.anInt1840--;
				} else {
					local34.anIntArray61[local36] = local56;
					local34.anIntArray60[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}
}
