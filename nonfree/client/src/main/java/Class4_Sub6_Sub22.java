import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class4_Sub6_Sub22 extends Class4_Sub6 {

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method5702(arg0, 0);
			@Pc(32) int[] local32 = this.method5702(arg0, 1);
			@Pc(38) int[] local38 = this.method5702(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static31.anInt797; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(21) int[] local21 = this.method5702(arg0, 2);
			@Pc(27) int[][] local27 = this.method5693(0, arg0);
			@Pc(35) int[][] local35 = this.method5693(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local27[0];
			@Pc(55) int[] local55 = local27[1];
			@Pc(59) int[] local59 = local27[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			for (@Pc(73) int local73 = 0; local73 < Static31.anInt797; local73++) {
				@Pc(79) int local79 = local21[local73];
				if (local79 == 4096) {
					local39[local73] = local51[local73];
					local43[local73] = local55[local73];
					local47[local73] = local59[local73];
				} else if (local79 == 0) {
					local39[local73] = local63[local73];
					local43[local73] = local67[local73];
					local47[local73] = local71[local73];
				} else {
					@Pc(112) int local112 = 4096 - local79;
					local39[local73] = local79 * local51[local73] + local112 * local63[local73] >> 12;
					local43[local73] = local79 * local55[local73] + local112 * local67[local73] >> 12;
					local47[local73] = local59[local73] * local79 + local71[local73] * local112 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}
}
