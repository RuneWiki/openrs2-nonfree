import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	public static int anInt3698;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public static int anInt3706;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public static int anInt3703 = 0;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_31 = new Class103(64);

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	public static final int anInt3705 = 12;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIZIJLjava/lang/String;ZIBLjava/lang/String;)V")
	public static void method3336(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) String arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) String arg9) {
		@Pc(6) int[] local6 = new int[4];
		for (@Pc(8) int local8 = 0; local8 < 3; local8++) {
			local6[local8] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class7_Sub3 local30 = new Class7_Sub3(128);
		local30.method2735(10);
		local30.method2788((arg0 ? 4 : 0) | (arg3 ? 1 : 0) | (arg7 ? 2 : 0));
		local30.method2777(arg5);
		local30.method2765(local6[0]);
		local30.method2738(arg6);
		local30.method2765(local6[1]);
		local30.method2788(Static37.anInt1055);
		local30.method2735(arg2);
		local30.method2735(arg1);
		local30.method2765(local6[2]);
		local30.method2788(arg8);
		local30.method2788(arg4);
		local30.method2765(local6[3]);
		local30.method2789(Static184.aBigInteger2, Static101.aBigInteger1);
		@Pc(116) Class7_Sub3 local116 = new Class7_Sub3(350);
		local116.method2738(arg9);
		@Pc(128) int local128 = 8 - Static344.method5559(arg9) % 8;
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			local116.method2735((int) (Math.random() * 255.0D));
		}
		local116.method2754(local6);
		Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
		Static29.aClass7_Sub3_Sub2_1.method2735(22);
		Static29.aClass7_Sub3_Sub2_1.method2788(local30.anInt3005 + local116.anInt3005 + 2);
		Static29.aClass7_Sub3_Sub2_1.method2788(555);
		Static29.aClass7_Sub3_Sub2_1.method2781(local30.aByteArray33, local30.anInt3005);
		Static29.aClass7_Sub3_Sub2_1.method2781(local116.aByteArray33, local116.anInt3005);
		Static221.anInt4403 = 0;
		Static339.anInt6449 = 1;
		Static80.anInt2113 = 0;
		Static353.anInt2411 = -3;
	}
}
