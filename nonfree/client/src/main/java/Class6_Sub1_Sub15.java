import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	private int anInt3708 = 4096;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(25) int[] local25 = this.method8165(0, Static574.anInt9711 & arg0 - 1);
			@Pc(31) int[] local31 = this.method8165(0, arg0);
			@Pc(41) int[] local41 = this.method8165(0, arg0 + 1 & Static574.anInt9711);
			for (@Pc(43) int local43 = 0; local43 < Static289.anInt5549; local43++) {
				@Pc(56) int local56 = this.anInt3708 * (local41[local43] - local25[local43]);
				@Pc(76) int local76 = (local31[local43 + 1 & Static153.anInt3343] - local31[Static153.anInt3343 & local43 - 1]) * this.anInt3708;
				@Pc(80) int local80 = local76 >> 12;
				@Pc(84) int local84 = local56 >> 12;
				@Pc(90) int local90 = local80 * local80 >> 12;
				@Pc(96) int local96 = local84 * local84 >> 12;
				@Pc(110) int local110 = (int) (Math.sqrt((double) ((float) (local96 + local90 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(121) int local121 = local110 == 0 ? 0 : 16777216 / local110;
				local11[local43] = 4096 - local121;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3708 = arg1.method4999();
		}
	}
}
