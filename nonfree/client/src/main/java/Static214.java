import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_121 = new Class41(24, -1);

	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	public static int anInt3952 = -1;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "Lclient!sq;")
	public static final Class214 aClass214_23 = new Class214(8);

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_122 = new Class41(64, -1);

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
	public static void method3616() {
		Static267.aClass82_6.method4537(Static392.aFloat104, Static282.aFloat50, Static93.aFloat20);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!hc;BLclient!km;)I")
	public static int method3620(@OriginalArg(0) Class96 arg0, @OriginalArg(2) Class82 arg1) {
		if (arg0.anInt2413 != -1) {
			return arg0.anInt2413;
		}
		if (arg0.anInt2408 != -1) {
			@Pc(35) Class182 local35 = arg1.anInterface1_4.method2849(arg1.method4543() ? arg0.anInt2408 : arg0.anInt2410);
			if (!local35.aBoolean366) {
				return local35.aShort70;
			}
		}
		return arg0.anInt2406;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Lclient!ms;IZBII)V")
	public static void method3624(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class155 local17 = arg0[local11];
			if (local17 != null && arg1 == local17.anInt4144) {
				Static202.method3377(local17, arg2, arg4, arg3);
				Static340.method5223(arg3, arg4, local17);
				if (local17.anInt4174 > local17.anInt4177 - local17.anInt4170) {
					local17.anInt4174 = local17.anInt4177 - local17.anInt4170;
				}
				if (local17.anInt4174 < 0) {
					local17.anInt4174 = 0;
				}
				if (local17.anInt4207 > local17.anInt4176 - local17.anInt4214) {
					local17.anInt4207 = local17.anInt4176 - local17.anInt4214;
				}
				if (local17.anInt4207 < 0) {
					local17.anInt4207 = 0;
				}
				if (local17.anInt4164 == 0) {
					Static13.method409(local17, arg2);
				}
			}
		}
	}
}
