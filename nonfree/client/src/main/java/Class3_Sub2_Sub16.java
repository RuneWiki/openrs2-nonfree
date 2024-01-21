import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
	private int anInt2005 = 4;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
	private int anInt2010 = 4;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2010 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt2005 = arg0.method1278();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(20) int local20 = Static190.anInt3865 / this.anInt2010;
			@Pc(25) int local25 = Static97.anInt2014 / this.anInt2005;
			@Pc(41) int[] local41;
			@Pc(31) int local31;
			if (local25 > 0) {
				local31 = arg0 % local25;
				local41 = this.method3328(0, local31 * Static97.anInt2014 / local25);
			} else {
				local41 = this.method3328(0, 0);
			}
			for (local31 = 0; local31 < Static190.anInt3865; local31++) {
				if (local20 <= 0) {
					local11[local31] = local41[0];
				} else {
					@Pc(70) int local70 = local31 % local20;
					local11[local31] = local41[Static190.anInt3865 * local70 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(25) int local25 = Static97.anInt2014 / this.anInt2005;
			@Pc(30) int local30 = Static190.anInt3865 / this.anInt2010;
			@Pc(38) int[][] local38;
			if (local25 <= 0) {
				local38 = this.method3332(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local25;
				local38 = this.method3332(0, Static97.anInt2014 * local44 / local25);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local16[1];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local38[2];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static190.anInt3865; local80++) {
				@Pc(86) int local86;
				if (local30 <= 0) {
					local86 = 0;
				} else {
					@Pc(92) int local92 = local80 % local30;
					local86 = local92 * Static190.anInt3865 / local30;
				}
				local70[local80] = local58[local86];
				local66[local80] = local62[local86];
				local78[local80] = local74[local86];
			}
		}
		return local16;
	}
}
