import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub10_Sub38 extends Class2_Sub10 {

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
	private int anInt9873 = 3072;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	private int anInt9879 = 1024;

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
	private int anInt9881 = 2048;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.anInt9881 = this.anInt9873 - this.anInt9879;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(29) int[] local29 = this.method8402(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static93.anInt1862; local31++) {
				local11[local31] = this.anInt9879 + (local29[local31] * this.anInt9881 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9879 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt9873 = arg0.method6884();
		} else if (arg1 == 2) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(29) int[][] local29 = this.method8408(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static93.anInt1862; local55++) {
				local45[local55] = (local33[local55] * this.anInt9881 >> 12) + this.anInt9879;
				local49[local55] = (this.anInt9881 * local37[local55] >> 12) + this.anInt9879;
				local53[local55] = this.anInt9879 + (this.anInt9881 * local41[local55] >> 12);
			}
		}
		return local19;
	}
}
