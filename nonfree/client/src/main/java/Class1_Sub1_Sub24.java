import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "[Lclient!di;")
	private Class62[] aClass62Array1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([[IB)V")
	private void method5060(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static501.anInt8748;
		@Pc(17) int local17 = Static8.anInt5990;
		Static175.method2778(arg0);
		Static71.method1176(Static98.anInt1743, Static326.anInt4973);
		if (this.aClass62Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass62Array1.length; local31++) {
			@Pc(38) Class62 local38 = this.aClass62Array1[local31];
			@Pc(41) int local41 = local38.anInt8333;
			@Pc(44) int local44 = local38.anInt8330;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method6732(local7, local17);
				} else {
					local38.method6731(local7, local17);
				}
			} else if (local44 >= 0) {
				local38.method6729(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aClass62Array1 = new Class62[arg1.method7974()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass62Array1.length; local18++) {
				@Pc(24) int local24 = arg1.method7974();
				if (local24 == 0) {
					this.aClass62Array1[local18] = Static401.method5775(arg1);
				} else if (local24 == 1) {
					this.aClass62Array1[local18] = Static330.method4879(arg1);
				} else if (local24 == 2) {
					this.aClass62Array1[local18] = Static45.method760(arg1);
				} else if (local24 == 3) {
					this.aClass62Array1[local18] = Static572.method7719(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(22) int local22 = Static501.anInt8748;
			@Pc(24) int local24 = Static8.anInt5990;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(35) int[][][] local35 = super.aClass241_41.method5267();
			this.method5060(local28);
			for (@Pc(41) int local41 = 0; local41 < Static8.anInt5990; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static501.anInt8748; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			this.method5060(super.aClass152_41.method3215());
		}
		return local9;
	}
}
