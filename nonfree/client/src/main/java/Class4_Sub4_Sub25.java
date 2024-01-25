import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub4_Sub25 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "[Lclient!di;")
	private Class51[] aClass51Array1;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			this.method4660(super.aClass103_41.method1978());
		}
		return local17;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aClass51Array1 = new Class51[arg1.method5007()];
			for (@Pc(34) int local34 = 0; local34 < this.aClass51Array1.length; local34++) {
				@Pc(40) int local40 = arg1.method5007();
				if (local40 == 0) {
					this.aClass51Array1[local34] = Static361.method516(arg1);
				} else if (local40 == 1) {
					this.aClass51Array1[local34] = Static382.method5065(arg1);
				} else if (local40 == 2) {
					this.aClass51Array1[local34] = Static99.method1504(arg1);
				} else if (local40 == 3) {
					this.aClass51Array1[local34] = Static28.method5896(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([[IB)V")
	private void method4660(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static419.anInt6404;
		@Pc(17) int local17 = Static91.anInt1740;
		Static217.method5795(arg0);
		Static98.method1498(Static211.anInt3669, Static204.anInt3610);
		if (this.aClass51Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass51Array1.length; local31++) {
			@Pc(38) Class51 local38 = this.aClass51Array1[local31];
			@Pc(41) int local41 = local38.anInt7226;
			@Pc(44) int local44 = local38.anInt7223;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method5809(local7, local17);
				} else {
					local38.method5807(local7, local17);
				}
			} else if (local44 >= 0) {
				local38.method5810(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(22) int local22 = Static419.anInt6404;
			@Pc(24) int local24 = Static91.anInt1740;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass163_41.method3179();
			this.method4660(local28);
			for (@Pc(39) int local39 = 0; local39 < Static91.anInt1740; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static419.anInt6404; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
