import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
	private int anInt3547 = 4096;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(25) int[] local25 = this.method3580(arg0 - 1 & Static91.anInt2110, 0);
			@Pc(31) int[] local31 = this.method3580(arg0, 0);
			@Pc(41) int[] local41 = this.method3580(arg0 + 1 & Static91.anInt2110, 0);
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local11[0];
			for (@Pc(55) int local55 = 0; local55 < Static115.anInt2578; local55++) {
				@Pc(76) int local76 = this.anInt3547 * (local31[local55 + 1 & Static48.anInt1202] - local31[local55 - 1 & Static48.anInt1202]);
				@Pc(88) int local88 = (local41[local55] - local25[local55]) * this.anInt3547;
				@Pc(92) int local92 = local76 >> 12;
				@Pc(96) int local96 = local88 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130;
				@Pc(132) int local132;
				@Pc(134) int local134;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local134 = 16777216 / local123;
					local132 = local88 / local123;
					local130 = local76 / local123;
				}
				if (this.aBoolean167) {
					local134 = (local134 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local53[local55] = local130;
				local45[local55] = local132;
				local49[local55] = local134;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3547 = arg0.method2765();
		} else if (arg1 == 1) {
			this.aBoolean167 = arg0.method2771() == 1;
		}
	}
}
