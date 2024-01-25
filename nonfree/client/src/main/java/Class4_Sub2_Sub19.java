import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class4_Sub2_Sub19 extends Class4_Sub2 {

	@OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
	private int anInt5879 = 4096;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5879 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(29) int[] local29 = this.method8768(0, Static489.anInt7677 & arg0 - 1);
			@Pc(35) int[] local35 = this.method8768(0, arg0);
			@Pc(45) int[] local45 = this.method8768(0, Static489.anInt7677 & arg0 + 1);
			for (@Pc(47) int local47 = 0; local47 < Static269.anInt4330; local47++) {
				@Pc(61) int local61 = (local45[local47] - local29[local47]) * this.anInt5879;
				@Pc(80) int local80 = (local35[Static215.anInt3481 & local47 + 1] - local35[local47 - 1 & Static215.anInt3481]) * this.anInt5879;
				@Pc(84) int local84 = local80 >> 12;
				@Pc(88) int local88 = local61 >> 12;
				@Pc(94) int local94 = local84 * local84 >> 12;
				@Pc(100) int local100 = local88 * local88 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((float) (local100 + local94 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(122) int local122 = local114 == 0 ? 0 : 16777216 / local114;
				local11[local47] = 4096 - local122;
			}
		}
		return local11;
	}
}
