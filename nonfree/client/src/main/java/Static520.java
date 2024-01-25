import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[B)Lclient!ht;")
	public static Class4_Sub5_Sub7 method7608(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub5_Sub7 local9 = new Class4_Sub5_Sub7();
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		local14.anInt5831 = local14.aByteArray68.length - 2;
		@Pc(25) int local25 = local14.method4936();
		@Pc(36) int local36 = local14.aByteArray68.length - local25 - 2 - 12;
		local14.anInt5831 = local36;
		@Pc(48) int local48 = local14.method4931();
		local9.anInt3821 = local14.method4936();
		local9.anInt3818 = local14.method4936();
		local9.anInt3819 = local14.method4936();
		local9.anInt3820 = local14.method4936();
		@Pc(72) int local72 = local14.method4905();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass350Array1 = new Class350[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local14.method4936();
				@Pc(93) Class350 local93 = new Class350(Static341.method5553(local86));
				local9.aClass350Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local14.method4931();
					@Pc(108) int local108 = local14.method4931();
					local93.method8199((long) local104, new Class4_Sub38(local108));
				}
			}
		}
		local14.anInt5831 = 0;
		local9.aString33 = local14.method4917();
		local9.anIntArray184 = new int[local48];
		local9.aStringArray21 = new String[local48];
		local9.anIntArray185 = new int[local48];
		local80 = 0;
		while (local14.anInt5831 < local36) {
			local86 = local14.method4936();
			if (local86 == 3) {
				local9.aStringArray21[local80] = local14.method4920().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray185[local80] = local14.method4905();
			} else {
				local9.anIntArray185[local80] = local14.method4931();
			}
			local9.anIntArray184[local80++] = local86;
		}
		return local9;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
	public static void method7609(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static196.aBooleanArray6[arg0]) {
			Static502.aClass176_122.method3984(arg0);
			Static343.aClass225ArrayArray1[arg0] = null;
			Static583.aClass225ArrayArray2[arg0] = null;
			Static196.aBooleanArray6[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)Lclient!ec;")
	public static Class1_Sub4_Sub2_Sub1 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class53 local11 = Static60.aClass53ArrayArrayArray1[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class1_Sub4_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class289 local27 = local11.aClass289_1; local27 != null; local27 = local27.aClass289_3) {
			@Pc(31) Class1_Sub4_Sub2 local31 = local27.aClass1_Sub4_Sub2_1;
			if (local31 instanceof Class1_Sub4_Sub2_Sub1) {
				@Pc(37) Class1_Sub4_Sub2_Sub1 local37 = (Class1_Sub4_Sub2_Sub1) local31;
				@Pc(45) int local45 = local37.method6925() * 256 - 4;
				@Pc(53) int local53 = local37.anInt9934 - local45 >> 9;
				@Pc(60) int local60 = local37.anInt9935 - local45 >> 9;
				@Pc(67) int local67 = local45 + local37.anInt9934 >> 9;
				@Pc(74) int local74 = local37.anInt9935 + local45 >> 9;
				if (arg2 >= local53 && arg1 >= local60 && arg2 <= local67 && arg1 <= local74) {
					@Pc(112) int local112 = (local67 + 1 - arg2) * (-arg1 + 1 + local74);
					if (local19 < local112) {
						local19 = local112;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
	public static void method7613(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 8);
		local8.method7134();
	}
}
