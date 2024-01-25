import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	static {
		new Class62(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(24) int local24 = Static229.anIntArray382[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static391.anInt7118; local26++) {
				local11[local26] = this.method2876(Static167.anIntArray267[local26], local24) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)I")
	private int method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589) / 262144;
	}
}
