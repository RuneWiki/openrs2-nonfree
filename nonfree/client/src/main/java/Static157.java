import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "Lclient!ct;")
	public static Class30 aClass30_47;

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	public static int anInt3251;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(13) Class32_Sub1 local13 = new Class32_Sub1();
		local13.aString7 = arg5;
		local13.anInt1272 = arg6;
		local13.anInt1266 = arg3;
		local13.anInt1269 = arg4;
		local13.anInt1264 = arg1 + Static51.anInt1301;
		local13.anInt1267 = arg0;
		local13.anInt1274 = arg2;
		Static299.aClass195_8.method5300(local13);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2978(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				@Pc(74) char local74 = Static97.aCharArray13[(int) (local60 - arg0 * 37L)];
				if (local74 == '_') {
					@Pc(84) int local84 = local56.length() - 1;
					local74 = ' ';
					local56.setCharAt(local84, Character.toUpperCase(local56.charAt(local84)));
				}
				local56.append(local74);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
	public static int method2980(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!fp;IIIILclient!th;IB)V")
	public static void method2981(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class196 arg5, @OriginalArg(6) int arg6) {
		@Pc(9) Interface4 local9 = null;
		if (arg2 == 0) {
			local9 = (Interface4) Static342.method5727(arg1, arg4, arg6);
		}
		if (arg2 == 1) {
			local9 = (Interface4) Static74.method1619(arg1, arg4, arg6);
		}
		if (arg2 == 2) {
			local9 = (Interface4) Static138.method2791(arg1, arg4, arg6, jb.class);
		}
		if (arg2 == 3) {
			local9 = (Interface4) Static109.method2324(arg1, arg4, arg6);
		}
		if (local9 == null) {
			return;
		}
		@Pc(62) int local62 = local9.method5925();
		@Pc(66) int local66 = local9.method5922();
		@Pc(72) Class71 local72 = Static219.method4081(local9.method5927());
		if (local72.method2277()) {
			Static201.method3744(local72, arg1, arg6, arg4);
		}
		if (local9.method5924()) {
			local9.method5920(arg0);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static136.method4751(arg1, arg4, arg6);
				return;
			}
			if (arg2 == 2) {
				Static69.method1568(arg1, arg4, arg6, jb.class);
				if (local72.anInt2397 != 0 && Static311.anInt5653 > arg4 + local72.anInt2411 && arg6 + local72.anInt2411 < Static189.anInt3820 && Static311.anInt5653 > arg4 + local72.anInt2376 && arg6 + local72.anInt2376 < Static189.anInt3820) {
					arg5.method5326(local72.anInt2376, local66, local72.aBoolean171, local72.anInt2411, arg6, !local72.aBoolean174, arg4);
					return;
				}
			} else if (arg2 == 3) {
				Static194.method3630(arg1, arg4, arg6);
				if (local72.anInt2397 != 1) {
					return;
				}
				arg5.method5311(arg6, arg4);
			} else {
				return;
			}
			return;
		}
		Static149.method2882(arg1, arg4, arg6);
		if (local72.anInt2397 != 0) {
			arg5.method5328(local62, local72.aBoolean171, !local72.aBoolean174, arg4, local66, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method2984(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static5.aClass162_1 != null) {
			@Pc(27) int local27;
			try {
				Static5.aClass162_1.method4553(0L);
				Static5.aClass162_1.method4547(local15);
				for (local27 = 0; local27 < 24 && local15[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local27 = 0; local27 < 24; local27++) {
					local15[local27] = -1;
				}
			}
		}
		arg0.method2133(24, local15);
	}
}
