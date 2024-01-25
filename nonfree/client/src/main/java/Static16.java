import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!ad;")
	public static Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "I")
	public static int anInt386;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	public static int anInt387;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_6 = new Class205(28, 6);

	@OriginalMember(owner = "client!at", name = "h", descriptor = "I")
	public static int anInt383 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ld;B)V")
	public static void method307(@OriginalArg(0) Class2_Sub26 arg0) {
		if (!Static269.aBoolean349) {
			arg0.method5617();
			Static285.anInt4946--;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIII)V")
	public static void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class227 local3 = new Class227();
		local3.anInt5783 = arg1 >> Static333.anInt5694;
		local3.anInt5788 = arg2 >> Static333.anInt5694;
		local3.anInt5773 = arg3 >> Static333.anInt5694;
		local3.anInt5794 = arg4 >> Static333.anInt5694;
		local3.anInt5779 = arg0;
		local3.anInt5776 = arg1;
		local3.anInt5791 = arg2;
		local3.anInt5780 = arg3;
		local3.anInt5775 = arg4;
		local3.anInt5789 = arg5;
		local3.anInt5778 = arg6;
		Static209.aClass227Array1[Static168.anInt3222++] = local3;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;Lclient!kk;I)I")
	public static int method309(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		@Pc(6) int local6 = arg1.anInt6145;
		@Pc(12) byte[] local12 = Static34.method627(arg0);
		arg1.method5339(local12.length);
		arg1.anInt6145 += Static383.aClass42_1.method873(local12, arg1.anInt6145, arg1.aByteArray112, 0, local12.length);
		return arg1.anInt6145 - local6;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!jd;I)Z")
	public static boolean method311(@OriginalArg(0) Class117 arg0) {
		return arg0 == Static258.aClass117_10 || Static47.aClass117_2 == arg0 || Static392.aClass117_15 == arg0;
	}
}
