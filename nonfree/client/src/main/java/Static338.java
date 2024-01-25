import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "Lclient!gi;")
	public static Class93 aClass93_13 = null;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3179(@OriginalArg(1) String arg0) {
		if (Static20.aStringArray8 == null) {
			Static252.method3492();
		}
		@Pc(18) String[] local18 = Static305.method172(arg0, '\n');
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			for (@Pc(24) int local24 = Static275.anInt4981; local24 > 0; local24--) {
				Static20.aStringArray8[local24] = Static20.aStringArray8[local24 - 1];
			}
			Static20.aStringArray8[0] = local18[local20];
			if (Static275.anInt4981 < Static20.aStringArray8.length - 1) {
				if (Static142.anInt2604 > 0) {
					Static142.anInt2604++;
				}
				Static275.anInt4981++;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)I")
	public static int method3181(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub12 local10 = Static92.method1397(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray213.length; local32++) {
				if (local10.anIntArray212[local32] == arg0) {
					local30 += local10.anIntArray213[local32];
				}
			}
			return local30;
		}
	}
}
