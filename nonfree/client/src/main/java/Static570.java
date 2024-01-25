import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public static int anInt9338;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!de;")
	public static final Class69 aClass69_60 = new Class69(260);

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt9337 = 0;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt9341 = 0;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[F")
	public static final float[] aFloatArray89 = new float[16];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!sl;)Lclient!wm;")
	public static Class135_Sub1 method7933(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(12) Class135 local12 = Static240.method8180(arg0);
		@Pc(16) int local16 = arg0.method2841();
		return new Class135_Sub1(local12.anInt10390, local12.aClass97_16, local12.aClass252_12, local12.anInt10395, local12.anInt10393, local16);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ZII)[B")
	public static byte[] method7934(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static115.method2081(local13, arg1);
		} else if (arg0 instanceof Class260) {
			@Pc(30) Class260 local30 = (Class260) arg0;
			return local30.method6258(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZ)I")
	public static int method7936(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub43 local12 = Static95.method1915(false, arg0);
		if (local12 == null) {
			return Static177.aClass331_1.method7574(arg0).anInt6884;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray671.length; local24++) {
			if (local12.anIntArray671[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static177.aClass331_1.method7574(arg0).anInt6884 - local12.anIntArray671.length;
	}
}
