import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class6_Sub4_Sub38 extends Class6_Sub4 {

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(29) int[] local29 = this.method8313(arg0, 2);
			@Pc(35) int[][] local35 = this.method8319(0, arg0);
			@Pc(41) int[][] local41 = this.method8319(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static6.anInt111; local79++) {
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
					@Pc(97) int local97 = 4096 - local85;
					local45[local79] = local69[local79] * local97 + local85 * local57[local79] >> 12;
					local49[local79] = local97 * local73[local79] + local85 * local61[local79] >> 12;
					local53[local79] = local77[local79] * local97 + local65[local79] * local85 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(26) int[] local26 = this.method8313(arg0, 0);
			@Pc(32) int[] local32 = this.method8313(arg0, 1);
			@Pc(38) int[] local38 = this.method8313(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static6.anInt111; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local46 * local26[local40] + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local16;
	}
}
