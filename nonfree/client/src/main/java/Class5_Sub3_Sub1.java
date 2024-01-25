import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!aja", name = "V", descriptor = "I")
	private int anInt230 = 4;

	@OriginalMember(owner = "client!aja", name = "K", descriptor = "I")
	private int anInt235 = 4;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(30) int local30 = Static7.anInt102 / this.anInt230;
			@Pc(35) int local35 = Static122.anInt2020 / this.anInt235;
			@Pc(51) int[] local51;
			@Pc(41) int local41;
			if (local35 > 0) {
				local41 = arg0 % local35;
				local51 = this.method9205(Static122.anInt2020 * local41 / local35, 0);
			} else {
				local51 = this.method9205(0, 0);
			}
			for (local41 = 0; local41 < Static7.anInt102; local41++) {
				if (local30 <= 0) {
					local11[local41] = local51[0];
				} else {
					@Pc(83) int local83 = local41 % local30;
					local11[local41] = local51[local83 * Static7.anInt102 / local30];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt230 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt235 = arg0.method7291();
		}
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(26) int local26 = Static7.anInt102 / this.anInt230;
			@Pc(31) int local31 = Static122.anInt2020 / this.anInt235;
			@Pc(42) int[][] local42;
			if (local31 <= 0) {
				local42 = this.method9207(0, 0);
			} else {
				@Pc(48) int local48 = arg0 % local31;
				local42 = this.method9207(local48 * Static122.anInt2020 / local31, 0);
			}
			@Pc(62) int[] local62 = local42[0];
			@Pc(66) int[] local66 = local42[1];
			@Pc(70) int[] local70 = local42[2];
			@Pc(74) int[] local74 = local17[0];
			@Pc(78) int[] local78 = local17[1];
			@Pc(82) int[] local82 = local17[2];
			for (@Pc(84) int local84 = 0; local84 < Static7.anInt102; local84++) {
				@Pc(92) int local92;
				if (local26 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local84 % local26;
					local92 = Static7.anInt102 * local98 / local26;
				}
				local74[local84] = local62[local92];
				local78[local84] = local66[local92];
				local82[local84] = local70[local92];
			}
		}
		return local17;
	}
}
