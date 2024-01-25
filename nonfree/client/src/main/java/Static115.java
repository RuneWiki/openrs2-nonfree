import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "Lclient!tj;")
	public static Class193 aClass193_40;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lclient!md;")
	public static final Class130 aClass130_1 = Static282.method4202();

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method2409() {
		if (Static51.aBoolean101) {
			return;
		}
		Static73.aBoolean138 = true;
		Static51.aBoolean101 = true;
		if (Static24.aBoolean37) {
			Static77.aFloat23 = (int) Static77.aFloat23 + 47 & 0xFFFFFFF0;
		} else {
			Static168.aFloat98 += (12.0F - Static168.aFloat98) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBII)Lclient!hk;")
	public static Class4_Sub4_Sub5 method2410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg2;
		@Pc(18) Class4_Sub4_Sub5 local18 = (Class4_Sub4_Sub5) Static124.aClass124_4.method3525((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static121.aClass193_85.method5049(Static121.aClass193_85.method5041(local9));
		if (local30 == null) {
			local9 = arg0 + 65536 << 8 | arg2;
			local18 = (Class4_Sub4_Sub5) Static124.aClass124_4.method3525((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static121.aClass193_85.method5049(Static121.aClass193_85.method5041(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class4_Sub4_Sub5) Static124.aClass124_4.method3525((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static121.aClass193_85.method5049(Static121.aClass193_85.method5041(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static235.method4178(local30);
					local18.anInt2878 = arg2;
					Static124.aClass124_4.method3528(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static235.method4178(local30);
				local18.anInt2878 = arg2;
				Static124.aClass124_4.method3528(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static235.method4178(local30);
			local18.anInt2878 = arg2;
			Static124.aClass124_4.method3528(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	public static void method2411() {
		Static22.aClass198_18.method5213();
		Static242.aClass198_223.method5213();
		Static263.aClass198_252.method5213();
		Static10.aClass198_10.method5213();
		Static224.aClass198_164.method5213();
	}
}
