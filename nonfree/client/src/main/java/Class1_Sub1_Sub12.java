import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!go", name = "U", descriptor = "I")
	private int anInt2167 = 585;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(27) int local27 = Static256.anIntArray474[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1350; local29++) {
				@Pc(40) int local40 = Static3.anIntArray3[local29];
				@Pc(86) int local86;
				if (local40 > this.anInt2167 && local40 < 4096 - this.anInt2167 && local27 > 2048 - this.anInt2167 && local27 < this.anInt2167 + 2048) {
					local86 = 2048 - local40;
					local86 = local86 < 0 ? -local86 : local86;
					local86 <<= 0xC;
					local86 /= 2048 - this.anInt2167;
					local18[local29] = 4096 - local86;
				} else if (local40 > 2048 - this.anInt2167 && this.anInt2167 + 2048 > local40) {
					local86 = local27 - 2048;
					local86 = local86 < 0 ? -local86 : local86;
					local86 -= this.anInt2167;
					local86 <<= 0xC;
					local18[local29] = local86 / (2048 - this.anInt2167);
				} else if (local27 < this.anInt2167 || local27 > 4096 - this.anInt2167) {
					local86 = local40 - 2048;
					@Pc(189) int local189 = local86 >= 0 ? local86 : -local86;
					@Pc(194) int local194 = local189 - this.anInt2167;
					@Pc(198) int local198 = local194 << 12;
					local18[local29] = local198 / (2048 - this.anInt2167);
				} else if (this.anInt2167 <= local40 && 4096 - this.anInt2167 >= local40) {
					local18[local29] = 0;
				} else {
					local86 = 2048 - local27;
					local86 = local86 >= 0 ? local86 : -local86;
					local86 <<= 0xC;
					local86 /= 2048 - this.anInt2167;
					local18[local29] = 4096 - local86;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2167 = arg0.method2244();
		}
	}
}
