import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!et", name = "M", descriptor = "[Lclient!s;")
	public static Class42[] aClass42Array4;

	@OriginalMember(owner = "client!et", name = "O", descriptor = "Lclient!oga;")
	public static Class267 aClass267_5;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_177 = new Class151(95, 12);

	@OriginalMember(owner = "client!et", name = "P", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_14 = new Class117(12, 7);

	@OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
	public static int anInt8125 = 7000;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "I")
	public static int anInt8126 = anInt8125;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[BBII)V")
	public static void method7081(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 <= arg2) {
			return;
		}
		arg3 += arg2;
		@Pc(33) int local33 = arg0 - arg2 >> 2;
		while (true) {
			local33--;
			if (local33 < 0) {
				local33 = arg0 - arg2 & 0x3;
				while (true) {
					local33--;
					if (local33 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(38) int local38 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg1[local38] = 1;
			@Pc(48) int local48 = local43 + 1;
			arg1[local43] = 1;
			arg3 = local48 + 1;
			arg1[local48] = 1;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Component;ILclient!lc;II)Lclient!nj;")
	public static Class64 method7083(@OriginalArg(0) Component arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static434.anInt6851 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class64 local33 = (Class64) Class.forName("Class64_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt2328 = arg3;
			local33.anIntArray157 = new int[(Static157.aBoolean213 ? 2 : 1) * 256];
			local33.method2221(arg0);
			local33.anInt2334 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt2334 > 16384) {
				local33.anInt2334 = 16384;
			}
			local33.method2215(local33.anInt2334);
			if (Static156.anInt2895 > 0 && Static115.aClass58_1 == null) {
				Static115.aClass58_1 = new Class58();
				Static115.aClass58_1.aClass207_1 = arg1;
				arg1.method4587(Static156.anInt2895, Static115.aClass58_1);
			}
			if (Static115.aClass58_1 != null) {
				if (Static115.aClass58_1.aClass64Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static115.aClass58_1.aClass64Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class64_Sub1 local114 = new Class64_Sub1(arg1, arg2);
				local114.anInt2328 = arg3;
				local114.anIntArray157 = new int[(Static157.aBoolean213 ? 2 : 1) * 256];
				local114.method2221(arg0);
				local114.anInt2334 = 16384;
				local114.method2215(local114.anInt2334);
				if (Static156.anInt2895 > 0 && Static115.aClass58_1 == null) {
					Static115.aClass58_1 = new Class58();
					Static115.aClass58_1.aClass207_1 = arg1;
					arg1.method4587(Static156.anInt2895, Static115.aClass58_1);
				}
				if (Static115.aClass58_1 != null) {
					if (Static115.aClass58_1.aClass64Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static115.aClass58_1.aClass64Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(176) Throwable local176) {
				return new Class64();
			}
		}
	}
}
