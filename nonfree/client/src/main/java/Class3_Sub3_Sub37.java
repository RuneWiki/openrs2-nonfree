import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class3_Sub3_Sub37 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(24) int local24 = Static269.anIntArray433[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static131.anInt2755; local26++) {
				local11[local26] = this.method5592(local24, Static151.anIntArray211[local26]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)I")
	private int method5592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 + arg0 * 57;
		@Pc(22) int local22 = local16 << 1 ^ local16;
		return 4096 - (Integer.MAX_VALUE & local22 * (local22 * 15731 * local22 + 789221) + 1376312589) / 262144;
	}
}
