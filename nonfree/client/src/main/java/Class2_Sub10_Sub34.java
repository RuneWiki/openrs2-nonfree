import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub10_Sub34 extends Class2_Sub10 {

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
	private int anInt9418 = 1;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	private int anInt9421 = 1;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9421 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt9418 = arg0.method6904();
		} else if (arg1 == 2) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(29) int local29 = this.anInt9418 + this.anInt9418 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt9421 + this.anInt9421 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt9418; local54 <= this.anInt9418 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method8408(local54 & Static93.anInt1860, 0);
				@Pc(68) int[][] local68 = new int[3][Static93.anInt1862];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt9421; local90 <= this.anInt9421; local90++) {
					@Pc(96) int local96 = Static603.anInt9994 & local90;
					local70 += local78[local96];
					local74 += local86[local96];
					local72 += local82[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (Static93.anInt1862 > local137) {
					local127[local137] = local45 * local70 >> 16;
					local131[local137] = local45 * local72 >> 16;
					local135[local137] = local45 * local74 >> 16;
					@Pc(171) int local171 = local137 - this.anInt9421 & Static603.anInt9994;
					local70 -= local78[local171];
					local74 -= local86[local171];
					local72 -= local82[local171];
					local137++;
					@Pc(198) int local198 = local137 + this.anInt9421 & Static603.anInt9994;
					local72 += local82[local198];
					local74 += local86[local198];
					local70 += local78[local198];
				}
				local48[this.anInt9418 + local54 - arg0] = local68;
			}
			@Pc(240) int[] local240 = local11[0];
			@Pc(244) int[] local244 = local11[1];
			@Pc(248) int[] local248 = local11[2];
			for (local72 = 0; local72 < Static93.anInt1862; local72++) {
				local74 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local29; local260++) {
					@Pc(266) int[][] local266 = local48[local260];
					local256 += local266[1][local72];
					local74 += local266[0][local72];
					local258 += local266[2][local72];
				}
				local240[local72] = local33 * local74 >> 16;
				local244[local72] = local33 * local256 >> 16;
				local248[local72] = local33 * local258 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(23) int local23 = this.anInt9418 + this.anInt9418 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt9421 + this.anInt9421 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt9418; local48 <= arg0 + this.anInt9418; local48++) {
				@Pc(58) int[] local58 = this.method8402(Static93.anInt1860 & local48, 0);
				@Pc(61) int[] local61 = new int[Static93.anInt1862];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt9421; local67 <= this.anInt9421; local67++) {
					local63 += local58[local67 & Static603.anInt9994];
				}
				@Pc(84) int local84 = 0;
				while (Static93.anInt1862 > local84) {
					local61[local84] = local39 * local63 >> 16;
					local63 -= local58[local84 - this.anInt9421 & Static603.anInt9994];
					local84++;
					local63 += local58[this.anInt9421 + local84 & Static603.anInt9994];
				}
				local42[local48 + this.anInt9418 - arg0] = local61;
			}
			for (@Pc(144) int local144 = 0; local144 < Static93.anInt1862; local144++) {
				@Pc(148) int local148 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local148 += local42[local63][local144];
				}
				local11[local144] = local27 * local148 >> 16;
			}
		}
		return local11;
	}
}
