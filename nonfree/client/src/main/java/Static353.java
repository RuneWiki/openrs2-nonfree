import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_220 = new Class18(41, 15);

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "[Lclient!np;")
	public static final Class1_Sub4_Sub20[] aClass1_Sub4_Sub20Array3 = new Class1_Sub4_Sub20[14];

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_174 = new Class21(64);

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
	public static int anInt6596 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	public static void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static339.aClass1_Sub7_Sub2_4.method2115(arg0);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg2);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg1);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!gt;IBLjava/awt/Component;)Lclient!fr;")
	public static Class48 method5813(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static14.anInt4962 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class48 local31 = (Class48) Class.forName("Class48_Sub1").getDeclaredConstructor().newInstance();
			local31.anInt1951 = arg0;
			local31.anIntArray150 = new int[(Static100.aBoolean156 ? 2 : 1) * 256];
			local31.method1829(arg3);
			local31.anInt1955 = (-1024 & arg0) + 1024;
			if (local31.anInt1955 > 16384) {
				local31.anInt1955 = 16384;
			}
			local31.method1835(local31.anInt1955);
			if (Static237.anInt2675 > 0 && Static351.aClass74_2 == null) {
				Static351.aClass74_2 = new Class74();
				Static351.aClass74_2.aClass75_3 = arg1;
				arg1.method2366(Static237.anInt2675, Static351.aClass74_2);
			}
			if (Static351.aClass74_2 != null) {
				if (Static351.aClass74_2.aClass48Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static351.aClass74_2.aClass48Array1[arg2] = local31;
			}
			return local31;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class48_Sub2 local109 = new Class48_Sub2(arg1, arg2);
				local109.anIntArray150 = new int[(Static100.aBoolean156 ? 2 : 1) * 256];
				local109.anInt1951 = arg0;
				local109.method1829(arg3);
				local109.anInt1955 = 16384;
				local109.method1835(local109.anInt1955);
				if (Static237.anInt2675 > 0 && Static351.aClass74_2 == null) {
					Static351.aClass74_2 = new Class74();
					Static351.aClass74_2.aClass75_3 = arg1;
					arg1.method2366(Static237.anInt2675, Static351.aClass74_2);
				}
				if (Static351.aClass74_2 != null) {
					if (Static351.aClass74_2.aClass48Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static351.aClass74_2.aClass48Array1[arg2] = local109;
				}
				return local109;
			} catch (@Pc(179) Throwable local179) {
				return new Class48();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	public static void method5815(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub4_Sub17 local18 = Static132.method2717(arg0, 12);
		local18.method3481();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZII)I")
	public static int method5817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(31) int local31 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00) * local8 & 0xFF0000 | (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8) + local31;
	}
}
