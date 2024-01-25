import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "Lclient!bg;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	public static int anInt9212;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
	public static int anInt9207 = -1;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7297(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static569.anInt9840; local16++) {
			if (arg0.equalsIgnoreCase(Static326.aStringArray26[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIZLclient!sba;)V")
	public static void method7299(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub43 arg2) {
		@Pc(8) int local8 = arg2.anInt8192;
		@Pc(12) int local12 = (int) arg2.aLong245;
		arg2.method7948();
		if (arg1) {
			Static228.method3571(local8);
		}
		Static186.method3097(local8);
		@Pc(31) Class97 local31 = Static495.method7281(local12);
		if (local31 != null) {
			Static479.method6666(local31);
		}
		Static94.method5251();
		if (!arg0 && Static152.anInt1936 != -1) {
			Static398.method5756(Static152.anInt1936, 1);
		}
		@Pc(52) Class323 local52 = new Class323(Static162.aClass234_23);
		for (@Pc(57) Class6_Sub43 local57 = (Class6_Sub43) local52.method7241(); local57 != null; local57 = (Class6_Sub43) local52.method7240()) {
			if (!local57.method7949()) {
				local57 = (Class6_Sub43) local52.method7241();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt8194 == 3) {
				@Pc(79) int local79 = (int) local57.aLong245;
				if (local79 >>> 16 == local8) {
					method7299(arg0, true, local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!jr;B)Lclient!ni;")
	public static Class210 method7300(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(12) int local12 = arg0.method6044();
		@Pc(19) Class114 local19 = Static551.method7703()[arg0.method6019()];
		@Pc(26) Class72 local26 = Static574.method4158()[arg0.method6019()];
		@Pc(30) int local30 = arg0.method6023();
		@Pc(34) int local34 = arg0.method6023();
		return new Class210(local12, local19, local26, local30, local34);
	}
}
