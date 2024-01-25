import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_4 = new Class93("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_5 = new Class93("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_6 = new Class93("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
	public static void method371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static205.method3670(arg0, arg3 + arg2, Static146.anIntArrayArray91[arg1], arg3 - arg2);
		@Pc(28) int local28 = -1;
		while (local7 < local9) {
			local28 += 2;
			local7++;
			local12 += local28;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(55) int[] local55 = Static146.anIntArrayArray91[arg1 + local9];
				@Pc(61) int[] local61 = Static146.anIntArrayArray91[arg1 - local9];
				@Pc(65) int local65 = local7 + arg3;
				@Pc(70) int local70 = arg3 - local7;
				Static205.method3670(arg0, local65, local55, local70);
				Static205.method3670(arg0, local65, local61, local70);
			}
			@Pc(86) int local86 = local9 + arg3;
			@Pc(91) int local91 = arg3 - local9;
			@Pc(97) int[] local97 = Static146.anIntArrayArray91[local7 + arg1];
			@Pc(104) int[] local104 = Static146.anIntArrayArray91[arg1 - local7];
			Static205.method3670(arg0, local86, local97, local91);
			Static205.method3670(arg0, local86, local104, local91);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	public static void method373() {
		Static113.anInt2542 = -1;
		Static75.aClass31_42 = null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!fo;")
	public static Class2_Sub11_Sub3 method374(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub11_Sub3 local18 = (Class2_Sub11_Sub3) Static104.aClass179_10.method5092((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(31) byte[] local31;
		if (arg0 < 32768) {
			local31 = Static34.aClass191_20.method5459(1, arg0);
		} else {
			local31 = Static327.aClass191_210.method5459(1, arg0 & 0x7FFF);
		}
		local18 = new Class2_Sub11_Sub3();
		if (local31 != null) {
			local18.method2135(new Class2_Sub10(local31));
		}
		if (arg0 >= 32768) {
			local18.method2133();
		}
		Static104.aClass179_10.method5085(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method376(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
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

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZLclient!tq;Lclient!tq;)V")
	public static void method377(@OriginalArg(1) int arg0, @OriginalArg(3) Class191 arg1, @OriginalArg(4) Class191 arg2) {
		Static287.anInt5816 = arg0;
		Static8.aClass191_7 = arg1;
		Static262.aClass191_171 = arg2;
		Static29.aBoolean64 = true;
		@Pc(22) int local22 = Static262.aClass191_171.method5460() - 1;
		Static183.anInt3615 = local22 * 256 + Static262.aClass191_171.method5443(local22);
		Static274.aStringArray50 = new String[] { null, null, Static65.aClass93_22.method2819(Static287.anInt5816), null, null };
		Static187.aStringArray31 = new String[] { null, null, null, null, Static317.aClass93_109.method2819(Static287.anInt5816) };
	}
}
