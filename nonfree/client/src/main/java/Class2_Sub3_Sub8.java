import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(21) int[] local21 = local13[1];
			@Pc(25) int[] local25 = local13[0];
			@Pc(29) int[] local29 = local13[2];
			for (@Pc(31) int local31 = 0; local31 < Static53.anInt1184; local31++) {
				local25[local31] = this.anInt847;
				local21[local31] = this.anInt845;
				local29[local31] = this.anInt848;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V")
	private void method682(@OriginalArg(0) int arg0) {
		this.anInt847 = arg0 >> 12 & 0xFF0;
		this.anInt848 = (arg0 & 0xFF) << 4;
		this.anInt845 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.method682(arg1.method2942());
		}
	}
}
