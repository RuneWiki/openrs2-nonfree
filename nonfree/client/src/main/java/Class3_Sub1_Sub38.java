import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub1_Sub38 extends Class3_Sub1 {

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	private int anInt9232 = 4096;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	private int anInt9238 = 4096;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt9235 = 4096;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(27) int[][] local27 = this.method7766(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static206.anInt4182; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local67 == local63) {
					local43[local53] = local59 * this.anInt9238 >> 12;
					local47[local53] = local63 * this.anInt9232 >> 12;
					local51[local53] = local67 * this.anInt9235 >> 12;
				} else {
					local43[local53] = this.anInt9238;
					local47[local53] = this.anInt9232;
					local51[local53] = this.anInt9235;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9238 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt9232 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt9235 = arg0.method3109();
		}
	}
}
