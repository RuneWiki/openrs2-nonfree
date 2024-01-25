import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
	public static int anInt934;

	@OriginalMember(owner = "client!bg", name = "kb", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!bg", name = "nb", descriptor = "Lclient!mq;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)[B")
	public static byte[] method723(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = local8.method3118();
		@Pc(16) int local16 = local8.method3116();
		if (local16 < 0 || Static527.anInt8332 != 0 && local16 > Static527.anInt8332) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(91) byte[] local91 = new byte[local16];
			local8.method3090(local16, local91);
			return local91;
		} else {
			@Pc(42) int local42 = local8.method3116();
			if (local42 < 0 || Static527.anInt8332 != 0 && Static527.anInt8332 < local42) {
				throw new RuntimeException();
			}
			@Pc(59) byte[] local59 = new byte[local42];
			if (local12 == 1) {
				Static61.method1154(local59, local42, arg0, local16);
			} else {
				@Pc(66) Class100 local66 = Static63.aClass100_1;
				synchronized (Static63.aClass100_1) {
					Static63.aClass100_1.method2788(local8, local59);
				}
			}
			return local59;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method724(@OriginalArg(0) Class43 arg0) {
		Static410.aClass117_8 = Static588.method2589(arg0, true, Static40.anInt4550);
		Static519.aClass58_13 = Static502.method6773(arg0, Static40.anInt4550);
		Static49.aClass117_1 = Static588.method2589(arg0, true, Static304.anInt5516);
		Static103.aClass58_6 = Static502.method6773(arg0, Static304.anInt5516);
		Static480.aClass117_9 = Static588.method2589(arg0, true, Static356.anInt6158);
		Static159.aClass58_7 = Static502.method6773(arg0, Static356.anInt6158);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method726(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
