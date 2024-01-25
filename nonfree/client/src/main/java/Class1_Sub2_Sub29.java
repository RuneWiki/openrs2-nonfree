import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	private int anInt6243 = 2048;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	private int anInt6244 = 3072;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	private int anInt6251 = 1024;

	static {
		new Class142(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6251 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt6244 = arg0.method2896();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(29) int[][] local29 = this.method5968(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static218.anInt3990; local55++) {
				local45[local55] = this.anInt6251 + (local33[local55] * this.anInt6243 >> 12);
				local49[local55] = (local37[local55] * this.anInt6243 >> 12) + this.anInt6251;
				local53[local55] = this.anInt6251 + (local41[local55] * this.anInt6243 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(29) int[] local29 = this.method5964(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static218.anInt3990; local31++) {
				local19[local31] = this.anInt6251 + (this.anInt6243 * local29[local31] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.anInt6243 = this.anInt6244 - this.anInt6251;
	}
}
