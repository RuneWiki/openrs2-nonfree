import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "[Lclient!gfa;")
	private Class130[] aClass130Array1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(19) int local19 = Static636.anInt10302;
			@Pc(21) int local21 = Static443.anInt7682;
			@Pc(25) int[][] local25 = new int[local21][local19];
			@Pc(30) int[][][] local30 = super.aClass36_41.method734();
			this.method5198(local25);
			for (@Pc(36) int local36 = 0; local36 < Static443.anInt7682; local36++) {
				@Pc(42) int[] local42 = local25[local36];
				@Pc(46) int[][] local46 = local30[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static636.anInt10302; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([[IB)V")
	private void method5198(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static636.anInt10302;
		@Pc(9) int local9 = Static443.anInt7682;
		Static377.method5450(arg0);
		Static483.method7048(Static144.anInt2744, Static599.anInt9773);
		if (this.aClass130Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass130Array1.length; local23++) {
			@Pc(30) Class130 local30 = this.aClass130Array1[local23];
			@Pc(33) int local33 = local30.anInt11290;
			@Pc(36) int local36 = local30.anInt11292;
			if (local33 >= 0) {
				if (local36 >= 0) {
					local30.method9436(local9, local7);
				} else {
					local30.method9438(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method9435(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.aClass130Array1 = new Class130[arg1.method5322(-51)];
			for (@Pc(38) int local38 = 0; local38 < this.aClass130Array1.length; local38++) {
				@Pc(46) int local46 = arg1.method5322(-75);
				if (local46 == 0) {
					this.aClass130Array1[local38] = Static536.method7530(arg1);
				} else if (local46 == 1) {
					this.aClass130Array1[local38] = Static137.method2245(arg1);
				} else if (local46 == 2) {
					this.aClass130Array1[local38] = Static696.method9128(arg1);
				} else if (local46 == 3) {
					this.aClass130Array1[local38] = Static503.method7215(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean794 = arg1.method5322(-113) == 1;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			this.method5198(super.aClass293_41.method7202());
		}
		return local9;
	}
}
