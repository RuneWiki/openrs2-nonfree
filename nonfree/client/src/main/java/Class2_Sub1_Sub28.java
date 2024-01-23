import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
	private int anInt3823;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		this(0);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub28(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3139(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	private void method3139(@OriginalArg(0) int arg0) {
		this.anInt3818 = arg0 >> 12 & 0xFF0;
		this.anInt3817 = (arg0 & 0xFF) << 4;
		this.anInt3823 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[2];
			@Pc(37) int[] local37 = local11[1];
			for (@Pc(39) int local39 = 0; local39 < Static281.anInt5558; local39++) {
				local29[local39] = this.anInt3818;
				local37[local39] = this.anInt3823;
				local33[local39] = this.anInt3817;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method3139(arg0.method2166());
		}
	}
}
