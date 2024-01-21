import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
	private int anInt1458;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	private int anInt1454;

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	private int anInt1453;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(27) int[][] local27 = this.method2582(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static149.anInt3233; local53++) {
				@Pc(59) int local59 = local39[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local31[local53];
				if (local67 == local59 && local63 == local59) {
					local47[local53] = local67 * this.anInt1454 >> 12;
					local43[local53] = this.anInt1458 * local59 >> 12;
					local51[local53] = local63 * this.anInt1453 >> 12;
				} else {
					local47[local53] = this.anInt1454;
					local43[local53] = this.anInt1458;
					local51[local53] = this.anInt1453;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1454 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt1458 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt1453 = arg1.method1456();
		}
	}
}
