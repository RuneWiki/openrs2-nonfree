import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class14_Sub3_Sub3 extends Class14_Sub3 {

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
	private int anInt650 = 4096;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt650 = arg0.method2498();
		} else if (arg1 == 1) {
			this.aBoolean32 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(33) int[] local33 = this.method6004(0, arg0 - 1 & Static179.anInt3689);
			@Pc(39) int[] local39 = this.method6004(0, arg0);
			@Pc(49) int[] local49 = this.method6004(0, Static179.anInt3689 & arg0 + 1);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static294.anInt5657; local63++) {
				@Pc(76) int local76 = this.anInt650 * (local49[local63] - local33[local63]);
				@Pc(95) int local95 = this.anInt650 * (local39[Static329.anInt6352 & local63 + 1] - local39[local63 - 1 & Static329.anInt6352]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local76 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local109 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(139) int local139;
				@Pc(147) int local147;
				if (local130 == 0) {
					local147 = 0;
					local139 = 0;
					local143 = 0;
				} else {
					local139 = local76 / local130;
					local143 = local95 / local130;
					local147 = 16777216 / local130;
				}
				if (this.aBoolean32) {
					local143 = (local143 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
				}
				local53[local63] = local143;
				local57[local63] = local139;
				local61[local63] = local147;
			}
		}
		return local19;
	}
}
