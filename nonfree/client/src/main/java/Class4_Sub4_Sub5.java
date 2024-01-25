import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class4_Sub4_Sub5 extends Class4_Sub4 {

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "[Lclient!jb;")
	private Class170[] aClass170Array1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(22) int local22 = Static560.anInt9394;
			@Pc(24) int local24 = Static278.anInt5214;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(35) int[][][] local35 = super.aClass201_41.method4415();
			this.method2137(local28);
			for (@Pc(41) int local41 = 0; local41 < Static278.anInt5214; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static560.anInt9394; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aClass170Array1 = new Class170[arg1.method6015()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass170Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method6015();
				if (local20 == 0) {
					this.aClass170Array1[local14] = Static348.method5169(arg1);
				} else if (local20 == 1) {
					this.aClass170Array1[local14] = Static191.method5004(arg1);
				} else if (local20 == 2) {
					this.aClass170Array1[local14] = Static370.method5549(arg1);
				} else if (local20 == 3) {
					this.aClass170Array1[local14] = Static294.method4612(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			this.method2137(super.aClass343_41.method7592());
		}
		return local19;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([[IB)V")
	private void method2137(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static560.anInt9394;
		@Pc(17) int local17 = Static278.anInt5214;
		Static492.method7051(arg0);
		Static541.method7511(Static360.anInt6375, Static571.anInt9405);
		if (this.aClass170Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass170Array1.length; local31++) {
			@Pc(38) Class170 local38 = this.aClass170Array1[local31];
			@Pc(41) int local41 = local38.anInt7390;
			@Pc(44) int local44 = local38.anInt7392;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method6131(local17, local15);
				}
			} else if (local44 < 0) {
				local38.method6129(local17, local15);
			} else {
				local38.method6128(local15, local17);
			}
		}
	}
}
