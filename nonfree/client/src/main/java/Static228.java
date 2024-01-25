import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!us;")
	public static final Class234 aClass234_83 = new Class234(80, 10);

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_57 = new Class244(54, 16);

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_65 = new Class57("M", "M", "M", "M");

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method3741(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local11 > local20 - local24) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local11 <= local20 - local24) {
				return 1;
			}
			@Pc(62) char local62;
			if (local22 == '\u0000') {
				local62 = arg2.charAt(local13++);
			} else {
				local62 = local22;
			}
			@Pc(78) char local78;
			if (local24 == '\u0000') {
				local78 = arg1.charAt(local20++);
			} else {
				local78 = local24;
			}
			local22 = Static221.method3686(local62);
			local24 = Static221.method3686(local78);
			local62 = Static225.method3725(local62, arg0);
			local78 = Static225.method3725(local78, arg0);
			if (local78 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local78 != local62) {
					return Static15.method197(arg0, local62) - Static15.method197(arg0, local78);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local8, local11);
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			if (arg0 == 2) {
				local13 = local8 - local151 - 1;
				local20 = local11 - local151 - 1;
			} else {
				local20 = local151;
				local13 = local151;
			}
			@Pc(181) char local181 = arg2.charAt(local13);
			@Pc(185) char local185 = arg1.charAt(local20);
			if (local185 != local181 && Character.toUpperCase(local181) != Character.toUpperCase(local185)) {
				local181 = Character.toLowerCase(local181);
				local185 = Character.toLowerCase(local185);
				if (local181 != local185) {
					return Static15.method197(arg0, local181) - Static15.method197(arg0, local185);
				}
			}
		}
		@Pc(226) int local226 = local8 - local11;
		if (local226 != 0) {
			return local226;
		}
		for (@Pc(235) int local235 = 0; local235 < local149; local235++) {
			@Pc(241) char local241 = arg2.charAt(local235);
			@Pc(245) char local245 = arg1.charAt(local235);
			if (local241 != local245) {
				return Static15.method197(arg0, local241) - Static15.method197(arg0, local245);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILclient!rp;)V")
	public static void method3744(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (Static16.aClass246_1 == null) {
			return;
		}
		try {
			Static16.aClass246_1.method5681(0L);
			Static16.aClass246_1.method5684(24, arg1.aByteArray42, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
