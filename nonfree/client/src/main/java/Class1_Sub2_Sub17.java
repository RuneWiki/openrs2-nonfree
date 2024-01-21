import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
	private int anInt2139;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	private int anInt2137;

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
	private int anInt2141;

	@OriginalMember(owner = "client!jd", name = "jb", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
	private int anInt2143;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(19) int[][] local19 = this.method3118(arg0, 0);
			@Pc(23) int[] local23 = local19[1];
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[2];
			@Pc(35) int[] local35 = local7[0];
			@Pc(39) int[] local39 = local7[2];
			@Pc(43) int[] local43 = local7[1];
			for (@Pc(45) int local45 = 0; local45 < Static110.anInt2825; local45++) {
				@Pc(51) int local51 = local27[local45];
				@Pc(58) int local58 = local51 - this.anIntArray279[0];
				if (local58 < 0) {
					local58 = -local58;
				}
				if (local58 > this.anInt2141) {
					local35[local45] = local51;
					local43[local45] = local23[local45];
					local39[local45] = local31[local45];
				} else {
					@Pc(96) int local96 = local23[local45];
					local58 = local96 - this.anIntArray279[1];
					if (local58 < 0) {
						local58 = -local58;
					}
					if (this.anInt2141 < local58) {
						local35[local45] = local51;
						local43[local45] = local96;
						local39[local45] = local31[local45];
					} else {
						@Pc(140) int local140 = local31[local45];
						local58 = local140 - this.anIntArray279[2];
						if (local58 < 0) {
							local58 = -local58;
						}
						if (local58 > this.anInt2141) {
							local35[local45] = local51;
							local43[local45] = local96;
							local39[local45] = local140;
						} else {
							local35[local45] = local51 * this.anInt2137 >> 12;
							local43[local45] = local96 * this.anInt2143 >> 12;
							local39[local45] = this.anInt2139 * local140 >> 12;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2141 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt2139 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt2143 = arg0.method878();
		} else if (arg1 == 3) {
			this.anInt2137 = arg0.method878();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method888();
			this.anIntArray279[1] = local57 >> 4 & 0xFF0;
			this.anIntArray279[2] = local57 >> 12 & 0x0;
			this.anIntArray279[0] = (local57 & 0xFF0000) << 4;
		}
	}
}
