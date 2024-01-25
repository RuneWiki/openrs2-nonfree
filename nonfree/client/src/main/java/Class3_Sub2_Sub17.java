import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "Z")
	private boolean aBoolean461 = true;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "Z")
	private boolean aBoolean460 = true;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(39) int[] local39 = this.method9204(this.aBoolean461 ? Static599.anInt9773 - arg0 : arg0, 0);
			if (this.aBoolean460) {
				for (@Pc(54) int local54 = 0; local54 < Static636.anInt10302; local54++) {
					local11[local54] = local39[Static144.anInt2744 - local54];
				}
			} else {
				Static735.method9182(local39, 0, local11, 0, Static636.anInt10302);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(43) int[][] local43 = this.method9212(0, this.aBoolean461 ? Static599.anInt9773 - arg0 : arg0);
			@Pc(47) int[] local47 = local43[0];
			@Pc(51) int[] local51 = local43[1];
			@Pc(55) int[] local55 = local43[2];
			@Pc(59) int[] local59 = local20[0];
			@Pc(63) int[] local63 = local20[1];
			@Pc(67) int[] local67 = local20[2];
			@Pc(72) int local72;
			if (this.aBoolean460) {
				for (local72 = 0; local72 < Static636.anInt10302; local72++) {
					local59[local72] = local47[Static144.anInt2744 - local72];
					local63[local72] = local51[Static144.anInt2744 - local72];
					local67[local72] = local55[Static144.anInt2744 - local72];
				}
			} else {
				for (local72 = 0; local72 < Static636.anInt10302; local72++) {
					local59[local72] = local47[local72];
					local63[local72] = local51[local72];
					local67[local72] = local55[local72];
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.aBoolean460 = arg1.method5322(-55) == 1;
		} else if (arg0 == 1) {
			this.aBoolean461 = arg1.method5322(-18) == 1;
		} else if (arg0 == 2) {
			super.aBoolean794 = arg1.method5322(-7) == 1;
		}
	}
}
