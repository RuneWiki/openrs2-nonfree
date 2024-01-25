import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
	private int anInt633 = 4096;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt633 = arg0.method2896();
		} else if (arg1 == 1) {
			this.aBoolean94 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(33) int[] local33 = this.method5964(arg0 - 1 & Static464.anInt6761, 0);
			@Pc(39) int[] local39 = this.method5964(arg0, 0);
			@Pc(49) int[] local49 = this.method5964(arg0 + 1 & Static464.anInt6761, 0);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static218.anInt3990; local63++) {
				@Pc(77) int local77 = this.anInt633 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = this.anInt633 * (local39[local63 + 1 & Static147.anInt2302] - local39[Static147.anInt2302 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(139) int local139;
				@Pc(143) int local143;
				if (local132 == 0) {
					local139 = 0;
					local141 = 0;
					local143 = 0;
				} else {
					local141 = local97 / local132;
					local139 = local77 / local132;
					local143 = 16777216 / local132;
				}
				if (this.aBoolean94) {
					local141 = (local141 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local53[local63] = local141;
				local57[local63] = local139;
				local61[local63] = local143;
			}
		}
		return local11;
	}
}
