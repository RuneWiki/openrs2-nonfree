import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "Lclient!uq;")
	public static Class348 aClass348_1;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "Lclient!bo;")
	public static final Class5_Sub8 aClass5_Sub8_1 = new Class5_Sub8(0, 0);

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
	public static int anInt8017 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BII)Z")
	public static boolean method6947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ha;IIILjava/lang/String;ZII)V")
	public static void method6949(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static42.aClass44_2 == null || Static327.aClass44_18 == null) {
			if (Static488.aClass384_112.method8883(Static133.anInt3879) && Static488.aClass384_112.method8883(Static368.anInt6509)) {
				Static42.aClass44_2 = arg0.method6994(Static654.method4046(Static488.aClass384_112, Static133.anInt3879, 0), true);
				@Pc(28) Class176 local28 = Static654.method4046(Static488.aClass384_112, Static368.anInt6509, 0);
				Static327.aClass44_18 = arg0.method6994(local28, true);
				local28.method4056();
				Static181.aClass44_14 = arg0.method6994(local28, true);
			} else {
				arg0.aa(arg2, arg5, arg1, 20, 255 - Static605.anInt9912 << 24 | Static415.anInt7119, 1);
			}
		}
		if (Static42.aClass44_2 != null && Static327.aClass44_18 != null) {
			@Pc(75) int local75 = (arg1 - Static327.aClass44_18.method5319() * 2) / Static42.aClass44_2.method5319();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static42.aClass44_2.method5312(Static327.aClass44_18.method5319() + arg2 + Static42.aClass44_2.method5319() * local77, arg5);
			}
			Static327.aClass44_18.method5312(arg2, arg5);
			Static181.aClass44_14.method5312(arg1 + arg2 - Static181.aClass44_14.method5319(), arg5);
		}
		Static471.aClass6_12.method7214(arg2 + 3, arg3, arg5 + 14, -1, -16777216 | Static455.anInt7665);
		arg0.aa(arg2, arg5 + 20, arg1, arg4 - 20, Static415.anInt7119 | -Static605.anInt9912 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
	public static void method6952() {
		if (!Static609.aBoolean813) {
			Static609.aBoolean813 = true;
			Static322.aFloat112 += (24.0F - Static322.aFloat112) / 2.0F;
			Static349.aBoolean501 = true;
		}
	}
}
