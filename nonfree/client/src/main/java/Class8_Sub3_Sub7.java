import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class8_Sub3_Sub7 extends Class8_Sub3 {

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt1073 = 4;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	private int anInt1075 = 4;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(27) int local27 = Static239.anInt4789 / this.anInt1075;
			@Pc(32) int local32 = Static86.anInt1852 / this.anInt1073;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local32 <= 0) {
				local41 = this.method4230(0, 0);
			} else {
				local47 = arg0 % local32;
				local41 = this.method4230(local47 * Static86.anInt1852 / local32, 0);
			}
			for (local47 = 0; local47 < Static239.anInt4789; local47++) {
				if (local27 > 0) {
					@Pc(75) int local75 = local47 % local27;
					local7[local47] = local41[local75 * Static239.anInt4789 / local27];
				} else {
					local7[local47] = local41[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(21) int local21 = Static239.anInt4789 / this.anInt1075;
			@Pc(26) int local26 = Static86.anInt1852 / this.anInt1073;
			@Pc(44) int[][] local44;
			if (local26 > 0) {
				@Pc(32) int local32 = arg0 % local26;
				local44 = this.method4224(local32 * Static86.anInt1852 / local26, 0);
			} else {
				local44 = this.method4224(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local11[0];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static239.anInt4789; local78++) {
				@Pc(98) int local98;
				if (local21 > 0) {
					@Pc(92) int local92 = local78 % local21;
					local98 = local92 * Static239.anInt4789 / local21;
				} else {
					local98 = 0;
				}
				local60[local78] = local56[local98];
				local72[local78] = local68[local98];
				local76[local78] = local64[local98];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1075 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt1073 = arg1.method2334();
		}
	}
}
