import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	public static void method712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 + Static238.anInt4280;
		@Pc(13) int local13 = Static371.anInt6936 + arg2;
		if (Static399.aClass262ArrayArrayArray2 == null || arg0 < 0 || arg2 < 0 || Static363.anInt1158 <= arg0 || arg2 >= Static511.anInt8889) {
			return;
		}
		@Pc(47) long local47 = (long) (local13 << 14 | arg1 << 28 | local9);
		@Pc(53) Class2_Sub40 local53 = (Class2_Sub40) Static357.aClass127_36.method3205(local47);
		if (local53 == null) {
			Static466.method7013(arg1, arg0, arg2);
			return;
		}
		@Pc(67) Class2_Sub27 local67 = (Class2_Sub27) local53.aClass249_57.method6527();
		if (local67 == null) {
			Static466.method7013(arg1, arg0, arg2);
			return;
		}
		@Pc(81) Class1_Sub5_Sub1 local81 = (Class1_Sub5_Sub1) Static466.method7013(arg1, arg0, arg2);
		if (local81 == null) {
			local81 = new Class1_Sub5_Sub1();
		} else {
			local81.anInt7975 = local81.anInt7963 = -1;
		}
		local81.anInt7967 = local67.anInt3463;
		local81.anInt7968 = local67.anInt3461;
		label46: while (true) {
			@Pc(109) Class2_Sub27 local109 = (Class2_Sub27) local53.aClass249_57.method6525();
			if (local109 == null) {
				break;
			}
			if (local81.anInt7967 != local109.anInt3463) {
				local81.anInt7974 = local109.anInt3461;
				local81.anInt7975 = local109.anInt3463;
				while (true) {
					@Pc(134) Class2_Sub27 local134 = (Class2_Sub27) local53.aClass249_57.method6525();
					if (local134 == null) {
						break label46;
					}
					if (local81.anInt7967 != local134.anInt3463 && local81.anInt7975 != local134.anInt3463) {
						local81.anInt7963 = local134.anInt3463;
						local81.anInt7970 = local134.anInt3461;
					}
				}
			}
		}
		@Pc(178) int local178 = Static200.method3233(arg1, (arg0 << 7) + 64, (arg2 << 7) + 64);
		Static447.method6826(arg1, arg0, arg2, local178, local81);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)Z")
	public static boolean method713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static368.method5871(arg1, arg0) | Static431.method6615(arg1, arg0)) & Static262.method6209(arg1, arg0);
	}
}
