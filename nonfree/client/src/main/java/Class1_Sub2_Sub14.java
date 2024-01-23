import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
	private int anInt2498 = 4;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	private int anInt2499 = 4;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(28) int local28 = Static299.anInt5670 / this.anInt2498;
			@Pc(33) int local33 = Static202.anInt4038 / this.anInt2499;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method4575(0, Static202.anInt4038 * local39 / local33);
			} else {
				local49 = this.method4575(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local18[1];
			@Pc(77) int[] local77 = local18[2];
			@Pc(81) int[] local81 = local18[0];
			for (@Pc(83) int local83 = 0; local83 < Static299.anInt5670; local83++) {
				@Pc(102) int local102;
				if (local28 > 0) {
					@Pc(96) int local96 = local83 % local28;
					local102 = Static299.anInt5670 * local96 / local28;
				} else {
					local102 = 0;
				}
				local81[local83] = local61[local102];
				local73[local83] = local65[local102];
				local77[local83] = local69[local102];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(28) int local28 = Static299.anInt5670 / this.anInt2498;
			@Pc(33) int local33 = Static202.anInt4038 / this.anInt2499;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method4570(Static202.anInt4038 * local39 / local33, 0);
			} else {
				local49 = this.method4570(0, 0);
			}
			for (local39 = 0; local39 < Static299.anInt5670; local39++) {
				if (local28 <= 0) {
					local7[local39] = local49[0];
				} else {
					@Pc(79) int local79 = local39 % local28;
					local7[local39] = local49[local79 * Static299.anInt5670 / local28];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2498 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt2499 = arg0.method2595();
		}
	}
}
