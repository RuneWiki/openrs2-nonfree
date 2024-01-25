import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
	private int anInt5359 = 585;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(27) int local27 = Static66.anIntArray158[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static251.anInt6509; local29++) {
				@Pc(35) int local35 = Static7.anIntArray23[local29];
				@Pc(75) int local75;
				if (this.anInt5359 < local35 && local35 < 4096 - this.anInt5359 && local27 > 2048 - this.anInt5359 && this.anInt5359 + 2048 > local27) {
					local75 = 2048 - local35;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5359;
					local11[local29] = 4096 - local75;
				} else if (local35 > 2048 - this.anInt5359 && local35 < this.anInt5359 + 2048) {
					local75 = local27 - 2048;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 -= this.anInt5359;
					local75 <<= 0xC;
					local11[local29] = local75 / (2048 - this.anInt5359);
				} else if (this.anInt5359 > local27 || 4096 - this.anInt5359 < local27) {
					local75 = local35 - 2048;
					@Pc(176) int local176 = local75 >= 0 ? local75 : -local75;
					@Pc(181) int local181 = local176 - this.anInt5359;
					@Pc(185) int local185 = local181 << 12;
					local11[local29] = local185 / (2048 - this.anInt5359);
				} else if (this.anInt5359 <= local35 && local35 <= 4096 - this.anInt5359) {
					local11[local29] = 0;
				} else {
					local75 = 2048 - local27;
					local75 = local75 < 0 ? -local75 : local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt5359;
					local11[local29] = 4096 - local75;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5359 = arg1.method3115();
		}
	}
}
