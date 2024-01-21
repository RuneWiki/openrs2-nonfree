import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	private int anInt1215;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
	private int anInt1219;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(29) int[] local29 = this.method2573(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static149.anInt3233; local31++) {
				local19[local31] = (this.anInt1214 * local29[local31] >> 12) + this.anInt1215;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.anInt1214 = this.anInt1219 - this.anInt1215;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(27) int[][] local27 = this.method2582(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local13[0];
			@Pc(47) int[] local47 = local13[1];
			@Pc(51) int[] local51 = local13[2];
			for (@Pc(53) int local53 = 0; local53 < Static149.anInt3233; local53++) {
				local43[local53] = (this.anInt1214 * local31[local53] >> 12) + this.anInt1215;
				local47[local53] = (local35[local53] * this.anInt1214 >> 12) + this.anInt1215;
				local51[local53] = this.anInt1215 + (this.anInt1214 * local39[local53] >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1215 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt1219 = arg1.method1456();
		} else if (arg0 == 2) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}
}
