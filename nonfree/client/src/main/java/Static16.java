import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_13 = new Class209("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
	public static boolean method318(@OriginalArg(1) int arg0) {
		if (Static214.aBooleanArray18[arg0]) {
			return true;
		} else if (Static277.aClass160_56.method3719(arg0)) {
			@Pc(25) int local25 = Static277.aClass160_56.method3722(arg0);
			if (local25 == 0) {
				Static214.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static60.aClass68ArrayArray1[arg0] == null) {
				Static60.aClass68ArrayArray1[arg0] = new Class68[local25];
			}
			for (@Pc(44) int local44 = 0; local44 < local25; local44++) {
				if (Static60.aClass68ArrayArray1[arg0][local44] == null) {
					@Pc(58) byte[] local58 = Static277.aClass160_56.method3696(local44, arg0);
					if (local58 != null) {
						@Pc(70) Class68 local70 = Static60.aClass68ArrayArray1[arg0][local44] = new Class68();
						local70.anInt2229 = local44 + (arg0 << 16);
						if (local58[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local70.method1745(new Class2_Sub23(local58));
					}
				}
			}
			Static214.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I")
	public static int method320() {
		return 6;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)Z")
	public static boolean method324(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 23 || arg0 == 20 || arg0 == 3 || arg0 == 19) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ya;ILclient!bh;)I")
	public static int method326(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1.anInt596 != -1) {
			return arg1.anInt596;
		}
		if (arg1.anInt600 != -1) {
			@Pc(32) Class140 local32 = arg0.anInterface4_6.method3794(arg0.method4465() ? arg1.anInt600 : arg1.anInt601);
			if (!local32.aBoolean293) {
				return local32.aShort44;
			}
		}
		return arg1.anInt594;
	}
}
