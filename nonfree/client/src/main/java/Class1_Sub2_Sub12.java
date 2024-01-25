import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "[Lclient!rm;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.aClass43Array1 = new Class43[arg1.method5174()];
			for (@Pc(32) int local32 = 0; local32 < this.aClass43Array1.length; local32++) {
				@Pc(38) int local38 = arg1.method5174();
				if (local38 == 0) {
					this.aClass43Array1[local32] = Static8.method84(arg1);
				} else if (local38 == 1) {
					this.aClass43Array1[local32] = Static258.method3963(arg1);
				} else if (local38 == 2) {
					this.aClass43Array1[local32] = Static303.method4524(arg1);
				} else if (local38 == 3) {
					this.aClass43Array1[local32] = Static354.method4950(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			this.method1419(super.aClass74_41.method1352());
		}
		return local9;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(17) int local17 = Static158.anInt2658;
			@Pc(19) int local19 = Static91.anInt1665;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(30) int[][][] local30 = super.aClass228_41.method4875();
			this.method1419(local23);
			for (@Pc(36) int local36 = 0; local36 < Static91.anInt1665; local36++) {
				@Pc(42) int[] local42 = local23[local36];
				@Pc(46) int[][] local46 = local30[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static158.anInt2658; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[[I)V")
	private void method1419(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static158.anInt2658;
		@Pc(9) int local9 = Static91.anInt1665;
		Static374.method5252(arg0);
		Static239.method3321(Static271.anInt4721, Static13.anInt189);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass43Array1.length; local27++) {
			@Pc(34) Class43 local34 = this.aClass43Array1[local27];
			@Pc(37) int local37 = local34.anInt5747;
			@Pc(40) int local40 = local34.anInt5750;
			if (local37 >= 0) {
				if (local40 < 0) {
					local34.method4938(local9, local7);
				} else {
					local34.method4940(local7, local9);
				}
			} else if (local40 >= 0) {
				local34.method4935(local7, local9);
			}
		}
	}
}
