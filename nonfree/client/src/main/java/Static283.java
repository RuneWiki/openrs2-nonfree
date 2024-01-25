import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "[S")
	public static short[] aShortArray60;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public static int anInt4649;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_109 = new Class136(105, -2);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public static void method4242() {
		@Pc(10) int local10 = Static627.aClass5_Sub46_31.aClass11_Sub8_2.method2214();
		if (local10 == 0) {
			Static479.aByteArrayArrayArray21 = null;
			Static446.method6619(0);
		} else if (local10 == 1) {
			Static647.method8873((byte) 0);
			Static446.method6619(512);
			if (Static480.aByteArrayArrayArray19 != null) {
				Static185.method2972();
			}
		} else {
			Static647.method8873((byte) (Static92.anInt9992 - 4 & 0xFF));
			Static446.method6619(2);
		}
		Static22.anInt464 = Static299.anInt4751;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method4243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class126 arg4) {
		arg4.KA(arg1, arg2, arg0 + arg1, arg2 + arg3);
		arg4.method7045(arg0, arg3, arg2, arg1, -16777216);
		if (Static88.anInt1458 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static203.anInt130 / (float) Static203.anInt134;
		@Pc(35) int local35 = arg0;
		@Pc(37) int local37 = arg3;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg0);
		} else {
			local35 = (int) ((float) arg3 / local33);
		}
		@Pc(64) int local64 = arg1 + (arg0 - local35) / 2;
		@Pc(73) int local73 = arg2 + (arg3 - local37) / 2;
		if (Static619.aClass44_37 == null || Static619.aClass44_37.method5319() != arg0 || Static619.aClass44_37.method5320() != arg3) {
			Static203.method157(Static203.anInt136, Static203.anInt137 + Static203.anInt130, Static203.anInt134 + Static203.anInt136, Static203.anInt137, local64, local73, local35 + local64, local37 + local73);
			Static203.method155(arg4);
			Static619.aClass44_37 = arg4.method6988(local64, local73, local35, local37, false);
		}
		Static619.aClass44_37.method5312(local64, local73);
		@Pc(129) int local129 = local35 * Static69.anInt1101 / Static203.anInt134;
		@Pc(135) int local135 = local37 * Static382.anInt10004 / Static203.anInt130;
		@Pc(143) int local143 = local35 * Static100.anInt1578 / Static203.anInt134 + local64;
		@Pc(157) int local157 = local37 + local73 - local135 - local37 * Static552.anInt9133 / Static203.anInt130;
		@Pc(159) int local159 = -1996554240;
		if (Static24.aClass235_1 == Static609.aClass235_7) {
			local159 = -1996488705;
		}
		arg4.aa(local143, local157, local129, local135, local159, 1);
		arg4.method7021(local143, local157, local129, local135, local159, 0);
		if (Static340.anInt5872 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static10.anInt161 > 50) {
			local198 = 500 - Static10.anInt161 * 5;
		} else {
			local198 = Static10.anInt161 * 5;
		}
		for (@Pc(209) Class5_Sub39 local209 = (Class5_Sub39) Static203.aClass306_2.method7313(); local209 != null; local209 = (Class5_Sub39) Static203.aClass306_2.method7301()) {
			@Pc(217) Class72 local217 = Static203.aClass273_2.method6529(local209.anInt7217);
			if (Static364.method5690(local217)) {
				@Pc(238) int local238;
				@Pc(249) int local249;
				if (local209.anInt7217 == Static299.anInt4748) {
					local238 = local209.anInt7224 * local35 / Static203.anInt134 + local64;
					local249 = (Static203.anInt130 - local209.anInt7220) * local37 / Static203.anInt130 + local73;
					arg4.method7045(4, 4, local249 - 2, local238 + -2, local198 << 24 | 0xFFFF00);
				} else if (Static95.anInt1501 != -1 && local217.anInt1513 == Static95.anInt1501) {
					local238 = local64 + local209.anInt7224 * local35 / Static203.anInt134;
					local249 = local37 * (Static203.anInt130 - local209.anInt7220) / Static203.anInt130 + local73;
					arg4.method7045(4, 4, local249 - 2, local238 + -2, local198 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLclient!ee;Ljava/lang/String;)I")
	public static int method4245(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt10154;
		@Pc(10) byte[] local10 = Static343.method5256(arg1);
		arg0.method8594(local10.length);
		arg0.anInt10154 += Static575.aClass41_1.method850(0, arg0.aByteArray104, local10, arg0.anInt10154, local10.length);
		return arg0.anInt10154 - local6;
	}
}
