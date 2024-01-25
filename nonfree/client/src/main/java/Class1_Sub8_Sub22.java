import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class1_Sub8_Sub22 extends Class1_Sub8 {

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	private int anInt5497 = 4096;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5497 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(25) int[] local25 = this.method6037(0, arg0 - 1 & Static443.anInt7904);
			@Pc(31) int[] local31 = this.method6037(0, arg0);
			@Pc(41) int[] local41 = this.method6037(0, Static443.anInt7904 & arg0 + 1);
			for (@Pc(43) int local43 = 0; local43 < Static18.anInt439; local43++) {
				@Pc(57) int local57 = this.anInt5497 * (local41[local43] - local25[local43]);
				@Pc(77) int local77 = (local31[Static283.anInt5397 & local43 + 1] - local31[local43 - 1 & Static283.anInt5397]) * this.anInt5497;
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
