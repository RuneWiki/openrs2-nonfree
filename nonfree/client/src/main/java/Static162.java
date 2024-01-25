import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "[I")
	public static int[] anIntArray621;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_53 = new Class11(19, 4);

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt3139 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
	public static int method2888() {
		if (Static385.aFrame2 == null) {
			return Static344.aBoolean359 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!nl;I)V")
	public static void method2889(@OriginalArg(0) Class171 arg0) {
		Static5.anInt197 = arg0.method3769("titlebg");
		Static14.anInt358 = arg0.method3769("logo");
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method2890() {
		if (Static234.anInt4158 == -1) {
			return;
		}
		@Pc(15) int local15 = Static311.aClass129_1.method2997();
		@Pc(19) int local19 = Static311.aClass129_1.method2989();
		if (Static29.aClass2_Sub19_1 != null) {
			local15 = Static29.aClass2_Sub19_1.method2378();
			local19 = Static29.aClass2_Sub19_1.method2380();
		}
		Static325.method4821(Static362.anInt6102, local19, 0, 0, local15, 0, Static234.anInt4158, 0, Static253.anInt4467);
		if (Static240.aClass4_18 != null) {
			Static289.method4380(local19, local15);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)I")
	public static int method2892(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(78) char local78;
			if (local17 == '\u0000') {
				local78 = arg1.charAt(local13++);
			} else {
				local78 = local17;
			}
			@Pc(91) char local91;
			if (local19 == '\u0000') {
				local91 = arg0.charAt(local15++);
			} else {
				local91 = local19;
			}
			local17 = Static228.method3720(local78);
			local19 = Static228.method3720(local91);
			local78 = Static76.method1206(local78, arg2);
			local91 = Static76.method1206(local91, arg2);
			if (local91 != local78 && Character.toUpperCase(local78) != Character.toUpperCase(local91)) {
				local78 = Character.toLowerCase(local78);
				local91 = Character.toLowerCase(local91);
				if (local91 != local78) {
					return Static37.method681(arg2, local78) - Static37.method681(arg2, local91);
				}
			}
		}
		@Pc(150) int local150 = Math.min(local8, local11);
		for (@Pc(152) int local152 = 0; local152 < local150; local152++) {
			if (arg2 == 2) {
				local15 = local11 - local152 - 1;
				local13 = local8 - local152 - 1;
			} else {
				local15 = local152;
				local13 = local152;
			}
			@Pc(180) char local180 = arg1.charAt(local13);
			@Pc(184) char local184 = arg0.charAt(local15);
			if (local184 != local180 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local184 != local180) {
					return Static37.method681(arg2, local180) - Static37.method681(arg2, local184);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(230) int local230 = 0; local230 < local150; local230++) {
			@Pc(236) char local236 = arg1.charAt(local230);
			@Pc(240) char local240 = arg0.charAt(local230);
			if (local240 != local236) {
				return Static37.method681(arg2, local236) - Static37.method681(arg2, local240);
			}
		}
		return 0;
	}
}
