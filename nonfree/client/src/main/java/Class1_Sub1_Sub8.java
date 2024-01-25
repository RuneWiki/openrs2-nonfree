import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
	private int anInt2531 = 4096;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2531 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(25) int[] local25 = this.method7709(Static171.anInt3020 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method7709(arg0, 0);
			@Pc(41) int[] local41 = this.method7709(arg0 + 1 & Static171.anInt3020, 0);
			for (@Pc(43) int local43 = 0; local43 < Static279.anInt4906; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt2531;
				@Pc(77) int local77 = this.anInt2531 * (local31[Static216.anInt4134 & local43 + 1] - local31[local43 - 1 & Static216.anInt4134]);
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
