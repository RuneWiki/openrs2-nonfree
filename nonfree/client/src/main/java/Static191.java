import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gga", name = "N", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!gga", name = "Q", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!gga", name = "P", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!gga", name = "U", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!gga", name = "O", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_59 = new Class322(82, -1);

	@OriginalMember(owner = "client!gga", name = "S", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!op;BII)Lclient!ue;")
	public static Class6_Sub2_Sub21 method3632(@OriginalArg(0) Class275 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg0.anInt7438;
		@Pc(19) Class6_Sub2_Sub21 local19 = (Class6_Sub2_Sub21) Static72.aClass379_2.method8729((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static314.aClass223_70.method5275(Static314.aClass223_70.method5259(local10));
		if (local32 == null) {
			local10 = arg2 + 65536 << 10 | arg0.anInt7438;
			local19 = (Class6_Sub2_Sub21) Static72.aClass379_2.method8729((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static314.aClass223_70.method5275(Static314.aClass223_70.method5259(local10));
			if (local32 == null) {
				local10 = arg0.anInt7438 | 0x3FFFC00;
				local19 = (Class6_Sub2_Sub21) Static72.aClass379_2.method8729((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static314.aClass223_70.method5275(Static314.aClass223_70.method5259(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static169.method3316(local32);
					} catch (@Pc(211) Exception local211) {
						throw new RuntimeException(local211.getMessage() + " S: " + local10);
					}
					local19.aClass275_16 = arg0;
					Static72.aClass379_2.method8733((long) local10 << 16, local19);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static169.method3316(local32);
				} catch (@Pc(135) Exception local135) {
					throw new RuntimeException(local135.getMessage() + " S: " + local10);
				}
				local19.aClass275_16 = arg0;
				Static72.aClass379_2.method8733((long) local10 << 16, local19);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static169.method3316(local32);
			} catch (@Pc(49) Exception local49) {
				throw new RuntimeException(local49.getMessage() + " S: " + local10);
			}
			local19.aClass275_16 = arg0;
			Static72.aClass379_2.method8733((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(Z)V")
	public static void method3634() {
		Static610.anInt9637 = 200;
		Static562.anInt9088 = (int) ((double) Static29.anInt380 * 34.46D);
		Static562.anInt9088 <<= 0x2;
		if (Static202.aClass75_5.method6680()) {
			Static562.anInt9088 += 512;
		}
		Static220.method4009(false);
	}
}
