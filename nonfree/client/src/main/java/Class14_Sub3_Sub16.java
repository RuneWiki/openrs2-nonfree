import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class14_Sub3_Sub16 extends Class14_Sub3 {

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
	private int anInt2745 = 585;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(25) int local25 = Static213.anIntArray381[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static294.anInt5657; local27++) {
				@Pc(33) int local33 = Static346.anIntArray638[local27];
				@Pc(70) int local70;
				if (this.anInt2745 < local33 && 4096 - this.anInt2745 > local33 && 2048 - this.anInt2745 < local25 && this.anInt2745 + 2048 > local25) {
					local70 = 2048 - local33;
					local70 = local70 >= 0 ? local70 : -local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt2745;
					local17[local27] = 4096 - local70;
				} else if (local33 > 2048 - this.anInt2745 && this.anInt2745 + 2048 > local33) {
					local70 = local25 - 2048;
					local70 = local70 < 0 ? -local70 : local70;
					local70 -= this.anInt2745;
					local70 <<= 0xC;
					local17[local27] = local70 / (2048 - this.anInt2745);
				} else if (local25 < this.anInt2745 || local25 > 4096 - this.anInt2745) {
					local70 = local33 - 2048;
					@Pc(174) int local174 = local70 >= 0 ? local70 : -local70;
					@Pc(179) int local179 = local174 - this.anInt2745;
					@Pc(183) int local183 = local179 << 12;
					local17[local27] = local183 / (2048 - this.anInt2745);
				} else if (local33 >= this.anInt2745 && 4096 - this.anInt2745 >= local33) {
					local17[local27] = 0;
				} else {
					local70 = 2048 - local25;
					local70 = local70 < 0 ? -local70 : local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt2745;
					local17[local27] = 4096 - local70;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2745 = arg0.method2498();
		}
	}
}
