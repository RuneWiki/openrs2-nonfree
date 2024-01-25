import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class4_Sub2_Sub21 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "I")
	private int anInt6952 = 4;

	@OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
	private int anInt6954 = 4;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(24) int local24 = Static269.anInt4330 / this.anInt6952;
			@Pc(29) int local29 = Static355.anInt5410 / this.anInt6954;
			@Pc(40) int[] local40;
			@Pc(46) int local46;
			if (local29 <= 0) {
				local40 = this.method8768(0, 0);
			} else {
				local46 = arg0 % local29;
				local40 = this.method8768(0, Static355.anInt5410 * local46 / local29);
			}
			for (local46 = 0; local46 < Static269.anInt4330; local46++) {
				if (local24 <= 0) {
					local15[local46] = local40[0];
				} else {
					@Pc(74) int local74 = local46 % local24;
					local15[local46] = local40[Static269.anInt4330 * local74 / local24];
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6952 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt6954 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int local26 = Static269.anInt4330 / this.anInt6952;
			@Pc(31) int local31 = Static355.anInt5410 / this.anInt6954;
			@Pc(42) int[][] local42;
			if (local31 <= 0) {
				local42 = this.method8772(0, 0);
			} else {
				@Pc(48) int local48 = arg0 % local31;
				local42 = this.method8772(Static355.anInt5410 * local48 / local31, 0);
			}
			@Pc(62) int[] local62 = local42[0];
			@Pc(66) int[] local66 = local42[1];
			@Pc(70) int[] local70 = local42[2];
			@Pc(74) int[] local74 = local17[0];
			@Pc(78) int[] local78 = local17[1];
			@Pc(82) int[] local82 = local17[2];
			for (@Pc(84) int local84 = 0; local84 < Static269.anInt4330; local84++) {
				@Pc(90) int local90;
				if (local26 <= 0) {
					local90 = 0;
				} else {
					@Pc(96) int local96 = local84 % local26;
					local90 = Static269.anInt4330 * local96 / local26;
				}
				local74[local84] = local62[local90];
				local78[local84] = local66[local90];
				local82[local84] = local70[local90];
			}
		}
		return local17;
	}
}
