import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub3_Sub26 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
	private int anInt3428;

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
	private int anInt3424;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3424 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt3428 = arg1.method1680();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(26) int[][] local26 = this.method2900(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static54.anInt1423; local52++) {
				@Pc(58) int local58 = local38[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local34[local52];
				if (this.anInt3424 > local58) {
					local42[local52] = this.anInt3424;
				} else if (this.anInt3428 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt3428;
				}
				if (this.anInt3424 > local62) {
					local50[local52] = this.anInt3424;
				} else if (this.anInt3428 < local62) {
					local50[local52] = this.anInt3428;
				} else {
					local50[local52] = local62;
				}
				if (this.anInt3424 > local66) {
					local46[local52] = this.anInt3424;
				} else if (this.anInt3428 >= local66) {
					local46[local52] = local66;
				} else {
					local46[local52] = this.anInt3428;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(27) int[] local27 = this.method2901(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static54.anInt1423; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (local35 < this.anInt3424) {
					local11[local29] = this.anInt3424;
				} else if (this.anInt3428 < local35) {
					local11[local29] = this.anInt3428;
				} else {
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}
}
