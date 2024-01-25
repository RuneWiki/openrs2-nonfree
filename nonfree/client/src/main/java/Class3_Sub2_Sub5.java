import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
	private int anInt2194 = 32768;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(26) int[] local26 = this.method8716(1, arg0);
			@Pc(32) int[] local32 = this.method8716(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static30.anInt908; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt2194 >> 12;
				@Pc(61) int local61 = Static540.anIntArray454[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static10.anIntArray5[local44] >> 12;
				@Pc(78) int local78 = Static241.anInt4556 & local34 + (local61 >> 12);
				@Pc(87) int local87 = arg0 + (local69 >> 12) & Static622.anInt9680;
				@Pc(93) int[] local93 = this.method8716(0, local87);
				local11[local34] = local93[local78];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2194 = arg0.method4858() << 4;
		} else if (arg1 == 1) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		Static272.method4337();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[] local26 = this.method8716(1, arg0);
			@Pc(32) int[] local32 = this.method8716(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static30.anInt908; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt2194 * local32[local46] >> 12;
				@Pc(75) int local75 = Static540.anIntArray454[local58] * local67 >> 12;
				@Pc(83) int local83 = Static10.anIntArray5[local58] * local67 >> 12;
				@Pc(92) int local92 = local46 + (local75 >> 12) & Static241.anInt4556;
				@Pc(100) int local100 = Static622.anInt9680 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method8718(0, local100);
				local36[local46] = local106[0][local92];
				local40[local46] = local106[1][local92];
				local44[local46] = local106[2][local92];
			}
		}
		return local11;
	}
}
