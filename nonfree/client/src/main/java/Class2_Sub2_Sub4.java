import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!de", name = "H", descriptor = "I")
	private int anInt1365 = 4096;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1365 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(25) int[] local25 = this.method5839(Static246.anInt4669 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method5839(arg0, 0);
			@Pc(41) int[] local41 = this.method5839(Static246.anInt4669 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static429.anInt6518; local43++) {
				@Pc(57) int local57 = (local41[local43] - local25[local43]) * this.anInt1365;
				@Pc(77) int local77 = (local31[local43 + 1 & Static303.anInt5406] - local31[local43 - 1 & Static303.anInt5406]) * this.anInt1365;
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
