import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!pm;")
	public static Class133 aClass133_4;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public static int anInt4996 = 0;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public static int anInt4999 = 0;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method3792() {
		Static4.aClass61_1.method1379();
		Static260.aClass61_49.method1379();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
	public static void method3793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static48.method768(arg4);
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = arg4;
		@Pc(17) int local17 = -arg4;
		@Pc(22) int local22 = arg4 - arg2;
		@Pc(24) int local24 = -1;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(77) int local77;
		if (Static228.anInt4643 <= arg3 && Static244.anInt4872 >= arg3) {
			@Pc(39) int[] local39 = Static181.anIntArrayArray19[arg3];
			local48 = Static2.method4(Static52.anInt1146, arg0 - arg4, anInt4996);
			local58 = Static2.method4(Static52.anInt1146, arg4 + arg0, anInt4996);
			local67 = Static2.method4(Static52.anInt1146, arg0 - local22, anInt4996);
			local77 = Static2.method4(Static52.anInt1146, arg0 + local22, anInt4996);
			Static19.method343(local48, arg5, local39, local67);
			Static19.method343(local67, arg1, local39, local77);
			Static19.method343(local77, arg5, local39, local58);
		}
		@Pc(99) int local99 = -1;
		@Pc(101) int local101 = local22;
		@Pc(104) int local104 = -local22;
		while (local8 < local14) {
			local24 += 2;
			local104 += local24;
			if (local104 >= 0 && local101 >= 1) {
				local101--;
				local104 -= local101 << 1;
				Static88.anIntArray128[local101] = local8;
			}
			local8++;
			local99 += 2;
			local17 += local99;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(216) int[] local216;
			@Pc(153) int local153;
			if (local17 >= 0) {
				local14--;
				local153 = arg3 - local14;
				local48 = local14 + arg3;
				if (local48 >= Static228.anInt4643 && local153 <= Static244.anInt4872) {
					if (local22 > local14) {
						local58 = Static88.anIntArray128[local14];
						local67 = Static2.method4(Static52.anInt1146, arg0 + local8, anInt4996);
						local77 = Static2.method4(Static52.anInt1146, arg0 - local8, anInt4996);
						local200 = Static2.method4(Static52.anInt1146, arg0 + local58, anInt4996);
						local209 = Static2.method4(Static52.anInt1146, arg0 - local58, anInt4996);
						if (local48 <= Static244.anInt4872) {
							local216 = Static181.anIntArrayArray19[local48];
							Static19.method343(local77, arg5, local216, local209);
							Static19.method343(local209, arg1, local216, local200);
							Static19.method343(local200, arg5, local216, local67);
						}
						if (local153 >= Static228.anInt4643) {
							local216 = Static181.anIntArrayArray19[local153];
							Static19.method343(local77, arg5, local216, local209);
							Static19.method343(local209, arg1, local216, local200);
							Static19.method343(local200, arg5, local216, local67);
						}
					} else {
						local58 = Static2.method4(Static52.anInt1146, arg0 + local8, anInt4996);
						local67 = Static2.method4(Static52.anInt1146, arg0 - local8, anInt4996);
						if (local48 <= Static244.anInt4872) {
							Static19.method343(local67, arg5, Static181.anIntArrayArray19[local48], local58);
						}
						if (Static228.anInt4643 <= local153) {
							Static19.method343(local67, arg5, Static181.anIntArrayArray19[local153], local58);
						}
					}
				}
				local17 -= local14 << 1;
			}
			local153 = arg3 - local8;
			local48 = arg3 + local8;
			if (Static228.anInt4643 <= local48 && local153 <= Static244.anInt4872) {
				local58 = arg0 + local14;
				local67 = arg0 - local14;
				if (anInt4996 <= local58 && Static52.anInt1146 >= local67) {
					local58 = Static2.method4(Static52.anInt1146, local58, anInt4996);
					local67 = Static2.method4(Static52.anInt1146, local67, anInt4996);
					if (local22 <= local8) {
						if (local48 <= Static244.anInt4872) {
							Static19.method343(local67, arg5, Static181.anIntArrayArray19[local48], local58);
						}
						if (local153 >= Static228.anInt4643) {
							Static19.method343(local67, arg5, Static181.anIntArrayArray19[local153], local58);
						}
					} else {
						local77 = local8 <= local101 ? local101 : Static88.anIntArray128[local8];
						local200 = Static2.method4(Static52.anInt1146, arg0 + local77, anInt4996);
						local209 = Static2.method4(Static52.anInt1146, arg0 - local77, anInt4996);
						if (local48 <= Static244.anInt4872) {
							local216 = Static181.anIntArrayArray19[local48];
							Static19.method343(local67, arg5, local216, local209);
							Static19.method343(local209, arg1, local216, local200);
							Static19.method343(local200, arg5, local216, local58);
						}
						if (local153 >= Static228.anInt4643) {
							local216 = Static181.anIntArrayArray19[local153];
							Static19.method343(local67, arg5, local216, local209);
							Static19.method343(local209, arg1, local216, local200);
							Static19.method343(local200, arg5, local216, local58);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!vm;")
	public static Class173 method3795(@OriginalArg(0) int arg0) {
		@Pc(10) Class173 local10 = (Class173) Static160.aClass61_27.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static16.aClass132_63.method3194(Static188.method2947(arg0), Static177.method1356(arg0));
		local10 = new Class173();
		local10.anInt5632 = arg0;
		if (local26 != null) {
			local10.method4246(new Class8_Sub2(local26));
		}
		local10.method4238();
		Static160.aClass61_27.method1377((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method3796() {
		@Pc(7) int local7 = Static41.anInt884;
		@Pc(15) int local15 = Static151.anInt4076 - local7 - Static13.anInt356;
		@Pc(23) int local23 = Static167.anInt3366;
		@Pc(31) int local31 = Static11.anInt2953 - local23 - Static250.anInt4959;
		if (local23 <= 0 && local31 <= 0 && local7 <= 0 && local15 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static58.aFrame2 != null) {
				local52 = Static58.aFrame2;
			} else if (Static209.aFrame3 == null) {
				local52 = Static199.aClass17_3.anApplet1;
			} else {
				local52 = Static209.aFrame3;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (Static209.aFrame3 == local52) {
				@Pc(74) Insets local74 = Static209.aFrame3.getInsets();
				local65 = local74.left;
				local67 = local74.top;
			}
			@Pc(83) Graphics local83 = local52.getGraphics();
			local83.setColor(Color.black);
			if (local23 > 0) {
				local83.fillRect(local65, local67, local23, Static151.anInt4076);
			}
			if (local7 > 0) {
				local83.fillRect(local65, local67, Static11.anInt2953, local7);
			}
			if (local31 > 0) {
				local83.fillRect(local65 + Static11.anInt2953 - local31, local67, local31, Static151.anInt4076);
			}
			if (local15 > 0) {
				local83.fillRect(local65, Static151.anInt4076 + local67 - local15, Static11.anInt2953, local15);
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBII)I")
	public static int method3797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(31) int local31 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg3 : arg2;
		@Pc(38) int local38 = local7 >= 8 ? arg1 : arg3;
		return ((local7 & 0x1) == 0 ? local38 : -local38) + ((local7 & 0x2) == 0 ? local31 : -local31);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	public static int method3798(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
