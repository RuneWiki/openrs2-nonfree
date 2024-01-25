import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ju", name = "ab", descriptor = "Lclient!bd;")
	public static Class21 aClass21_8;

	@OriginalMember(owner = "client!ju", name = "N", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_50 = new Class183(41, 3);

	@OriginalMember(owner = "client!ju", name = "db", descriptor = "[I")
	public static int[] anIntArray273 = new int[2];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[I[J)V")
	public static void method3068(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static348.method5541(arg1, arg1.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBLclient!g;I)Lclient!ob;")
	public static Class2_Sub7_Sub12 method3070(@OriginalArg(0) int arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub24 local14 = new Class2_Sub24(arg1.method1968(arg0, arg2));
		@Pc(47) Class2_Sub7_Sub12 local47 = new Class2_Sub7_Sub12(arg0, local14.method5744(), local14.method5744(), local14.method5776(), local14.method5776(), local14.method5732() == 1, local14.method5732(), local14.method5732());
		@Pc(51) int local51 = local14.method5732();
		for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
			local47.aClass238_24.method5796(new Class2_Sub12(local14.method5732(), local14.method5753(), local14.method5753(), local14.method5753(), local14.method5753(), local14.method5753(), local14.method5753(), local14.method5753(), local14.method5753()));
		}
		local47.method4264();
		return local47;
	}
}
