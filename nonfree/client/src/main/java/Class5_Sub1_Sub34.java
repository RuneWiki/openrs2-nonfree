import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class5_Sub1_Sub34 extends Class5_Sub1 {

	@OriginalMember(owner = "client!v", name = "P", descriptor = "I")
	private int anInt3910 = 1024;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "I")
	private int anInt3913 = 2048;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	private int anInt3909 = 3072;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(21) int[][] local21 = this.method3191(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local21[1];
			for (@Pc(47) int local47 = 0; local47 < Static174.anInt3489; local47++) {
				local33[local47] = (local25[local47] * this.anInt3913 >> 12) + this.anInt3910;
				local37[local47] = this.anInt3910 + (local45[local47] * this.anInt3913 >> 12);
				local41[local47] = this.anInt3910 + (local29[local47] * this.anInt3913 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3910 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt3909 = arg0.method3077();
		} else if (arg1 == 2) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.anInt3913 = this.anInt3909 - this.anInt3910;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0, 0);
			for (@Pc(27) int local27 = 0; local27 < Static174.anInt3489; local27++) {
				local11[local27] = this.anInt3910 + (this.anInt3913 * local25[local27] >> 12);
			}
		}
		return local11;
	}
}
