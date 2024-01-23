import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ci", name = "jb", descriptor = "[J")
	public static long[] aLongArray2 = new long[256];

	static {
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(27) long local27 = (long) local23;
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				if ((local27 & 0x1L) == 1L) {
					local27 = local27 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local27 >>>= 0x1;
				}
			}
			aLongArray2[local23] = local27;
		}
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V")
	private void method537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static63.anIntArray182[arg1];
		@Pc(13) int local13 = Static128.anIntArray362[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static51.anInt1249 = arg0;
			Static164.anInt3598 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static164.anInt3598 = arg0;
			Static51.anInt1249 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static164.anInt3598 = Static105.anInt2391 - arg0;
			Static51.anInt1249 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static51.anInt1249 = Static53.anInt1436 - arg0;
			Static164.anInt3598 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static51.anInt1249 = Static53.anInt1436 - arg0;
			Static164.anInt3598 = Static105.anInt2391 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static164.anInt3598 = Static105.anInt2391 - arg0;
			Static51.anInt1249 = Static53.anInt1436 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static164.anInt3598 = arg0;
			Static51.anInt1249 = Static53.anInt1436 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static164.anInt3598 = Static105.anInt2391 - arg1;
			Static51.anInt1249 = arg0;
		}
		Static51.anInt1249 &= Static92.anInt2170;
		Static164.anInt3598 &= Static32.anInt814;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static105.anInt2391; local34++) {
				this.method537(arg0, local34);
				@Pc(47) int[][] local47 = this.method3501(Static51.anInt1249, 0);
				local24[local34] = local47[0][Static164.anInt3598];
				local28[local34] = local47[1][Static164.anInt3598];
				local32[local34] = local47[2][Static164.anInt3598];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			for (@Pc(17) int local17 = 0; local17 < Static105.anInt2391; local17++) {
				this.method537(arg0, local17);
				@Pc(34) int[] local34 = this.method3514(Static51.anInt1249, 0);
				local11[local17] = local34[Static164.anInt3598];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}
}
