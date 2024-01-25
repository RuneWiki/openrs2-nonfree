import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!er;")
	public static final Class86 aClass86_2 = new Class86();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILclient!gaa;)V")
	public static void method1330(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class108 arg1) {
		@Pc(16) int local16 = arg1.anInt4084 == 0 ? arg1.anInt4067 : arg1.anInt4084;
		@Pc(25) int local25 = arg1.anInt4035 == 0 ? arg1.anInt4037 : arg1.anInt4035;
		Static384.method6091(arg1.anInt4043, local16, local25, Static85.aClass108ArrayArray2[arg1.anInt4043 >> 16], arg0);
		if (arg1.aClass108Array1 != null) {
			Static384.method6091(arg1.anInt4043, local16, local25, arg1.aClass108Array1, arg0);
		}
		@Pc(58) Class3_Sub50 local58 = (Class3_Sub50) Static40.aClass307_5.method7424((long) arg1.anInt4043);
		if (local58 != null) {
			Static282.method4635(local16, local25, arg0, local58.anInt9575);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method1333(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static310.method5221(arg1, local11, arg0);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class243 local13 = local7.aClass243_1; local13 != null; local13 = local13.aClass243_3) {
			@Pc(17) Class2_Sub3_Sub1 local17 = local13.aClass2_Sub3_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort121 == arg1 && local17.aShort124 == arg2) {
				Static634.method8595(local17, false);
				return;
			}
		}
	}
}
