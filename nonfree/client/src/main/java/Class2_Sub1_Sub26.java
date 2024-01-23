import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
	private int anInt3653 = 32768;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3653 = arg0.method2130() << 4;
		} else if (arg1 == 1) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(27) int[] local27 = this.method4601(arg0, 1);
			@Pc(35) int[] local35 = this.method4601(arg0, 2);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static281.anInt5558; local49++) {
				@Pc(66) int local66 = local27[local49] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = local35[local49] * this.anInt3653 >> 12;
				@Pc(83) int local83 = local75 * Static290.anIntArray541[local66] >> 12;
				@Pc(91) int local91 = Static80.anIntArray164[local66] * local75 >> 12;
				@Pc(99) int local99 = (local83 >> 12) + local49 & Static226.anInt6054;
				@Pc(107) int local107 = Static107.anInt2459 & arg0 + (local91 >> 12);
				@Pc(113) int[][] local113 = this.method4600(local107, 0);
				local39[local49] = local113[0][local99];
				local43[local49] = local113[1][local99];
				local47[local49] = local113[2][local99];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(23) int[] local23 = this.method4601(arg0, 1);
			@Pc(29) int[] local29 = this.method4601(arg0, 2);
			for (@Pc(31) int local31 = 0; local31 < Static281.anInt5558; local31++) {
				@Pc(46) int local46 = local23[local31] >> 4 & 0xFF;
				@Pc(55) int local55 = local29[local31] * this.anInt3653 >> 12;
				@Pc(63) int local63 = local55 * Static80.anIntArray164[local46] >> 12;
				@Pc(72) int local72 = Static107.anInt2459 & arg0 + (local63 >> 12);
				@Pc(80) int local80 = local55 * Static290.anIntArray541[local46] >> 12;
				@Pc(88) int local88 = Static226.anInt6054 & (local80 >> 12) + local31;
				@Pc(94) int[] local94 = this.method4601(local72, 0);
				local13[local31] = local94[local88];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		Static66.method1205();
	}
}
