import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class14_Sub1_Sub17 extends Class14_Sub1 {

	@OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
	private int anInt4599 = 4096;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4599 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(25) int[] local25 = this.method8897(0, Static52.anInt1266 & arg0 - 1);
			@Pc(31) int[] local31 = this.method8897(0, arg0);
			@Pc(41) int[] local41 = this.method8897(0, arg0 + 1 & Static52.anInt1266);
			for (@Pc(43) int local43 = 0; local43 < Static371.anInt6835; local43++) {
				@Pc(57) int local57 = this.anInt4599 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = this.anInt4599 * (local31[local43 + 1 & Static192.anInt3590] - local31[Static192.anInt3590 & local43 - 1]);
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
}
