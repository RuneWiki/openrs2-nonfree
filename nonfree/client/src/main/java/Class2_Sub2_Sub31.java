import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
	private int anInt6083 = 4096;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(25) int[] local25 = this.method6266(0, arg0 - 1 & Static71.anInt1203);
			@Pc(31) int[] local31 = this.method6266(0, arg0);
			@Pc(41) int[] local41 = this.method6266(0, arg0 + 1 & Static71.anInt1203);
			for (@Pc(43) int local43 = 0; local43 < Static398.anInt6955; local43++) {
				@Pc(57) int local57 = this.anInt6083 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = this.anInt6083 * (local31[local43 + 1 & Static210.anInt3600] - local31[Static210.anInt3600 & local43 - 1]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(120) int local120 = local112 == 0 ? 0 : 16777216 / local112;
				local11[local43] = 4096 - local120;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6083 = arg0.method6148();
		}
	}
}
