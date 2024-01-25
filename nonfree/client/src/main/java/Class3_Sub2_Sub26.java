import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private int anInt8377 = 32768;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		Static333.method4978();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(30) int[] local30 = this.method9204(arg0, 1);
			@Pc(36) int[] local36 = this.method9204(arg0, 2);
			@Pc(40) int[] local40 = local20[0];
			@Pc(44) int[] local44 = local20[1];
			@Pc(48) int[] local48 = local20[2];
			for (@Pc(50) int local50 = 0; local50 < Static636.anInt10302; local50++) {
				@Pc(62) int local62 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = this.anInt8377 * local36[local50] >> 12;
				@Pc(79) int local79 = local71 * Static263.anIntArray275[local62] >> 12;
				@Pc(87) int local87 = Static500.anIntArray466[local62] * local71 >> 12;
				@Pc(96) int local96 = local50 + (local79 >> 12) & Static144.anInt2744;
				@Pc(105) int local105 = Static599.anInt9773 & arg0 + (local87 >> 12);
				@Pc(111) int[][] local111 = this.method9212(0, local105);
				local40[local50] = local111[0][local96];
				local44[local50] = local111[1][local96];
				local48[local50] = local111[2][local96];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt8377 = arg1.method5272() << 4;
		} else if (arg0 == 1) {
			super.aBoolean794 = arg1.method5322(-15) == 1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(29) int[] local29 = this.method9204(arg0, 1);
			@Pc(35) int[] local35 = this.method9204(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static636.anInt10302; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt8377 * local35[local37] >> 12;
				@Pc(64) int local64 = Static263.anIntArray275[local47] * local56 >> 12;
				@Pc(72) int local72 = Static500.anIntArray466[local47] * local56 >> 12;
				@Pc(81) int local81 = local37 + (local64 >> 12) & Static144.anInt2744;
				@Pc(89) int local89 = (local72 >> 12) + arg0 & Static599.anInt9773;
				@Pc(95) int[] local95 = this.method9204(local89, 0);
				local11[local37] = local95[local81];
			}
		}
		return local11;
	}
}
