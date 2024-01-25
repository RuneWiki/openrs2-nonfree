import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt27;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_1 = new Class100(34, 3);

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public static int anInt29 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIIII[BII)V")
	public static void method25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg5[local31] = (byte) (arg5[local31] - arg1[arg7++]);
				@Pc(44) int local44 = arg6++;
				arg5[local44] = (byte) (arg5[local44] - arg1[arg7++]);
				@Pc(57) int local57 = arg6++;
				arg5[local57] = (byte) (arg5[local57] - arg1[arg7++]);
				@Pc(70) int local70 = arg6++;
				arg5[local70] = (byte) (arg5[local70] - arg1[arg7++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg6++;
				arg5[local31] = (byte) (arg5[local31] - arg1[arg7++]);
			}
			arg7 += arg0;
			arg6 += arg2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!je;)V")
	public static void method26(@OriginalArg(0) Class12_Sub2 arg0) {
		Static533.aClass137_41.H(arg0.anInt10998, arg0.anInt10997 + (arg0.method9159() >> 1), arg0.anInt11002, Static536.anIntArray675);
		arg0.anInt11007 = Static536.anIntArray675[0];
		arg0.anInt11001 = Static536.anIntArray675[1];
		arg0.anInt11000 = Static536.anIntArray675[2];
	}
}
