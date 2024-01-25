import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt9659;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!eb;")
	public static final Class81 aClass81_8 = new Class81();

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt9662 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILjava/lang/String;Z)V")
	public static void method7917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static435.method6180(arg0, arg1, false, null, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static97.aByteArrayArrayArray19[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static97.aByteArrayArrayArray19[arg3][arg2][arg1] & 0x10) == 0) {
			return arg0 == Static378.method5644(arg3, arg2, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!bi;)V")
	public static void method7920(@OriginalArg(1) Class31 arg0) {
		Static147.anInt3290 = arg0.method653("p11_full");
		Static318.anInt5720 = arg0.method653("p12_full");
		Static498.anInt8630 = arg0.method653("b12_full");
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!vj;I)V")
	public static void method7921(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt8462 > Static237.anInt7561) {
			Static240.method4082(arg1);
		} else if (arg1.anInt8509 >= Static237.anInt7561) {
			Static184.method3421(arg1);
		} else {
			Static497.method7072(false, arg1);
			local7 = Static466.anInt7863;
			local9 = Static351.anInt6124;
		}
		if (arg1.anInt8934 < 512 || arg1.anInt8929 < 512 || (Static38.anInt740 - 1) * 512 <= arg1.anInt8934 || Static38.anInt741 * 512 - 512 <= arg1.anInt8929) {
			arg1.anIntArray651 = null;
			local7 = -1;
			arg1.anInt8509 = 0;
			arg1.anInt8462 = 0;
			arg1.anInt8483 = -1;
			arg1.anInt8529 = -1;
			arg1.anInt8504 = -1;
			local9 = 0;
			arg1.anInt8934 = arg1.anIntArray653[0] * 512 + arg1.method7021() * 256;
			arg1.anInt8929 = arg1.anIntArray654[0] * 512 + arg1.method7021() * 256;
			arg1.method7031();
		}
		if (Static129.aClass10_Sub1_Sub2_Sub2_1 == arg1 && (arg1.anInt8934 < 6144 || arg1.anInt8929 < 6144 || (Static38.anInt740 - 12) * 512 <= arg1.anInt8934 || arg1.anInt8929 >= Static38.anInt741 * 512 - 6144)) {
			local7 = -1;
			arg1.anInt8529 = -1;
			arg1.anInt8509 = 0;
			local9 = 0;
			arg1.anIntArray651 = null;
			arg1.anInt8462 = 0;
			arg1.anInt8483 = -1;
			arg1.anInt8504 = -1;
			arg1.anInt8934 = arg1.anIntArray653[0] * 512 + arg1.method7021() * 256;
			arg1.anInt8929 = arg1.anIntArray654[0] * 512 + arg1.method7021() * 256;
			arg1.method7031();
		}
		@Pc(211) int local211 = Static450.method6351(arg1);
		Static463.method6487(local9, arg1, local7, local211);
		Static551.method7606(arg1, local7);
		Static353.method5229(arg1);
	}
}
