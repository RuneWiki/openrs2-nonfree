import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
	public static int[] anIntArray757;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
	public static final int[] anIntArray756 = new int[13];

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[B")
	public static final byte[] aByteArray115 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
	public static int anInt8618 = 2;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)I")
	public static int method7525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static279.anIntArray259[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Lclient!oj;")
	public static Class46_Sub6 method7528(@OriginalArg(1) int arg0) {
		@Pc(11) Class184[] local11 = Class20_Sub1_Sub1.aClass184Array3;
		synchronized (Class20_Sub1_Sub1.aClass184Array3) {
			@Pc(30) Class46_Sub6 local30;
			if (Class20_Sub1_Sub1.aClass184Array3.length <= arg0 || Class20_Sub1_Sub1.aClass184Array3[arg0].method5140()) {
				local30 = new Class46_Sub6();
				local30.aClass46_Sub1Array1 = new Class46_Sub1[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass46_Sub1Array1[local52] = new Class46_Sub1();
				}
			} else {
				local30 = (Class46_Sub6) Class20_Sub1_Sub1.aClass184Array3[arg0].method5146();
				local30.method8227();
				@Pc(37) int local37 = Static117.anIntArray191[arg0]--;
			}
			return local30;
		}
	}
}
