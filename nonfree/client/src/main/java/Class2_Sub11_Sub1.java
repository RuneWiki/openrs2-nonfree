import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!cda", name = "F", descriptor = "I")
	private int anInt1340 = 32768;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(31) int[] local31 = this.method9540(arg0, 1);
			@Pc(37) int[] local37 = this.method9540(arg0, 2);
			for (@Pc(39) int local39 = 0; local39 < Static301.anInt10214; local39++) {
				@Pc(49) int local49 = local31[local39] >> 4 & 0xFF;
				@Pc(58) int local58 = this.anInt1340 * local37[local39] >> 12;
				@Pc(66) int local66 = local58 * Static519.anIntArray590[local49] >> 12;
				@Pc(74) int local74 = local58 * Static611.anIntArray688[local49] >> 12;
				@Pc(82) int local82 = (local66 >> 12) + local39 & Static78.anInt1356;
				@Pc(90) int local90 = Static332.anInt5074 & arg0 + (local74 >> 12);
				@Pc(96) int[] local96 = this.method9540(local90, 0);
				local21[local39] = local96[local82];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		Static652.method8957();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1340 = arg1.method8575() << 4;
		} else if (arg0 == 1) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(27) int[] local27 = this.method9540(arg0, 1);
			@Pc(33) int[] local33 = this.method9540(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static301.anInt10214; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = this.anInt1340 * local33[local47] >> 12;
				@Pc(76) int local76 = local68 * Static519.anIntArray590[local59] >> 12;
				@Pc(84) int local84 = Static611.anIntArray688[local59] * local68 >> 12;
				@Pc(92) int local92 = local47 + (local76 >> 12) & Static78.anInt1356;
				@Pc(100) int local100 = arg0 + (local84 >> 12) & Static332.anInt5074;
				@Pc(106) int[][] local106 = this.method9538(0, local100);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}
}
