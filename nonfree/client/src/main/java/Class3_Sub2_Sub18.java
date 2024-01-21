import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
	private int anInt2139 = 585;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2139 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(27) int local27 = Static34.anIntArray37[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static190.anInt3865; local29++) {
				@Pc(35) int local35 = Static133.anIntArray187[local29];
				@Pc(66) int local66;
				if (local35 > this.anInt2139 && local35 < 4096 - this.anInt2139 && 2048 - this.anInt2139 < local27 && this.anInt2139 + 2048 > local27) {
					local66 = 2048 - local35;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt2139;
					local19[local29] = 4096 - local66;
				} else if (local35 > 2048 - this.anInt2139 && local35 < this.anInt2139 + 2048) {
					local66 = local27 - 2048;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 -= this.anInt2139;
					local66 <<= 0xC;
					local19[local29] = local66 / (2048 - this.anInt2139);
				} else if (this.anInt2139 > local27 || 4096 - this.anInt2139 < local27) {
					local66 = local35 - 2048;
					@Pc(176) int local176 = local66 >= 0 ? local66 : -local66;
					@Pc(181) int local181 = local176 - this.anInt2139;
					@Pc(185) int local185 = local181 << 12;
					local19[local29] = local185 / (2048 - this.anInt2139);
				} else if (local35 >= this.anInt2139 && 4096 - this.anInt2139 >= local35) {
					local19[local29] = 0;
				} else {
					local66 = 2048 - local27;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt2139;
					local19[local29] = 4096 - local66;
				}
			}
		}
		return local19;
	}
}
