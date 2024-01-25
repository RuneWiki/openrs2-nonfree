import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class2_Sub10_Sub13 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "[Lclient!wea;")
	private Class160[] aClass160Array1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(22) int local22 = Static93.anInt1862;
			@Pc(24) int local24 = Static512.anInt8591;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass250_41.method6387();
			this.method3780(local28);
			for (@Pc(39) int local39 = 0; local39 < Static512.anInt8591; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static93.anInt1862; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[[I)V")
	private void method3780(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static93.anInt1862;
		@Pc(9) int local9 = Static512.anInt8591;
		Static93.method1626(arg0);
		Static55.method1025(Static93.anInt1860, Static603.anInt9994);
		if (this.aClass160Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass160Array1.length; local23++) {
			@Pc(30) Class160 local30 = this.aClass160Array1[local23];
			@Pc(33) int local33 = local30.anInt9565;
			@Pc(36) int local36 = local30.anInt9562;
			if (local33 >= 0) {
				if (local36 >= 0) {
					local30.method8042(local9, local7);
				} else {
					local30.method8041(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method8039(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass160Array1 = new Class160[arg0.method6904()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass160Array1.length; local18++) {
				@Pc(24) int local24 = arg0.method6904();
				if (local24 == 0) {
					this.aClass160Array1[local18] = Static595.method8193(arg0);
				} else if (local24 == 1) {
					this.aClass160Array1[local18] = Static338.method5215(arg0);
				} else if (local24 == 2) {
					this.aClass160Array1[local18] = Static258.method8465(arg0);
				} else if (local24 == 3) {
					this.aClass160Array1[local18] = Static475.method7382(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			this.method3780(super.aClass304_41.method7210());
		}
		return local14;
	}
}
