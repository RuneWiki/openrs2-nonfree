import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class7_Sub4_Sub15 extends Class7_Sub4 {

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	private int anInt3444 = 32768;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		Static14.method201();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(21) int[] local21 = this.method5634(1, arg0);
			@Pc(27) int[] local27 = this.method5634(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static201.anInt4174; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt3444 * local27[local29] >> 12;
				@Pc(56) int local56 = Static279.anIntArray848[local39] * local48 >> 12;
				@Pc(64) int local64 = local48 * Static268.anIntArray680[local39] >> 12;
				@Pc(73) int local73 = Static110.anInt2508 & local29 + (local56 >> 12);
				@Pc(82) int local82 = arg0 + (local64 >> 12) & Static153.anInt3263;
				@Pc(88) int[] local88 = this.method5634(0, local82);
				local11[local29] = local88[local73];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(21) int[] local21 = this.method5634(1, arg0);
			@Pc(27) int[] local27 = this.method5634(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static201.anInt4174; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt3444 >> 12;
				@Pc(70) int local70 = Static279.anIntArray848[local53] * local62 >> 12;
				@Pc(78) int local78 = Static268.anIntArray680[local53] * local62 >> 12;
				@Pc(86) int local86 = Static110.anInt2508 & local41 + (local70 >> 12);
				@Pc(94) int local94 = arg0 + (local78 >> 12) & Static153.anInt3263;
				@Pc(100) int[][] local100 = this.method5638(local94, 0);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3444 = arg0.method2764() << 4;
		} else if (arg1 == 1) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}
}
