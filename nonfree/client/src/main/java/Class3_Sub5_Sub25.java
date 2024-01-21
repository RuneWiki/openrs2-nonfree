import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class3_Sub5_Sub25 extends Class3_Sub5 {

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	private int anInt3344;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3344 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(27) int local27 = Static94.anIntArray277[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static104.anInt2195; local29++) {
				@Pc(35) int local35 = Static124.anIntArray355[local29];
				@Pc(71) int local71;
				if (local35 > this.anInt3344 && local35 < 4096 - this.anInt3344 && local27 > 2048 - this.anInt3344 && local27 < this.anInt3344 + 2048) {
					local71 = 2048 - local35;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3344;
					local19[local29] = 4096 - local71;
				} else if (local35 > 2048 - this.anInt3344 && local35 < this.anInt3344 + 2048) {
					local71 = local27 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt3344;
					local71 <<= 0xC;
					local19[local29] = local71 / (2048 - this.anInt3344);
				} else if (local27 < this.anInt3344 || local27 > 4096 - this.anInt3344) {
					local71 = local35 - 2048;
					@Pc(176) int local176 = local71 >= 0 ? local71 : -local71;
					@Pc(181) int local181 = local176 - this.anInt3344;
					@Pc(185) int local185 = local181 << 12;
					local19[local29] = local185 / (2048 - this.anInt3344);
				} else if (this.anInt3344 <= local35 && local35 <= 4096 - this.anInt3344) {
					local19[local29] = 0;
				} else {
					local71 = 2048 - local27;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3344;
					local19[local29] = 4096 - local71;
				}
			}
		}
		return local19;
	}
}
