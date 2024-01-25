import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class3_Sub4_Sub25 extends Class3_Sub4 {

	@OriginalMember(owner = "client!oj", name = "V", descriptor = "[Lclient!mp;")
	private Class155[] aClass155Array1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			this.method4259(super.aClass109_41.method2832());
		}
		return local9;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[[I)V")
	private void method4259(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static148.anInt2687;
		@Pc(9) int local9 = Static140.anInt2503;
		Static459.method4923(arg0);
		Static402.method5511(Static165.anInt2326, Static225.anInt3793);
		if (this.aClass155Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass155Array1.length; local25++) {
			@Pc(32) Class155 local32 = this.aClass155Array1[local25];
			@Pc(35) int local35 = local32.anInt6667;
			@Pc(38) int local38 = local32.anInt6668;
			if (local35 >= 0) {
				if (local38 < 0) {
					local32.method5520(local9, local7);
				} else {
					local32.method5523(local7, local9);
				}
			} else if (local38 >= 0) {
				local32.method5518(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(25) int local25 = Static148.anInt2687;
			@Pc(27) int local27 = Static140.anInt2503;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass148_41.method3567();
			this.method4259(local31);
			for (@Pc(42) int local42 = 0; local42 < Static140.anInt2503; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static148.anInt2687; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass155Array1 = new Class155[arg0.method4096()];
			for (@Pc(29) int local29 = 0; local29 < this.aClass155Array1.length; local29++) {
				@Pc(35) int local35 = arg0.method4096();
				if (local35 == 0) {
					this.aClass155Array1[local29] = Static101.method1700(arg0);
				} else if (local35 == 1) {
					this.aClass155Array1[local29] = Static208.method3162(arg0);
				} else if (local35 == 2) {
					this.aClass155Array1[local29] = Static430.method5858(arg0);
				} else if (local35 == 3) {
					this.aClass155Array1[local29] = Static441.method5946(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
