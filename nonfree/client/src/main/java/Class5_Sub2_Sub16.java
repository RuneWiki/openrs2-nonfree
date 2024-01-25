import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!in", name = "I", descriptor = "[Lclient!df;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B[[I)V")
	private void method3683(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static314.anInt6320;
		@Pc(9) int local9 = Static423.anInt7200;
		Static282.method4237(arg0);
		Static300.method4351(Static550.anInt6610, Static271.anInt4487);
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass3Array1.length; local28++) {
			@Pc(35) Class3 local35 = this.aClass3Array1[local28];
			@Pc(38) int local38 = local35.anInt9989;
			@Pc(41) int local41 = local35.anInt9988;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method8485(local9, local7);
				}
			} else if (local41 < 0) {
				local35.method8489(local7, local9);
			} else {
				local35.method8487(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass3Array1 = new Class3[arg0.method8645()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass3Array1.length; local11++) {
				@Pc(17) int local17 = arg0.method8645();
				if (local17 == 0) {
					this.aClass3Array1[local11] = Static253.method3924(arg0);
				} else if (local17 == 1) {
					this.aClass3Array1[local11] = Static508.method7361(arg0);
				} else if (local17 == 2) {
					this.aClass3Array1[local11] = Static384.method5955(arg0);
				} else if (local17 == 3) {
					this.aClass3Array1[local11] = Static511.method7387(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(22) int local22 = Static314.anInt6320;
			@Pc(24) int local24 = Static423.anInt7200;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass370_41.method8548();
			this.method3683(local28);
			for (@Pc(39) int local39 = 0; local39 < Static423.anInt7200; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static314.anInt6320; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			this.method3683(super.aClass246_41.method5950());
		}
		return local9;
	}
}
