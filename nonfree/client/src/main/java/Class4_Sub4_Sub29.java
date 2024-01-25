import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class4_Sub4_Sub29 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "[Lclient!ln;")
	private Class122[] aClass122Array1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.aClass122Array1 = new Class122[arg1.method2380()];
			for (@Pc(30) int local30 = 0; local30 < this.aClass122Array1.length; local30++) {
				@Pc(36) int local36 = arg1.method2380();
				if (local36 == 0) {
					this.aClass122Array1[local30] = Static277.method4777(arg1);
				} else if (local36 == 1) {
					this.aClass122Array1[local30] = Static46.method877(arg1);
				} else if (local36 == 2) {
					this.aClass122Array1[local30] = Static48.method916(arg1);
				} else if (local36 == 3) {
					this.aClass122Array1[local30] = Static314.method2744(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			this.method4398(super.aClass207_41.method5468());
		}
		return local17;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[[I)V")
	private void method4398(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static124.anInt3576;
		@Pc(9) int local9 = Static331.anInt6571;
		Static294.method3382(arg0);
		Static297.method5044(Static59.anInt1278, Static350.anInt6802);
		if (this.aClass122Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass122Array1.length; local25++) {
			@Pc(32) Class122 local32 = this.aClass122Array1[local25];
			@Pc(35) int local35 = local32.anInt5903;
			@Pc(38) int local38 = local32.anInt5900;
			if (local35 < 0) {
				if (local38 >= 0) {
					local32.method4965(local9, local7);
				}
			} else if (local38 < 0) {
				local32.method4969(local9, local7);
			} else {
				local32.method4968(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(17) int local17 = Static124.anInt3576;
			@Pc(19) int local19 = Static331.anInt6571;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass160_41.method4319();
			this.method4398(local23);
			for (@Pc(34) int local34 = 0; local34 < Static331.anInt6571; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static124.anInt3576; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
