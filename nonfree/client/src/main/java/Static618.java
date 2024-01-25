import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!tja", name = "p", descriptor = "I")
	public static int anInt6014;

	@OriginalMember(owner = "client!tja", name = "q", descriptor = "I")
	public static int anInt6009 = 0;

	@OriginalMember(owner = "client!tja", name = "m", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_111 = new Class186(29, -1);

	@OriginalMember(owner = "client!tja", name = "o", descriptor = "Z")
	public static boolean aBoolean481 = false;

	@OriginalMember(owner = "client!tja", name = "n", descriptor = "Lclient!hd;")
	public static final Class145 aClass145_11 = new Class145(1);

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IZI)V")
	public static void method5117(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class3_Sub51 local8 = Static321.method5223(arg1, arg0);
		if (local8 != null) {
			local8.method9446();
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)V")
	public static void method5118(@OriginalArg(0) int arg0) {
		if (Static112.anInt2244 == 0) {
			Static671.aClass3_Sub22_Sub5_3.method9343(32023, arg0);
		} else {
			Static554.anInt9248 = arg0;
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I[ILclient!gia;II[I)Lclient!pt;")
	public static Class1_Sub3 method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class67_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) byte[] local23 = new byte[arg0 * arg3];
		for (@Pc(25) int local25 = 0; local25 < arg0; local25++) {
			@Pc(35) int local35 = arg3 * local25 + arg1[local25];
			for (@Pc(37) int local37 = 0; local37 < arg4[local25]; local37++) {
				local23[local35++] = -1;
			}
		}
		return new Class1_Sub3(arg2, arg3, arg0, local23);
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(II)Z")
	public static boolean method5120(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
