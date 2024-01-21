import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub4_Sub37 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
	private int anInt4781;

	@OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
	private int anInt4782;

	@OriginalMember(owner = "client!wh", name = "pb", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
	private int anInt4778;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)I")
	@Override
	public int method3213() {
		return this.anInt4778;
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)Z")
	private boolean method3219() {
		if (this.anIntArray434 != null) {
			return true;
		} else if (this.anInt4778 >= 0) {
			@Pc(29) int local29 = Static108.anInterface3_2.method3051(this.anInt4778) ? 64 : 128;
			this.anIntArray434 = Static108.anInterface3_2.method3050(this.anInt4778);
			this.anInt4781 = local29;
			this.anInt4782 = local29;
			return this.anIntArray434 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4778 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89 && this.method3219()) {
			@Pc(35) int local35 = (Static98.anInt3017 == this.anInt4781 ? arg0 : arg0 * this.anInt4781 / Static98.anInt3017) * this.anInt4782;
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local11[1];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt4782 == Static73.anInt1888) {
				for (local53 = 0; local53 < Static73.anInt1888; local53++) {
					local61 = this.anIntArray434[local35++];
					local43[local53] = (local61 & 0xFF) << 4;
					local47[local53] = local61 >> 4 & 0xFF0;
					local39[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static73.anInt1888; local53++) {
					local61 = this.anInt4782 * local53 / Static73.anInt1888;
					@Pc(109) int local109 = this.anIntArray434[local61 + local35];
					local43[local53] = (local109 & 0xFF) << 4;
					local47[local53] = local109 >> 4 & 0xFF0;
					local39[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
