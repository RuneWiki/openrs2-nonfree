import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class3_Sub3_Sub8 extends Class3_Sub3 {

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
	private int anInt1648 = 585;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1648 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(25) int local25 = Static269.anIntArray433[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static131.anInt2755; local27++) {
				@Pc(33) int local33 = Static151.anIntArray211[local27];
				@Pc(73) int local73;
				if (local33 > this.anInt1648 && local33 < 4096 - this.anInt1648 && local25 > 2048 - this.anInt1648 && local25 < this.anInt1648 + 2048) {
					local73 = 2048 - local33;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt1648;
					local11[local27] = 4096 - local73;
				} else if (2048 - this.anInt1648 < local33 && this.anInt1648 + 2048 > local33) {
					local73 = local25 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt1648;
					local73 <<= 0xC;
					local11[local27] = local73 / (2048 - this.anInt1648);
				} else if (local25 < this.anInt1648 || local25 > 4096 - this.anInt1648) {
					local73 = local33 - 2048;
					@Pc(181) int local181 = local73 >= 0 ? local73 : -local73;
					@Pc(186) int local186 = local181 - this.anInt1648;
					@Pc(190) int local190 = local186 << 12;
					local11[local27] = local190 / (2048 - this.anInt1648);
				} else if (local33 >= this.anInt1648 && local33 <= 4096 - this.anInt1648) {
					local11[local27] = 0;
				} else {
					local73 = 2048 - local25;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt1648;
					local11[local27] = 4096 - local73;
				}
			}
		}
		return local11;
	}
}
