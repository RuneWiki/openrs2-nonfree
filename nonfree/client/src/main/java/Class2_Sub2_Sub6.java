import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int anInt833 = 3072;

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
	private int anInt832 = 1024;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
	private int anInt834 = 2048;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static106.anInt3045; local28++) {
				local16[local28] = this.anInt832 + (this.anInt834 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.anInt834 = this.anInt833 - this.anInt832;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(25) int[][] local25 = this.method3557(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local7[0];
			@Pc(45) int[] local45 = local7[1];
			@Pc(49) int[] local49 = local7[2];
			for (@Pc(51) int local51 = 0; local51 < Static106.anInt3045; local51++) {
				local41[local51] = (local29[local51] * this.anInt834 >> 12) + this.anInt832;
				local45[local51] = this.anInt832 + (local33[local51] * this.anInt834 >> 12);
				local49[local51] = (local37[local51] * this.anInt834 >> 12) + this.anInt832;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt832 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt833 = arg1.method234();
		} else if (arg0 == 2) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}
}
