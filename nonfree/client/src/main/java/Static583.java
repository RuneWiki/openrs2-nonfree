import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!om;")
	public static Class256 aClass256_2;

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "[B")
	public static byte[] aByteArray102;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "Lclient!em;")
	public static final Class83 aClass83_209 = new Class83(82, 12);

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method7812() {
		Static406.aClass188_1.method7568();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static254.aLongArray4[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static278.aLongArray12[local26] = 0L;
		}
		Static165.anInt3159 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!pc;III)V")
	public static void method7813(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub37 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 14 | arg3 << 28 | arg2);
		@Pc(22) Class1_Sub20 local22 = (Class1_Sub20) Static365.aClass91_29.method2271(local16);
		if (local22 == null) {
			local22 = new Class1_Sub20();
			Static365.aClass91_29.method2269(local16, local22);
			local22.aClass111_10.method2552(arg1);
			return;
		}
		@Pc(47) Class222 local47 = Static230.aClass225_1.method4857(arg1.anInt6970);
		@Pc(50) int local50 = local47.anInt5915;
		if (local47.anInt5916 == 1) {
			local50 *= arg1.anInt6969 + 1;
		}
		for (@Pc(67) Class1_Sub37 local67 = (Class1_Sub37) local22.aClass111_10.method2547(); local67 != null; local67 = (Class1_Sub37) local22.aClass111_10.method2554()) {
			local47 = Static230.aClass225_1.method4857(local67.anInt6970);
			@Pc(78) int local78 = local47.anInt5915;
			if (local47.anInt5916 == 1) {
				local78 *= local67.anInt6969 + 1;
			}
			if (local78 < local50) {
				Static151.method2498(local67, arg1);
				return;
			}
		}
		local22.aClass111_10.method2552(arg1);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7816(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static549.method7493(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static549.method7493(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(53) int local53 = local14 - local11;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local53);
		for (@Pc(68) int local68 = local11; local68 < local14; local68++) {
			@Pc(74) char local74 = arg0.charAt(local68);
			if (Static239.method3542(local74)) {
				@Pc(84) char local84 = Static368.method5399(local74);
				if (local84 != '\u0000') {
					local66.append(local84);
				}
			}
		}
		if (local66.length() == 0) {
			return null;
		} else {
			return local66.toString();
		}
	}
}
