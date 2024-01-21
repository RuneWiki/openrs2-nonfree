import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	private int anInt3426;

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
	private int anInt3432;

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.method2447(arg1.method1436());
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(19) int[] local19 = local7[1];
			@Pc(23) int[] local23 = local7[2];
			@Pc(27) int[] local27 = local7[0];
			for (@Pc(29) int local29 = 0; local29 < Static149.anInt3233; local29++) {
				local27[local29] = this.anInt3435;
				local19[local29] = this.anInt3432;
				local23[local29] = this.anInt3426;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	private void method2447(@OriginalArg(0) int arg0) {
		this.anInt3435 = arg0 >> 12 & 0xFF0;
		this.anInt3432 = arg0 >> 4 & 0xFF0;
		this.anInt3426 = (arg0 & 0xFF) << 4;
	}
}
