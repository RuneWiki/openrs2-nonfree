import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub9() {
		super(3, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(26) int[] local26 = this.method8362(arg0, 0);
			@Pc(32) int[] local32 = this.method8362(arg0, 1);
			@Pc(38) int[] local38 = this.method8362(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2935; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local46) + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[] local29 = this.method8362(arg0, 2);
			@Pc(35) int[][] local35 = this.method8360(0, arg0);
			@Pc(41) int[][] local41 = this.method8360(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static131.anInt2935; local79++) {
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
					@Pc(117) int local117 = 4096 - local85;
					local45[local79] = local57[local79] * local85 + local69[local79] * local117 >> 12;
					local49[local79] = local73[local79] * local117 + local61[local79] * local85 >> 12;
					local53[local79] = local65[local79] * local85 + local77[local79] * local117 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}
}
