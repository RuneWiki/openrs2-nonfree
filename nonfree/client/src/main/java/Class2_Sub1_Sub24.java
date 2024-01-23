import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt3552 = 4;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private int anInt3555 = 4;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3552 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt3555 = arg0.method2146();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int local29 = Static281.anInt5558 / this.anInt3552;
			@Pc(34) int local34 = Static64.anInt1560 / this.anInt3555;
			@Pc(45) int[][] local45;
			if (local34 <= 0) {
				local45 = this.method4600(0, 0);
			} else {
				@Pc(51) int local51 = arg0 % local34;
				local45 = this.method4600(Static64.anInt1560 * local51 / local34, 0);
			}
			@Pc(65) int[] local65 = local45[1];
			@Pc(69) int[] local69 = local45[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local45[0];
			@Pc(81) int[] local81 = local19[2];
			@Pc(85) int[] local85 = local19[1];
			for (@Pc(87) int local87 = 0; local87 < Static281.anInt5558; local87++) {
				@Pc(97) int local97;
				if (local29 <= 0) {
					local97 = 0;
				} else {
					@Pc(103) int local103 = local87 % local29;
					local97 = Static281.anInt5558 * local103 / local29;
				}
				local73[local87] = local77[local97];
				local85[local87] = local65[local97];
				local81[local87] = local69[local97];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(26) int local26 = Static64.anInt1560 / this.anInt3555;
			@Pc(31) int local31 = Static281.anInt5558 / this.anInt3552;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local26 <= 0) {
				local42 = this.method4601(0, 0);
			} else {
				local48 = arg0 % local26;
				local42 = this.method4601(local48 * Static64.anInt1560 / local26, 0);
			}
			for (local48 = 0; local48 < Static281.anInt5558; local48++) {
				if (local31 > 0) {
					@Pc(76) int local76 = local48 % local31;
					local17[local48] = local42[Static281.anInt5558 * local76 / local31];
				} else {
					local17[local48] = local42[0];
				}
			}
		}
		return local17;
	}
}
