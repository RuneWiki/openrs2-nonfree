import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hga", name = "J", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!hga", name = "P", descriptor = "I")
	public static int anInt4742 = 104;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZII)V")
	public static void method4122(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub24 local12 = Static628.method9105(arg1, arg0);
		if (local12 != null) {
			local12.method9253();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!wq;)I")
	public static int method4123(@OriginalArg(1) Class375 arg0) {
		if (arg0 == Static55.aClass375_38) {
			return 6407;
		} else if (Static354.aClass375_31 == arg0) {
			return 6408;
		} else if (arg0 == Static155.aClass375_18) {
			return 6406;
		} else if (Static520.aClass375_44 == arg0) {
			return 6409;
		} else if (arg0 == Static463.aClass375_39) {
			return 6410;
		} else if (arg0 == Static77.aClass375_49) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "(III)Z")
	public static boolean method4124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
