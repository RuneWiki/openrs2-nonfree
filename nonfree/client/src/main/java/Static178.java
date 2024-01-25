import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!io", name = "i", descriptor = "I")
	public static int anInt3626;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public static int anInt3627;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)Lclient!bm;")
	public static Class23 method3009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class23 local7 = new Class23();
		local7.anInt923 = -1;
		local7.anInt926 = -1;
		local7.anInt934 = arg1 + 5 + 1;
		local7.anInt916 = arg0 + 1 + 5;
		local7.anIntArrayArray4 = new int[local7.anInt916][local7.anInt934];
		local7.method825();
		return local7;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	public static void method3010() {
		Static191.aClass5_33.method110();
		Static229.aClass5_36.method110();
		Static281.aClass5_46.method110();
		Static248.aClass5_39.method110();
		Static420.aClass5_56.method110();
	}
}
