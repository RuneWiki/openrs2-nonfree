import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public static int anInt8035;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_162 = new Class156(92, -2);

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
	public static final int[] anIntArray463 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[[BLclient!pj;)V")
	public static void method6946(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class137_Sub1 arg1) {
		@Pc(15) int local15 = Static56.aByteArrayArray1.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static75.anIntArray68[local17] >> 8) * 64 - Static315.anInt5380;
				@Pc(47) int local47 = (Static75.anIntArray68[local17] & 0xFF) * 64 - Static290.anInt5128;
				Static455.method6423();
				arg1.method6466(Static273.aClass100_6, Static553.aClass169Array1, local47, local36, local23);
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method6948() {
		if (Static373.aFileOutputStream1 != null) {
			try {
				Static373.aFileOutputStream1.close();
			} catch (@Pc(17) IOException local17) {
			}
		}
		Static373.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public static void method6949(@OriginalArg(1) int arg0) {
		if (!Static20.method345(arg0)) {
			return;
		}
		@Pc(22) Class238[] local22 = Static397.aClass238ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class238 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt5968 = 0;
				local30.anInt6023 = 0;
				local30.anInt6022 = 1;
			}
		}
	}
}
