import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	static {
		new Class84(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(27) int local27 = Static342.anIntArray469[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static347.anInt5974; local29++) {
				local19[local29] = this.method4562(local27, Static384.anIntArray551[local29]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(III)I")
	private int method4562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589) / 262144;
	}
}
