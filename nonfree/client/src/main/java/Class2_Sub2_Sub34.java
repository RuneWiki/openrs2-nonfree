import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "[J")
	public static final long[] aLongArray7;

	static {
		Math.sqrt(8192.0D);
		aLongArray7 = new long[256];
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(15) long local15 = (long) local11;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1L) == 1L) {
					local15 = local15 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local15 >>>= 0x1;
				}
			}
			aLongArray7[local11] = local15;
		}
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static339.anInt6735; local37++) {
				this.method5510(local37, arg0);
				@Pc(50) int[][] local50 = this.method5887(Static344.anInt6884, 0);
				local27[local37] = local50[0][Static7.anInt159];
				local31[local37] = local50[1][Static7.anInt159];
				local35[local37] = local50[2][Static7.anInt159];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			for (@Pc(17) int local17 = 0; local17 < Static339.anInt6735; local17++) {
				this.method5510(local17, arg0);
				@Pc(30) int[] local30 = this.method5876(0, Static344.anInt6884);
				local11[local17] = local30[Static7.anInt159];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BII)V")
	private void method5510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static212.anIntArray325[arg0];
		@Pc(17) int local17 = Class208.lb[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static344.anInt6884 = arg1;
			Static7.anInt159 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static344.anInt6884 = arg0;
			Static7.anInt159 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static7.anInt159 = Static339.anInt6735 - arg1;
			Static344.anInt6884 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static7.anInt159 = arg0;
			Static344.anInt6884 = Static84.anInt1830 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static7.anInt159 = Static339.anInt6735 - arg0;
			Static344.anInt6884 = Static84.anInt1830 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static344.anInt6884 = Static84.anInt1830 - arg0;
			Static7.anInt159 = Static339.anInt6735 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static344.anInt6884 = Static84.anInt1830 - arg0;
			Static7.anInt159 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static344.anInt6884 = arg1;
			Static7.anInt159 = Static339.anInt6735 - arg0;
		}
		Static7.anInt159 &= Static25.anInt1346;
		Static344.anInt6884 &= Static285.anInt5782;
	}
}
