import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			for (@Pc(24) int local24 = 0; local24 < Static6.anInt4960; local24++) {
				this.method2127(local24, arg0);
				@Pc(38) int[] local38 = this.method4464(Static105.anInt2225, 0);
				local17[local24] = local38[Static51.anInt1112];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(III)V")
	private void method2127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static298.anIntArray589[arg0];
		@Pc(21) int local21 = Static10.anIntArray604[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && -2.356194490192345D >= (double) local32) {
			Static51.anInt1112 = arg0;
			Static105.anInt2225 = arg1;
		} else if (-1.5707963267948966D >= (double) local32 && -2.356194490192345D <= (double) local32) {
			Static51.anInt1112 = arg1;
			Static105.anInt2225 = arg0;
		} else if (-0.7853981633974483D >= (double) local32 && (double) local32 >= -1.5707963267948966D) {
			Static51.anInt1112 = Static6.anInt4960 - arg1;
			Static105.anInt2225 = arg0;
		} else if (local32 <= 0.0F && -0.7853981633974483D <= (double) local32) {
			Static51.anInt1112 = arg0;
			Static105.anInt2225 = Static213.anInt5511 - arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static51.anInt1112 = Static6.anInt4960 - arg0;
			Static105.anInt2225 = Static213.anInt5511 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static105.anInt2225 = Static213.anInt5511 - arg0;
			Static51.anInt1112 = Static6.anInt4960 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static105.anInt2225 = Static213.anInt5511 - arg0;
			Static51.anInt1112 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static51.anInt1112 = Static6.anInt4960 - arg0;
			Static105.anInt2225 = arg1;
		}
		Static51.anInt1112 &= Static274.anInt5042;
		Static105.anInt2225 &= Static202.anInt3956;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(26) int[] local26 = local18[1];
			@Pc(30) int[] local30 = local18[0];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static6.anInt4960; local36++) {
				this.method2127(local36, arg0);
				@Pc(50) int[][] local50 = this.method4456(Static105.anInt2225, 0);
				local30[local36] = local50[0][Static51.anInt1112];
				local26[local36] = local50[1][Static51.anInt1112];
				local34[local36] = local50[2][Static51.anInt1112];
			}
		}
		return local18;
	}
}
