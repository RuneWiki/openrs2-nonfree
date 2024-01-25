import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!iaa;Ljava/lang/String;)I")
	public static int method5175(@OriginalArg(1) Class6_Sub26 arg0, @OriginalArg(2) String arg1) {
		@Pc(11) int local11 = arg0.anInt5769;
		@Pc(15) byte[] local15 = Static302.method5729(arg1);
		arg0.method4984(local15.length);
		arg0.anInt5769 += Static54.aClass213_1.method5247(0, arg0.aByteArray65, local15.length, local15, arg0.anInt5769);
		return arg0.anInt5769 - local11;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)V")
	public static void method5181() {
		Static101.aClass9_4.X(Static263.anInt5267, Static104.aClass6_Sub6_Sub1_4.aBoolean128 ? Static581.anInt9824 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)V")
	public static void method5182() {
		@Pc(10) int local10 = 0;
		if (Static104.aClass6_Sub6_Sub1_4 != null) {
			local10 = Static104.aClass6_Sub6_Sub1_4.method1084(Static5.anInt145);
		}
		@Pc(27) int local27;
		@Pc(40) int local40;
		if (local10 == 2) {
			local27 = Static171.anInt3912 > 800 ? 800 : Static171.anInt3912;
			Static341.anInt6334 = (Static171.anInt3912 - local27) / 2;
			local40 = Static345.anInt6685 > 600 ? 600 : Static345.anInt6685;
			Static228.anInt4744 = local27;
			Static180.anInt4051 = local40;
			Static423.anInt7841 = 0;
		} else if (local10 == 1) {
			local27 = Static171.anInt3912 > 1024 ? 1024 : Static171.anInt3912;
			Static228.anInt4744 = local27;
			local40 = Static345.anInt6685 > 768 ? 768 : Static345.anInt6685;
			Static341.anInt6334 = (Static171.anInt3912 - local27) / 2;
			Static180.anInt4051 = local40;
			Static423.anInt7841 = 0;
		} else {
			Static341.anInt6334 = 0;
			Static423.anInt7841 = 0;
			Static180.anInt4051 = Static345.anInt6685;
			Static228.anInt4744 = Static171.anInt3912;
		}
	}
}
