import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
	private int anInt5911 = 4096;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5911 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(31) int[] local31 = this.method5472(Static157.anInt2698 & arg0 - 1, 0);
			@Pc(37) int[] local37 = this.method5472(arg0, 0);
			@Pc(47) int[] local47 = this.method5472(Static157.anInt2698 & arg0 + 1, 0);
			for (@Pc(49) int local49 = 0; local49 < Static217.anInt3574; local49++) {
				@Pc(63) int local63 = (local47[local49] - local31[local49]) * this.anInt5911;
				@Pc(82) int local82 = (local37[Static127.anInt2287 & local49 + 1] - local37[local49 - 1 & Static127.anInt2287]) * this.anInt5911;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local63 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local49] = 4096 - local124;
			}
		}
		return local11;
	}
}
