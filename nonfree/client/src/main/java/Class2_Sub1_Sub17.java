import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	private int anInt2416 = 3072;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	private int anInt2413 = 2048;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	private int anInt2420 = 1024;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(41) int[][] local41 = this.method3205(0, arg0);
			@Pc(45) int[] local45 = local41[1];
			@Pc(49) int[] local49 = local41[2];
			@Pc(53) int[] local53 = local41[0];
			@Pc(57) int[] local57 = local7[2];
			@Pc(61) int[] local61 = local7[0];
			@Pc(65) int[] local65 = local7[1];
			for (@Pc(67) int local67 = 0; local67 < Static62.anInt1675; local67++) {
				local61[local67] = this.anInt2420 + (local53[local67] * this.anInt2413 >> 12);
				local65[local67] = (this.anInt2413 * local45[local67] >> 12) + this.anInt2420;
				local57[local67] = this.anInt2420 + (this.anInt2413 * local49[local67] >> 12);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method3203(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1675; local28++) {
				local16[local28] = this.anInt2420 + (this.anInt2413 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2420 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt2416 = arg0.method163();
		} else if (arg1 == 2) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.anInt2413 = this.anInt2416 - this.anInt2420;
	}
}
