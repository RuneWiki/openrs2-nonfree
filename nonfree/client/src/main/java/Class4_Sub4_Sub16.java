import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class4_Sub4_Sub16 extends Class4_Sub4 {

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
	private int anInt4152 = 0;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
	private int anInt4156 = 4096;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(21) int[] local21 = this.method6040(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static419.anInt6404; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt4152 && local29 <= this.anInt4156 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4152 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt4156 = arg1.method5028();
		}
	}
}
