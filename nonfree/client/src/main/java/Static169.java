import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
	public static int anInt2992;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
	public static int anInt2994;

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "Lclient!kaa;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "[Lclient!rt;")
	public static final Class3_Sub52[] aClass3_Sub52Array1 = new Class3_Sub52[1024];

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "[Lclient!jl;")
	public static Class196[] aClass196Array1 = null;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;III)V")
	public static void method2734(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class31 local9 = Static593.aClass31Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static593.aClass31Array1[local11] = Static593.aClass31Array1[local11 - 1];
		}
		if (false) {
			anInt2992 = -23;
		}
		if (local9 == null) {
			local9 = new Class31(arg3, arg7, arg5, arg4, arg0, arg2, arg6, arg1);
		} else {
			local9.method1130(arg5, arg7, arg3, arg0, arg4, arg1, arg2, arg6);
		}
		Static671.anInt10587 = Static475.anInt7494;
		Static314.anInt5068++;
		Static593.aClass31Array1[0] = local9;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)I")
	public static int method2736(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(56) char local56;
			if (local17 == '\u0000') {
				local56 = arg0.charAt(local13++);
			} else {
				local56 = local17;
			}
			@Pc(66) char local66;
			if (local19 == '\u0000') {
				local66 = arg1.charAt(local15++);
			} else {
				local66 = local19;
			}
			local17 = Static19.method617(local56);
			local19 = Static19.method617(local66);
			local56 = Static326.method4757(arg2, local56);
			local66 = Static326.method4757(arg2, local66);
			if (local66 != local56 && Character.toUpperCase(local56) != Character.toUpperCase(local66)) {
				local56 = Character.toLowerCase(local56);
				local66 = Character.toLowerCase(local66);
				if (local56 != local66) {
					return Static458.method5831(arg2, local56) - Static458.method5831(arg2, local66);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local8, local11);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg2 == 2) {
				local15 = local11 - local139 - 1;
				local13 = local8 - local139 - 1;
			} else {
				local15 = local139;
				local13 = local139;
			}
			@Pc(172) char local172 = arg0.charAt(local13);
			@Pc(176) char local176 = arg1.charAt(local15);
			if (local172 != local176 && Character.toUpperCase(local172) != Character.toUpperCase(local176)) {
				local172 = Character.toLowerCase(local172);
				local176 = Character.toLowerCase(local176);
				if (local172 != local176) {
					return Static458.method5831(arg2, local172) - Static458.method5831(arg2, local176);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(233) int local233 = 0; local233 < local137; local233++) {
			@Pc(241) char local241 = arg0.charAt(local233);
			@Pc(245) char local245 = arg1.charAt(local233);
			if (local245 != local241) {
				return Static458.method5831(arg2, local241) - Static458.method5831(arg2, local245);
			}
		}
		return 0;
	}
}
