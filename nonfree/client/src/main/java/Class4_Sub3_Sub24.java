import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class4_Sub3_Sub24 extends Class4_Sub3 {

	@OriginalMember(owner = "client!na", name = "W", descriptor = "I")
	private int anInt2759;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2759 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt2761 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[] local29 = this.method3149(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static134.anInt3188; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt2759 <= local37 && this.anInt2761 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
