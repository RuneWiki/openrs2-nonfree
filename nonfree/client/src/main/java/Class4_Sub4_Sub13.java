import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class4_Sub4_Sub13 extends Class4_Sub4 {

	@OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
	private int anInt4490 = 1024;

	@OriginalMember(owner = "client!iga", name = "O", descriptor = "I")
	private int anInt4494 = 3072;

	@OriginalMember(owner = "client!iga", name = "P", descriptor = "I")
	private int anInt4495 = 2048;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method7890(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static560.anInt9394; local28++) {
				local11[local28] = this.anInt4490 + (this.anInt4495 * local26[local28] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4490 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt4494 = arg1.method5982();
		} else if (arg0 == 2) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.anInt4495 = this.anInt4494 - this.anInt4490;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7892(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static560.anInt9394; local52++) {
				local42[local52] = (this.anInt4495 * local30[local52] >> 12) + this.anInt4490;
				local46[local52] = (this.anInt4495 * local34[local52] >> 12) + this.anInt4490;
				local50[local52] = this.anInt4490 + (local38[local52] * this.anInt4495 >> 12);
			}
		}
		return local16;
	}
}
