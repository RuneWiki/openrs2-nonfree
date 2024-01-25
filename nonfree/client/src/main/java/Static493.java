import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
	public static int anInt8769;

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "Lclient!vm;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "Lclient!kha;")
	public static Class181 aClass181_100;

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "B")
	public static byte aByte105;

	@OriginalMember(owner = "client!ro", name = "E", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_47 = new Class307(4);

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "[I")
	public static final int[] anIntArray555 = new int[2048];

	@OriginalMember(owner = "client!ro", name = "M", descriptor = "[I")
	public static final int[] anIntArray556 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
	public static int anInt8770 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7236(@OriginalArg(1) String arg0) {
		return Static595.aHashtable12.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(III)Z")
	public static boolean method7237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!lea;IIBLclient!qg;ILclient!dv;)V")
	public static void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class272 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub3_Sub1_Sub2_Sub1 arg6) {
		@Pc(12) Class3_Sub25 local12 = new Class3_Sub25();
		local12.anInt4655 = arg2 << 9;
		local12.anInt4661 = arg3;
		local12.anInt4649 = arg0 << 9;
		if (arg4 != null) {
			local12.aClass272_1 = arg4;
			@Pc(159) int local159 = arg4.anInt8263;
			@Pc(162) int local162 = arg4.anInt8284;
			if (arg5 == 1 || arg5 == 3) {
				local159 = arg4.anInt8284;
				local162 = arg4.anInt8263;
			}
			local12.anInt4658 = local162 + arg2 << 9;
			local12.anInt4647 = arg4.anInt8253;
			local12.anInt4644 = arg4.anInt8251 << 9;
			local12.anInt4645 = arg4.anInt8259;
			local12.anInt4654 = arg4.anInt8248;
			local12.anIntArray244 = arg4.anIntArray522;
			local12.aBoolean401 = arg4.aBoolean708;
			local12.anInt4660 = arg0 + local159 << 9;
			local12.anInt4643 = arg4.anInt8266;
			local12.anInt4648 = arg4.anInt8278;
			local12.aBoolean400 = arg4.aBoolean706;
			local12.anInt4657 = arg4.anInt8275;
			if (arg4.anIntArray523 != null) {
				local12.aBoolean402 = true;
				local12.method3944();
			}
			if (local12.anIntArray244 != null) {
				local12.anInt4656 = (int) (Math.random() * (double) (local12.anInt4647 - local12.anInt4648)) + local12.anInt4648;
			}
			Static598.aClass276_62.method6906(local12);
			return;
		}
		if (arg6 != null) {
			local12.aClass2_Sub3_Sub1_Sub2_Sub1_1 = arg6;
			@Pc(35) Class22 local35 = arg6.aClass22_1;
			if (local35.anIntArray29 != null) {
				local12.aBoolean402 = true;
				local35 = local35.method425(Static514.aClass166_1);
			}
			if (local35 != null) {
				local12.anInt4658 = arg2 + local35.anInt404 << 9;
				local12.anInt4660 = local35.anInt404 + arg0 << 9;
				local12.anInt4657 = Static545.method7729(arg6);
				local12.anInt4644 = local35.anInt422 << 9;
				local12.aBoolean401 = local35.aBoolean36;
				local12.anInt4643 = local35.anInt395;
				local12.anInt4645 = local35.anInt417;
				local12.anInt4654 = local35.anInt405;
			}
			Static342.aClass276_43.method6906(local12);
			return;
		}
		if (arg1 == null) {
			return;
		}
		local12.aClass2_Sub3_Sub1_Sub2_Sub2_3 = arg1;
		local12.anInt4660 = arg1.method5308() + arg0 << 9;
		local12.anInt4658 = arg2 + arg1.method5308() << 9;
		local12.anInt4657 = Static499.method7288(arg1);
		local12.aBoolean401 = arg1.aBoolean542;
		local12.anInt4644 = arg1.anInt6362 << 9;
		local12.anInt4654 = 256;
		local12.anInt4645 = arg1.anInt6360;
		local12.anInt4643 = 256;
		Static470.aClass307_42.method7425((long) arg1.anInt6289, local12);
		return;
	}
}
