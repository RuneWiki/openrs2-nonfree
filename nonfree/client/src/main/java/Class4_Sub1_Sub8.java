import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!es", name = "G", descriptor = "[Lclient!cp;")
	private Class22[] aClass22Array1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([[II)V")
	private void method2572(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static376.anInt7260;
		@Pc(13) int local13 = Static477.anInt8774;
		Static504.method7402(arg0);
		Static449.method6957(Static237.anInt4286, Static569.anInt9982);
		if (this.aClass22Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass22Array1.length; local27++) {
			@Pc(34) Class22 local34 = this.aClass22Array1[local27];
			@Pc(37) int local37 = local34.anInt7880;
			@Pc(40) int local40 = local34.anInt7882;
			if (local37 >= 0) {
				if (local40 >= 0) {
					local34.method6562(local13, local7);
				} else {
					local34.method6565(local7, local13);
				}
			} else if (local40 >= 0) {
				local34.method6561(local7, local13);
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(19) int local19 = Static376.anInt7260;
			@Pc(21) int local21 = Static477.anInt8774;
			@Pc(25) int[][] local25 = new int[local21][local19];
			@Pc(30) int[][][] local30 = super.aClass84_41.method2455();
			this.method2572(local25);
			for (@Pc(36) int local36 = 0; local36 < Static477.anInt8774; local36++) {
				@Pc(42) int[] local42 = local25[local36];
				@Pc(46) int[][] local46 = local30[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static376.anInt7260; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aClass22Array1 = new Class22[arg1.method4905()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass22Array1.length; local11++) {
				@Pc(17) int local17 = arg1.method4905();
				if (local17 == 0) {
					this.aClass22Array1[local11] = Static79.method1263(arg1);
				} else if (local17 == 1) {
					this.aClass22Array1[local11] = Static344.method5585(arg1);
				} else if (local17 == 2) {
					this.aClass22Array1[local11] = Static479.method7193(arg1);
				} else if (local17 == 3) {
					this.aClass22Array1[local11] = Static240.method7430(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			this.method2572(super.aClass185_41.method4443());
		}
		return local9;
	}
}
