import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!ti;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt4199;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[[Lclient!mj;")
	public static Class64[][] aClass64ArrayArray1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt4196 = 0;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt4197 = 0;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_730 = Static199.method3560("mapscene");

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public static int anInt4198 = 0;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_731 = Static199.method3560("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIILclient!rd;ZI)V")
	public static void method3308(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class72_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = (long) ((arg2 << 16) + arg0);
		@Pc(17) Class2_Sub3_Sub16 local17 = (Class2_Sub3_Sub16) Static118.aClass103_16.method3659(local7);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub3_Sub16) Static202.aClass103_20.method3659(local7);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub3_Sub16) Static106.aClass103_12.method3659(local7);
		if (local17 == null) {
			if (!arg4) {
				local17 = (Class2_Sub3_Sub16) Static204.aClass103_21.method3659(local7);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class2_Sub3_Sub16();
			local17.aByte10 = arg1;
			local17.aClass72_Sub1_21 = arg3;
			local17.anInt2304 = arg5;
			if (arg4) {
				Static118.aClass103_16.method3665(local7, local17);
				Static187.anInt4366++;
			} else {
				Static8.aClass102_1.method3629(local17);
				Static106.aClass103_12.method3665(local7, local17);
				Static36.anInt666++;
			}
		} else if (arg4) {
			local17.method3918();
			Static118.aClass103_16.method3665(local7, local17);
			Static36.anInt666--;
			Static187.anInt4366++;
		}
	}
}
