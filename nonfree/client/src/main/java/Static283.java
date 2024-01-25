import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_9;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!us;")
	public static final Class344 aClass344_70 = new Class344(83, -1);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lclient!ofa;")
	public static Class244 method4955(@OriginalArg(0) int arg0) {
		@Pc(16) Class244[] local16 = Static231.method4415();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class244 local24 = local16[local18];
			if (local24.anInt7629 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
