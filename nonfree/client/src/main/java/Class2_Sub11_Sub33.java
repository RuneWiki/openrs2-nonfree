import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class2_Sub11_Sub33 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
	private int anInt10391 = 4096;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(25) int[] local25 = this.method9540(Static332.anInt5074 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method9540(arg0, 0);
			@Pc(41) int[] local41 = this.method9540(Static332.anInt5074 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static301.anInt10214; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt10391;
				@Pc(76) int local76 = (local31[Static78.anInt1356 & local43 + 1] - local31[local43 - 1 & Static78.anInt1356]) * this.anInt10391;
				@Pc(80) int local80 = local76 >> 12;
				@Pc(84) int local84 = local57 >> 12;
				@Pc(90) int local90 = local80 * local80 >> 12;
				@Pc(96) int local96 = local84 * local84 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((float) (local90 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(120) int local120 = local111 == 0 ? 0 : 16777216 / local111;
				local11[local43] = 4096 - local120;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10391 = arg1.method8575();
		}
	}
}
