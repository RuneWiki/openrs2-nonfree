import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt8799 = -1;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public static int anInt8803 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!r;ZII)Lclient!vl;")
	public static Class346 method6871(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static294.anIntArray262 != null) {
			for (@Pc(16) int local16 = 0; local16 < Static294.anIntArray262.length; local16++) {
				if (Static294.anIntArray262[local16] == arg2) {
					return Static298.aClass346Array1[local16];
				}
			}
		}
		@Pc(43) Class346 local43 = (Class346) Static289.aClass342_111.method7684((long) arg2);
		if (local43 != null) {
			if (arg1 && local43.aClass328_12 == null) {
				@Pc(57) Class328 local57 = Static410.method5763(arg2, Static451.aClass284_127);
				if (local57 == null) {
					return null;
				}
				local43.aClass328_12 = local57;
			}
			return local43;
		}
		@Pc(70) Class365[] local70 = Static607.method8164(Static537.aClass284_152, arg2);
		if (local70 == null) {
			return null;
		}
		@Pc(79) Class328 local79 = Static410.method5763(arg2, Static451.aClass284_127);
		if (local79 == null) {
			return null;
		}
		if (arg1) {
			local43 = new Class346(arg0.method8027(local79, local70), local79);
		} else {
			local43 = new Class346(arg0.method8027(local79, local70));
		}
		Static289.aClass342_111.method7683(local43, (long) arg2);
		return local43;
	}
}
