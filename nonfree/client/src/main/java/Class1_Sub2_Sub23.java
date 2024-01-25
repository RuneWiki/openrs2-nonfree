import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
	private int anInt5349 = 4096;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
	private int anInt5350 = 4096;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	private int anInt5348 = 4096;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5350 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt5348 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt5349 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(27) int[][] local27 = this.method5968(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static218.anInt3990; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt5350 >> 12;
					local47[local53] = local63 * this.anInt5348 >> 12;
					local51[local53] = local67 * this.anInt5349 >> 12;
				} else {
					local43[local53] = this.anInt5350;
					local47[local53] = this.anInt5348;
					local51[local53] = this.anInt5349;
				}
			}
		}
		return local17;
	}
}
