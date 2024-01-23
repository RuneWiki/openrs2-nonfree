import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	private int anInt3160 = 4;

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	private int anInt3158 = 4;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3158 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt3160 = arg0.method4261();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(25) int local25 = Static114.anInt1359 / this.anInt3158;
			@Pc(30) int local30 = Static199.anInt4143 / this.anInt3160;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method4937(0, Static199.anInt4143 * local39 / local30);
			} else {
				local49 = this.method4937(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local11[0];
			@Pc(73) int[] local73 = local11[1];
			@Pc(77) int[] local77 = local49[2];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static114.anInt1359; local83++) {
				@Pc(105) int local105;
				if (local25 > 0) {
					@Pc(99) int local99 = local83 % local25;
					local105 = local99 * Static114.anInt1359 / local25;
				} else {
					local105 = 0;
				}
				local69[local83] = local61[local105];
				local73[local83] = local65[local105];
				local81[local83] = local77[local105];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(26) int local26 = Static114.anInt1359 / this.anInt3158;
			@Pc(31) int local31 = Static199.anInt4143 / this.anInt3160;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local31 <= 0) {
				local42 = this.method4946(0, 0);
			} else {
				local48 = arg0 % local31;
				local42 = this.method4946(Static199.anInt4143 * local48 / local31, 0);
			}
			for (local48 = 0; local48 < Static114.anInt1359; local48++) {
				if (local26 > 0) {
					@Pc(72) int local72 = local48 % local26;
					local17[local48] = local42[local72 * Static114.anInt1359 / local26];
				} else {
					local17[local48] = local42[0];
				}
			}
		}
		return local17;
	}
}
