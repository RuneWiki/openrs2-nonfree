import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!ph;")
	public static Class187 aClass187_8;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_11 = new Class217(49, -1);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Lclient!ak;")
	public static Class11 method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static309.aClass11ArrayArrayArray2[0][arg1][arg2] != null && Static309.aClass11ArrayArrayArray2[0][arg1][arg2].aClass11_1 != null;
			if (local28 && arg0 >= Static285.anInt5004 - 1) {
				return null;
			}
			Static321.method4391(arg0, arg1, arg2);
		}
		return Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZII)I")
	public static int method288(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class10_Sub44 local8 = Static40.method555(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray703.length) {
			return local8.anIntArray703[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(III)Z")
	public static boolean method289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
