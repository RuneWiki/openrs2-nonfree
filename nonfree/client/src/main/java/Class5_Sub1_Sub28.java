import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class5_Sub1_Sub28 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	private int anInt3155 = 4;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
	private int anInt3157 = 4;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3155 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt3157 = arg0.method3062();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(27) int local27 = Static174.anInt3489 / this.anInt3155;
			@Pc(32) int local32 = Static207.anInt4072 / this.anInt3157;
			@Pc(51) int[][] local51;
			if (local32 > 0) {
				@Pc(41) int local41 = arg0 % local32;
				local51 = this.method3191(0, Static207.anInt4072 * local41 / local32);
			} else {
				local51 = this.method3191(0, 0);
			}
			@Pc(63) int[] local63 = local51[1];
			@Pc(67) int[] local67 = local51[0];
			@Pc(71) int[] local71 = local51[2];
			@Pc(75) int[] local75 = local18[0];
			@Pc(79) int[] local79 = local18[1];
			@Pc(83) int[] local83 = local18[2];
			for (@Pc(85) int local85 = 0; local85 < Static174.anInt3489; local85++) {
				@Pc(102) int local102;
				if (local27 > 0) {
					@Pc(96) int local96 = local85 % local27;
					local102 = Static174.anInt3489 * local96 / local27;
				} else {
					local102 = 0;
				}
				local75[local85] = local67[local102];
				local79[local85] = local63[local102];
				local83[local85] = local71[local102];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(24) int local24 = Static174.anInt3489 / this.anInt3155;
			@Pc(29) int local29 = Static207.anInt4072 / this.anInt3157;
			@Pc(45) int[] local45;
			@Pc(35) int local35;
			if (local29 > 0) {
				local35 = arg0 % local29;
				local45 = this.method3196(Static207.anInt4072 * local35 / local29, 0);
			} else {
				local45 = this.method3196(0, 0);
			}
			for (local35 = 0; local35 < Static174.anInt3489; local35++) {
				if (local24 <= 0) {
					local11[local35] = local45[0];
				} else {
					@Pc(74) int local74 = local35 % local24;
					local11[local35] = local45[Static174.anInt3489 * local74 / local24];
				}
			}
		}
		return local11;
	}
}
