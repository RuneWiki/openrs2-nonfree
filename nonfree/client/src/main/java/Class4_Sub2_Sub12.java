import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub12() {
		super(3, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(26) int[] local26 = this.method8208(2, arg0);
			@Pc(34) int[][] local34 = this.method8202(arg0, 0);
			@Pc(40) int[][] local40 = this.method8202(arg0, 1);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static417.anInt5248; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(114) int local114 = 4096 - local84;
					local44[local78] = local68[local78] * local114 + local84 * local56[local78] >> 12;
					local48[local78] = local72[local78] * local114 + local60[local78] * local84 >> 12;
					local52[local78] = local64[local78] * local84 + local114 * local76[local78] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(23) int[] local23 = this.method8208(0, arg0);
			@Pc(29) int[] local29 = this.method8208(1, arg0);
			@Pc(35) int[] local35 = this.method8208(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static417.anInt5248; local37++) {
				@Pc(43) int local43 = local35[local37];
				if (local43 == 4096) {
					local13[local37] = local23[local37];
				} else if (local43 == 0) {
					local13[local37] = local29[local37];
				} else {
					local13[local37] = local29[local37] * (4096 - local43) + local23[local37] * local43 >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}
}
