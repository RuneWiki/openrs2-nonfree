import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class7_Sub3_Sub16 extends Class7_Sub3 {

	@OriginalMember(owner = "client!js", name = "F", descriptor = "I")
	private int anInt3552 = 32768;

	static {
		new Class229("", 76);
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(26) int[] local26 = this.method5591(1, arg0);
			@Pc(32) int[] local32 = this.method5591(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static58.anInt1052; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt3552 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static54.anIntArray80[local58] >> 12;
				@Pc(83) int local83 = Static114.anIntArray163[local58] * local67 >> 12;
				@Pc(91) int local91 = Static410.anInt6497 & (local75 >> 12) + local46;
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static25.anInt366;
				@Pc(105) int[][] local105 = this.method5597(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		Static371.method4759();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3552 = arg1.method3943() << 4;
		} else if (arg0 == 1) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(21) int[] local21 = this.method5591(1, arg0);
			@Pc(27) int[] local27 = this.method5591(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static58.anInt1052; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt3552 >> 12;
				@Pc(56) int local56 = Static54.anIntArray80[local39] * local48 >> 12;
				@Pc(64) int local64 = Static114.anIntArray163[local39] * local48 >> 12;
				@Pc(73) int local73 = local29 + (local56 >> 12) & Static410.anInt6497;
				@Pc(82) int local82 = arg0 + (local64 >> 12) & Static25.anInt366;
				@Pc(88) int[] local88 = this.method5591(0, local82);
				local11[local29] = local88[local73];
			}
		}
		return local11;
	}
}
