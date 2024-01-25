import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	private int anInt740 = 585;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt740 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(27) int local27 = Static123.anIntArray113[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static636.anInt10302; local29++) {
				@Pc(35) int local35 = Static508.anIntArray472[local29];
				@Pc(78) int local78;
				if (this.anInt740 < local35 && local35 < 4096 - this.anInt740 && local27 > 2048 - this.anInt740 && this.anInt740 + 2048 > local27) {
					local78 = 2048 - local35;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt740;
					local11[local29] = 4096 - local78;
				} else if (2048 - this.anInt740 < local35 && local35 < this.anInt740 + 2048) {
					local78 = local27 - 2048;
					local78 = local78 >= 0 ? local78 : -local78;
					local78 -= this.anInt740;
					local78 <<= 0xC;
					local11[local29] = local78 / (2048 - this.anInt740);
				} else if (local27 < this.anInt740 || 4096 - this.anInt740 < local27) {
					local78 = local35 - 2048;
					@Pc(202) int local202 = local78 < 0 ? -local78 : local78;
					@Pc(207) int local207 = local202 - this.anInt740;
					@Pc(211) int local211 = local207 << 12;
					local11[local29] = local211 / (2048 - this.anInt740);
				} else if (this.anInt740 <= local35 && local35 <= 4096 - this.anInt740) {
					local11[local29] = 0;
				} else {
					local78 = 2048 - local27;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt740;
					local11[local29] = 4096 - local78;
				}
			}
		}
		return local11;
	}
}
