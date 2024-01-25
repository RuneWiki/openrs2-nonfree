import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class3_Sub3_Sub39 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
	private int anInt6862 = 4096;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6862 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(25) int[] local25 = this.method5733(arg0 - 1 & Static351.anInt6821, 0);
			@Pc(31) int[] local31 = this.method5733(arg0, 0);
			@Pc(41) int[] local41 = this.method5733(Static351.anInt6821 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static131.anInt2755; local43++) {
				@Pc(57) int local57 = this.anInt6862 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = (local31[Static167.anInt3460 & local43 + 1] - local31[local43 - 1 & Static167.anInt3460]) * this.anInt6862;
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local97 + local91 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(119) int local119 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local119;
			}
		}
		return local11;
	}
}
