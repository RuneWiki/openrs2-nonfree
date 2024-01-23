import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[][] local29 = this.method4129(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local29[1];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2934; local55++) {
				local37[local55] = 4096 - local33[local55];
				local41[local55] = 4096 - local53[local55];
				local49[local55] = 4096 - local45[local55];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(21) int[] local21 = this.method4117(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static110.anInt2934; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}
}
