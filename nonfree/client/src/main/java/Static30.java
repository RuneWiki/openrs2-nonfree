import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!ir;")
	public static Class100 aClass100_12;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BZ)V")
	public static void method596(@OriginalArg(1) boolean arg0) {
		Static228.method3973(Static191.anInt3991, Static171.anInt3583, Static298.anInt5944, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method597() {
		@Pc(5) String local5 = "www";
		if (Static113.anInt6411 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(16) String local16 = "";
		if (Static230.aString248 != null) {
			local16 = "/p=" + Static230.aString248;
		}
		return Static309.anInt6133 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static344.anInt6698 + "/a=" + Static329.anInt6344 + local16 + "/" : "http://" + local5 + ".runescape.com/l=" + Static344.anInt6698 + "/a=" + Static329.anInt6344 + local16 + "/";
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lclient!rr;")
	public static Class58_Sub1 method599() {
		Static260.anInt5196 = 0;
		return Static261.method4413();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIII)Lclient!qg;")
	public static Class3_Sub7_Sub18 method601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg1 << 8;
		@Pc(18) Class3_Sub7_Sub18 local18 = (Class3_Sub7_Sub18) Static58.aClass188_1.method5061((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static69.aClass100_25.method2318(Static69.aClass100_25.method2300(local9));
		if (local30 == null) {
			local9 = arg2 | arg0 + 65536 << 8;
			local18 = (Class3_Sub7_Sub18) Static58.aClass188_1.method5061((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static69.aClass100_25.method2318(Static69.aClass100_25.method2300(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class3_Sub7_Sub18) Static58.aClass188_1.method5061((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static69.aClass100_25.method2318(Static69.aClass100_25.method2300(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static354.method5736(local30);
					local18.anInt5006 = arg2;
					Static58.aClass188_1.method5063(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static354.method5736(local30);
				local18.anInt5006 = arg2;
				Static58.aClass188_1.method5063(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static354.method5736(local30);
			local18.anInt5006 = arg2;
			Static58.aClass188_1.method5063(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub7_Sub11 local16 = Static116.method2029(arg1, 1);
		local16.method2509();
		local16.anInt3054 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)Lclient!hl;")
	public static Class83 method606(@OriginalArg(1) int arg0) {
		@Pc(10) Class83 local10 = (Class83) Static181.aClass198_14.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static171.aClass100_73.method2319(29, arg0);
		local10 = new Class83();
		if (local20 != null) {
			local10.method2060(new Class3_Sub4(local20), arg0);
		}
		Static181.aClass198_14.method5231((long) arg0, local10);
		return local10;
	}
}
