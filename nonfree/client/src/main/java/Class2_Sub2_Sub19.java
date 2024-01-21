import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
	private int anInt2724 = 0;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
	private int anInt2729 = 4096;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2724 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt2729 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static106.anInt3045; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt2724 <= local34 && this.anInt2729 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}
}
