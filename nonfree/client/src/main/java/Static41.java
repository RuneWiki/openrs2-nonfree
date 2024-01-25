import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!iu;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	public static void method630(@OriginalArg(0) boolean arg0) {
		Static44.method683();
		if (Static142.anInt2665 != 30 && Static142.anInt2665 != 25) {
			return;
		}
		Static30.anInt6417++;
		if (Static30.anInt6417 < 50 && !arg0) {
			return;
		}
		Static30.anInt6417 = 0;
		if (!Static103.aBoolean155 && Static6.aClass130_1 != null) {
			Static177.method1119(Static181.aClass48_195);
			try {
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				Static209.aClass1_Sub33_Sub2_2.lb = 0;
			} catch (@Pc(54) IOException local54) {
				Static103.aBoolean155 = true;
			}
		}
		Static44.method683();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method635(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) char[] local14 = new char[arg0];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(29) int local29 = arg1[arg2 + local18] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(48) char local48 = Static367.aCharArray6[local29 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local29 = local48;
				}
				local14[local16++] = (char) local29;
			}
		}
		return new String(local14, 0, local16);
	}
}
