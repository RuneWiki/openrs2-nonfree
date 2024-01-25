import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class12_Sub1_Sub38 extends Class12_Sub1 {

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	private int anInt9279 = 32768;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9279 = arg0.method5199() << 4;
		} else if (arg1 == 1) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		Static431.method6596();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(27) int[] local27 = this.method7795(1, arg0);
			@Pc(33) int[] local33 = this.method7795(2, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static357.anInt6670; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt9279 >> 12;
				@Pc(76) int local76 = local68 * Static95.anIntArray196[local59] >> 12;
				@Pc(84) int local84 = Static103.anIntArray206[local59] * local68 >> 12;
				@Pc(92) int local92 = (local76 >> 12) + local47 & Static149.anInt3278;
				@Pc(100) int local100 = Static162.anInt3758 & (local84 >> 12) + arg0;
				@Pc(106) int[][] local106 = this.method7790(0, local100);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(28) int[] local28 = this.method7795(1, arg0);
			@Pc(36) int[] local36 = this.method7795(2, arg0);
			for (@Pc(38) int local38 = 0; local38 < Static357.anInt6670; local38++) {
				@Pc(48) int local48 = local28[local38] >> 4 & 0xFF;
				@Pc(57) int local57 = this.anInt9279 * local36[local38] >> 12;
				@Pc(65) int local65 = Static95.anIntArray196[local48] * local57 >> 12;
				@Pc(73) int local73 = local57 * Static103.anIntArray206[local48] >> 12;
				@Pc(81) int local81 = Static149.anInt3278 & (local65 >> 12) + local38;
				@Pc(89) int local89 = (local73 >> 12) + arg0 & Static162.anInt3758;
				@Pc(95) int[] local95 = this.method7795(0, local89);
				local11[local38] = local95[local81];
			}
		}
		return local11;
	}
}
