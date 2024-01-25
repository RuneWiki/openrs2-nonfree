import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!ui;")
	public static Class230 aClass230_19;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
	public static int anInt1135 = -1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZI)V")
	public static void method894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 7);
		local8.method3004();
		local8.anInt3686 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public static void method896() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static92.anInt1675; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static262.anInt6340; local18++) {
				if (Static287.method4351(Static25.aClass132ArrayArrayArray1, true, local14, local18, local12)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)I")
	public static int method897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BILjava/awt/Component;ILclient!ng;)Lclient!n;")
	public static Class14 method899(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class162 arg3) {
		if (Static212.anInt3652 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class14 local36 = (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
			local36.anIntArray682 = new int[(Static250.aBoolean432 ? 2 : 1) * 256];
			local36.anInt5699 = arg0;
			local36.method4902(arg1);
			local36.anInt5692 = (arg0 & 0xFFFFFC00) + 1024;
			if (local36.anInt5692 > 16384) {
				local36.anInt5692 = 16384;
			}
			local36.method4895(local36.anInt5692);
			if (Static101.anInt1798 > 0 && Static10.aClass209_1 == null) {
				Static10.aClass209_1 = new Class209();
				Static10.aClass209_1.aClass162_4 = arg3;
				arg3.method3278(Static101.anInt1798, Static10.aClass209_1);
			}
			if (Static10.aClass209_1 != null) {
				if (Static10.aClass209_1.aClass14Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static10.aClass209_1.aClass14Array1[arg2] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class14_Sub2 local117 = new Class14_Sub2(arg3, arg2);
				local117.anInt5699 = arg0;
				local117.anIntArray682 = new int[(Static250.aBoolean432 ? 2 : 1) * 256];
				local117.method4902(arg1);
				local117.anInt5692 = 16384;
				local117.method4895(local117.anInt5692);
				if (Static101.anInt1798 > 0 && Static10.aClass209_1 == null) {
					Static10.aClass209_1 = new Class209();
					Static10.aClass209_1.aClass162_4 = arg3;
					arg3.method3278(Static101.anInt1798, Static10.aClass209_1);
				}
				if (Static10.aClass209_1 != null) {
					if (Static10.aClass209_1.aClass14Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static10.aClass209_1.aClass14Array1[arg2] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class14();
			}
		}
	}
}
