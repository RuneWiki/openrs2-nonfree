import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "[Lclient!jk;")
	private Class71[] aClass71Array1;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			this.method4287(super.aClass330_41.method7982());
		}
		return local9;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(25) int local25 = Static164.anInt8839;
			@Pc(27) int local27 = Static638.anInt10476;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass214_41.method5658();
			this.method4287(local31);
			for (@Pc(42) int local42 = 0; local42 < Static638.anInt10476; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static164.anInt8839; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.aClass71Array1 = new Class71[arg1.method8401()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass71Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method8401();
				if (local20 == 0) {
					this.aClass71Array1[local14] = Static66.method1484(arg1);
				} else if (local20 == 1) {
					this.aClass71Array1[local14] = Static350.method5751(arg1);
				} else if (local20 == 2) {
					this.aClass71Array1[local14] = Static449.method6795(arg1);
				} else if (local20 == 3) {
					this.aClass71Array1[local14] = Static244.method4642(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B[[I)V")
	private void method4287(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static164.anInt8839;
		@Pc(9) int local9 = Static638.anInt10476;
		Static180.method3688(arg0);
		Static593.method8116(Static52.anInt1120, Static46.anInt1029);
		if (this.aClass71Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass71Array1.length; local25++) {
			@Pc(32) Class71 local32 = this.aClass71Array1[local25];
			@Pc(35) int local35 = local32.anInt8462;
			@Pc(38) int local38 = local32.anInt8466;
			if (local35 < 0) {
				if (local38 >= 0) {
					local32.method6990(local7, local9);
				}
			} else if (local38 >= 0) {
				local32.method6986(local9, local7);
			} else {
				local32.method6988(local7, local9);
			}
		}
	}
}
