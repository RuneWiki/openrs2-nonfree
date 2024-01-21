import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private int anInt2187;

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
	private int anInt2194;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(27) int[][] local27 = this.method2582(0, arg0);
			@Pc(31) int[] local31 = local27[2];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local17[0];
			@Pc(43) int[] local43 = local27[1];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static149.anInt3233; local53++) {
				@Pc(59) int local59 = local35[local53];
				@Pc(67) int local67 = local59 - this.anIntArray226[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt2194) {
					local39[local53] = local59;
					local47[local53] = local43[local53];
					local51[local53] = local31[local53];
				} else {
					@Pc(102) int local102 = local43[local53];
					local67 = local102 - this.anIntArray226[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt2194) {
						local39[local53] = local59;
						local47[local53] = local102;
						local51[local53] = local31[local53];
					} else {
						@Pc(141) int local141 = local31[local53];
						local67 = local141 - this.anIntArray226[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt2194) {
							local39[local53] = local59;
							local47[local53] = local102;
							local51[local53] = local141;
						} else {
							local39[local53] = local59 * this.anInt2184 >> 12;
							local47[local53] = local102 * this.anInt2187 >> 12;
							local51[local53] = local141 * this.anInt2188 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2194 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt2188 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt2187 = arg1.method1456();
		} else if (arg0 == 3) {
			this.anInt2184 = arg1.method1456();
		} else if (arg0 == 4) {
			@Pc(63) int local63 = arg1.method1436();
			this.anIntArray226[1] = local63 >> 4 & 0xFF0;
			this.anIntArray226[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray226[2] = local63 >> 12 & 0x0;
		}
	}
}
