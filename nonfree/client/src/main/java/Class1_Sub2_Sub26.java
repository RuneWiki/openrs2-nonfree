import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
	private int anInt3294;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(22) int local22 = Static181.anInt4508 / this.anInt3294;
			@Pc(27) int local27 = Static22.anInt596 / this.anInt3290;
			@Pc(43) int[] local43;
			@Pc(33) int local33;
			if (local22 > 0) {
				local33 = arg0 % local22;
				local43 = this.method3401(Static181.anInt4508 * local33 / local22, 0);
			} else {
				local43 = this.method3401(0, 0);
			}
			for (local33 = 0; local33 < Static22.anInt596; local33++) {
				if (local27 <= 0) {
					local13[local33] = local43[0];
				} else {
					@Pc(69) int local69 = local33 % local27;
					local13[local33] = local43[local69 * Static22.anInt596 / local27];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3290 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt3294 = arg1.method1234();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(25) int local25 = Static22.anInt596 / this.anInt3290;
			@Pc(30) int local30 = Static181.anInt4508 / this.anInt3294;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method3390(local36 * Static181.anInt4508 / local30, 0);
			} else {
				local46 = this.method3390(0, 0);
			}
			@Pc(58) int[] local58 = local46[1];
			@Pc(62) int[] local62 = local46[0];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static22.anInt596; local80++) {
				@Pc(94) int local94;
				if (local25 > 0) {
					@Pc(88) int local88 = local80 % local25;
					local94 = local88 * Static22.anInt596 / local25;
				} else {
					local94 = 0;
				}
				local70[local80] = local62[local94];
				local74[local80] = local58[local94];
				local78[local80] = local66[local94];
			}
		}
		return local16;
	}
}
