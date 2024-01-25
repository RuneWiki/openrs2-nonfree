import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class6_Sub8_Sub9 extends Class6_Sub8 {

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
	private int anInt4118 = 585;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(27) int local27 = Static424.anIntArray466[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static83.anInt1268; local29++) {
				@Pc(35) int local35 = Static2.anIntArray1[local29];
				@Pc(69) int local69;
				if (local35 > this.anInt4118 && local35 < 4096 - this.anInt4118 && local27 > 2048 - this.anInt4118 && local27 < this.anInt4118 + 2048) {
					local69 = 2048 - local35;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt4118;
					local11[local29] = 4096 - local69;
				} else if (local35 > 2048 - this.anInt4118 && this.anInt4118 + 2048 > local35) {
					local69 = local27 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt4118;
					local69 <<= 0xC;
					local11[local29] = local69 / (2048 - this.anInt4118);
				} else if (this.anInt4118 > local27 || local27 > 4096 - this.anInt4118) {
					local69 = local35 - 2048;
					@Pc(181) int local181 = local69 >= 0 ? local69 : -local69;
					@Pc(186) int local186 = local181 - this.anInt4118;
					@Pc(190) int local190 = local186 << 12;
					local11[local29] = local190 / (2048 - this.anInt4118);
				} else if (local35 >= this.anInt4118 && local35 <= 4096 - this.anInt4118) {
					local11[local29] = 0;
				} else {
					local69 = 2048 - local27;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt4118;
					local11[local29] = 4096 - local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4118 = arg1.method3018();
		}
	}
}
