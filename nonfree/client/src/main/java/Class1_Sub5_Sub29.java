import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub5_Sub29 extends Class1_Sub5 {

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
	private int anInt3103;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)V")
	private void method2390(@OriginalArg(0) int arg0) {
		this.anInt3103 = arg0 >> 12 & 0xFF0;
		this.anInt3099 = (arg0 & 0xFF) << 4;
		this.anInt3109 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(23) int[] local23 = local15[0];
			@Pc(27) int[] local27 = local15[1];
			@Pc(31) int[] local31 = local15[2];
			for (@Pc(33) int local33 = 0; local33 < Static177.anInt4018; local33++) {
				local23[local33] = this.anInt3103;
				local27[local33] = this.anInt3109;
				local31[local33] = this.anInt3099;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2390(arg0.method316());
		}
	}
}
