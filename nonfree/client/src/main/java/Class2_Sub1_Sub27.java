import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
	private int anInt2965;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
	private int anInt2966;

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
	private int anInt2969;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(23) int[][] local23 = this.method2991(arg0, 0);
			@Pc(27) int[] local27 = local23[1];
			@Pc(31) int[] local31 = local23[0];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[2];
			@Pc(47) int[] local47 = local13[1];
			for (@Pc(49) int local49 = 0; local49 < Static129.anInt3118; local49++) {
				@Pc(55) int local55 = local35[local49];
				@Pc(59) int local59 = local31[local49];
				@Pc(63) int local63 = local27[local49];
				if (local55 == local59 && local55 == local63) {
					local39[local49] = local59 * this.anInt2966 >> 12;
					local47[local49] = this.anInt2965 * local55 >> 12;
					local43[local49] = this.anInt2969 * local63 >> 12;
				} else {
					local39[local49] = this.anInt2966;
					local47[local49] = this.anInt2965;
					local43[local49] = this.anInt2969;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2966 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt2965 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt2969 = arg0.method2353();
		}
	}
}
