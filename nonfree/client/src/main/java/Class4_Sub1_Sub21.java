import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class4_Sub1_Sub21 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mw", name = "J", descriptor = "Z")
	private boolean aBoolean469 = true;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "Z")
	private boolean aBoolean468 = true;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(37) int[] local37 = this.method8392(this.aBoolean468 ? Static237.anInt4286 - arg0 : arg0, 0);
			if (this.aBoolean469) {
				for (@Pc(50) int local50 = 0; local50 < Static376.anInt7260; local50++) {
					local19[local50] = local37[Static569.anInt9982 - local50];
				}
			} else {
				Static597.method3729(local37, 0, local19, 0, Static376.anInt7260);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(38) int[][] local38 = this.method8385(this.aBoolean468 ? Static237.anInt4286 - arg0 : arg0, 0);
			@Pc(42) int[] local42 = local38[0];
			@Pc(46) int[] local46 = local38[1];
			@Pc(50) int[] local50 = local38[2];
			@Pc(54) int[] local54 = local11[0];
			@Pc(58) int[] local58 = local11[1];
			@Pc(62) int[] local62 = local11[2];
			@Pc(67) int local67;
			if (this.aBoolean469) {
				for (local67 = 0; local67 < Static376.anInt7260; local67++) {
					local54[local67] = local42[Static569.anInt9982 - local67];
					local58[local67] = local46[Static569.anInt9982 - local67];
					local62[local67] = local50[Static569.anInt9982 - local67];
				}
			} else {
				for (local67 = 0; local67 < Static376.anInt7260; local67++) {
					local54[local67] = local42[local67];
					local58[local67] = local46[local67];
					local62[local67] = local50[local67];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean469 = arg1.method4905() == 1;
		} else if (arg0 == 1) {
			this.aBoolean468 = arg1.method4905() == 1;
		} else if (arg0 == 2) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}
}
