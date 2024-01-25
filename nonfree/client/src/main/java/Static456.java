import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "Lclient!wd;")
	public static final Class366 aClass366_9 = new Class366(4);

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
	public static int anInt8379 = 0;

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "S")
	public static short aShort91 = 1;

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
	public static int anInt8380 = 0;

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[520];

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "J")
	public static long aLong219 = 0L;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)Z")
	public static boolean method6910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface27 local14 = (Interface27) Static418.method6567(arg0, arg1, arg2);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static369.method5759(local14) & true;
		}
		local14 = (Interface27) Static575.method7984(arg0, arg1, arg2, wha.class);
		if (local14 != null) {
			local16 &= Static369.method5759(local14);
		}
		local14 = (Interface27) Static484.method7154(arg0, arg1, arg2);
		if (local14 != null) {
			local16 &= Static369.method5759(local14);
		}
		return local16;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	public static void method6911() {
		Static52.aClass236_7.method6253();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6912(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static338.method5451(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static338.method5451(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(52) int local52 = local14 - local11;
		if (local52 < 1 || local52 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local52);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static472.method7260(local75)) {
				@Pc(85) char local85 = Static564.method7859(local75);
				if (local85 != '\u0000') {
					local67.append(local85);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)Z")
	public static boolean method6913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	public static void method6914() {
		Static522.aClass136_1 = new Class136(8);
		Static311.anInt10378 = 0;
		for (@Pc(17) Class15_Sub8 local17 = (Class15_Sub8) Static266.aClass123_7.method3537(); local17 != null; local17 = (Class15_Sub8) Static266.aClass123_7.method3541()) {
			local17.method6537();
		}
	}
}
