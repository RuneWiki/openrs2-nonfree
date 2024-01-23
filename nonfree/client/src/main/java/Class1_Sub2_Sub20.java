import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
	private int anInt2509 = 32768;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		Static189.method2977();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2509 = arg0.method946() << 4;
		} else if (arg1 == 1) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(23) int[][] local23 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(33) int[] local33 = this.method3514(arg0, 1);
			@Pc(39) int[] local39 = this.method3514(arg0, 2);
			@Pc(43) int[] local43 = local23[0];
			@Pc(47) int[] local47 = local23[2];
			@Pc(51) int[] local51 = local23[1];
			for (@Pc(53) int local53 = 0; local53 < Static105.anInt2391; local53++) {
				@Pc(65) int local65 = local33[local53] * 255 >> 12 & 0xFF;
				@Pc(74) int local74 = this.anInt2509 * local39[local53] >> 12;
				@Pc(82) int local82 = Static115.anIntArray331[local65] * local74 >> 12;
				@Pc(90) int local90 = local74 * Static55.anIntArray169[local65] >> 12;
				@Pc(98) int local98 = (local90 >> 12) + local53 & Static32.anInt814;
				@Pc(106) int local106 = (local82 >> 12) + arg0 & Static92.anInt2170;
				@Pc(112) int[][] local112 = this.method3501(local106, 0);
				local43[local53] = local112[0][local98];
				local51[local53] = local112[1][local98];
				local47[local53] = local112[2][local98];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(31) int[] local31 = this.method3514(arg0, 1);
			@Pc(39) int[] local39 = this.method3514(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static105.anInt2391; local41++) {
				@Pc(51) int local51 = local31[local41] >> 4 & 0xFF;
				@Pc(60) int local60 = local39[local41] * this.anInt2509 >> 12;
				@Pc(68) int local68 = Static115.anIntArray331[local51] * local60 >> 12;
				@Pc(76) int local76 = Static55.anIntArray169[local51] * local60 >> 12;
				@Pc(84) int local84 = Static92.anInt2170 & arg0 + (local68 >> 12);
				@Pc(92) int local92 = (local76 >> 12) + local41 & Static32.anInt814;
				@Pc(98) int[] local98 = this.method3514(local84, 0);
				local19[local41] = local98[local92];
			}
		}
		return local19;
	}
}
