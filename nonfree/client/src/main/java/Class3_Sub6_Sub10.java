import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class3_Sub6_Sub10 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
	private int anInt2935 = 4;

	@OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
	private int anInt2939 = 4;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2935 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt2939 = arg0.method5175();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(20) int local20 = Static521.anInt8383 / this.anInt2935;
			@Pc(25) int local25 = Static522.anInt8394 / this.anInt2939;
			@Pc(41) int[][] local41;
			if (local25 > 0) {
				@Pc(31) int local31 = arg0 % local25;
				local41 = this.method7773(0, Static522.anInt8394 * local31 / local25);
			} else {
				local41 = this.method7773(0, 0);
			}
			@Pc(53) int[] local53 = local41[0];
			@Pc(57) int[] local57 = local41[1];
			@Pc(61) int[] local61 = local41[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static521.anInt8383; local75++) {
				@Pc(89) int local89;
				if (local20 > 0) {
					@Pc(83) int local83 = local75 % local20;
					local89 = Static521.anInt8383 * local83 / local20;
				} else {
					local89 = 0;
				}
				local65[local75] = local53[local89];
				local69[local75] = local57[local89];
				local73[local75] = local61[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(28) int local28 = Static521.anInt8383 / this.anInt2935;
			@Pc(33) int local33 = Static522.anInt8394 / this.anInt2939;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method7769(Static522.anInt8394 * local39 / local33, 0);
			} else {
				local49 = this.method7769(0, 0);
			}
			for (local39 = 0; local39 < Static521.anInt8383; local39++) {
				if (local28 > 0) {
					@Pc(67) int local67 = local39 % local28;
					local11[local39] = local49[local67 * Static521.anInt8383 / local28];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}
}
