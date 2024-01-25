import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt5501;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!ak;")
	public static final Class13 aClass13_2 = new Class13(16);

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public static int anInt5502 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!m;")
	public static final Class235 aClass235_30 = new Class235(60);

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_98 = new Class186(8, 1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public static void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static584.aClass262ArrayArrayArray2[0][arg1][arg2] != null && Static584.aClass262ArrayArrayArray2[0][arg1][arg2].aClass262_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static584.aClass262ArrayArrayArray2[local25][arg1][arg2] == null) {
				@Pc(47) Class262 local47 = Static584.aClass262ArrayArrayArray2[local25][arg1][arg2] = new Class262(local25);
				if (local23) {
					local47.aByte113++;
				}
			}
		}
	}
}
