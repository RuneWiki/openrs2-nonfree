import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
	private int anInt3778 = 3072;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
	private int anInt3780 = 1024;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
	private int anInt3787 = 2048;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.anInt3787 = this.anInt3778 - this.anInt3780;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(25) int[][] local25 = this.method3397(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local15[0];
			@Pc(41) int[] local41 = local25[2];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static107.anInt2321; local51++) {
				local37[local51] = this.anInt3780 + (local29[local51] * this.anInt3787 >> 12);
				local45[local51] = this.anInt3780 + (local33[local51] * this.anInt3787 >> 12);
				local49[local51] = (this.anInt3787 * local41[local51] >> 12) + this.anInt3780;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3780 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt3778 = arg0.method3023();
		} else if (arg1 == 2) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(21) int[] local21 = this.method3393(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static107.anInt2321; local23++) {
				local11[local23] = this.anInt3780 + (local21[local23] * this.anInt3787 >> 12);
			}
		}
		return local11;
	}
}
