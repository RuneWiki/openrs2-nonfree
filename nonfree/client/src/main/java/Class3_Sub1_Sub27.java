import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!no", name = "O", descriptor = "I")
	private int anInt6225 = 4;

	@OriginalMember(owner = "client!no", name = "I", descriptor = "I")
	private int anInt6221 = 4;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(22) int local22 = Static206.anInt4182 / this.anInt6225;
			@Pc(27) int local27 = Static245.anInt4535 / this.anInt6221;
			@Pc(48) int[] local48;
			@Pc(36) int local36;
			if (local27 > 0) {
				local36 = arg0 % local27;
				local48 = this.method7765(0, local36 * Static245.anInt4535 / local27);
			} else {
				local48 = this.method7765(0, 0);
			}
			for (local36 = 0; local36 < Static206.anInt4182; local36++) {
				if (local22 > 0) {
					@Pc(71) int local71 = local36 % local22;
					local13[local36] = local48[Static206.anInt4182 * local71 / local22];
				} else {
					local13[local36] = local48[0];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6225 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt6221 = arg0.method3118();
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(25) int local25 = Static206.anInt4182 / this.anInt6225;
			@Pc(30) int local30 = Static245.anInt4535 / this.anInt6221;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method7766(0, Static245.anInt4535 * local39 / local30);
			} else {
				local49 = this.method7766(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static206.anInt4182; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = local95 * Static206.anInt4182 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}
}
