import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!am", name = "u", descriptor = "F")
	public static float aFloat3 = 0.0F;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[200];

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	public static int anInt451 = 0;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
	public static void method450() {
		Static587.anInt10248 = -1;
		Static460.anInt11073 = 0;
		Static472.anInt8440 = -1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public static void method451() {
		if (Static35.anInterface1Array1 == null) {
			return;
		}
		@Pc(9) Interface1[] local9 = Static35.anInterface1Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface1 local17 = local9[local11];
			local17.method7815();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg4++;
				arg3[local31] = (byte) (arg3[local31] - arg7[arg1++]);
				@Pc(44) int local44 = arg4++;
				arg3[local44] = (byte) (arg3[local44] - arg7[arg1++]);
				@Pc(57) int local57 = arg4++;
				arg3[local57] = (byte) (arg3[local57] - arg7[arg1++]);
				@Pc(70) int local70 = arg4++;
				arg3[local70] = (byte) (arg3[local70] - arg7[arg1++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg4++;
				arg3[local31] = (byte) (arg3[local31] - arg7[arg1++]);
			}
			arg4 += arg0;
			arg1 += arg2;
		}
	}
}
