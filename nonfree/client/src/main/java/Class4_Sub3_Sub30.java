import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class4_Sub3_Sub30 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	private int anInt5811 = 4096;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	private int anInt5815 = 4096;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
	private int anInt5813 = 4096;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5815 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt5813 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt5811 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(25) int[][] local25 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(35) int[][] local35 = this.method6331(arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local35[2];
			@Pc(51) int[] local51 = local25[0];
			@Pc(55) int[] local55 = local25[1];
			@Pc(59) int[] local59 = local25[2];
			for (@Pc(61) int local61 = 0; local61 < Static304.anInt5637; local61++) {
				@Pc(67) int local67 = local39[local61];
				@Pc(71) int local71 = local47[local61];
				@Pc(75) int local75 = local43[local61];
				if (local67 == local71 && local71 == local75) {
					local51[local61] = local67 * this.anInt5815 >> 12;
					local55[local61] = local71 * this.anInt5813 >> 12;
					local59[local61] = local75 * this.anInt5811 >> 12;
				} else {
					local51[local61] = this.anInt5815;
					local55[local61] = this.anInt5813;
					local59[local61] = this.anInt5811;
				}
			}
		}
		return local25;
	}
}
