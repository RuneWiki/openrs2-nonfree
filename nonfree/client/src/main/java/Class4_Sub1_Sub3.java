import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
	private int anInt476 = 2048;

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
	private int anInt483 = 3072;

	@OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
	private int anInt486 = 1024;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(22) int[][] local22 = this.method4549(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local12[1];
			@Pc(42) int[] local42 = local12[0];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static68.anInt1753; local48++) {
				local42[local48] = (local26[local48] * this.anInt476 >> 12) + this.anInt486;
				local38[local48] = (local30[local48] * this.anInt476 >> 12) + this.anInt486;
				local46[local48] = (this.anInt476 * local34[local48] >> 12) + this.anInt486;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.anInt476 = this.anInt483 - this.anInt486;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(29) int[] local29 = this.method4538(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static68.anInt1753; local31++) {
				local19[local31] = this.anInt486 + (this.anInt476 * local29[local31] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt486 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt483 = arg1.method3085();
		} else if (arg0 == 2) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}
}
