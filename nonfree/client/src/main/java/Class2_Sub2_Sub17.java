import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[] local29 = this.method5839(arg0, 2);
			@Pc(35) int[][] local35 = this.method5840(arg0, 0);
			@Pc(41) int[][] local41 = this.method5840(arg0, 1);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static429.anInt6518; local79++) {
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
					@Pc(114) int local114 = 4096 - local85;
					local45[local79] = local57[local79] * local85 + local69[local79] * local114 >> 12;
					local49[local79] = local61[local79] * local85 + local114 * local73[local79] >> 12;
					local53[local79] = local85 * local65[local79] + local77[local79] * local114 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(21) int[] local21 = this.method5839(arg0, 0);
			@Pc(27) int[] local27 = this.method5839(arg0, 1);
			@Pc(33) int[] local33 = this.method5839(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static429.anInt6518; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local27[local35] * (4096 - local41) + local21[local35] * local41 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}
}
