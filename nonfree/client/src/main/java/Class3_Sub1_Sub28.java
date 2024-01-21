import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "Z")
	private boolean aBoolean164;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean164 = arg1.method1545() == 1;
		} else if (arg0 == 1) {
			this.aBoolean165 = arg1.method1545() == 1;
		} else if (arg0 == 2) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(29) int[][] local29 = this.method3124(0, this.aBoolean165 ? Static106.anInt2755 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local12[1];
			@Pc(49) int[] local49 = local12[2];
			@Pc(53) int[] local53 = local12[0];
			@Pc(58) int local58;
			if (this.aBoolean164) {
				for (local58 = 0; local58 < Static129.anInt3285; local58++) {
					local53[local58] = local33[Static105.anInt2733 - local58];
					local45[local58] = local37[Static105.anInt2733 - local58];
					local49[local58] = local41[Static105.anInt2733 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static129.anInt3285; local58++) {
					local53[local58] = local33[local58];
					local45[local58] = local37[local58];
					local49[local58] = local41[local58];
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(35) int[] local35 = this.method3120(0, this.aBoolean165 ? Static106.anInt2755 - arg0 : arg0);
			if (this.aBoolean164) {
				for (@Pc(40) int local40 = 0; local40 < Static129.anInt3285; local40++) {
					local17[local40] = local35[Static105.anInt2733 - local40];
				}
			} else {
				Static188.method2238(local35, 0, local17, 0, Static129.anInt3285);
			}
		}
		return local17;
	}
}
