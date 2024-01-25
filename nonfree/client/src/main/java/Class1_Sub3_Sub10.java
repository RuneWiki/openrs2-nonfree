import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "[Lclient!ue;")
	private Class57[] aClass57Array1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			this.method1447(super.aClass172_41.method3959());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(25) int local25 = Static347.anInt5974;
			@Pc(27) int local27 = Static241.anInt4307;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass20_41.method476();
			this.method1447(local31);
			for (@Pc(42) int local42 = 0; local42 < Static241.anInt4307; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static347.anInt5974; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[[I)V")
	private void method1447(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static347.anInt5974;
		@Pc(9) int local9 = Static241.anInt4307;
		Static374.method5128(arg0);
		Static41.method5521(Static274.anInt4887, Static307.anInt5524);
		if (this.aClass57Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass57Array1.length; local23++) {
			@Pc(30) Class57 local30 = this.aClass57Array1[local23];
			@Pc(33) int local33 = local30.anInt7559;
			@Pc(36) int local36 = local30.anInt7558;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method5863(local7, local9);
				} else {
					local30.method5862(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method5861(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass57Array1 = new Class57[arg0.method4130()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass57Array1.length; local22++) {
				@Pc(30) int local30 = arg0.method4130();
				if (local30 == 0) {
					this.aClass57Array1[local22] = Static251.method3696(arg0);
				} else if (local30 == 1) {
					this.aClass57Array1[local22] = Static218.method3292(arg0);
				} else if (local30 == 2) {
					this.aClass57Array1[local22] = Static335.method1049(arg0);
				} else if (local30 == 3) {
					this.aClass57Array1[local22] = Static57.method1011(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}
}
