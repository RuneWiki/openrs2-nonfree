import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub6_Sub16 extends Class2_Sub6 {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(28) int local28 = Static138.anIntArray291[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static151.anInt2711; local30++) {
				local20[local30] = this.method2927(local28, Static160.anIntArray329[local30]) % 4096;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I")
	private int method2927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
