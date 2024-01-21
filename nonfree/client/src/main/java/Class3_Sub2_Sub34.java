import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
	private int anInt3863;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
	private int anInt3867;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3863 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt3867 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(29) int[] local29 = this.method2787(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static86.anInt1942; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = local37 >= this.anInt3863 && this.anInt3867 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
