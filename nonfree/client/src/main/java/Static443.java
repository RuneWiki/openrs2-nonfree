import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
	public static int anInt7576;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Lclient!db;")
	public static final Class64 aClass64_373 = new Class64(79, -1);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZLclient!dv;)V")
	public static void method6270(@OriginalArg(0) int arg0, @OriginalArg(2) Class77 arg1) {
		if (Static406.anInt7043 >= 50 || (arg1 == null || arg1.anIntArrayArray36 == null || arg1.anIntArrayArray36.length <= arg0 || arg1.anIntArrayArray36[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray36[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		if (arg1.anIntArrayArray36[arg0].length > 1) {
			@Pc(59) int local59 = (int) ((double) arg1.anIntArrayArray36[arg0].length * Math.random());
			if (local59 > 0) {
				local40 = arg1.anIntArrayArray36[arg0][local59];
			}
		}
		@Pc(74) int local74 = local36 >> 5 & 0x7;
		if (arg1.aBoolean208) {
			Static560.method7718(0, 255, local40, false, local74);
		} else {
			Static3.method60(local74, 255, 0, local40);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIIIZILclient!no;[B)Lclient!mn;")
	public static Class114_Sub1_Sub1 method6271(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class66_Sub3 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean477 || Static422.method6062(arg1) && Static422.method6062(arg0)) {
			return new Class114_Sub1_Sub1(arg2, 3553, 6406, arg1, arg0, false, arg3, 6406);
		} else if (arg2.aBoolean489) {
			return new Class114_Sub1_Sub1(arg2, 34037, 6406, arg1, arg0, false, arg3, 6406);
		} else {
			return new Class114_Sub1_Sub1(arg2, 6406, arg1, arg0, Static514.method7261(arg1), Static514.method7261(arg0), arg3, 6406);
		}
	}
}
