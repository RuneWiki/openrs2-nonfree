import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class6_Sub1_Sub30 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "[I")
	public static final int[] anIntArray554 = new int[32];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray554[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)I")
	private int method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * 57 + arg1;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (Integer.MAX_VALUE & local24 * (local24 * 15731 * local24 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(24) int local24 = Static230.anIntArray222[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static479.anInt8231; local26++) {
				local16[local26] = this.method7215(local24, Static205.anIntArray199[local26]) % 4096;
			}
		}
		return local16;
	}
}
