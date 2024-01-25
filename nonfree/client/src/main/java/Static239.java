import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "Lclient!sk;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
	public static int anInt4035;

	@OriginalMember(owner = "client!ln", name = "cb", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array7;

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_73 = new Class231("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_94 = new Class25(52, 2);

	@OriginalMember(owner = "client!ln", name = "Z", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_9 = new Class91("", 14);

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "[S")
	public static final short[] aShortArray76 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method3260(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static327.method4670(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg7 >> 2);
		@Pc(20) int local20 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg6++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg3++]);
				@Pc(44) int local44 = arg6++;
				arg2[local44] = (byte) (arg2[local44] - arg1[arg3++]);
				@Pc(57) int local57 = arg6++;
				arg2[local57] = (byte) (arg2[local57] - arg1[arg3++]);
				@Pc(70) int local70 = arg6++;
				arg2[local70] = (byte) (arg2[local70] - arg1[arg3++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg6++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg3++]);
			}
			arg3 += arg4;
			arg6 += arg5;
		}
	}
}
