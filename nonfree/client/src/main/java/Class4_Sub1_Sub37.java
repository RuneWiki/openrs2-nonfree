import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class4_Sub1_Sub37 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	private int anInt5472 = 0;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
	private int anInt5471 = 1;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	private int anInt5477 = 0;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(26) int local26 = Static237.anIntArray478[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1626; local34++) {
				@Pc(41) int local41 = Static138.anIntArray231[local34];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt5472 == 0) {
					local70 = (local41 - local26) * this.anInt5471;
				} else {
					@Pc(60) int local60 = local32 * local32 + local47 * local47 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt5471 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt5477 == 0) {
					local70 = Static130.anIntArray223[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5477 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local17[local34] = local70;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		Static303.method4682();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5472 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt5477 = arg0.method4666();
		} else if (arg1 == 3) {
			this.anInt5471 = arg0.method4666();
		}
	}
}
