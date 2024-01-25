import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
	private int anInt8274 = 585;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(26) int local26 = Static376.anIntArray665[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static201.anInt3738; local28++) {
				@Pc(34) int local34 = Static57.anIntArray536[local28];
				@Pc(67) int local67;
				if (this.anInt8274 < local34 && local34 < 4096 - this.anInt8274 && local26 > 2048 - this.anInt8274 && this.anInt8274 + 2048 > local26) {
					local67 = 2048 - local34;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8274;
					local18[local28] = 4096 - local67;
				} else if (local34 > 2048 - this.anInt8274 && this.anInt8274 + 2048 > local34) {
					local67 = local26 - 2048;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 -= this.anInt8274;
					local67 <<= 0xC;
					local18[local28] = local67 / (2048 - this.anInt8274);
				} else if (local26 < this.anInt8274 || local26 > 4096 - this.anInt8274) {
					local67 = local34 - 2048;
					@Pc(169) int local169 = local67 >= 0 ? local67 : -local67;
					@Pc(174) int local174 = local169 - this.anInt8274;
					@Pc(178) int local178 = local174 << 12;
					local18[local28] = local178 / (2048 - this.anInt8274);
				} else if (local34 >= this.anInt8274 && local34 <= 4096 - this.anInt8274) {
					local18[local28] = 0;
				} else {
					local67 = 2048 - local26;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8274;
					local18[local28] = 4096 - local67;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8274 = arg0.method5610();
		}
	}
}
