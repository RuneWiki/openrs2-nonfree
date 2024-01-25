import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString379 = "Opened title screen";

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)Lclient!mk;")
	public static Class129 method5800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class184[] local13 = null;
		@Pc(17) Class12 local17 = Static34.method844(arg3);
		if (local17.anIntArray14 != null) {
			local13 = new Class184[local17.anIntArray14.length];
			for (@Pc(27) int local27 = 0; local27 < local13.length; local27++) {
				@Pc(36) Class1 local36 = Static37.method863(local17.anIntArray14[local27]);
				local13[local27] = new Class184(local36.anInt2, local36.anInt9, local36.anInt1, local36.anInt11, local36.anInt5, local36.anInt15, local36.anInt10, local36.aBoolean1);
			}
		}
		return new Class129(local17.anInt370, local13, local17.anInt375, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(CI)Z")
	public static boolean method5804(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
