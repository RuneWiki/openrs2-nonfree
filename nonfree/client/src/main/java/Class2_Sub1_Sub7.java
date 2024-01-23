import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
	private int anInt1275 = 1024;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	private int anInt1265 = 2048;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "I")
	private int anInt1272 = 3072;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(29) int[] local29 = this.method4601(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static281.anInt5558; local31++) {
				local7[local31] = (this.anInt1265 * local29[local31] >> 12) + this.anInt1275;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.anInt1265 = this.anInt1272 - this.anInt1275;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1275 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt1272 = arg0.method2130();
		} else if (arg1 == 2) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int[][] local29 = this.method4600(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local18[0];
			@Pc(49) int[] local49 = local18[1];
			@Pc(53) int[] local53 = local18[2];
			for (@Pc(55) int local55 = 0; local55 < Static281.anInt5558; local55++) {
				local45[local55] = (local33[local55] * this.anInt1265 >> 12) + this.anInt1275;
				local49[local55] = this.anInt1275 + (this.anInt1265 * local37[local55] >> 12);
				local53[local55] = (this.anInt1265 * local41[local55] >> 12) + this.anInt1275;
			}
		}
		return local18;
	}
}
