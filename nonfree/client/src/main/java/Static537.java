import jaggl.OpenGL;
import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZZI)I")
	public static int method7677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class6_Sub3 local10 = Static536.method7657(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10.anIntArray21.length; local26++) {
			if (local10.anIntArray21[local26] >= 0 && Static149.aClass244_1.anInt6698 > local10.anIntArray21[local26]) {
				@Pc(52) Class282 local52 = Static149.aClass244_1.method5958(local10.anIntArray21[local26]);
				@Pc(62) int local62 = local52.method6975(arg0, Static521.aClass20_21.method250(arg0).anInt8386);
				if (arg2) {
					local24 += local10.anIntArray20[local26] * local62;
				} else {
					local24 += local62;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!lga;ILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class75 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(3) Interface11 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static469.method7081()) {
			throw new RuntimeException("");
		} else if (Static34.method446("jaggl")) {
			@Pc(30) OpenGL local30 = new OpenGL();
			@Pc(40) long local40 = local30.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local40 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(62) Class75_Sub1_Sub1 local62 = new Class75_Sub1_Sub1(local30, arg3, local40, arg2, arg1, arg0);
			local62.method6829();
			return local62;
		} else {
			throw new RuntimeException("");
		}
	}
}
