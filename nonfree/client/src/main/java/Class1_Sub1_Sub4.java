import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
	private int anInt276 = 585;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt276 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(25) int local25 = Static219.anIntArray515[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static131.anInt2513; local27++) {
				@Pc(38) int local38 = Static105.anIntArray261[local27];
				@Pc(75) int local75;
				if (this.anInt276 < local38 && 4096 - this.anInt276 > local38 && local25 > 2048 - this.anInt276 && local25 < this.anInt276 + 2048) {
					local75 = 2048 - local38;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt276;
					local17[local27] = 4096 - local75;
				} else if (2048 - this.anInt276 < local38 && local38 < this.anInt276 + 2048) {
					local75 = local25 - 2048;
					local75 = local75 < 0 ? -local75 : local75;
					local75 -= this.anInt276;
					local75 <<= 0xC;
					local17[local27] = local75 / (2048 - this.anInt276);
				} else if (this.anInt276 > local25 || local25 > 4096 - this.anInt276) {
					local75 = local38 - 2048;
					@Pc(181) int local181 = local75 < 0 ? -local75 : local75;
					@Pc(186) int local186 = local181 - this.anInt276;
					@Pc(190) int local190 = local186 << 12;
					local17[local27] = local190 / (2048 - this.anInt276);
				} else if (this.anInt276 <= local38 && 4096 - this.anInt276 >= local38) {
					local17[local27] = 0;
				} else {
					local75 = 2048 - local25;
					local75 = local75 < 0 ? -local75 : local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt276;
					local17[local27] = 4096 - local75;
				}
			}
		}
		return local17;
	}
}
