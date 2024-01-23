import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I")
	private int method2368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * 57 + arg1;
		@Pc(21) int local21 = local15 ^ local15 << 1;
		return 4096 - (Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(26) int local26 = Static250.anIntArray398[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static182.anInt3492; local28++) {
				local17[local28] = this.method2368(local26, Static279.anIntArray454[local28]) % 4096;
			}
		}
		return local17;
	}
}
