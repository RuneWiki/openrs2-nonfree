import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub8_Sub19 extends Class1_Sub8 {

	static {
		new Class158(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[] local29 = this.method6037(2, arg0);
			@Pc(35) int[][] local35 = this.method6035(arg0, 0);
			@Pc(41) int[][] local41 = this.method6035(arg0, 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static18.anInt439; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(137) int local137 = 4096 - local85;
					local45[local79] = local137 * local69[local79] + local85 * local57[local79] >> 12;
					local49[local79] = local73[local79] * local137 + local85 * local61[local79] >> 12;
					local53[local79] = local65[local79] * local85 + local77[local79] * local137 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(29) int[] local29 = this.method6037(0, arg0);
			@Pc(35) int[] local35 = this.method6037(1, arg0);
			@Pc(41) int[] local41 = this.method6037(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static18.anInt439; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = (4096 - local49) * local35[local43] + local49 * local29[local43] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}
}
