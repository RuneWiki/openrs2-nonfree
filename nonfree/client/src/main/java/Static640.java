import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_101 = new Class305(13, 4);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
	public static void method8647(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static1.anInt9943 == 1) {
			Static374.aClass65_12.method6912(arg1, arg0, Static147.anInt3008, Static25.anInt344);
		} else {
			Static374.aClass65_12.method6912(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIBII)V")
	public static void method8648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static106.anInt2266 <= arg4 && Static669.anInt10712 >= arg5 && Static639.anInt10384 <= arg2 && arg0 <= Static496.anInt8305) {
			if (arg1 == 1) {
				Static64.method908(arg3, arg4, arg5, arg2, arg0);
			} else {
				Static653.method8765(arg4, arg3, arg0, arg1, arg5, arg2);
			}
		} else if (arg1 == 1) {
			Static100.method1974(arg3, arg2, arg0, arg5, arg4);
		} else {
			Static477.method6825(arg4, arg3, arg0, arg1, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method8649() {
		@Pc(14) Class5_Sub21 local14 = Static64.method905(Static263.aClass49_1, Static466.aClass305_73);
		local14.aClass5_Sub41_Sub2_1.method7798(Static469.method6688());
		local14.aClass5_Sub41_Sub2_1.method7848(Static32.anInt510);
		local14.aClass5_Sub41_Sub2_1.method7848(Static79.anInt1140);
		local14.aClass5_Sub41_Sub2_1.method7798(Static172.aClass5_Sub50_14.aClass12_Sub6_1.method1989());
		Static495.method7092(local14);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method8650(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static686.method4972(arg1, arg0, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8651(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(12) int local12 = arg0.indexOf(arg1); local12 != -1; local12 = arg0.indexOf(arg1, arg2.length() + local12)) {
			arg0 = arg0.substring(0, local12) + arg2 + arg0.substring(local12 + arg1.length());
		}
		return arg0;
	}
}
