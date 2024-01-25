import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[B")
	public static byte[] method7609(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub6_Sub7 local17 = (Class1_Sub6_Sub7) Static288.aClass137_2.method2930((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static87.method4324(local52, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class1_Sub6_Sub7(local22);
			Static288.aClass137_2.method2928((long) arg0, local17);
		}
		return local17.aByteArray64;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;IZIIZIIJLjava/lang/String;)V")
	public static void method7612(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) String arg9) {
		if (!Static554.aBoolean708 && Static337.anInt8004 < 500) {
			@Pc(20) int local20 = arg7 == -1 ? Static447.anInt7729 : arg7;
			@Pc(34) Class1_Sub51 local34 = new Class1_Sub51(arg9, arg1, local20, arg4, arg5, arg8, arg0, arg2, arg3, arg6);
			Static310.aClass353_32.method7679(local34);
			Static337.anInt8004++;
		}
	}
}
