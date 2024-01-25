import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
	private int anInt3764 = 1;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
	private int anInt3766 = 1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(23) int local23 = this.anInt3764 + this.anInt3764 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt3766 + this.anInt3766 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt3764; local47 <= this.anInt3764 + arg0; local47++) {
				@Pc(57) int[] local57 = this.method5839(local47 & Static246.anInt4669, 0);
				@Pc(60) int[] local60 = new int[Static429.anInt6518];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt3766; local66 <= this.anInt3766; local66++) {
					local62 += local57[local66 & Static303.anInt5406];
				}
				@Pc(87) int local87 = 0;
				while (Static429.anInt6518 > local87) {
					local60[local87] = local62 * local39 >> 16;
					local62 -= local57[local87 - this.anInt3766 & Static303.anInt5406];
					local87++;
					local62 += local57[Static303.anInt5406 & local87 + this.anInt3766];
				}
				local42[this.anInt3764 + local47 - arg0] = local60;
			}
			for (@Pc(148) int local148 = 0; local148 < Static429.anInt6518; local148++) {
				@Pc(152) int local152 = 0;
				for (local62 = 0; local62 < local23; local62++) {
					local152 += local42[local62][local148];
				}
				local11[local148] = local27 * local152 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3766 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt3764 = arg0.method5495();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(23) int local23 = this.anInt3764 + this.anInt3764 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt3766 + this.anInt3766 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt3764; local48 <= arg0 + this.anInt3764; local48++) {
				@Pc(58) int[][] local58 = this.method5840(local48 & Static246.anInt4669, 0);
				@Pc(62) int[][] local62 = new int[3][Static429.anInt6518];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt3766; local84 <= this.anInt3766; local84++) {
					@Pc(90) int local90 = local84 & Static303.anInt5406;
					local66 += local76[local90];
					local64 += local72[local90];
					local68 += local80[local90];
				}
				@Pc(121) int[] local121 = local62[0];
				@Pc(125) int[] local125 = local62[1];
				@Pc(129) int[] local129 = local62[2];
				@Pc(131) int local131 = 0;
				while (Static429.anInt6518 > local131) {
					local121[local131] = local64 * local39 >> 16;
					local125[local131] = local39 * local66 >> 16;
					local129[local131] = local39 * local68 >> 16;
					@Pc(164) int local164 = local131 - this.anInt3766 & Static303.anInt5406;
					local66 -= local76[local164];
					local64 -= local72[local164];
					local68 -= local80[local164];
					local131++;
					@Pc(190) int local190 = local131 + this.anInt3766 & Static303.anInt5406;
					local64 += local72[local190];
					local66 += local76[local190];
					local68 += local80[local190];
				}
				local42[local48 + this.anInt3764 - arg0] = local62;
			}
			@Pc(233) int[] local233 = local11[0];
			@Pc(237) int[] local237 = local11[1];
			@Pc(241) int[] local241 = local11[2];
			for (local66 = 0; local66 < Static429.anInt6518; local66++) {
				local68 = 0;
				@Pc(249) int local249 = 0;
				@Pc(251) int local251 = 0;
				for (@Pc(253) int local253 = 0; local253 < local23; local253++) {
					@Pc(259) int[][] local259 = local42[local253];
					local251 += local259[2][local66];
					local249 += local259[1][local66];
					local68 += local259[0][local66];
				}
				local233[local66] = local27 * local68 >> 16;
				local237[local66] = local249 * local27 >> 16;
				local241[local66] = local251 * local27 >> 16;
			}
		}
		return local11;
	}
}
