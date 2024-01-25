import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class6_Sub5_Sub14 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
	private int anInt2873 = 4096;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt2873 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(25) int[] local25 = this.method6543(0, arg0 - 1 & Static52.anInt1464);
			@Pc(31) int[] local31 = this.method6543(0, arg0);
			@Pc(41) int[] local41 = this.method6543(0, Static52.anInt1464 & arg0 + 1);
			for (@Pc(43) int local43 = 0; local43 < Static240.anInt4386; local43++) {
				@Pc(57) int local57 = this.anInt2873 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = this.anInt2873 * (local31[local43 + 1 & Static408.anInt7338] - local31[local43 - 1 & Static408.anInt7338]);
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
}
