import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "Lclient!om;")
	public static Class272 aClass272_1;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!lb;IIB)Lclient!rc;")
	public static Class3_Sub4_Sub19 method840(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class3_Sub28 local14 = new Class3_Sub28(arg0.method5089(arg2, arg1));
		@Pc(52) Class3_Sub4_Sub19 local52 = new Class3_Sub4_Sub19(arg2, local14.method5295(), local14.method5295(), local14.method5312(), local14.method5312(), local14.method5322(-74) == 1, local14.method5322(-72), local14.method5322(-18));
		@Pc(56) int local56 = local14.method5322(-45);
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local52.aClass357_53.method8401(new Class3_Sub26(local14.method5322(-71), local14.method5272(), local14.method5272(), local14.method5272(), local14.method5272(), local14.method5272(), local14.method5272(), local14.method5272(), local14.method5272()));
		}
		if (-105 != -105) {
			method841((Object) null, 113, 0, -53);
		}
		local52.method7610();
		return local52;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method841(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg0;
			return Static600.method8266(local14, arg3, arg2);
		} else if (arg0 instanceof Class150) {
			@Pc(26) Class150 local26 = (Class150) arg0;
			return local26.method9040(arg3, arg2);
		} else {
			if (arg1 != 31054) {
				method842();
			}
			throw new IllegalArgumentException();
		}
	}
}
