import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub4_Sub20 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "[Lclient!hha;")
	private Class53[] aClass53Array1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[II)V")
	private void method4556(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static395.anInt6816;
		@Pc(14) int local14 = Static118.anInt2485;
		Static513.method7443(arg0);
		Static467.method8860(Static104.anInt2340, Static463.anInt7489);
		if (this.aClass53Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass53Array1.length; local28++) {
			@Pc(35) Class53 local35 = this.aClass53Array1[local28];
			@Pc(38) int local38 = local35.anInt9767;
			@Pc(41) int local41 = local35.anInt9772;
			if (local38 >= 0) {
				if (local41 < 0) {
					local35.method8322(local14, local12);
				} else {
					local35.method8328(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method8329(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(17) int local17 = Static395.anInt6816;
			@Pc(19) int local19 = Static118.anInt2485;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass68_41.method1903();
			this.method4556(local23);
			for (@Pc(34) int local34 = 0; local34 < Static118.anInt2485; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static395.anInt6816; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			this.method4556(super.aClass348_41.method8071());
		}
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass53Array1 = new Class53[arg0.method2859()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass53Array1.length; local22++) {
				@Pc(28) int local28 = arg0.method2859();
				if (local28 == 0) {
					this.aClass53Array1[local22] = Static98.method8919(arg0);
				} else if (local28 == 1) {
					this.aClass53Array1[local22] = Static80.method1741(arg0);
				} else if (local28 == 2) {
					this.aClass53Array1[local22] = Static253.method4192(arg0);
				} else if (local28 == 3) {
					this.aClass53Array1[local22] = Static75.method7252(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}
}
