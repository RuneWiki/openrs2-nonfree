import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!rg;")
	public static Class27 aClass27_19;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	public static int anInt4763 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!g;ZILjava/lang/String;)Lclient!tg;")
	public static Class215 method4278(@OriginalArg(0) Class83 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method1961(arg2);
		if (local10 == -1) {
			return new Class215(0);
		}
		@Pc(24) int[] local24 = arg0.method1965(local10);
		@Pc(30) Class215 local30 = new Class215(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local32 < local30.anInt6173) {
				@Pc(50) Class2_Sub24 local50 = new Class2_Sub24(arg0.method1968(local24[local34++], local10));
				@Pc(54) int local54 = local50.method5776();
				@Pc(58) int local58 = local50.method5753();
				@Pc(62) int local62 = local50.method5732();
				if (!arg1 && local62 == 1) {
					local30.anInt6173--;
				} else {
					local30.anIntArray533[local32] = local54;
					local30.anIntArray532[local32] = local58;
					local32++;
				}
			}
			return local30;
		}
	}
}
