import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	private int anInt2104 = 585;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2104 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(29) int local29 = Static305.anIntArray416[arg0];
			for (@Pc(31) int local31 = 0; local31 < Static236.anInt4609; local31++) {
				@Pc(37) int local37 = Static201.anIntArray324[local31];
				@Pc(73) int local73;
				if (local37 > this.anInt2104 && local37 < 4096 - this.anInt2104 && local29 > 2048 - this.anInt2104 && this.anInt2104 + 2048 > local29) {
					local73 = 2048 - local37;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt2104;
					local21[local31] = 4096 - local73;
				} else if (local37 > 2048 - this.anInt2104 && local37 < this.anInt2104 + 2048) {
					local73 = local29 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt2104;
					local73 <<= 0xC;
					local21[local31] = local73 / (2048 - this.anInt2104);
				} else if (this.anInt2104 > local29 || local29 > 4096 - this.anInt2104) {
					local73 = local37 - 2048;
					@Pc(173) int local173 = local73 >= 0 ? local73 : -local73;
					@Pc(178) int local178 = local173 - this.anInt2104;
					@Pc(182) int local182 = local178 << 12;
					local21[local31] = local182 / (2048 - this.anInt2104);
				} else if (this.anInt2104 <= local37 && local37 <= 4096 - this.anInt2104) {
					local21[local31] = 0;
				} else {
					local73 = 2048 - local29;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt2104;
					local21[local31] = 4096 - local73;
				}
			}
		}
		return local21;
	}
}
