import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
	private int anInt1192 = 4096;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1192 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0 - 1 & Static15.anInt388, 0);
			@Pc(31) int[] local31 = this.method3393(arg0, 0);
			@Pc(41) int[] local41 = this.method3393(Static15.anInt388 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static107.anInt2321; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt1192;
				@Pc(77) int local77 = this.anInt1192 * (local31[Static144.anInt2893 & local43 + 1] - local31[local43 - 1 & Static144.anInt2893]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local91 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(122) int local122 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local122;
			}
		}
		return local11;
	}
}
