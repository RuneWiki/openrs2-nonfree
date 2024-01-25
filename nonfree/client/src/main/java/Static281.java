import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "[B")
	public static final byte[] aByteArray76 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)Lclient!q;")
	public static Class5_Sub9_Sub18 method4763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg1 << 8;
		@Pc(18) Class5_Sub9_Sub18 local18 = (Class5_Sub9_Sub18) Static338.aClass215_7.method5683((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static262.aClass170_90.method4571(Static262.aClass170_90.method4567(local9));
		if (local30 == null) {
			local9 = arg2 | arg0 + 65536 << 8;
			local18 = (Class5_Sub9_Sub18) Static338.aClass215_7.method5683((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static262.aClass170_90.method4571(Static262.aClass170_90.method4567(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class5_Sub9_Sub18) Static338.aClass215_7.method5683((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static262.aClass170_90.method4571(Static262.aClass170_90.method4567(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static177.method2211(local30);
					local18.anInt4835 = arg2;
					Static338.aClass215_7.method5687(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static177.method2211(local30);
				local18.anInt4835 = arg2;
				Static338.aClass215_7.method5687(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static177.method2211(local30);
			local18.anInt4835 = arg2;
			Static338.aClass215_7.method5687(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!bk;Z)Lclient!op;")
	public static Class29_Sub2 method4765(@OriginalArg(0) Class5_Sub1 arg0) {
		return new Class29_Sub2(arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1843(), arg0.method1843(), arg0.method1832());
	}
}
