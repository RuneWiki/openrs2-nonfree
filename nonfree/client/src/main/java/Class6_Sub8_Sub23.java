import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class6_Sub8_Sub23 extends Class6_Sub8 {

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
	private int anInt5989 = 32768;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		Static496.method7310();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(30) int[] local30 = this.method8930(arg0, 1);
			@Pc(36) int[] local36 = this.method8930(arg0, 2);
			@Pc(40) int[] local40 = local20[0];
			@Pc(44) int[] local44 = local20[1];
			@Pc(48) int[] local48 = local20[2];
			for (@Pc(50) int local50 = 0; local50 < Static83.anInt1268; local50++) {
				@Pc(62) int local62 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = this.anInt5989 * local36[local50] >> 12;
				@Pc(79) int local79 = Static510.anIntArray636[local62] * local71 >> 12;
				@Pc(87) int local87 = Static471.anIntArray505[local62] * local71 >> 12;
				@Pc(95) int local95 = (local79 >> 12) + local50 & Static333.anInt5727;
				@Pc(103) int local103 = Static165.anInt3453 & arg0 + (local87 >> 12);
				@Pc(111) int[][] local111 = this.method8928(0, local103);
				local40[local50] = local111[0][local95];
				local44[local50] = local111[1][local95];
				local48[local50] = local111[2][local95];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5989 = arg1.method3018() << 4;
		} else if (arg0 == 1) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int[] local29 = this.method8930(arg0, 1);
			@Pc(35) int[] local35 = this.method8930(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static83.anInt1268; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt5989 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static510.anIntArray636[local47] >> 12;
				@Pc(72) int local72 = Static471.anIntArray505[local47] * local56 >> 12;
				@Pc(80) int local80 = Static333.anInt5727 & (local64 >> 12) + local37;
				@Pc(88) int local88 = Static165.anInt3453 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method8930(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}
}
