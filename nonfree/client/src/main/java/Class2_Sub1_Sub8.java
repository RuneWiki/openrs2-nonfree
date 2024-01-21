import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
	private int anInt1152;

	@OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
	private int anInt1154;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int local26 = Static90.anInt2352 / this.anInt1152;
			@Pc(31) int local31 = Static129.anInt3118 / this.anInt1154;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local26 <= 0) {
				local44 = this.method2980(0, 0);
			} else {
				local50 = arg0 % local26;
				local44 = this.method2980(0, local50 * Static90.anInt2352 / local26);
			}
			for (local50 = 0; local50 < Static129.anInt3118; local50++) {
				if (local31 <= 0) {
					local17[local50] = local44[0];
				} else {
					@Pc(83) int local83 = local50 % local31;
					local17[local50] = local44[local83 * Static129.anInt3118 / local31];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(16) int local16 = Static90.anInt2352 / this.anInt1152;
			@Pc(21) int local21 = Static129.anInt3118 / this.anInt1154;
			@Pc(40) int[][] local40;
			if (local16 > 0) {
				@Pc(30) int local30 = arg0 % local16;
				local40 = this.method2991(Static90.anInt2352 * local30 / local16, 0);
			} else {
				local40 = this.method2991(0, 0);
			}
			@Pc(52) int[] local52 = local40[1];
			@Pc(56) int[] local56 = local40[0];
			@Pc(60) int[] local60 = local40[2];
			@Pc(64) int[] local64 = local7[1];
			@Pc(68) int[] local68 = local7[0];
			@Pc(72) int[] local72 = local7[2];
			for (@Pc(74) int local74 = 0; local74 < Static129.anInt3118; local74++) {
				@Pc(88) int local88;
				if (local21 > 0) {
					@Pc(82) int local82 = local74 % local21;
					local88 = local82 * Static129.anInt3118 / local21;
				} else {
					local88 = 0;
				}
				local68[local74] = local56[local88];
				local64[local74] = local52[local88];
				local72[local74] = local60[local88];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1154 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt1152 = arg0.method2387();
		}
	}
}
