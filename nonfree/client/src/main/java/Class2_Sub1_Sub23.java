import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
	private int anInt5153 = 3072;

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
	private int anInt5157 = 2048;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
	private int anInt5156 = 1024;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method6031(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2581; local55++) {
				local45[local55] = (local33[local55] * this.anInt5157 >> 12) + this.anInt5156;
				local49[local55] = this.anInt5156 + (local37[local55] * this.anInt5157 >> 12);
				local53[local55] = (local41[local55] * this.anInt5157 >> 12) + this.anInt5156;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5156 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt5153 = arg1.method3711();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.anInt5157 = this.anInt5153 - this.anInt5156;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(26) int[] local26 = this.method6037(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2581; local28++) {
				local16[local28] = (this.anInt5157 * local26[local28] >> 12) + this.anInt5156;
			}
		}
		return local16;
	}
}
