import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(28) int[] local28 = local19[0];
			@Pc(32) int[] local32 = local19[2];
			@Pc(36) int[] local36 = local19[1];
			for (@Pc(38) int local38 = 0; local38 < Static75.anInt1848; local38++) {
				this.method2065(arg0, local38);
				@Pc(52) int[][] local52 = this.method4758(0, Static33.anInt867);
				local28[local38] = local52[0][Static62.anInt1580];
				local36[local38] = local52[1][Static62.anInt1580];
				local32[local38] = local52[2][Static62.anInt1580];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			for (@Pc(23) int local23 = 0; local23 < Static75.anInt1848; local23++) {
				this.method2065(arg0, local23);
				@Pc(37) int[] local37 = this.method4746(0, Static33.anInt867);
				local16[local23] = local37[Static62.anInt1580];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)V")
	private void method2065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static157.anIntArray331[arg1];
		@Pc(28) int local28 = Static98.anIntArray221[arg0];
		@Pc(39) float local39 = (float) Math.atan2((double) (local9 - 2048), (double) (local28 - 2048));
		if ((double) local39 >= -3.141592653589793D && (double) local39 <= -2.356194490192345D) {
			Static33.anInt867 = arg0;
			Static62.anInt1580 = arg1;
		} else if ((double) local39 <= -1.5707963267948966D && (double) local39 >= -2.356194490192345D) {
			Static33.anInt867 = arg1;
			Static62.anInt1580 = arg0;
		} else if (-0.7853981633974483D >= (double) local39 && -1.5707963267948966D <= (double) local39) {
			Static33.anInt867 = arg1;
			Static62.anInt1580 = Static75.anInt1848 - arg0;
		} else if (local39 <= 0.0F && -0.7853981633974483D <= (double) local39) {
			Static33.anInt867 = Static6.anInt2264 - arg0;
			Static62.anInt1580 = arg1;
		} else if (local39 >= 0.0F && (double) local39 <= 0.7853981633974483D) {
			Static62.anInt1580 = Static75.anInt1848 - arg1;
			Static33.anInt867 = Static6.anInt2264 - arg0;
		} else if ((double) local39 >= 0.7853981633974483D && (double) local39 <= 1.5707963267948966D) {
			Static33.anInt867 = Static6.anInt2264 - arg1;
			Static62.anInt1580 = Static75.anInt1848 - arg0;
		} else if ((double) local39 >= 1.5707963267948966D && (double) local39 <= 2.356194490192345D) {
			Static33.anInt867 = Static6.anInt2264 - arg1;
			Static62.anInt1580 = arg0;
		} else if ((double) local39 >= 2.356194490192345D && (double) local39 <= 3.141592653589793D) {
			Static33.anInt867 = arg0;
			Static62.anInt1580 = Static75.anInt1848 - arg1;
		}
		Static33.anInt867 &= Static178.anInt4007;
		Static62.anInt1580 &= Static145.anInt3482;
	}
}
