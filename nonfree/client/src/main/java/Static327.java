import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!iha;")
	public static Class173 aClass173_4;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "Lclient!rg;")
	public static Class310 aClass310_63;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	public static int anInt5650 = 0;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	public static int anInt5651 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5103(@OriginalArg(1) String arg0) {
		return Static533.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method5104() {
		if (Static358.anInt6145 == -1) {
			return;
		}
		@Pc(12) int local12 = Static656.aClass118_1.method7586();
		@Pc(16) int local16 = Static656.aClass118_1.method7590();
		@Pc(21) Class14_Sub29 local21 = (Class14_Sub29) Static477.aClass32_54.method584();
		if (local21 != null) {
			local12 = local21.method7858();
			local16 = local21.method7859();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static656.aBoolean741) {
			local33 = Static532.method7876();
			local35 = Static276.method4674();
		}
		Static608.method8584(local35 + local16, local12, local35, local35, Static358.anInt6145, local33 + local12, local33, local35 + Static506.anInt8791, local16, Static563.anInt4939 + local33, local33);
		if (Static125.aClass299_4 != null) {
			Static502.method7569(local33 + local12, local16 - -local35);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I[BZ)I")
	public static int method5105(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(22) int local22 = Static376.method7669(arg0.charAt(local12));
			@Pc(37) int local37 = local10 > local12 + 1 ? Static376.method7669(arg0.charAt(local12 + 1)) : -1;
			@Pc(63) int local63 = local10 > local12 + 2 ? Static376.method7669(arg0.charAt(local12 + 2)) : -1;
			@Pc(83) int local83 = local12 + 3 < local10 ? Static376.method7669(arg0.charAt(local12 + 3)) : -1;
			arg2[arg1++] = (byte) (local22 << 2 | local37 >>> 4);
			if (local63 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local63 >>> 2 | (local37 & 0xF) << 4);
			if (local83 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local83 | (local63 & 0x3) << 6);
		}
		if (false) {
			aClass310_63 = null;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBZ)I")
	public static int method5106(@OriginalArg(0) int arg0) {
		@Pc(13) Class14_Sub14 local13 = Static495.method7455(arg0, false);
		if (local13 == null) {
			return Static688.aClass232_1.method5791(arg0).anInt9313;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local13.anIntArray106.length; local34++) {
			if (local13.anIntArray106[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static688.aClass232_1.method5791(arg0).anInt9313 - local13.anIntArray106.length;
	}
}
