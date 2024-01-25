import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "Z")
	public static boolean aBoolean67;

	@OriginalMember(owner = "client!bp", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!w;)V")
	public static void method942(@OriginalArg(1) Class4_Sub9 arg0) {
		arg0.aClass4_Sub3_24 = null;
		@Pc(10) int local10 = arg0.aClass4_Sub1Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			arg0.aClass4_Sub1Array1[local19].aBoolean3 = false;
		}
		@Pc(36) Class283[] local36 = Class14_Sub22.aClass283Array1;
		synchronized (Class14_Sub22.aClass283Array1) {
			if (local10 < Class14_Sub22.aClass283Array1.length && Static245.anIntArray235[local10] < 200) {
				Class14_Sub22.aClass283Array1[local10].method6802(arg0);
				@Pc(59) int local59 = Static245.anIntArray235[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIII[[[BIIIILclient!ha;II)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[][][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class144 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg2 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg11 = arg11 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg11 = arg11 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg11 = arg11 + 3 & 0x3;
		}
		arg9.Q(arg1, arg6, arg0, arg7, arg5, arg8, arg4[arg3 - 1][arg11], arg2, arg10);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method944(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static521.method7679(-1, arg0, arg1, -1);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILclient!rg;)Lclient!ija;")
	public static Class14_Sub2_Sub10 method945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class310 arg2) {
		@Pc(16) Class14_Sub21 local16 = new Class14_Sub21(arg2.method7803(arg1, arg0));
		@Pc(48) Class14_Sub2_Sub10 local48 = new Class14_Sub2_Sub10(arg1, local16.method7703(0), local16.method7703(0), local16.method7748(), local16.method7748(), local16.method7695(114) == 1, local16.method7695(110), local16.method7695(99));
		@Pc(52) int local52 = local16.method7695(97);
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			local48.aClass32_25.method582(new Class14_Sub51(local16.method7695(126), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544), local16.method7717(-1978450544)));
		}
		local48.method4288();
		return local48;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method947(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + (long) arg0.charAt(local10) - local8;
		}
		return local8;
	}
}
