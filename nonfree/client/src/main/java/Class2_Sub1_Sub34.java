import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
	private int anInt3967;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
	private int anInt3968;

	@OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
	private int anInt3966;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(17) int[] local17 = this.method2980(0, arg0);
			for (@Pc(19) int local19 = 0; local19 < Static129.anInt3118; local19++) {
				local7[local19] = this.anInt3967 + (this.anInt3968 * local17[local19] >> 12);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3967 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt3966 = arg0.method2353();
		} else if (arg1 == 2) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.anInt3968 = this.anInt3966 - this.anInt3967;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(21) int[][] local21 = this.method2991(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local21[1];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static129.anInt3118; local47++) {
				local33[local47] = (this.anInt3968 * local25[local47] >> 12) + this.anInt3967;
				local41[local47] = this.anInt3967 + (local37[local47] * this.anInt3968 >> 12);
				local45[local47] = (this.anInt3968 * local29[local47] >> 12) + this.anInt3967;
			}
		}
		return local11;
	}
}
