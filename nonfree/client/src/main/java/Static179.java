import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!eba;")
	public static Class81 aClass81_3;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
	public static int anInt3523;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_8 = new Class336(3, 4);

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_72 = new Class180(59, 1);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I")
	public static int method3209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static495.aShortArrayArray28 == null ? 0 : Static495.aShortArrayArray28[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	public static void method3211() {
		@Pc(7) Class214 local7 = null;
		try {
			@Pc(20) Class81 local20 = Static247.aClass291_1.method7130("2");
			while (local20.anInt2532 == 0) {
				Static373.method5403(1L);
			}
			if (local20.anInt2532 == 1) {
				local7 = (Class214) local20.anObject4;
				@Pc(46) byte[] local46 = new byte[(int) local7.method5376()];
				@Pc(60) int local60;
				for (@Pc(48) int local48 = 0; local48 < local46.length; local48 += local60) {
					local60 = local7.method5381(local48, local46, local46.length - local48);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				Static125.method2361(new Class3_Sub25(local46));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method5380();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(II)I")
	public static int method3213(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(23) int local23 = arg0 * 6 - 61440;
		@Pc(31) int local31 = (local23 * arg0 >> 12) + 40960;
		return local31 * local17 >> 12;
	}
}
