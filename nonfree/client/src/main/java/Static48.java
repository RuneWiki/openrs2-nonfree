import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public static int anInt1043;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_329 = Static151.method2243("<col=80ff00>");

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_330 = Static151.method2243("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_331 = Static151.method2243("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!mb;Lclient!mb;ILclient!pb;)Lclient!vi;")
	public static Class2_Sub1_Sub2 method731(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(14) int local14 = arg2.method2114(arg0);
		@Pc(20) int local20 = arg2.method2142(arg1, local14);
		return Static8.method149(local20, local14, arg2);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
	public static void method732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 + arg5;
		@Pc(15) int local15 = arg1 - arg5;
		@Pc(19) int local19 = arg5 + arg4;
		@Pc(24) int local24 = arg0 - arg5;
		for (@Pc(26) int local26 = arg3; local26 < local10; local26++) {
			Static19.method345(arg2, Static55.anIntArrayArray8[local26], arg4, arg0);
		}
		for (@Pc(53) int local53 = arg1; local53 > local15; local53--) {
			Static19.method345(arg2, Static55.anIntArrayArray8[local53], arg4, arg0);
		}
		for (@Pc(73) int local73 = local10; local73 <= local15; local73++) {
			@Pc(79) int[] local79 = Static55.anIntArrayArray8[local73];
			Static19.method345(arg2, local79, arg4, local19);
			Static19.method345(arg2, local79, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!dh;)V")
	public static void method734(@OriginalArg(1) Class7_Sub2 arg0) {
		if (Static25.anInt581 == arg0.anInt3100 || arg0.anInt3062 == -1 || arg0.anInt3075 != 0 || arg0.anInt3055 + 1 > Static90.method27(arg0.anInt3062).anIntArray389[arg0.anInt3066]) {
			@Pc(43) int local43 = arg0.anInt3100 - arg0.anInt3069;
			@Pc(48) int local48 = Static25.anInt581 - arg0.anInt3069;
			@Pc(59) int local59 = arg0.anInt3076 * 128 + arg0.anInt3048 * 64;
			@Pc(69) int local69 = arg0.anInt3048 * 64 + arg0.anInt3047 * 128;
			@Pc(79) int local79 = arg0.anInt3058 * 128 + arg0.anInt3048 * 64;
			@Pc(90) int local90 = arg0.anInt3059 * 128 + arg0.anInt3048 * 64;
			arg0.anInt3046 = ((local43 - local48) * local59 + local48 * local90) / local43;
			arg0.anInt3085 = (local48 * local79 + local69 * (local43 - local48)) / local43;
		}
		arg0.anInt3084 = 0;
		if (arg0.anInt3061 == 0) {
			arg0.anInt3098 = 1024;
		}
		if (arg0.anInt3061 == 1) {
			arg0.anInt3098 = 1536;
		}
		if (arg0.anInt3061 == 2) {
			arg0.anInt3098 = 0;
		}
		if (arg0.anInt3061 == 3) {
			arg0.anInt3098 = 512;
		}
		arg0.anInt3071 = arg0.anInt3098;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)V")
	public static void method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = -arg0;
		@Pc(22) int local22 = -1;
		@Pc(31) int local31 = Static144.method2183(arg1 + arg0, Static122.anInt2718, Static153.anInt3279);
		@Pc(40) int local40 = Static144.method2183(arg1 - arg0, Static122.anInt2718, Static153.anInt3279);
		Static19.method345(arg3, Static55.anIntArrayArray8[arg2], local40, local31);
		while (local15 > local17) {
			local22 += 2;
			local20 += local22;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local20 > 0) {
				local15--;
				local20 -= local15 << 1;
				local72 = arg2 - local15;
				local76 = local15 + arg2;
				if (local76 >= Static154.anInt3307 && local72 <= Static15.anInt353) {
					local91 = Static144.method2183(arg1 + local17, Static122.anInt2718, Static153.anInt3279);
					local100 = Static144.method2183(arg1 - local17, Static122.anInt2718, Static153.anInt3279);
					if (local76 <= Static15.anInt353) {
						Static19.method345(arg3, Static55.anIntArrayArray8[local76], local100, local91);
					}
					if (local72 >= Static154.anInt3307) {
						Static19.method345(arg3, Static55.anIntArrayArray8[local72], local100, local91);
					}
				}
			}
			local17++;
			local76 = local17 + arg2;
			local72 = arg2 - local17;
			if (Static154.anInt3307 <= local76 && local72 <= Static15.anInt353) {
				local91 = Static144.method2183(local15 + arg1, Static122.anInt2718, Static153.anInt3279);
				local100 = Static144.method2183(arg1 - local15, Static122.anInt2718, Static153.anInt3279);
				if (local76 <= Static15.anInt353) {
					Static19.method345(arg3, Static55.anIntArrayArray8[local76], local100, local91);
				}
				if (local72 >= Static154.anInt3307) {
					Static19.method345(arg3, Static55.anIntArrayArray8[local72], local100, local91);
				}
			}
		}
	}
}
