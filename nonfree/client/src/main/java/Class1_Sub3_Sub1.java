import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	private int anInt622 = 4;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
	private int anInt627 = 4;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(20) int local20 = Static110.anInt2934 / this.anInt627;
			@Pc(25) int local25 = Static166.anInt3882 / this.anInt622;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method4117(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method4117(0, Static166.anInt3882 * local39 / local25);
			}
			for (local39 = 0; local39 < Static110.anInt2934; local39++) {
				if (local20 > 0) {
					@Pc(59) int local59 = local39 % local20;
					local11[local39] = local33[local59 * Static110.anInt2934 / local20];
				} else {
					local11[local39] = local33[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(28) int local28 = Static166.anInt3882 / this.anInt622;
			@Pc(33) int local33 = Static110.anInt2934 / this.anInt627;
			@Pc(44) int[][] local44;
			if (local28 <= 0) {
				local44 = this.method4129(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local28;
				local44 = this.method4129(0, Static166.anInt3882 * local50 / local28);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[2];
			@Pc(84) int[] local84 = local19[1];
			for (@Pc(86) int local86 = 0; local86 < Static110.anInt2934; local86++) {
				@Pc(95) int local95;
				if (local33 <= 0) {
					local95 = 0;
				} else {
					@Pc(101) int local101 = local86 % local33;
					local95 = local101 * Static110.anInt2934 / local33;
				}
				local76[local86] = local64[local95];
				local84[local86] = local68[local95];
				local80[local86] = local72[local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt627 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt622 = arg0.method1772();
		}
	}
}
