import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static int anInt5905;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
	public static final int[] anIntArray343 = new int[4];

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	public static int[] anIntArray344 = new int[4];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)Lclient!km;")
	public static Class40 method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg3 * 76724863L ^ (long) arg4 * 986053L ^ (long) arg0 * 475427L ^ (long) arg2 * 97549L ^ (long) arg5 * 67481L ^ (long) arg1 * 32147369L;
		@Pc(44) Class40 local44 = (Class40) Static272.aClass236_51.method6242(local38);
		if (local44 == null) {
			local44 = Static274.aClass16_12.method6068(arg5, arg2, arg0, arg4, arg1, arg3);
			Static272.aClass236_51.method6241(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public static void method4821(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static405.aClass56ArrayArrayArray2 = Static591.aClass56ArrayArrayArray3;
			Static34.aClass86Array5 = Static253.aClass86Array4;
		} else {
			Static405.aClass56ArrayArrayArray2 = Static383.aClass56ArrayArrayArray1;
			Static34.aClass86Array5 = Static86.aClass86Array2;
		}
		Static192.anInt4507 = Static405.aClass56ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4822(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg1[local17 + arg0] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static542.aCharArray9[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
	public static boolean method4823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static531.method7496(arg1, arg0) | Static639.method8603(arg0, arg1) | Static430.method6706(arg1, arg0)) & Static215.method4063(arg0, arg1);
	}
}
