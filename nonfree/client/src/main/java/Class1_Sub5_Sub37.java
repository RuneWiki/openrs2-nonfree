import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub5_Sub37 extends Class1_Sub5 {

	@OriginalMember(owner = "client!v", name = "O", descriptor = "I")
	private int anInt3986;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "I")
	private int anInt3992;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(28) int local28 = Static101.anInt2218 / this.anInt3986;
			@Pc(33) int local33 = Static177.anInt4018 / this.anInt3992;
			@Pc(49) int[][] local49;
			if (local28 > 0) {
				@Pc(39) int local39 = arg0 % local28;
				local49 = this.method3144(Static101.anInt2218 * local39 / local28, 0);
			} else {
				local49 = this.method3144(0, 0);
			}
			@Pc(61) int[] local61 = local49[1];
			@Pc(65) int[] local65 = local49[0];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[2];
			@Pc(81) int[] local81 = local11[1];
			for (@Pc(83) int local83 = 0; local83 < Static177.anInt4018; local83++) {
				@Pc(92) int local92;
				if (local33 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local33;
					local92 = local98 * Static177.anInt4018 / local33;
				}
				local73[local83] = local65[local92];
				local81[local83] = local61[local92];
				local77[local83] = local69[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = Static177.anInt4018 / this.anInt3992;
			@Pc(30) int local30 = Static101.anInt2218 / this.anInt3986;
			@Pc(51) int[] local51;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local51 = this.method3145(0, local39 * Static101.anInt2218 / local30);
			} else {
				local51 = this.method3145(0, 0);
			}
			for (local39 = 0; local39 < Static177.anInt4018; local39++) {
				if (local25 <= 0) {
					local16[local39] = local51[0];
				} else {
					@Pc(77) int local77 = local39 % local25;
					local16[local39] = local51[Static177.anInt4018 * local77 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3992 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt3986 = arg0.method336();
		}
	}
}
