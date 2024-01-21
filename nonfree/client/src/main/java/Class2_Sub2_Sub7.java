import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
	private int anInt886 = 585;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt886 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(27) int local27 = Static160.anIntArray187[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static106.anInt3045; local29++) {
				@Pc(35) int local35 = Static15.anIntArray41[local29];
				@Pc(75) int local75;
				if (this.anInt886 < local35 && 4096 - this.anInt886 > local35 && 2048 - this.anInt886 < local27 && this.anInt886 + 2048 > local27) {
					local75 = 2048 - local35;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt886;
					local19[local29] = 4096 - local75;
				} else if (local35 > 2048 - this.anInt886 && local35 < this.anInt886 + 2048) {
					local75 = local27 - 2048;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 -= this.anInt886;
					local75 <<= 0xC;
					local19[local29] = local75 / (2048 - this.anInt886);
				} else if (this.anInt886 > local27 || local27 > 4096 - this.anInt886) {
					local75 = local35 - 2048;
					@Pc(185) int local185 = local75 >= 0 ? local75 : -local75;
					@Pc(190) int local190 = local185 - this.anInt886;
					@Pc(194) int local194 = local190 << 12;
					local19[local29] = local194 / (2048 - this.anInt886);
				} else if (this.anInt886 <= local35 && 4096 - this.anInt886 >= local35) {
					local19[local29] = 0;
				} else {
					local75 = 2048 - local27;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt886;
					local19[local29] = 4096 - local75;
				}
			}
		}
		return local19;
	}
}
