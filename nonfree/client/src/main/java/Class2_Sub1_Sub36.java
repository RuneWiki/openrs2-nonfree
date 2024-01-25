import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ut", name = "S", descriptor = "[Lclient!jg;")
	private Class31[] aClass31Array1;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(17) int local17 = Static131.anInt2581;
			@Pc(19) int local19 = Static266.anInt4930;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(30) int[][][] local30 = super.aClass158_41.method3636();
			this.method5617(local23);
			for (@Pc(36) int local36 = 0; local36 < Static266.anInt4930; local36++) {
				@Pc(42) int[] local42 = local23[local36];
				@Pc(46) int[][] local46 = local30[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static131.anInt2581; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aClass31Array1 = new Class31[arg1.method3737()];
			for (@Pc(34) int local34 = 0; local34 < this.aClass31Array1.length; local34++) {
				@Pc(40) int local40 = arg1.method3737();
				if (local40 == 0) {
					this.aClass31Array1[local34] = Static31.method2633(arg1);
				} else if (local40 == 1) {
					this.aClass31Array1[local34] = Static137.method1998(arg1);
				} else if (local40 == 2) {
					this.aClass31Array1[local34] = Static204.method3168(arg1);
				} else if (local40 == 3) {
					this.aClass31Array1[local34] = Static384.method5335(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([[IZ)V")
	private void method5617(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static131.anInt2581;
		@Pc(13) int local13 = Static266.anInt4930;
		Static433.method5836(arg0);
		Static315.method4512(Static36.anInt893, Static287.anInt5227);
		if (this.aClass31Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass31Array1.length; local27++) {
			@Pc(34) Class31 local34 = this.aClass31Array1[local27];
			@Pc(37) int local37 = local34.anInt6936;
			@Pc(40) int local40 = local34.anInt6939;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method5445(local13, local7);
				}
			} else if (local40 >= 0) {
				local34.method5446(local13, local7);
			} else {
				local34.method5444(local13, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			this.method5617(super.aClass67_41.method1595());
		}
		return local9;
	}
}
