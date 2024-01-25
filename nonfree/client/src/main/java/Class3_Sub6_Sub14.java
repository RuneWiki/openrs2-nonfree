import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class3_Sub6_Sub14 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ip", name = "R", descriptor = "I")
	private int anInt4708 = 4096;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(25) int[] local25 = this.method8001(0, arg0 - 1 & Static527.anInt10285);
			@Pc(31) int[] local31 = this.method8001(0, arg0);
			@Pc(41) int[] local41 = this.method8001(0, arg0 + 1 & Static527.anInt10285);
			for (@Pc(43) int local43 = 0; local43 < Static481.anInt8358; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt4708;
				@Pc(77) int local77 = this.anInt4708 * (local31[Static325.anInt5932 & local43 + 1] - local31[Static325.anInt5932 & local43 - 1]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(119) int local119 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local119;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4708 = arg0.method6811();
		}
	}
}
