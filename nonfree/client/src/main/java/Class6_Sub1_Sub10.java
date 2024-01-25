import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
	private int anInt1942 = 4096;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
	private int anInt1946 = 0;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(21) int[] local21 = this.method5609(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static299.anInt5659; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt1946 <= local29 && local29 <= this.anInt1942 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1946 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt1942 = arg0.method4021();
		}
	}
}
