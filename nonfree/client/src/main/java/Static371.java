import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "F")
	public static float aFloat65 = 1024.0F;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/awt/Component;BLclient!kk;)Lclient!uu;")
	public static Class63 method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) Class192 arg3) {
		if (Static92.anInt9993 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class63 local32 = (Class63) Class.forName("Class63_Sub1").getDeclaredConstructor().newInstance();
			local32.anIntArray320 = new int[(Static568.aBoolean763 ? 2 : 1) * 256];
			local32.anInt3870 = arg1;
			local32.method3494(arg2);
			local32.anInt3864 = (-1024 & arg1) + 1024;
			if (local32.anInt3864 > 16384) {
				local32.anInt3864 = 16384;
			}
			local32.method3496(local32.anInt3864);
			if (Static330.anInt5768 > 0 && Static460.aClass274_1 == null) {
				Static460.aClass274_1 = new Class274();
				Static460.aClass274_1.aClass192_4 = arg3;
				arg3.method4334(Static460.aClass274_1, Static330.anInt5768);
			}
			if (Static460.aClass274_1 != null) {
				if (Static460.aClass274_1.aClass63Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static460.aClass274_1.aClass63Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(107) Throwable local107) {
			try {
				@Pc(113) Class63_Sub2 local113 = new Class63_Sub2(arg3, arg0);
				local113.anInt3870 = arg1;
				local113.anIntArray320 = new int[(Static568.aBoolean763 ? 2 : 1) * 256];
				local113.method3494(arg2);
				local113.anInt3864 = 16384;
				local113.method3496(local113.anInt3864);
				if (Static330.anInt5768 > 0 && Static460.aClass274_1 == null) {
					Static460.aClass274_1 = new Class274();
					Static460.aClass274_1.aClass192_4 = arg3;
					arg3.method4334(Static460.aClass274_1, Static330.anInt5768);
				}
				if (Static460.aClass274_1 != null) {
					if (Static460.aClass274_1.aClass63Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static460.aClass274_1.aClass63Array1[arg0] = local113;
				}
				return local113;
			} catch (@Pc(177) Throwable local177) {
				return new Class63();
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
	public static boolean method4028() {
		return Static469.anInt7883 >= 1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method4031(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(42) int local42 = 2;
		for (@Pc(46) int local46 = arg1 / 10; local46 != 0; local46 /= 10) {
			local42++;
		}
		@Pc(61) char[] local61 = new char[local42];
		local61[0] = '+';
		for (@Pc(69) int local69 = local42 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg1;
			arg1 /= 10;
			@Pc(84) int local84 = local73 - arg1 * 10;
			if (local84 < 10) {
				local61[local69] = (char) (local84 + 48);
			} else {
				local61[local69] = (char) (local84 + 87);
			}
		}
		return new String(local61);
	}
}
