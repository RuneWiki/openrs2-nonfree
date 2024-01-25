import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class6_Sub1_Sub34 extends Class6_Sub1 {

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
	private int anInt9547 = 4;

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
	private int anInt9546 = 4;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(24) int local24 = Static479.anInt8231 / this.anInt9547;
			@Pc(29) int local29 = Static434.anInt7425 / this.anInt9546;
			@Pc(40) int[][] local40;
			if (local29 <= 0) {
				local40 = this.method8959(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local29;
				local40 = this.method8959(local46 * Static434.anInt7425 / local29, 0);
			}
			@Pc(62) int[] local62 = local40[0];
			@Pc(66) int[] local66 = local40[1];
			@Pc(70) int[] local70 = local40[2];
			@Pc(74) int[] local74 = local15[0];
			@Pc(78) int[] local78 = local15[1];
			@Pc(82) int[] local82 = local15[2];
			for (@Pc(84) int local84 = 0; local84 < Static479.anInt8231; local84++) {
				@Pc(101) int local101;
				if (local24 > 0) {
					@Pc(95) int local95 = local84 % local24;
					local101 = Static479.anInt8231 * local95 / local24;
				} else {
					local101 = 0;
				}
				local74[local84] = local62[local101];
				local78[local84] = local66[local101];
				local82[local84] = local70[local101];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9547 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt9546 = arg0.method8374();
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(26) int local26 = Static479.anInt8231 / this.anInt9547;
			@Pc(31) int local31 = Static434.anInt7425 / this.anInt9546;
			@Pc(47) int[] local47;
			@Pc(37) int local37;
			if (local31 > 0) {
				local37 = arg0 % local31;
				local47 = this.method8963(0, local37 * Static434.anInt7425 / local31);
			} else {
				local47 = this.method8963(0, 0);
			}
			for (local37 = 0; local37 < Static479.anInt8231; local37++) {
				if (local26 > 0) {
					@Pc(65) int local65 = local37 % local26;
					local11[local37] = local47[Static479.anInt8231 * local65 / local26];
				} else {
					local11[local37] = local47[0];
				}
			}
		}
		return local11;
	}
}
