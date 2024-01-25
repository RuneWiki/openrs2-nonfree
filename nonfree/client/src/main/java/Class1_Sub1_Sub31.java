import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[] local26 = this.method7882(2, arg0);
			@Pc(32) int[][] local32 = this.method7880(arg0, 0);
			@Pc(38) int[][] local38 = this.method7880(arg0, 1);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static87.anInt1964; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(137) int local137 = 4096 - local82;
					local42[local76] = local137 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local137 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local137 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method7882(0, arg0);
			@Pc(32) int[] local32 = this.method7882(1, arg0);
			@Pc(38) int[] local38 = this.method7882(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static87.anInt1964; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local32[local40] * (4096 - local46) + local46 * local26[local40] >> 12;
				}
			}
		}
		return local11;
	}
}
