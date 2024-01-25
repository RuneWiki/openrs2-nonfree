import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cfa", name = "D", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "(I)V")
	public static void method1247() {
		for (@Pc(10) Class6_Sub41 local10 = (Class6_Sub41) Static413.aClass361_53.method7838(); local10 != null; local10 = (Class6_Sub41) Static413.aClass361_53.method7845()) {
			if (local10.anInt8203 == -1) {
				local10.anInt8211 = 0;
				if (local10.anInt8201 >= 0 && local10.anInt8205 >= 0 && local10.anInt8201 < Static473.anInt8075 && local10.anInt8205 < Static165.anInt6749) {
					Static306.method4839(local10);
				}
			} else {
				local10.method7804();
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method1249(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static133.aClass59Array3 != Static49.aClass59Array2) {
			@Pc(11) int local11 = Static273.aClass59Array4[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class59 local18 = Static273.aClass59Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7865(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "([BBIIIII)V")
	public static void method1253(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static404.method5927(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static404.method5927(arg5)) {
			@Pc(31) int local31 = Static52.method1134(arg4);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg5 > arg3 ? arg3 : arg5;
			@Pc(48) int local48 = arg3 >> 1;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(58) byte[] local58 = arg0;
			@Pc(65) byte[] local65 = new byte[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local33, arg1, arg3, arg5, 0, arg4, 5121, local58, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(86) int local86 = local31 * arg3;
				@Pc(88) byte[] local88 = local65;
				for (@Pc(90) int local90 = 0; local90 < local31; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(100) int local100 = local90 + local86;
					for (@Pc(102) int local102 = 0; local102 < local52; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local48; local106++) {
							@Pc(112) byte local112 = local58[local96];
							local96 += local31;
							@Pc(122) int local122 = local112 + local58[local96];
							@Pc(128) int local128 = local122 + local58[local100];
							local96 += local31;
							local100 += local31;
							@Pc(142) int local142 = local128 + local58[local100];
							local100 += local31;
							local65[local94] = (byte) (local142 >> 2);
							local94 += local31;
						}
						local100 += local86;
						local96 += local86;
					}
				}
				local65 = local58;
				local58 = local88;
				arg3 = local48;
				arg5 = local52;
				local44 >>= 0x1;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
