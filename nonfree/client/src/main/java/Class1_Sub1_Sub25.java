import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	private int anInt6943 = 32768;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6943 = arg1.method4426() << 4;
		} else if (arg0 == 1) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method7882(1, arg0);
			@Pc(32) int[] local32 = this.method7882(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static87.anInt1964; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt6943 >> 12;
				@Pc(61) int local61 = Static549.anIntArray610[local44] * local53 >> 12;
				@Pc(69) int local69 = Static279.anIntArray312[local44] * local53 >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static451.anInt8721;
				@Pc(85) int local85 = arg0 + (local69 >> 12) & Static561.anInt6003;
				@Pc(91) int[] local91 = this.method7882(0, local85);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		Static316.method4803();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[] local26 = this.method7882(1, arg0);
			@Pc(32) int[] local32 = this.method7882(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static87.anInt1964; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt6943 * local32[local46] >> 12;
				@Pc(75) int local75 = Static549.anIntArray610[local58] * local67 >> 12;
				@Pc(83) int local83 = Static279.anIntArray312[local58] * local67 >> 12;
				@Pc(91) int local91 = Static451.anInt8721 & (local75 >> 12) + local46;
				@Pc(99) int local99 = arg0 + (local83 >> 12) & Static561.anInt6003;
				@Pc(105) int[][] local105 = this.method7880(local99, 0);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}
}
