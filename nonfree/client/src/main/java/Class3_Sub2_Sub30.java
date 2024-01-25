import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
	private int anInt8902 = 1;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
	private int anInt8908 = 0;

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
	private int anInt8909 = 0;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt8909 = arg1.method5322(-51);
		} else if (arg0 == 1) {
			this.anInt8908 = arg1.method5322(-98);
		} else if (arg0 == 3) {
			this.anInt8902 = arg1.method5322(-107);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(26) int local26 = Static123.anIntArray113[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static636.anInt10302; local34++) {
				@Pc(40) int local40 = Static508.anIntArray472[local34];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt8909 == 0) {
					local70 = (local40 - local26) * this.anInt8902;
				} else {
					@Pc(60) int local60 = local46 * local46 + local32 * local32 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt8902 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt8908 == 0) {
					local70 = Static500.anIntArray466[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8908 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local18[local34] = local70;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		Static333.method4978();
	}
}
