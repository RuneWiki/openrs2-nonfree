import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	private int anInt1915 = 32768;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1915 = arg0.method2588() << 4;
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		Static437.method5734();
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(29) int[] local29 = this.method5894(1, arg0);
			@Pc(35) int[] local35 = this.method5894(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static406.anInt6694; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt1915 >> 12;
				@Pc(78) int local78 = Static346.anIntArray387[local61] * local70 >> 12;
				@Pc(86) int local86 = Static97.anIntArray132[local61] * local70 >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static5.anInt72;
				@Pc(102) int local102 = Static350.anInt3654 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method5899(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(28) int[] local28 = this.method5894(1, arg0);
			@Pc(34) int[] local34 = this.method5894(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static406.anInt6694; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt1915 * local34[local36] >> 12;
				@Pc(63) int local63 = Static346.anIntArray387[local46] * local55 >> 12;
				@Pc(71) int local71 = local55 * Static97.anIntArray132[local46] >> 12;
				@Pc(79) int local79 = local36 + (local63 >> 12) & Static5.anInt72;
				@Pc(87) int local87 = (local71 >> 12) + arg0 & Static350.anInt3654;
				@Pc(93) int[] local93 = this.method5894(0, local87);
				local18[local36] = local93[local79];
			}
		}
		return local18;
	}
}
