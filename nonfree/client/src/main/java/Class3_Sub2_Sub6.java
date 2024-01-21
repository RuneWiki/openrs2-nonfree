import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	private int anInt748 = 4096;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt748 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, Static170.anInt1101 & arg0 - 1);
			@Pc(35) int[] local35 = this.method3328(0, arg0);
			@Pc(45) int[] local45 = this.method3328(0, Static170.anInt1101 & arg0 + 1);
			for (@Pc(47) int local47 = 0; local47 < Static190.anInt3865; local47++) {
				@Pc(61) int local61 = (local45[local47] - local29[local47]) * this.anInt748;
				@Pc(81) int local81 = this.anInt748 * (local35[local47 + 1 & Static134.anInt2681] - local35[local47 - 1 & Static134.anInt2681]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local89 * local89 >> 12;
				@Pc(101) int local101 = local85 * local85 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local15[local47] = 4096 - local126;
			}
		}
		return local15;
	}
}
