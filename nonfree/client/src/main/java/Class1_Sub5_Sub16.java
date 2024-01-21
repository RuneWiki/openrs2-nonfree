import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub5_Sub16 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private int anInt2111;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2111 = arg0.method359() << 4;
		} else if (arg1 == 1) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		Static80.method1357();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3145(1, arg0);
			@Pc(35) int[] local35 = this.method3145(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static177.anInt4018; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt2111 >> 12;
				@Pc(64) int local64 = local56 * Static61.anIntArray125[local47] >> 12;
				@Pc(72) int local72 = local56 * Static121.anIntArray285[local47] >> 12;
				@Pc(81) int local81 = arg0 + (local72 >> 12) & Static151.anInt3420;
				@Pc(89) int local89 = Static47.anInt1130 & local37 + (local64 >> 12);
				@Pc(97) int[] local97 = this.method3145(0, local81);
				local11[local37] = local97[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[] local29 = this.method3145(1, arg0);
			@Pc(35) int[] local35 = this.method3145(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static177.anInt4018; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt2111 * local35[local49] >> 12;
				@Pc(78) int local78 = local70 * Static121.anIntArray285[local61] >> 12;
				@Pc(86) int local86 = (local78 >> 12) + arg0 & Static151.anInt3420;
				@Pc(94) int local94 = local70 * Static61.anIntArray125[local61] >> 12;
				@Pc(102) int local102 = (local94 >> 12) + local49 & Static47.anInt1130;
				@Pc(108) int[][] local108 = this.method3144(local86, 0);
				local39[local49] = local108[0][local102];
				local43[local49] = local108[1][local102];
				local47[local49] = local108[2][local102];
			}
		}
		return local19;
	}
}
