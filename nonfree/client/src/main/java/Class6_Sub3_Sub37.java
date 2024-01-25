import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class6_Sub3_Sub37 extends Class6_Sub3 {

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "[Lclient!us;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[[I)V")
	private void method7329(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static35.anInt670;
		@Pc(17) int local17 = Static170.anInt3133;
		Static387.method5668(arg0);
		Static304.method4597(Static132.anInt2511, Static147.anInt2781);
		if (this.aClass19Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass19Array1.length; local31++) {
			@Pc(38) Class19 local38 = this.aClass19Array1[local31];
			@Pc(41) int local41 = local38.anInt8864;
			@Pc(44) int local44 = local38.anInt8861;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method7066(local17, local7);
				}
			} else if (local44 < 0) {
				local38.method7060(local7, local17);
			} else {
				local38.method7064(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(17) int local17 = Static35.anInt670;
			@Pc(19) int local19 = Static170.anInt3133;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass263_41.method5966();
			this.method7329(local23);
			for (@Pc(36) int local36 = 0; local36 < Static170.anInt3133; local36++) {
				@Pc(42) int[] local42 = local23[local36];
				@Pc(46) int[][] local46 = local28[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static35.anInt670; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.aClass19Array1 = new Class19[arg1.method6019()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass19Array1.length; local11++) {
				@Pc(17) int local17 = arg1.method6019();
				if (local17 == 0) {
					this.aClass19Array1[local11] = Static567.method7824(arg1);
				} else if (local17 == 1) {
					this.aClass19Array1[local11] = Static288.method6406(arg1);
				} else if (local17 == 2) {
					this.aClass19Array1[local11] = Static582.method6360(arg1);
				} else if (local17 == 3) {
					this.aClass19Array1[local11] = Static529.method7817(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			this.method7329(super.aClass137_41.method3413());
		}
		return local14;
	}
}
