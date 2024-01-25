import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub8_Sub7 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
	private int anInt2329 = 585;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2329 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(27) int local27 = Static134.anIntArray308[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static18.anInt439; local29++) {
				@Pc(35) int local35 = Static198.anIntArray749[local29];
				@Pc(72) int local72;
				if (this.anInt2329 < local35 && local35 < 4096 - this.anInt2329 && local27 > 2048 - this.anInt2329 && local27 < this.anInt2329 + 2048) {
					local72 = 2048 - local35;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt2329;
					local19[local29] = 4096 - local72;
				} else if (local35 > 2048 - this.anInt2329 && this.anInt2329 + 2048 > local35) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt2329;
					local72 <<= 0xC;
					local19[local29] = local72 / (2048 - this.anInt2329);
				} else if (local27 < this.anInt2329 || 4096 - this.anInt2329 < local27) {
					local72 = local35 - 2048;
					@Pc(174) int local174 = local72 < 0 ? -local72 : local72;
					@Pc(179) int local179 = local174 - this.anInt2329;
					@Pc(183) int local183 = local179 << 12;
					local19[local29] = local183 / (2048 - this.anInt2329);
				} else if (this.anInt2329 <= local35 && local35 <= 4096 - this.anInt2329) {
					local19[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt2329;
					local19[local29] = 4096 - local72;
				}
			}
		}
		return local19;
	}
}
