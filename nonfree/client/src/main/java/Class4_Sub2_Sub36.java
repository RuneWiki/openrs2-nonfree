import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class4_Sub2_Sub36 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt10186 = 4096;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(25) int[] local25 = this.method8208(0, arg0 - 1 & Static565.anInt5164);
			@Pc(31) int[] local31 = this.method8208(0, arg0);
			@Pc(41) int[] local41 = this.method8208(0, Static565.anInt5164 & arg0 + 1);
			for (@Pc(43) int local43 = 0; local43 < Static417.anInt5248; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt10186;
				@Pc(77) int local77 = (local31[Static359.anInt6929 & local43 + 1] - local31[Static359.anInt6929 & local43 - 1]) * this.anInt10186;
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local97 + local91 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(122) int local122 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local122;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10186 = arg0.method7054();
		}
	}
}
