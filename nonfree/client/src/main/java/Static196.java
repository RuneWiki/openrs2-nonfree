import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gv", name = "P", descriptor = "Lclient!fd;")
	public static Class103 aClass103_15;

	@OriginalMember(owner = "client!gv", name = "R", descriptor = "I")
	public static int anInt3667;

	@OriginalMember(owner = "client!gv", name = "Z", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
	public static int anInt3665 = -1;

	@OriginalMember(owner = "client!gv", name = "V", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!kaa;)[I")
	public static int[] method3128(@OriginalArg(1) Class3_Sub27 arg0) {
		@Pc(10) Class3_Sub9 local10 = new Class3_Sub9(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			local13[local21] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method5572(10);
		local10.method5601(local13[0]);
		local10.method5601(local13[1]);
		local10.method5601(local13[2]);
		local10.method5601(local13[3]);
		for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
			local10.method5601((int) (Math.random() * 9.9999999E7D));
		}
		local10.method5620((int) (Math.random() * 9.9999999E7D));
		local10.method5582(Static105.aBigInteger1, Static239.aBigInteger2);
		arg0.aClass3_Sub9_Sub2_2.method5625(local10.aByteArray51, local10.anInt6453, 0);
		return local13;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3129(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += (long) (local27 - 64);
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += (long) (local27 + 1 - 97);
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += (long) (local27 - 21);
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ni;Z)V")
	public static void method3130(@OriginalArg(0) Class9_Sub2_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
			@Pc(5) Class9_Sub2_Sub1_Sub2_Sub2 local5 = (Class9_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local5.aClass309_1 != null) {
				Static647.method8676(local5.aByte127 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, local5);
			}
		} else if (arg0 instanceof Class9_Sub2_Sub1_Sub2_Sub1) {
			@Pc(27) Class9_Sub2_Sub1_Sub2_Sub1 local27 = (Class9_Sub2_Sub1_Sub2_Sub1) arg0;
			Static102.method1713(local27.aByte127 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, local27);
		}
	}
}
