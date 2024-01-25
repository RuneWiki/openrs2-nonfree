import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class10_Sub2_Sub21 extends Class10_Sub2 {

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt4817 = 4;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	private int anInt4818 = 4;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(20) int local20 = Static121.anInt2458 / this.anInt4817;
			@Pc(25) int local25 = Static190.anInt3835 / this.anInt4818;
			@Pc(44) int[] local44;
			@Pc(34) int local34;
			if (local25 > 0) {
				local34 = arg0 % local25;
				local44 = this.method6041(Static190.anInt3835 * local34 / local25, 0);
			} else {
				local44 = this.method6041(0, 0);
			}
			for (local34 = 0; local34 < Static121.anInt2458; local34++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local34 % local20;
					local11[local34] = local44[Static121.anInt2458 * local62 / local20];
				} else {
					local11[local34] = local44[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(30) int local30 = Static121.anInt2458 / this.anInt4817;
			@Pc(35) int local35 = Static190.anInt3835 / this.anInt4818;
			@Pc(43) int[][] local43;
			if (local35 <= 0) {
				local43 = this.method6045(0, 0);
			} else {
				@Pc(49) int local49 = arg0 % local35;
				local43 = this.method6045(0, local49 * Static190.anInt3835 / local35);
			}
			@Pc(65) int[] local65 = local43[0];
			@Pc(69) int[] local69 = local43[1];
			@Pc(73) int[] local73 = local43[2];
			@Pc(77) int[] local77 = local13[0];
			@Pc(81) int[] local81 = local13[1];
			@Pc(85) int[] local85 = local13[2];
			for (@Pc(87) int local87 = 0; local87 < Static121.anInt2458; local87++) {
				@Pc(93) int local93;
				if (local30 <= 0) {
					local93 = 0;
				} else {
					@Pc(99) int local99 = local87 % local30;
					local93 = local99 * Static121.anInt2458 / local30;
				}
				local77[local87] = local65[local93];
				local81[local87] = local69[local93];
				local85[local87] = local73[local93];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4817 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt4818 = arg1.method2502();
		}
	}
}
