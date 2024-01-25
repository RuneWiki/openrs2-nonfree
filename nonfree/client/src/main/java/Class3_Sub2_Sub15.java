import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
	private int anInt4214 = 0;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt4216 = 1;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	private int anInt4222 = 0;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(23) int local23 = Static441.anIntArray522[arg0];
			@Pc(29) int local29 = local23 - 2048 >> 1;
			for (@Pc(31) int local31 = 0; local31 < Static406.anInt6694; local31++) {
				@Pc(37) int local37 = Static86.anIntArray125[local31];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(69) int local69;
				if (this.anInt4222 == 0) {
					local69 = (local37 - local23) * this.anInt4216;
				} else {
					@Pc(59) int local59 = local29 * local29 + local43 * local43 >> 12;
					local69 = (int) (Math.sqrt((double) ((float) local59 / 4096.0F)) * 4096.0D);
					local69 = (int) ((double) (local69 * this.anInt4216) * 3.141592653589793D);
				}
				local69 -= local69 & 0xFFFFF000;
				if (this.anInt4214 == 0) {
					local69 = Static97.anIntArray132[local69 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4214 == 2) {
					local69 -= 2048;
					if (local69 < 0) {
						local69 = -local69;
					}
					local69 = 2048 - local69 << 1;
				}
				local15[local31] = local69;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		Static437.method5734();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4222 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt4214 = arg0.method2582();
		} else if (arg1 == 3) {
			this.anInt4216 = arg0.method2582();
		}
	}
}
