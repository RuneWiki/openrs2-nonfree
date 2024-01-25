import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class5_Sub2_Sub31 extends Class5_Sub2 {

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(27) int[] local27 = this.method5808(0, arg0);
			@Pc(33) int[] local33 = this.method5808(1, arg0);
			@Pc(39) int[] local39 = this.method5808(2, arg0);
			for (@Pc(41) int local41 = 0; local41 < Static15.anInt493; local41++) {
				@Pc(47) int local47 = local39[local41];
				if (local47 == 4096) {
					local13[local41] = local27[local41];
				} else if (local47 == 0) {
					local13[local41] = local33[local41];
				} else {
					local13[local41] = local47 * local27[local41] + local33[local41] * (4096 - local47) >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[] local29 = this.method5808(2, arg0);
			@Pc(35) int[][] local35 = this.method5818(arg0, 0);
			@Pc(41) int[][] local41 = this.method5818(arg0, 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static15.anInt493; local79++) {
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
					local45[local79] = local69[local79] * local137 + local85 * local57[local79] >> 12;
					local49[local79] = local85 * local61[local79] + local73[local79] * local137 >> 12;
					local53[local79] = local85 * local65[local79] + local77[local79] * local137 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}
}
