import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class8_Sub2_Sub34 extends Class8_Sub2 {

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(26) int[] local26 = this.method8505(arg0, 0);
			@Pc(32) int[] local32 = this.method8505(arg0, 1);
			@Pc(38) int[] local38 = this.method8505(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static538.anInt9297; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local46 * local26[local40] + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[] local29 = this.method8505(arg0, 2);
			@Pc(35) int[][] local35 = this.method8510(0, arg0);
			@Pc(41) int[][] local41 = this.method8510(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static538.anInt9297; local79++) {
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
					@Pc(95) int local95 = 4096 - local85;
					local45[local79] = local69[local79] * local95 + local85 * local57[local79] >> 12;
					local49[local79] = local85 * local61[local79] + local95 * local73[local79] >> 12;
					local53[local79] = local85 * local65[local79] + local95 * local77[local79] >> 12;
				}
			}
		}
		return local19;
	}
}
