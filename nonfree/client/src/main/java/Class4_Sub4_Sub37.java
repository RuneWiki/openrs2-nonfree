import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class4_Sub4_Sub37 extends Class4_Sub4 {

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
	private int anInt9125 = 1;

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
	private int anInt9127 = 1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(32) int local32 = this.anInt9125 + this.anInt9125 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt9127 + this.anInt9127 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt9125; local57 <= arg0 + this.anInt9125; local57++) {
				@Pc(67) int[] local67 = this.method7890(0, Static360.anInt6375 & local57);
				@Pc(70) int[] local70 = new int[Static560.anInt9394];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt9127; local76 <= this.anInt9127; local76++) {
					local72 += local67[local76 & Static571.anInt9405];
				}
				@Pc(97) int local97 = 0;
				while (local97 < Static560.anInt9394) {
					local70[local97] = local48 * local72 >> 16;
					local72 -= local67[Static571.anInt9405 & local97 - this.anInt9127];
					local97++;
					local72 += local67[this.anInt9127 + local97 & Static571.anInt9405];
				}
				local51[local57 + this.anInt9125 - arg0] = local70;
			}
			for (@Pc(163) int local163 = 0; local163 < Static560.anInt9394; local163++) {
				@Pc(167) int local167 = 0;
				for (local72 = 0; local72 < local32; local72++) {
					local167 += local51[local72][local163];
				}
				local13[local163] = local36 * local167 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt9127 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt9125 = arg1.method6015();
		} else if (arg0 == 2) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(23) int local23 = this.anInt9125 + this.anInt9125 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt9127 + this.anInt9127 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt9125; local48 <= arg0 + this.anInt9125; local48++) {
				@Pc(58) int[][] local58 = this.method7892(0, local48 & Static360.anInt6375);
				@Pc(62) int[][] local62 = new int[3][Static560.anInt9394];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt9127; local84 <= this.anInt9127; local84++) {
					@Pc(90) int local90 = Static571.anInt9405 & local84;
					local68 += local80[local90];
					local66 += local76[local90];
					local64 += local72[local90];
				}
				@Pc(117) int[] local117 = local62[0];
				@Pc(121) int[] local121 = local62[1];
				@Pc(125) int[] local125 = local62[2];
				@Pc(127) int local127 = 0;
				while (Static560.anInt9394 > local127) {
					local117[local127] = local39 * local64 >> 16;
					local121[local127] = local66 * local39 >> 16;
					local125[local127] = local68 * local39 >> 16;
					@Pc(161) int local161 = local127 - this.anInt9127 & Static571.anInt9405;
					local64 -= local72[local161];
					local68 -= local80[local161];
					local66 -= local76[local161];
					local127++;
					@Pc(187) int local187 = this.anInt9127 + local127 & Static571.anInt9405;
					local64 += local72[local187];
					local66 += local76[local187];
					local68 += local80[local187];
				}
				local42[local48 + this.anInt9125 - arg0] = local62;
			}
			@Pc(236) int[] local236 = local11[0];
			@Pc(240) int[] local240 = local11[1];
			@Pc(244) int[] local244 = local11[2];
			for (local66 = 0; local66 < Static560.anInt9394; local66++) {
				local68 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local23; local256++) {
					@Pc(262) int[][] local262 = local42[local256];
					local254 += local262[2][local66];
					local252 += local262[1][local66];
					local68 += local262[0][local66];
				}
				local236[local66] = local68 * local27 >> 16;
				local240[local66] = local252 * local27 >> 16;
				local244[local66] = local27 * local254 >> 16;
			}
		}
		return local11;
	}
}
