import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZBZII)I")
	public static int method5084(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class2_Sub24 local15 = Static628.method9105(arg1, false);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray263.length; local23++) {
			if (local15.anIntArray263[local23] >= 0 && local15.anIntArray263[local23] < Static635.aClass336_2.anInt10100) {
				@Pc(52) Class301 local52 = Static635.aClass336_2.method8424(local15.anIntArray263[local23]);
				@Pc(62) int local62 = local52.method7713(Static229.aClass70_1.method2496(arg2).anInt10093, arg2);
				if (arg0) {
					local21 += local62 * local15.anIntArray264[local23];
				} else {
					local21 += local62;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!uu;")
	public static Class156 method5085(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class156 local8;
		try {
			local8 = (Class156) Class.forName("Class156_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class156_Sub1();
		}
		local8.aString54 = arg1;
		local8.anInt5335 = arg0;
		return local8;
	}
}
