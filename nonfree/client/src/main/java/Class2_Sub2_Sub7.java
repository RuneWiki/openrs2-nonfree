import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	private int anInt1799 = 585;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(27) int local27 = Static318.anIntArray565[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static429.anInt6518; local29++) {
				@Pc(35) int local35 = Static365.anIntArray535[local29];
				@Pc(67) int local67;
				if (local35 > this.anInt1799 && local35 < 4096 - this.anInt1799 && 2048 - this.anInt1799 < local27 && local27 < this.anInt1799 + 2048) {
					local67 = 2048 - local35;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1799;
					local19[local29] = 4096 - local67;
				} else if (2048 - this.anInt1799 < local35 && local35 < this.anInt1799 + 2048) {
					local67 = local27 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt1799;
					local67 <<= 0xC;
					local19[local29] = local67 / (2048 - this.anInt1799);
				} else if (local27 < this.anInt1799 || local27 > 4096 - this.anInt1799) {
					local67 = local35 - 2048;
					@Pc(168) int local168 = local67 < 0 ? -local67 : local67;
					@Pc(173) int local173 = local168 - this.anInt1799;
					@Pc(177) int local177 = local173 << 12;
					local19[local29] = local177 / (2048 - this.anInt1799);
				} else if (this.anInt1799 <= local35 && local35 <= 4096 - this.anInt1799) {
					local19[local29] = 0;
				} else {
					local67 = 2048 - local27;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1799;
					local19[local29] = 4096 - local67;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1799 = arg0.method5500();
		}
	}
}
