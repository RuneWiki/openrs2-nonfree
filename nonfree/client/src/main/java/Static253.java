import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!td;")
	public static Class1_Sub19_Sub3 aClass1_Sub19_Sub3_3;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Lclient!dk;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method3768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static30.aClass203_4.method4548(); local10 != null; local10 = (Class1_Sub22) Static30.aClass203_4.method4545()) {
			Static445.method5855(arg2, local10, arg1, arg0, arg3);
		}
		for (@Pc(39) Class1_Sub22 local39 = (Class1_Sub22) Static262.aClass203_17.method4548(); local39 != null; local39 = (Class1_Sub22) Static262.aClass203_17.method4545()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class212 local48 = local39.aClass30_Sub1_Sub1_Sub1_1.method948();
			if (local39.aClass30_Sub1_Sub1_Sub1_1.aBoolean81) {
				local43 = 0;
			} else if (local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 == local48.anInt6253 || local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 == local48.anInt6267 || local48.anInt6291 == local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 || local48.anInt6278 == local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255) {
				local43 = 2;
			} else if (local48.anInt6275 == local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 || local48.anInt6259 == local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 || local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 == local48.anInt6280 || local39.aClass30_Sub1_Sub1_Sub1_1.anInt1255 == local48.anInt6245) {
				local43 = 3;
			}
			if (local43 != local39.anInt3801) {
				@Pc(139) int local139 = Static145.method2320(local39.aClass30_Sub1_Sub1_Sub1_1);
				if (local139 != local39.anInt3798) {
					if (local39.aClass1_Sub19_Sub4_3 != null) {
						Static12.aClass1_Sub19_Sub2_1.method3181(local39.aClass1_Sub19_Sub4_3);
						local39.aClass1_Sub19_Sub4_3 = null;
					}
					local39.anInt3798 = local139;
				}
				local39.anInt3801 = local43;
			}
			local39.anInt3790 = local39.aClass30_Sub1_Sub1_Sub1_1.anInt7490;
			local39.anInt3800 = local39.aClass30_Sub1_Sub1_Sub1_1.anInt7490 + (local39.aClass30_Sub1_Sub1_Sub1_1.method944() << 6);
			local39.anInt3803 = local39.aClass30_Sub1_Sub1_Sub1_1.anInt7488;
			local39.anInt3793 = local39.aClass30_Sub1_Sub1_Sub1_1.anInt7488 + (local39.aClass30_Sub1_Sub1_Sub1_1.method944() << 6);
			Static445.method5855(arg2, local39, arg1, arg0, arg3);
		}
		for (@Pc(215) Class1_Sub22 local215 = (Class1_Sub22) Static155.aClass38_15.method767(); local215 != null; local215 = (Class1_Sub22) Static155.aClass38_15.method773()) {
			@Pc(219) byte local219 = 1;
			@Pc(226) Class212 local226 = local215.aClass30_Sub1_Sub1_Sub2_1.method948();
			if (local215.aClass30_Sub1_Sub1_Sub2_1.aBoolean81) {
				local219 = 0;
			} else if (local226.anInt6253 == local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 || local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 == local226.anInt6267 || local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 == local226.anInt6291 || local226.anInt6278 == local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255) {
				local219 = 2;
			} else if (local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 == local226.anInt6275 || local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 == local226.anInt6259 || local226.anInt6280 == local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255 || local226.anInt6245 == local215.aClass30_Sub1_Sub1_Sub2_1.anInt1255) {
				local219 = 3;
			}
			if (local219 != local215.anInt3801) {
				@Pc(313) int local313 = Static458.method6182(local215.aClass30_Sub1_Sub1_Sub2_1);
				if (local313 != local215.anInt3798) {
					if (local215.aClass1_Sub19_Sub4_3 != null) {
						Static12.aClass1_Sub19_Sub2_1.method3181(local215.aClass1_Sub19_Sub4_3);
						local215.aClass1_Sub19_Sub4_3 = null;
					}
					local215.anInt3798 = local313;
				}
				local215.anInt3801 = local219;
			}
			local215.anInt3790 = local215.aClass30_Sub1_Sub1_Sub2_1.anInt7490;
			local215.anInt3800 = local215.aClass30_Sub1_Sub1_Sub2_1.anInt7490 + (local215.aClass30_Sub1_Sub1_Sub2_1.method944() << 6);
			local215.anInt3803 = local215.aClass30_Sub1_Sub1_Sub2_1.anInt7488;
			local215.anInt3793 = local215.aClass30_Sub1_Sub1_Sub2_1.anInt7488 + (local215.aClass30_Sub1_Sub1_Sub2_1.method944() << 6);
			Static445.method5855(arg2, local215, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V")
	public static void method3770() {
		for (@Pc(8) Class1_Sub40 local8 = (Class1_Sub40) Static239.aClass203_37.method4548(); local8 != null; local8 = (Class1_Sub40) Static239.aClass203_37.method4545()) {
			if (local8.anInt6628 == -1) {
				local8.anInt6629 = 0;
				if (local8.anInt6621 >= 0 && local8.anInt6627 >= 0 && Static209.anInt4283 > local8.anInt6621 && local8.anInt6627 < Static211.anInt4295) {
					Static364.method5094(local8);
				}
			} else {
				local8.method6178();
			}
		}
	}
}
