import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "[Lclient!rj;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			this.method4319(super.aClass219_41.method5568());
		}
		return local9;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([[II)V")
	private void method4319(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static307.anInt4846;
		@Pc(9) int local9 = Static397.anInt7340;
		Static477.method7098(arg0);
		Static494.method7179(Static485.anInt8693, Static324.anInt6207);
		if (this.aClass30Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass30Array1.length; local28++) {
			@Pc(35) Class30 local35 = this.aClass30Array1[local28];
			@Pc(38) int local38 = local35.anInt8664;
			@Pc(41) int local41 = local35.anInt8662;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method7127(local9, local7);
				}
			} else if (local41 < 0) {
				local35.method7131(local7, local9);
			} else {
				local35.method7125(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.aClass30Array1 = new Class30[arg1.method7548()];
			for (@Pc(30) int local30 = 0; local30 < this.aClass30Array1.length; local30++) {
				@Pc(36) int local36 = arg1.method7548();
				if (local36 == 0) {
					this.aClass30Array1[local30] = Static131.method2296(arg1);
				} else if (local36 == 1) {
					this.aClass30Array1[local30] = Static3.method415(arg1);
				} else if (local36 == 2) {
					this.aClass30Array1[local30] = Static321.method5159(arg1);
				} else if (local36 == 3) {
					this.aClass30Array1[local30] = Static313.method5082(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(22) int local22 = Static307.anInt4846;
			@Pc(24) int local24 = Static397.anInt7340;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass226_41.method5722();
			this.method4319(local28);
			for (@Pc(39) int local39 = 0; local39 < Static397.anInt7340; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static307.anInt4846; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
