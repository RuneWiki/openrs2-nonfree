import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class1_Sub8_Sub23 extends Class1_Sub8 {

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "I")
	private int anInt5569 = 32768;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		Static9.method2255();
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[] local29 = this.method6037(1, arg0);
			@Pc(35) int[] local35 = this.method6037(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static18.anInt439; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt5569 * local35[local49] >> 12;
				@Pc(78) int local78 = Static311.anIntArray545[local61] * local70 >> 12;
				@Pc(86) int local86 = local70 * Static435.anIntArray722[local61] >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static283.anInt5397;
				@Pc(102) int local102 = Static443.anInt7904 & arg0 + (local86 >> 12);
				@Pc(108) int[][] local108 = this.method6035(local102, 0);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(21) int[] local21 = this.method6037(1, arg0);
			@Pc(27) int[] local27 = this.method6037(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static18.anInt439; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt5569 * local27[local29] >> 12;
				@Pc(56) int local56 = Static311.anIntArray545[local39] * local48 >> 12;
				@Pc(64) int local64 = local48 * Static435.anIntArray722[local39] >> 12;
				@Pc(72) int local72 = Static283.anInt5397 & (local56 >> 12) + local29;
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static443.anInt7904;
				@Pc(86) int[] local86 = this.method6037(0, local80);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5569 = arg1.method1177() << 4;
		} else if (arg0 == 1) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}
}
