import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub15_Sub4 extends Class2_Sub15 {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	private int anInt2560 = 4096;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(25) int[] local25 = this.method9725(0, Static426.anInt11132 & arg0 - 1);
			@Pc(31) int[] local31 = this.method9725(0, arg0);
			@Pc(41) int[] local41 = this.method9725(0, arg0 + 1 & Static426.anInt11132);
			for (@Pc(43) int local43 = 0; local43 < Static329.anInt6017; local43++) {
				@Pc(57) int local57 = this.anInt2560 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = (local31[Static386.anInt7302 & local43 + 1] - local31[Static386.anInt7302 & local43 - 1]) * this.anInt2560;
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local57 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local97 + local91 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(119) int local119 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local119;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2560 = arg1.method5211();
		}
	}
}
