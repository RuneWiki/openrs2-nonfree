import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class7_Sub3_Sub25 extends Class7_Sub3 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	private int anInt5284 = 4096;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
	private int anInt5285 = 4096;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	private int anInt5286 = 4096;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(22) int[][] local22 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(32) int[][] local32 = this.method5597(0, arg0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static58.anInt1052; local58++) {
				@Pc(64) int local64 = local36[local58];
				@Pc(68) int local68 = local44[local58];
				@Pc(72) int local72 = local40[local58];
				if (local64 == local68 && local68 == local72) {
					local48[local58] = local64 * this.anInt5284 >> 12;
					local52[local58] = this.anInt5286 * local68 >> 12;
					local56[local58] = local72 * this.anInt5285 >> 12;
				} else {
					local48[local58] = this.anInt5284;
					local52[local58] = this.anInt5286;
					local56[local58] = this.anInt5285;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5284 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt5286 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt5285 = arg1.method3943();
		}
	}
}
