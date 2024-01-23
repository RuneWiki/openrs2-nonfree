import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	private int anInt3854 = 4096;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3854 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(25) int[] local25 = this.method4450(0, arg0 - 1 & Static9.anInt244);
			@Pc(31) int[] local31 = this.method4450(0, arg0);
			@Pc(41) int[] local41 = this.method4450(0, Static9.anInt244 & arg0 + 1);
			for (@Pc(43) int local43 = 0; local43 < Static131.anInt2513; local43++) {
				@Pc(57) int local57 = this.anInt3854 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = (local31[Static11.anInt321 & local43 + 1] - local31[Static11.anInt321 & local43 - 1]) * this.anInt3854;
				@Pc(81) int local81 = local57 >> 12;
				@Pc(85) int local85 = local77 >> 12;
				@Pc(91) int local91 = local85 * local85 >> 12;
				@Pc(97) int local97 = local81 * local81 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(119) int local119 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local119;
			}
		}
		return local11;
	}
}
