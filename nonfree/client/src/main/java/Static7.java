import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "J")
	public static long aLong4;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public static int anInt157;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "Lclient!aj;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public static final int anInt143 = 2;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	public static int anInt158 = -1;

	@OriginalMember(owner = "client!af", name = "H", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_2 = new Class183(29, 3);

	@OriginalMember(owner = "client!af", name = "N", descriptor = "[I")
	public static final int[] anIntArray15 = new int[5];

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	public static int anInt170 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method67() {
		@Pc(7) Class248 local7 = null;
		try {
			@Pc(11) Class86 local11 = Static154.aClass123_2.method3267();
			while (local11.anInt2590 == 0) {
				Static215.method3855(1L);
			}
			if (local11.anInt2590 == 1) {
				local7 = (Class248) local11.anObject2;
				@Pc(35) byte[] local35 = new byte[(int) local7.method6007()];
				@Pc(49) int local49;
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37 += local49) {
					local49 = local7.method6006(local37, local35, local35.length - local37);
					if (local49 == -1) {
						throw new IOException("EOF");
					}
				}
				Static255.method4404(new Class2_Sub24(local35));
			}
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method6004();
			}
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method71(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static204.aCharArray3[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!ep;")
	public static Class68[] method72() {
		if (Static297.aClass68Array1 == null) {
			@Pc(11) Class68[] local11 = Static257.method4426(Static154.aClass123_2);
			@Pc(15) Class68[] local15 = new Class68[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(66) int local66;
			@Pc(72) Class68 local72;
			label63: for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(25) Class68 local25 = local11[local19];
				if ((local25.anInt1895 <= 0 || local25.anInt1895 >= 24) && local25.anInt1896 >= 800 && local25.anInt1899 >= 600 && (Static199.anInt4131 >= 96 || Static36.anInt2910 != 0 || local25.anInt1896 <= 1024 && local25.anInt1899 <= 768)) {
					for (local66 = 0; local66 < local17; local66++) {
						local72 = local15[local66];
						if (local25.anInt1896 == local72.anInt1896 && local72.anInt1899 == local25.anInt1899) {
							if (local25.anInt1895 > local72.anInt1895) {
								local15[local66] = local25;
							}
							continue label63;
						}
					}
					local15[local17] = local25;
					local17++;
				}
			}
			Static297.aClass68Array1 = new Class68[local17];
			Static394.method2444(local15, 0, Static297.aClass68Array1, 0, local17);
			@Pc(128) int[] local128 = new int[Static297.aClass68Array1.length];
			for (local66 = 0; local66 < Static297.aClass68Array1.length; local66++) {
				local72 = Static297.aClass68Array1[local66];
				local128[local66] = local72.anInt1896 * local72.anInt1899;
			}
			Static188.method3472(local128, Static297.aClass68Array1);
		}
		return Static297.aClass68Array1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
	public static void method78(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class2_Sub41 local10 = (Class2_Sub41) Static314.aClass238_34.method5795(); local10 != null; local10 = (Class2_Sub41) Static314.aClass238_34.method5799()) {
			if (local10.aClass2_Sub11_Sub2_3 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(local10.aClass2_Sub11_Sub2_3);
				local10.aClass2_Sub11_Sub2_3 = null;
			}
			if (local10.aClass2_Sub11_Sub2_2 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(local10.aClass2_Sub11_Sub2_2);
				local10.aClass2_Sub11_Sub2_2 = null;
			}
			local10.method6130();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class2_Sub41 local53 = (Class2_Sub41) Static126.aClass238_8.method5795(); local53 != null; local53 = (Class2_Sub41) Static126.aClass238_8.method5799()) {
			if (local53.aClass2_Sub11_Sub2_3 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(local53.aClass2_Sub11_Sub2_3);
				local53.aClass2_Sub11_Sub2_3 = null;
			}
			local53.method6130();
		}
		for (@Pc(82) Class2_Sub41 local82 = (Class2_Sub41) Static309.aClass243_26.method5975(); local82 != null; local82 = (Class2_Sub41) Static309.aClass243_26.method5973()) {
			if (local82.aClass2_Sub11_Sub2_3 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(local82.aClass2_Sub11_Sub2_3);
				local82.aClass2_Sub11_Sub2_3 = null;
			}
			local82.method6130();
		}
	}
}
