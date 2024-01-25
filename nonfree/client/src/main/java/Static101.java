import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!kca;")
	public static final Class168 aClass168_1 = new Class168();

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_48 = new Class40(113, 8);

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_31 = new Class160(0, 8);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	public static int method1649() {
		return Static341.anInt6076++;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII[B[I[[B[[B[I)I")
	public static int method1650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg3[arg0];
		@Pc(15) int local15 = local9 + arg6[arg0];
		@Pc(19) int local19 = arg3[arg1];
		@Pc(25) int local25 = local19 + arg6[arg1];
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(53) int local53 = arg2[arg0] & 0xFF;
		if (local53 > (arg2[arg1] & 0xFF)) {
			local53 = arg2[arg1] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg4[arg0];
		@Pc(78) byte[] local78 = arg5[arg1];
		@Pc(83) int local83 = local27 - local9;
		@Pc(88) int local88 = local27 - local19;
		for (@Pc(90) int local90 = local27; local90 < local34; local90++) {
			@Pc(102) int local102 = local74[local83++] + local78[local88++];
			if (local102 < local53) {
				local53 = local102;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)Z")
	public static boolean method1651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method1652() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static164.anInt2901 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
