import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cja", name = "M", descriptor = "[Lclient!m;")
	private Class71[] aClass71Array1;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "([[II)V")
	private void method1512(@OriginalArg(0) int[][] arg0) {
		@Pc(13) int local13 = Static269.anInt4330;
		@Pc(15) int local15 = Static355.anInt5410;
		Static355.method4757(arg0);
		Static192.method2986(Static489.anInt7677, Static215.anInt3481);
		if (this.aClass71Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass71Array1.length; local29++) {
			@Pc(36) Class71 local36 = this.aClass71Array1[local29];
			@Pc(39) int local39 = local36.anInt6720;
			@Pc(42) int local42 = local36.anInt6721;
			if (local39 >= 0) {
				if (local42 >= 0) {
					local36.method5893(local15, local13);
				} else {
					local36.method5892(local13, local15);
				}
			} else if (local42 >= 0) {
				local36.method5894(local15, local13);
			}
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(17) int local17 = Static269.anInt4330;
			@Pc(19) int local19 = Static355.anInt5410;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass304_41.method6701();
			this.method1512(local23);
			for (@Pc(34) int local34 = 0; local34 < Static355.anInt5410; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static269.anInt4330; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			this.method1512(super.aClass271_41.method6063());
		}
		return local9;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aClass71Array1 = new Class71[arg1.method8865()];
			for (@Pc(44) int local44 = 0; local44 < this.aClass71Array1.length; local44++) {
				@Pc(50) int local50 = arg1.method8865();
				if (local50 == 0) {
					this.aClass71Array1[local44] = Static111.method2112(arg1);
				} else if (local50 == 1) {
					this.aClass71Array1[local44] = Static473.method6523(arg1);
				} else if (local50 == 2) {
					this.aClass71Array1[local44] = Static102.method8743(arg1);
				} else if (local50 == 3) {
					this.aClass71Array1[local44] = Static545.method7265(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean793 = arg1.method8865() == 1;
			return;
		}
	}
}
