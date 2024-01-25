import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
	private int anInt5787 = 4096;

	@OriginalMember(owner = "client!kaa", name = "H", descriptor = "Z")
	private boolean aBoolean503 = true;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5787 = arg0.method7860();
		} else if (arg1 == 1) {
			this.aBoolean503 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(31) int[] local31 = this.method8945(arg0 - 1 & Static115.anInt2379, 0);
			@Pc(37) int[] local37 = this.method8945(arg0, 0);
			@Pc(47) int[] local47 = this.method8945(arg0 + 1 & Static115.anInt2379, 0);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			for (@Pc(61) int local61 = 0; local61 < Static195.anInt3759; local61++) {
				@Pc(74) int local74 = (local47[local61] - local31[local61]) * this.anInt5787;
				@Pc(94) int local94 = this.anInt5787 * (local37[Static388.anInt6925 & local61 + 1] - local37[Static388.anInt6925 & local61 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(137) int local137;
				@Pc(145) int local145;
				if (local128 == 0) {
					local137 = 0;
					local141 = 0;
					local145 = 0;
				} else {
					local137 = local74 / local128;
					local141 = local94 / local128;
					local145 = 16777216 / local128;
				}
				if (this.aBoolean503) {
					local141 = (local141 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local51[local61] = local141;
				local55[local61] = local137;
				local59[local61] = local145;
			}
		}
		return local17;
	}
}
