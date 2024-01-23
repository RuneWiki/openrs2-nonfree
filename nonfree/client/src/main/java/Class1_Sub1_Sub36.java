import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(3, false);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(30) int[] local30 = this.method4464(arg0, 2);
			@Pc(36) int[][] local36 = this.method4456(arg0, 0);
			@Pc(42) int[][] local42 = this.method4456(arg0, 1);
			@Pc(46) int[] local46 = local19[0];
			@Pc(50) int[] local50 = local19[1];
			@Pc(54) int[] local54 = local19[2];
			@Pc(58) int[] local58 = local36[0];
			@Pc(62) int[] local62 = local36[1];
			@Pc(66) int[] local66 = local36[2];
			@Pc(70) int[] local70 = local42[0];
			@Pc(74) int[] local74 = local42[1];
			@Pc(78) int[] local78 = local42[2];
			for (@Pc(80) int local80 = 0; local80 < Static6.anInt4960; local80++) {
				@Pc(87) int local87 = local30[local80];
				if (local87 == 4096) {
					local46[local80] = local58[local80];
					local50[local80] = local62[local80];
					local54[local80] = local66[local80];
				} else if (local87 == 0) {
					local46[local80] = local70[local80];
					local50[local80] = local74[local80];
					local54[local80] = local78[local80];
				} else {
					@Pc(120) int local120 = 4096 - local87;
					local46[local80] = local120 * local70[local80] + local58[local80] * local87 >> 12;
					local50[local80] = local120 * local74[local80] + local62[local80] * local87 >> 12;
					local54[local80] = local78[local80] * local120 + local66[local80] * local87 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(27) int[] local27 = this.method4464(arg0, 0);
			@Pc(33) int[] local33 = this.method4464(arg0, 1);
			@Pc(39) int[] local39 = this.method4464(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static6.anInt4960; local41++) {
				@Pc(48) int local48 = local39[local41];
				if (local48 == 4096) {
					local17[local41] = local27[local41];
				} else if (local48 == 0) {
					local17[local41] = local33[local41];
				} else {
					local17[local41] = (4096 - local48) * local33[local41] + local48 * local27[local41] >> 12;
				}
			}
		}
		return local17;
	}
}
