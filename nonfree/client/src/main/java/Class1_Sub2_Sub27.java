import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
	private int anInt4271 = 32768;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4271 = arg0.method2593() << 4;
		} else if (arg1 == 1) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(30) int[] local30 = this.method4570(arg0, 1);
			@Pc(36) int[] local36 = this.method4570(arg0, 2);
			@Pc(40) int[] local40 = local17[0];
			@Pc(44) int[] local44 = local17[2];
			@Pc(48) int[] local48 = local17[1];
			for (@Pc(50) int local50 = 0; local50 < Static299.anInt5670; local50++) {
				@Pc(63) int local63 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(72) int local72 = this.anInt4271 * local36[local50] >> 12;
				@Pc(80) int local80 = Static25.anIntArray41[local63] * local72 >> 12;
				@Pc(88) int local88 = local72 * Static36.anIntArray54[local63] >> 12;
				@Pc(96) int local96 = (local88 >> 12) + local50 & Static142.anInt2791;
				@Pc(104) int local104 = Static167.anInt3492 & arg0 + (local80 >> 12);
				@Pc(110) int[][] local110 = this.method4575(0, local104);
				local40[local50] = local110[0][local96];
				local48[local50] = local110[1][local96];
				local44[local50] = local110[2][local96];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		Static44.method777();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(27) int[] local27 = this.method4570(arg0, 1);
			@Pc(33) int[] local33 = this.method4570(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static299.anInt5670; local35++) {
				@Pc(47) int local47 = local33[local35] * this.anInt4271 >> 12;
				@Pc(55) int local55 = local27[local35] >> 4 & 0xFF;
				@Pc(63) int local63 = Static36.anIntArray54[local55] * local47 >> 12;
				@Pc(72) int local72 = Static142.anInt2791 & local35 + (local63 >> 12);
				@Pc(80) int local80 = local47 * Static25.anIntArray41[local55] >> 12;
				@Pc(88) int local88 = (local80 >> 12) + arg0 & Static167.anInt3492;
				@Pc(94) int[] local94 = this.method4570(local88, 0);
				local17[local35] = local94[local72];
			}
		}
		return local17;
	}
}
