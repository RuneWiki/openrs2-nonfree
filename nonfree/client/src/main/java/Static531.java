import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
	public static int anInt9500 = 0;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!lf;")
	public static final Class187 aClass187_33 = new Class187();

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public static void method7863() {
		@Pc(15) Class308 local15 = null;
		try {
			@Pc(21) Class55 local21 = Static375.aClass71_3.method1980("2", true);
			while (local21.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (local21.anInt1481 == 1) {
				local15 = (Class308) local21.anObject5;
				@Pc(43) byte[] local43 = new byte[(int) local15.method7735()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local15.method7737(local43, local43.length - local45, local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static233.method4139(new Class12_Sub8(local43));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local15 != null) {
				local15.method7739();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIII)V")
	public static void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg3; local8 <= arg4; local8++) {
			Static118.method2461(Static228.anIntArrayArray46[local8], arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!lm;")
	public static Class30_Sub1 method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class243 local14 = local7.aClass243_3; local14 != null; local14 = local14.aClass243_11) {
			@Pc(18) Class30_Sub1 local18 = local14.aClass30_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort115 == arg1 && local18.aShort112 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[S)[S")
	public static short[] method7868(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static554.method3501(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
