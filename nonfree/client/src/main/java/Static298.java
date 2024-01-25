import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_62 = new Class46(54, 6);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIB)Z")
	public static boolean method4650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface22 local11 = (Interface22) Static71.method1202(arg0, arg2, arg1);
		if (local11 != null) {
			local5 = Static463.method6856(local11) & true;
		}
		local11 = (Interface22) Static217.method3700(arg0, arg2, arg1, tw.class);
		if (local11 != null) {
			local5 &= Static463.method6856(local11);
		}
		local11 = (Interface22) Static614.method8756(arg0, arg2, arg1);
		if (local11 != null) {
			local5 &= Static463.method6856(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!tg;IIBLclient!ha;)V")
	public static void method4652(@OriginalArg(0) Class330 arg0, @OriginalArg(4) Class133 arg1) {
		Static608.aClass330_62.method7910();
		if (Static577.aBoolean698) {
			return;
		}
		for (@Pc(20) Class5_Sub26 local20 = (Class5_Sub26) arg0.method7908(); local20 != null; local20 = (Class5_Sub26) arg0.method7914()) {
			@Pc(28) Class299 local28 = Static620.aClass42_4.method937(local20.anInt4151);
			if (Static258.method4238(local28)) {
				@Pc(40) boolean local40 = Static129.method1918(local28, local20, arg1);
				if (local40) {
					Static346.method4220(arg1, local28, local20);
				}
			}
		}
	}
}
