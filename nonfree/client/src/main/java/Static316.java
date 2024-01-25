import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "[[[Lclient!ch;")
	public static Class53[][][] aClass53ArrayArrayArray3;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!kp;IB)V")
	public static void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (!Static627.aBoolean736) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(27) int local27;
		for (@Pc(21) Class2_Sub2_Sub11 local21 = (Class2_Sub2_Sub11) arg1.aClass75_9.method1573(); local21 != null; local21 = (Class2_Sub2_Sub11) arg1.aClass75_9.method1568()) {
			local27 = Static437.method5994(local21);
			if (local10 < local27) {
				local10 = local27;
			}
		}
		local10 += 8;
		Static104.anInt1917 = (Static500.aBoolean612 ? 26 : 22) + arg1.anInt4924 * 16;
		local27 = arg1.anInt4924 * 16 + 21;
		@Pc(63) int local63 = Static408.anInt6345 + Static46.anInt975;
		if (local10 + local63 > Static511.anInt8548) {
			local63 = Static46.anInt975 - local10;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(83) int local83 = Static500.aBoolean612 ? 33 : 31;
		@Pc(90) int local90 = arg2 + 13 - local83;
		if (local90 + local27 > Static153.anInt2747) {
			local90 = Static153.anInt2747 - local27;
		}
		if (local90 < 0) {
			local90 = 0;
		}
		Static621.anInt9974 = local63;
		Static351.anInt5494 = local10;
		Static446.aClass2_Sub2_Sub12_2 = arg1;
		Static346.anInt5444 = local90;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!vj;)V")
	public static void method4248(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static363.aClass254_9 != null) {
			@Pc(24) int local24;
			try {
				Static363.aClass254_9.method5500(0L);
				Static363.aClass254_9.method5508(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method8508(0, 24, local12);
	}
}
