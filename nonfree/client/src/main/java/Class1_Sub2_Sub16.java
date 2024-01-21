import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
	private int anInt2104;

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
	private int anInt2103;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(27) int local27 = Static110.anInt2825 / this.anInt2104;
			@Pc(32) int local32 = Static102.anInt2580 / this.anInt2103;
			@Pc(50) int[][] local50;
			if (local32 > 0) {
				@Pc(38) int local38 = arg0 % local32;
				local50 = this.method3118(local38 * Static102.anInt2580 / local32, 0);
			} else {
				local50 = this.method3118(0, 0);
			}
			@Pc(62) int[] local62 = local50[1];
			@Pc(66) int[] local66 = local50[2];
			@Pc(70) int[] local70 = local18[2];
			@Pc(74) int[] local74 = local18[1];
			@Pc(78) int[] local78 = local50[0];
			@Pc(82) int[] local82 = local18[0];
			for (@Pc(84) int local84 = 0; local84 < Static110.anInt2825; local84++) {
				@Pc(101) int local101;
				if (local27 > 0) {
					@Pc(95) int local95 = local84 % local27;
					local101 = Static110.anInt2825 * local95 / local27;
				} else {
					local101 = 0;
				}
				local82[local84] = local78[local101];
				local74[local84] = local62[local101];
				local70[local84] = local66[local101];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(30) int local30 = Static110.anInt2825 / this.anInt2104;
			@Pc(35) int local35 = Static102.anInt2580 / this.anInt2103;
			@Pc(43) int[] local43;
			@Pc(49) int local49;
			if (local35 <= 0) {
				local43 = this.method3130(0, 0);
			} else {
				local49 = arg0 % local35;
				local43 = this.method3130(0, local49 * Static102.anInt2580 / local35);
			}
			for (local49 = 0; local49 < Static110.anInt2825; local49++) {
				if (local30 <= 0) {
					local21[local49] = local43[0];
				} else {
					@Pc(80) int local80 = local49 % local30;
					local21[local49] = local43[Static110.anInt2825 * local80 / local30];
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2104 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt2103 = arg0.method861();
		}
	}
}
