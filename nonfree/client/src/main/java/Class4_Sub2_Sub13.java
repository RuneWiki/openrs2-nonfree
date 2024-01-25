import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	private int anInt4355 = 1;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private int anInt4349 = 0;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private int anInt4356 = 0;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4349 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt4356 = arg1.method8865();
		} else if (arg0 == 3) {
			this.anInt4355 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(23) int local23 = Static429.anIntArray465[arg0];
			@Pc(29) int local29 = local23 - 2048 >> 1;
			for (@Pc(31) int local31 = 0; local31 < Static269.anInt4330; local31++) {
				@Pc(37) int local37 = Static312.anIntArray370[local31];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt4349 == 0) {
					local67 = this.anInt4355 * (local37 - local23);
				} else {
					@Pc(57) int local57 = local43 * local43 + local29 * local29 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (local67 * this.anInt4355) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt4356 == 0) {
					local67 = Static181.anIntArray229[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4356 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local15[local31] = local67;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		Static282.method4074();
	}
}
