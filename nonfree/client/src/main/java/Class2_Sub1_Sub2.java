import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
	private int anInt375 = 4;

	@OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
	private int anInt378 = 4;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt375 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt378 = arg0.method209();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(28) int local28 = Static62.anInt1675 / this.anInt375;
			@Pc(33) int local33 = Static25.anInt4767 / this.anInt378;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method3203(local42 * Static25.anInt4767 / local33, 0);
			} else {
				local52 = this.method3203(0, 0);
			}
			for (local42 = 0; local42 < Static62.anInt1675; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(78) int local78 = local42 % local28;
					local19[local42] = local52[local78 * Static62.anInt1675 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(20) int local20 = Static25.anInt4767 / this.anInt378;
			@Pc(25) int local25 = Static62.anInt1675 / this.anInt375;
			@Pc(41) int[][] local41;
			if (local20 > 0) {
				@Pc(31) int local31 = arg0 % local20;
				local41 = this.method3205(0, Static25.anInt4767 * local31 / local20);
			} else {
				local41 = this.method3205(0, 0);
			}
			@Pc(53) int[] local53 = local41[0];
			@Pc(57) int[] local57 = local41[1];
			@Pc(61) int[] local61 = local41[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[2];
			@Pc(73) int[] local73 = local11[1];
			for (@Pc(75) int local75 = 0; local75 < Static62.anInt1675; local75++) {
				@Pc(92) int local92;
				if (local25 > 0) {
					@Pc(86) int local86 = local75 % local25;
					local92 = Static62.anInt1675 * local86 / local25;
				} else {
					local92 = 0;
				}
				local65[local75] = local53[local92];
				local73[local75] = local57[local92];
				local69[local75] = local61[local92];
			}
		}
		return local11;
	}
}
