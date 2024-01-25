import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	public static int anInt4202;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
	public static int anInt4204;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_49 = new Class158(49, 4);

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!rq;")
	public static final Class261 aClass261_1 = new Class261();

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
	public static int anInt4203 = -1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(31) int local31 = -arg0; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg6++;
				arg1[local39] = (byte) (arg1[local39] - arg3[arg4++]);
				@Pc(52) int local52 = arg6++;
				arg1[local52] = (byte) (arg1[local52] - arg3[arg4++]);
				@Pc(65) int local65 = arg6++;
				arg1[local65] = (byte) (arg1[local65] - arg3[arg4++]);
				@Pc(78) int local78 = arg6++;
				arg1[local78] = (byte) (arg1[local78] - arg3[arg4++]);
			}
			for (@Pc(94) int local94 = local15; local94 < 0; local94++) {
				local39 = arg6++;
				arg1[local39] = (byte) (arg1[local39] - arg3[arg4++]);
			}
			arg4 += arg7;
			arg6 += arg2;
		}
	}
}
