import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class3_Sub8_Sub35 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "[Lclient!pn;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z[[I)V")
	private void method8312(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static91.anInt1849;
		@Pc(9) int local9 = Static589.anInt9553;
		Static43.method787(arg0);
		Static548.method7022(Static635.anInt10496, Static348.anInt5973);
		if (this.aClass33Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass33Array1.length; local23++) {
			@Pc(30) Class33 local30 = this.aClass33Array1[local23];
			@Pc(33) int local33 = local30.anInt7490;
			@Pc(36) int local36 = local30.anInt7489;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method6288(local9, local7);
				} else {
					local30.method6286(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method6282(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.aClass33Array1 = new Class33[arg1.method7954()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass33Array1.length; local33++) {
				@Pc(39) int local39 = arg1.method7954();
				if (local39 == 0) {
					this.aClass33Array1[local33] = Static380.method5356(arg1);
				} else if (local39 == 1) {
					this.aClass33Array1[local33] = Static563.method7421(arg1);
				} else if (local39 == 2) {
					this.aClass33Array1[local33] = Static219.method3248(arg1);
				} else if (local39 == 3) {
					this.aClass33Array1[local33] = Static552.method7307(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			this.method8312(super.aClass87_41.method1798());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(23) int local23 = Static91.anInt1849;
			@Pc(25) int local25 = Static589.anInt9553;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass326_41.method7327();
			this.method8312(local29);
			for (@Pc(40) int local40 = 0; local40 < Static589.anInt9553; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static91.anInt1849; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
