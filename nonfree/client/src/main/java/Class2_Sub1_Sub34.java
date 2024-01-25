import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
	private int anInt6685 = 585;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(27) int local27 = Static373.anIntArray55[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static131.anInt2581; local29++) {
				@Pc(35) int local35 = Static252.anIntArray323[local29];
				@Pc(72) int local72;
				if (local35 > this.anInt6685 && local35 < 4096 - this.anInt6685 && 2048 - this.anInt6685 < local27 && this.anInt6685 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6685;
					local19[local29] = 4096 - local72;
				} else if (2048 - this.anInt6685 < local35 && this.anInt6685 + 2048 > local35) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt6685;
					local72 <<= 0xC;
					local19[local29] = local72 / (2048 - this.anInt6685);
				} else if (this.anInt6685 > local27 || 4096 - this.anInt6685 < local27) {
					local72 = local35 - 2048;
					@Pc(187) int local187 = local72 < 0 ? -local72 : local72;
					@Pc(192) int local192 = local187 - this.anInt6685;
					@Pc(196) int local196 = local192 << 12;
					local19[local29] = local196 / (2048 - this.anInt6685);
				} else if (this.anInt6685 <= local35 && 4096 - this.anInt6685 >= local35) {
					local19[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6685;
					local19[local29] = 4096 - local72;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6685 = arg1.method3711();
		}
	}
}
