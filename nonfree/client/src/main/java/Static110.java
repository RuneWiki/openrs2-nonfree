import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!am;")
	public static Class11 aClass11_49;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!c;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_37 = new Class154(10);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!h", name = "x", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)I")
	public static int method2037(@OriginalArg(0) boolean arg0) {
		@Pc(17) long local17 = Static274.method4763();
		for (@Pc(29) Class4_Sub32 local29 = arg0 ? (Class4_Sub32) Static264.aClass198_22.method5268() : (Class4_Sub32) Static264.aClass198_22.method5263(); local29 != null; local29 = (Class4_Sub32) Static264.aClass198_22.method5263()) {
			if ((local29.aLong165 & 0x3FFFFFFFFFFFFFFFL) < local17) {
				if ((local29.aLong165 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local29.aLong259;
					Static103.anIntArray295[local55] = Static73.anIntArray161[local55];
					local29.method5667();
					return local55;
				}
				local29.method5667();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[B")
	public static byte[] method2038(@OriginalArg(1) int arg0) {
		@Pc(17) Class4_Sub1_Sub5 local17 = (Class4_Sub1_Sub5) Static315.aClass15_3.method356((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static130.method2621(local28, local52);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class4_Sub1_Sub5(local22);
			Static315.aClass15_3.method352((long) arg0, local17);
		}
		return local17.aByteArray18;
	}
}
