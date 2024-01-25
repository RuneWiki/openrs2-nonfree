import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class3_Sub8_Sub11 extends Class3_Sub8 {

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(28) int local28 = Static510.anIntArray172[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static91.anInt1849; local30++) {
				local11[local30] = this.method3805(local28, Static13.anIntArray11[local30]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(III)I")
	private int method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
