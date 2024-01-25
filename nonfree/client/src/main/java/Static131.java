import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
	public static int anInt2368;

	@OriginalMember(owner = "client!gj", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!gj", name = "tb", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_91 = new Class56(65, -2);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	public static boolean method1881(@OriginalArg(0) int arg0) {
		if (Static7.aBooleanArray1[arg0]) {
			return true;
		} else if (Static412.aClass211_92.method4372(arg0)) {
			@Pc(25) int local25 = Static412.aClass211_92.method4365(arg0);
			if (local25 == 0) {
				Static7.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static412.aClass110ArrayArray2[arg0] == null) {
				Static412.aClass110ArrayArray2[arg0] = new Class110[local25];
			}
			for (@Pc(49) int local49 = 0; local49 < local25; local49++) {
				if (Static412.aClass110ArrayArray2[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static412.aClass211_92.method4377(arg0, local49);
					if (local63 != null) {
						@Pc(75) Class110 local75 = Static412.aClass110ArrayArray2[arg0][local49] = new Class110();
						local75.anInt2675 = (arg0 << 16) + local49;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method2053(new Class4_Sub9(local63));
					}
				}
			}
			Static7.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
	public static void method1901() {
		@Pc(7) Class70 local7 = null;
		try {
			@Pc(17) Class45 local17 = Static24.aClass196_1.method3908("2", true);
			while (local17.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (local17.anInt1129 == 1) {
				local7 = (Class70) local17.anObject5;
				@Pc(42) byte[] local42 = new byte[(int) local7.method1446()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local7.method1445(local44, local42, local42.length - local44);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static249.method6048(new Class4_Sub9(local42));
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method1443();
			}
		} catch (@Pc(93) Exception local93) {
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qn;IBI)Lclient!lf;")
	public static Class4_Sub2_Sub11 method1914(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0.method4377(arg2, arg1));
		@Pc(45) Class4_Sub2_Sub11 local45 = new Class4_Sub2_Sub11(arg1, local14.method5038(), local14.method5038(), local14.method4997(), local14.method4997(), local14.method5007() == 1, local14.method5007(), local14.method5007());
		@Pc(57) int local57 = local14.method5007();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local45.aClass244_17.method5273(new Class4_Sub10(local14.method5007(), local14.method5028(), local14.method5028(), local14.method5028(), local14.method5028(), local14.method5028(), local14.method5028(), local14.method5028(), local14.method5028()));
		}
		local45.method3013();
		return local45;
	}
}
