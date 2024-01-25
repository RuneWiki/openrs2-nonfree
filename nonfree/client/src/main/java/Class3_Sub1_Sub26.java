import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	private int anInt8461 = 3072;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	private int anInt8460 = 2048;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	private int anInt8465 = 1024;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(29) int[][] local29 = this.method9576(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static379.anInt5859; local55++) {
				local45[local55] = this.anInt8465 + (local33[local55] * this.anInt8460 >> 12);
				local49[local55] = this.anInt8465 + (local37[local55] * this.anInt8460 >> 12);
				local53[local55] = this.anInt8465 + (this.anInt8460 * local41[local55] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(29) int[] local29 = this.method9577(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static379.anInt5859; local31++) {
				local17[local31] = (local29[local31] * this.anInt8460 >> 12) + this.anInt8465;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt8465 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt8461 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.anInt8460 = this.anInt8461 - this.anInt8465;
	}
}
