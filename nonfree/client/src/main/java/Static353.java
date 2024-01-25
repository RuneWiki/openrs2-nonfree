import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_182 = new Class151("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
	public static int anInt5858 = 0;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_24 = new Class257(16);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[BI[BII)V")
	public static void method4549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg0 >> 2);
		@Pc(20) int local20 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg2++;
				arg5[local31] = (byte) (arg5[local31] - arg3[arg7++]);
				@Pc(44) int local44 = arg2++;
				arg5[local44] = (byte) (arg5[local44] - arg3[arg7++]);
				@Pc(57) int local57 = arg2++;
				arg5[local57] = (byte) (arg5[local57] - arg3[arg7++]);
				@Pc(70) int local70 = arg2++;
				arg5[local70] = (byte) (arg5[local70] - arg3[arg7++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg2++;
				arg5[local31] = (byte) (arg5[local31] - arg3[arg7++]);
			}
			arg2 += arg6;
			arg7 += arg1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4550(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(2, arg1);
		local8.method3459();
		local8.aString43 = arg0;
	}
}
