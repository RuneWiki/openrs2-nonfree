import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZBI)V")
	public static void method5193(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static228.aByteArrayArrayArray7 = new byte[arg1][Static43.anInt1151][Static260.anInt5348];
		Static100.aByteArrayArrayArray4 = new byte[arg1][Static43.anInt1151][Static260.anInt5348];
		Static276.anIntArrayArrayArray12 = new int[arg1][Static43.anInt1151 + 1][Static260.anInt5348 + 1];
		Static192.anIntArray381 = new int[Static260.anInt5348];
		Static283.anIntArray555 = new int[Static260.anInt5348];
		Static203.anInt4293 = 99;
		Static268.aByteArrayArrayArray10 = new byte[arg1][Static43.anInt1151 + 1][Static260.anInt5348 + 1];
		Static48.anIntArray72 = new int[Static260.anInt5348];
		if (!arg0) {
			Static223.aByteArrayArrayArray3 = null;
		}
		Static334.aByteArrayArrayArray12 = new byte[arg1][Static43.anInt1151][Static260.anInt5348];
		Static44.anIntArray69 = new int[Static260.anInt5348];
		Static338.anIntArray660 = new int[5];
		Static47.aByteArrayArrayArray1 = new byte[arg1][Static43.anInt1151][Static260.anInt5348];
		Static44.anIntArray68 = new int[Static260.anInt5348];
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public static void method5194(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg0);
		if (local19 != null) {
			for (@Pc(24) int local24 = 0; local24 < local19.anIntArray3.length; local24++) {
				local19.anIntArray3[local24] = -1;
				local19.anIntArray4[local24] = 0;
			}
		}
	}
}
