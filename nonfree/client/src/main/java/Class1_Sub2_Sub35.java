import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt5338 = 0;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt5329 = 1;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	private int anInt5337 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		Static44.method777();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(21) int local21 = Static7.anIntArray13[arg0];
			@Pc(27) int local27 = local21 - 2048 >> 1;
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5670; local29++) {
				@Pc(40) int local40 = Static310.anIntArray108[local29];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(72) int local72;
				if (this.anInt5338 == 0) {
					local72 = this.anInt5329 * (local40 - local21);
				} else {
					@Pc(62) int local62 = local27 * local27 + local46 * local46 >> 12;
					local72 = (int) (Math.sqrt((double) ((float) local62 / 4096.0F)) * 4096.0D);
					local72 = (int) ((double) (local72 * this.anInt5329) * 3.141592653589793D);
				}
				local72 -= local72 & 0xFFFFF000;
				if (this.anInt5337 == 0) {
					local72 = Static25.anIntArray41[local72 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5337 == 2) {
					local72 -= 2048;
					if (local72 < 0) {
						local72 = -local72;
					}
					local72 = 2048 - local72 << 1;
				}
				local13[local29] = local72;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5338 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt5337 = arg0.method2595();
		} else if (arg1 == 3) {
			this.anInt5329 = arg0.method2595();
		}
	}
}
