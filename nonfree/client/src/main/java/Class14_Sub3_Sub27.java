import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class14_Sub3_Sub27 extends Class14_Sub3 {

	@OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
	private int anInt4426 = 4096;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(25) int[] local25 = this.method6004(0, arg0 - 1 & Static179.anInt3689);
			@Pc(31) int[] local31 = this.method6004(0, arg0);
			@Pc(41) int[] local41 = this.method6004(0, arg0 + 1 & Static179.anInt3689);
			for (@Pc(43) int local43 = 0; local43 < Static294.anInt5657; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt4426;
				@Pc(77) int local77 = (local31[Static329.anInt6352 & local43 + 1] - local31[Static329.anInt6352 & local43 - 1]) * this.anInt4426;
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

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4426 = arg0.method2498();
		}
	}
}
