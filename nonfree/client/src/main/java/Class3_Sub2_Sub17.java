import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
	private int anInt2262 = 1024;

	@OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
	private int anInt2266 = 3072;

	@OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
	private int anInt2261 = 2048;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.anInt2261 = this.anInt2266 - this.anInt2262;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(27) int[][] local27 = this.method4965(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static22.anInt421; local53++) {
				local43[local53] = this.anInt2262 + (this.anInt2261 * local31[local53] >> 12);
				local47[local53] = this.anInt2262 + (this.anInt2261 * local35[local53] >> 12);
				local51[local53] = (this.anInt2261 * local39[local53] >> 12) + this.anInt2262;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2262 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt2266 = arg1.method3948();
		} else if (arg0 == 2) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(27) int[] local27 = this.method4954(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static22.anInt421; local29++) {
				local16[local29] = this.anInt2262 + (this.anInt2261 * local27[local29] >> 12);
			}
		}
		return local16;
	}
}
