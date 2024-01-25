import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	private int anInt6375 = 16;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	private int anInt6373 = 2000;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	private int anInt6376 = 0;

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	private int anInt6378 = 4096;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
	private int anInt6379 = 0;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		Static51.method703();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6379 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt6373 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt6375 = arg0.method3580();
		} else if (arg1 == 3) {
			this.anInt6376 = arg0.method3555();
		} else if (arg1 == 4) {
			this.anInt6378 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(27) int local27 = this.anInt6378 >> 1;
			@Pc(32) int[][] local32 = super.aClass170_41.method3646();
			@Pc(39) Random local39 = new Random((long) this.anInt6379);
			for (@Pc(41) int local41 = 0; local41 < this.anInt6373; local41++) {
				@Pc(61) int local61 = this.anInt6378 > 0 ? this.anInt6376 + Static175.method2474(this.anInt6378, local39) - local27 : this.anInt6376;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static175.method2474(Static217.anInt3574, local39);
				@Pc(77) int local77 = Static175.method2474(Static290.anInt4775, local39);
				@Pc(88) int local88 = (this.anInt6375 * Static412.anIntArray564[local67] >> 12) + local72;
				@Pc(99) int local99 = local77 + (Static114.anIntArray157[local67] * this.anInt6375 >> 12);
				@Pc(103) int local103 = local99 - local77;
				@Pc(108) int local108 = local88 - local72;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(132) boolean local132 = local108 < local103;
					@Pc(136) int local136;
					@Pc(140) int local140;
					if (local132) {
						local136 = local72;
						local72 = local77;
						local140 = local88;
						local88 = local99;
						local77 = local136;
						local99 = local140;
					}
					if (local88 < local72) {
						local136 = local72;
						local72 = local88;
						local140 = local77;
						local88 = local136;
						local77 = local99;
						local99 = local140;
					}
					local136 = local77;
					local140 = local88 - local72;
					@Pc(176) int local176 = local99 - local77;
					@Pc(181) int local181 = -local140 / 2;
					@Pc(185) int local185 = 2048 / local140;
					@Pc(195) int local195 = 1024 - (Static175.method2474(4096, local39) >> 2);
					@Pc(206) int local206 = local77 >= local99 ? -1 : 1;
					if (local176 < 0) {
						local176 = -local176;
					}
					for (@Pc(213) int local213 = local72; local213 < local88; local213++) {
						@Pc(226) int local226 = local195 + local185 * (local213 + -local72) + 1024;
						@Pc(230) int local230 = Static127.anInt2287 & local213;
						@Pc(234) int local234 = Static157.anInt2698 & local136;
						if (local132) {
							local32[local234][local230] = local226;
						} else {
							local32[local230][local234] = local226;
						}
						local181 += local176;
						if (local181 > 0) {
							local181 += -local140;
							local136 -= -local206;
						}
					}
				}
			}
		}
		return local18;
	}
}
