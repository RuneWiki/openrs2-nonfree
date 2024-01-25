import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!tj;")
	public static Class193 aClass193_52;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Lclient!t;")
	public static Class189 aClass189_6;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Lclient!cl;")
	public static final Class32 aClass32_5 = new Class32();

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
	public static int[] anIntArray271 = new int[2];

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIZI)V")
	public static void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static184.method3527();
		}
		if (Static229.aFrame1 != null && (arg1 != 3 || arg2 != Static184.anInt3878 || Static43.anInt1147 != arg0)) {
			Static311.method5120(Static229.aFrame1, Static1.aClass134_7);
			Static229.aFrame1 = null;
		}
		if (arg1 == 3 && Static229.aFrame1 == null) {
			Static229.aFrame1 = Static239.method4227(arg0, 0, arg2, Static1.aClass134_7);
			if (Static229.aFrame1 != null) {
				Static43.anInt1147 = arg0;
				Static184.anInt3878 = arg2;
				Static222.method4006(Static1.aClass134_7);
			}
		}
		if (arg1 == 3 && Static229.aFrame1 == null) {
			method2875(-1, Static309.anInt6000, -1, true, arg4);
			return;
		}
		@Pc(70) Container local70;
		@Pc(83) Insets local83;
		if (Static229.aFrame1 != null) {
			Static165.anInt3522 = arg0;
			Static255.anInt5171 = arg2;
			local70 = Static229.aFrame1;
		} else if (Static308.aFrame2 == null) {
			local70 = Static1.aClass134_7.anApplet1;
			Static255.anInt5171 = local70.getSize().width;
			Static165.anInt3522 = local70.getSize().height;
		} else {
			local83 = Static308.aFrame2.getInsets();
			@Pc(92) int local92 = local83.left + local83.right;
			Static255.anInt5171 = Static308.aFrame2.getSize().width - local92;
			Static165.anInt3522 = Static308.aFrame2.getSize().height - local83.bottom - local83.top;
			local70 = Static308.aFrame2;
		}
		@Pc(131) int local131;
		if (arg1 == 1) {
			Static179.anInt3824 = (Static255.anInt5171 - 765) / 2;
			Static24.anInt496 = 765;
			Static140.anInt3219 = 0;
			Static23.anInt465 = 503;
		} else if (Static286.anInt6700 < 96 && Static225.anInt4568 == 0) {
			local131 = Static255.anInt5171 > 1024 ? 1024 : Static255.anInt5171;
			Static179.anInt3824 = (Static255.anInt5171 - local131) / 2;
			@Pc(145) int local145 = Static165.anInt3522 > 768 ? 768 : Static165.anInt3522;
			Static24.anInt496 = local131;
			Static140.anInt3219 = 0;
			Static23.anInt465 = local145;
		} else {
			Static23.anInt465 = Static165.anInt3522;
			Static24.anInt496 = Static255.anInt5171;
			Static140.anInt3219 = 0;
			Static179.anInt3824 = 0;
		}
		if (Static80.anInt2116 != 0) {
			@Pc(186) boolean local186;
			if (Static24.anInt496 < 1024 && Static23.anInt465 < 768) {
				local186 = true;
			} else {
				local186 = false;
			}
		}
		if (arg3) {
			Static106.method2349(Static225.anInt4568);
		} else {
			Static300.aCanvas5.setSize(Static24.anInt496, Static23.anInt465);
			if (Static274.aClass47_9 != null) {
				Static274.aClass47_9.method2691();
			}
			if (local70 == Static308.aFrame2) {
				local83 = Static308.aFrame2.getInsets();
				Static300.aCanvas5.setLocation(Static179.anInt3824 + local83.left, local83.top + Static140.anInt3219);
			} else {
				Static300.aCanvas5.setLocation(Static179.anInt3824, Static140.anInt3219);
			}
		}
		if (arg1 < 2) {
			Static155.aBoolean267 = false;
		} else {
			Static155.aBoolean267 = true;
		}
		if (Static357.anInt6821 != -1) {
			Static196.method5556(true);
		}
		if (Static155.aClass114_3 != null && (Static139.anInt3199 == 30 || Static139.anInt3199 == 25)) {
			Static178.method3408();
		}
		for (local131 = 0; local131 < 100; local131++) {
			Static172.aBooleanArray19[local131] = true;
		}
		Static195.aBoolean315 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)[Lclient!j;")
	public static Class101[] method2877() {
		if (Static329.aClass101Array2 == null) {
			@Pc(19) Class101[] local19 = Static287.method3917(Static1.aClass134_7);
			@Pc(23) Class101[] local23 = new Class101[local19.length];
			@Pc(25) int local25 = 0;
			@Pc(77) int local77;
			@Pc(83) Class101 local83;
			label63: for (@Pc(27) int local27 = 0; local27 < local19.length; local27++) {
				@Pc(33) Class101 local33 = local19[local27];
				if ((local33.anInt3225 <= 0 || local33.anInt3225 >= 24) && local33.anInt3228 >= 800 && local33.anInt3223 >= 600 && (Static286.anInt6700 >= 96 || Static225.anInt4568 != 0 || local33.anInt3228 <= 1024 && local33.anInt3223 <= 768)) {
					for (local77 = 0; local77 < local25; local77++) {
						local83 = local23[local77];
						if (local33.anInt3228 == local83.anInt3228 && local83.anInt3223 == local33.anInt3223) {
							if (local33.anInt3225 > local83.anInt3225) {
								local23[local77] = local33;
							}
							continue label63;
						}
					}
					local23[local25] = local33;
					local25++;
				}
			}
			Static329.aClass101Array2 = new Class101[local25];
			Static359.method760(local23, 0, Static329.aClass101Array2, 0, local25);
			@Pc(139) int[] local139 = new int[Static329.aClass101Array2.length];
			for (local77 = 0; local77 < Static329.aClass101Array2.length; local77++) {
				local83 = Static329.aClass101Array2[local77];
				local139[local77] = local83.anInt3223 * local83.anInt3228;
			}
			Static144.method2965(local139, Static329.aClass101Array2);
		}
		return Static329.aClass101Array2;
	}
}
