import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(27) int[][] local27 = this.method3017(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static53.anInt1184; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray8[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt117 < local67) {
					local43[local53] = local59;
					local51[local53] = local35[local53];
					local47[local53] = local39[local53];
				} else {
					@Pc(98) int local98 = local35[local53];
					local67 = local98 - this.anIntArray8[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt117) {
						local43[local53] = local59;
						local51[local53] = local98;
						local47[local53] = local39[local53];
					} else {
						@Pc(134) int local134 = local39[local53];
						local67 = local134 - this.anIntArray8[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt117 < local67) {
							local43[local53] = local59;
							local51[local53] = local98;
							local47[local53] = local134;
						} else {
							local43[local53] = local59 * this.anInt122 >> 12;
							local51[local53] = local98 * this.anInt123 >> 12;
							local47[local53] = this.anInt116 * local134 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt117 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt116 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt123 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt122 = arg1.method2933();
		} else if (arg0 == 4) {
			@Pc(55) int local55 = arg1.method2942();
			this.anIntArray8[0] = (local55 & 0xFF0000) << 4;
			this.anIntArray8[1] = local55 >> 4 & 0xFF0;
			this.anIntArray8[2] = local55 >> 12 & 0x0;
		}
	}
}
