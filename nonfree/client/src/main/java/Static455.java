import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!s", name = "M", descriptor = "Lclient!jo;")
	public static Class168 aClass168_104;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_95 = new Class181(59, -1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!lt;)V")
	public static void method7057(@OriginalArg(1) Class6_Sub26_Sub2 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static534.anInt9243; local11++) {
			@Pc(17) int local17 = Static127.anIntArray215[local11];
			@Pc(21) Class11_Sub1_Sub1_Sub2 local21 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local17];
			@Pc(25) int local25 = arg0.method4966();
			if ((local25 & 0x20) != 0) {
				local25 += arg0.method4966() << 8;
			}
			if ((local25 & 0x800) != 0) {
				local25 += arg0.method4966() << 16;
			}
			Static340.method5372(arg0, local25, local21, local17);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FIZBIIIII)[[I")
	public static int[][] method7059(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub1_Sub37 local13 = new Class6_Sub1_Sub37();
		local13.anInt9481 = 4;
		local13.anInt9475 = (int) (arg0 * 4096.0F);
		local13.anInt9483 = 3;
		local13.aBoolean704 = false;
		local13.anInt9482 = 8;
		local13.method8160();
		Static8.method612(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method7929(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)Lclient!ss;")
	public static Class5_Sub8 method7060() {
		@Pc(13) Class5_Sub8 local13 = (Class5_Sub8) Static262.aClass267_5.method6540();
		if (local13 == null) {
			return new Class5_Sub8();
		} else {
			Static294.anInt5606--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;ZZ)Z")
	public static boolean method7061(@OriginalArg(1) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local48 >= '0' && local48 <= '9') {
				local71 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local71 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local71 = local48 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local33) {
				local71 = -local71;
			}
			@Pc(113) int local113 = local37 * 10 + local71;
			if (local113 / 10 != local37) {
				return false;
			}
			local37 = local113;
			local35 = true;
		}
		return local35;
	}
}
