import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class8_Sub3_Sub1 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
	private int anInt284 = 0;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
	private int anInt283 = 4096;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(28) int[] local28 = this.method4230(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static239.anInt4789; local30++) {
				@Pc(41) int local41 = local28[local30];
				local7[local30] = local41 >= this.anInt284 && local41 <= this.anInt283 ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt284 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt283 = arg1.method2375();
		}
	}
}
