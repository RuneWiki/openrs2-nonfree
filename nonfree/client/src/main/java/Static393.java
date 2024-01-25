import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_82 = new Class154(65, 3);

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_109 = new Class349(56, 2);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!mv;[ILclient!mv;I)V")
	public static void method5409(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class229 arg2) {
		Static212.aClass229_48 = arg0;
		if (arg1 != null) {
			Static48.anIntArray101 = arg1;
		}
		Static37.aClass229_9 = arg2;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZLclient!nc;Z)V")
	public static void method5411(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub33 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg1.anInt5981;
		@Pc(16) int local16 = (int) arg1.aLong268;
		arg1.method7657();
		if (arg2) {
			Static453.method5905(local12);
		}
		Static532.method6993(local12);
		@Pc(33) Class273 local33 = Static594.method7731(local16);
		if (local33 != null) {
			Static155.method2111(local33);
		}
		Static297.method4281();
		if (!arg0 && Static122.anInt2094 != -1) {
			Static134.method1813(1, Static122.anInt2094);
		}
		@Pc(54) Class316 local54 = new Class316(Static346.aClass90_17);
		for (@Pc(61) Class2_Sub33 local61 = (Class2_Sub33) local54.method6328(); local61 != null; local61 = (Class2_Sub33) local54.method6325()) {
			if (!local61.method7656()) {
				local61 = (Class2_Sub33) local54.method6328();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt5985 == 3) {
				@Pc(85) int local85 = (int) local61.aLong268;
				if (local85 >>> 16 == local12) {
					method5411(arg0, local61, true);
				}
			}
		}
	}
}
