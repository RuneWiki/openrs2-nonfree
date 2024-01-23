import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
	private int anInt2944 = 3072;

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
	private int anInt2943 = 1024;

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	private int anInt2947 = 2048;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(27) int[] local27 = this.method3955(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static54.anInt953; local29++) {
				local7[local29] = (local27[local29] * this.anInt2947 >> 12) + this.anInt2943;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.anInt2947 = this.anInt2944 - this.anInt2943;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2943 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt2944 = arg0.method2095();
		} else if (arg1 == 2) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(27) int[][] local27 = this.method3952(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static54.anInt953; local53++) {
				local43[local53] = (local31[local53] * this.anInt2947 >> 12) + this.anInt2943;
				local51[local53] = this.anInt2943 + (this.anInt2947 * local35[local53] >> 12);
				local47[local53] = this.anInt2943 + (local39[local53] * this.anInt2947 >> 12);
			}
		}
		return local17;
	}
}
