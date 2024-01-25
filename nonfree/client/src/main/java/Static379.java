import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	public static int anInt6350;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Lclient!jk;")
	public static final Class176 aClass176_4 = new Class176("game3", 2);

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "Lclient!hba;")
	public static final Class134 aClass134_6 = new Class134();

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_241 = new Class179(10, 10);

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!oja;")
	public static final Class257 aClass257_6 = new Class257();

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!rk;)V")
	public static void method5357(@OriginalArg(1) Class2_Sub9 arg0) {
		arg0.aClass2_Sub1_20 = null;
		@Pc(20) int local20 = arg0.aClass2_Sub5Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			arg0.aClass2_Sub5Array1[local22].aBoolean124 = false;
		}
		@Pc(40) Class43[] local40 = Class6_Sub9.aClass43Array1;
		synchronized (Class6_Sub9.aClass43Array1) {
			if (Class6_Sub9.aClass43Array1.length > local20 && Static506.anIntArray557[local20] < 200) {
				Class6_Sub9.aClass43Array1[local20].method1084(arg0);
				@Pc(61) int local61 = Static506.anIntArray557[local20]++;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5360(@OriginalArg(1) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local17) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(84) int local84;
				if (local25 >= '0' && local25 <= '9') {
					local84 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local84 = local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local84 = local25 + 10 - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local84 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local84 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local84 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local84 += local25 - 55;
				}
				if (local84 != 0 && Static455.method6581((byte) local84)) {
					local14.append(Static622.method8571((byte) local84));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local14.append(' ');
			} else {
				local14.append(local25);
			}
		}
		return local14.toString();
	}
}
