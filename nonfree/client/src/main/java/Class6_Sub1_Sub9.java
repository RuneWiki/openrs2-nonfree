import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(34) int[] local34 = this.method8963(0, this.aBoolean172 ? Static476.anInt8174 - arg0 : arg0);
			if (this.aBoolean171) {
				for (@Pc(39) int local39 = 0; local39 < Static479.anInt8231; local39++) {
					local16[local39] = local34[Static413.anInt7225 - local39];
				}
			} else {
				Static679.method1569(local34, 0, local16, 0, Static479.anInt8231);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean171 = arg0.method8374() == 1;
		} else if (arg1 == 1) {
			this.aBoolean172 = arg0.method8374() == 1;
		} else if (arg1 == 2) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(33) int[][] local33 = this.method8959(this.aBoolean172 ? Static476.anInt8174 - arg0 : arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(62) int local62;
			if (this.aBoolean171) {
				for (local62 = 0; local62 < Static479.anInt8231; local62++) {
					local49[local62] = local37[Static413.anInt7225 - local62];
					local53[local62] = local41[Static413.anInt7225 - local62];
					local57[local62] = local45[Static413.anInt7225 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static479.anInt8231; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local11;
	}
}
