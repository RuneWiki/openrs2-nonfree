import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
	public static final int[] anIntArray476 = new int[4096];

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray476[local12] = Static89.method1832(local12);
		}
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)I")
	private int method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(24) int local24 = local9 << 1 ^ local9;
		return 4096 - (local24 * (local24 * 15731 * local24 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(21) int local21 = Static201.anIntArray251[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static30.anInt908; local23++) {
				local13[local23] = this.method6578(local21, Static26.anIntArray20[local23]) % 4096;
			}
		}
		return local13;
	}
}
