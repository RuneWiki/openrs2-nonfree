import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Z")
	public static boolean aBoolean289;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[2048];

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
	public static void method3432() {
		@Pc(13) Class204 local13 = null;
		try {
			@Pc(19) Class39 local19 = Static237.aClass258_3.method5895("3", false);
			while (local19.anInt894 == 0) {
				Static589.method7892(1L);
			}
			if (local19.anInt894 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local13 = (Class204) local19.anObject2;
			@Pc(51) byte[] local51 = new byte[(int) local13.method4676()];
			if (local51.length == 0) {
				Static501.aString78 = "";
				Static423.aString64 = "";
			} else {
				@Pc(73) int local73;
				for (@Pc(59) int local59 = 0; local59 < local51.length; local59 += local73) {
					local73 = local13.method4681(local51, local59, local51.length - local59);
					if (local73 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(95) Class3_Sub11 local95 = new Class3_Sub11(local51);
				@Pc(99) int local99 = local95.method5175();
				if (local99 > 120) {
					throw new RuntimeException("Bad length");
				}
				local95.anInt6128 = local99 + 1;
				if (!local95.method5190()) {
					throw new RuntimeException("Invalid CRC");
				}
				local95.anInt6128 = 1;
				@Pc(130) int local130 = local95.method5175();
				if (local130 > 3) {
					throw new RuntimeException("Invalid version " + local130);
				}
				Static501.aString78 = local95.method5193();
				Static423.aString64 = local95.method5193();
				if (local130 >= 1) {
					Static357.anInt6226 = local95.method5198();
				} else {
					Static357.anInt6226 = Static535.anInt8570;
				}
				if (local130 >= 2) {
					Static589.aLong274 = local95.method5226();
				} else {
					Static589.aLong274 = Static149.aLong80;
				}
				if (local130 < 3) {
					Static326.aString39 = Static286.aString34;
				} else if (local95.method5175() == 1) {
					Static326.aString39 = local95.method5193();
				} else {
					Static326.aString39 = null;
				}
			}
		} catch (@Pc(206) Exception local206) {
			Static423.aString64 = "";
			Static501.aString78 = "";
		}
		try {
			if (local13 != null) {
				local13.method4677();
			}
		} catch (@Pc(217) Exception local217) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method3433(@OriginalArg(0) Class361 arg0) {
		if (Static299.anInt5089 != arg0.anInt9591) {
			return;
		}
		if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95 == null) {
			arg0.anInt9628 = 0;
			arg0.anInt9629 = 0;
			return;
		}
		arg0.anInt9667 = 150;
		arg0.anInt9639 = (int) (Math.sin((double) Static506.anInt8251 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9628 = Static166.anInt3327;
		arg0.anInt9582 = 5;
		arg0.anInt9629 = Static381.method5573(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95);
		arg0.lb = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9512;
		arg0.anInt9644 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9526;
		arg0.anInt9596 = 0;
		arg0.anInt9664 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9527;
		@Pc(75) Class185 local75 = arg0.lb == -1 ? null : Static545.aClass240_2.method5680(arg0.lb);
		if (local75 != null) {
			Static407.method5864(local75, arg0.anInt9644);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = Static282.aShort77 + local7 * (Static87.aShort83 - Static282.aShort77) / 100;
		@Pc(40) int local40 = arg4 * local34 >> 8;
		@Pc(47) int local47 = 16384 - arg3 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg5 & 0x3FFF;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = local40;
		if (local47 != 0) {
			local64 = -local40 * Class356.anIntArray597[local47] >> 14;
			local66 = local40 * Class356.anIntArray598[local47] >> 14;
		}
		if (local54 != 0) {
			local62 = Class356.anIntArray597[local54] * local66 >> 14;
			local66 = Class356.anIntArray598[local54] * local66 >> 14;
		}
		Static494.anInt8029 = arg3;
		Static226.anInt3984 = arg1 - local62;
		Static350.anInt6080 = arg2 - local66;
		Static208.anInt3801 = 0;
		Static333.anInt5565 = arg5;
		Static461.anInt7704 = arg0 - local64;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(ZI)V")
	public static void method3435(@OriginalArg(0) boolean arg0) {
		Static236.method3658();
		if (!Static184.method3148(Static32.anInt602)) {
			return;
		}
		Static173.anInt3427++;
		if (Static173.anInt3427 < 50 && !arg0) {
			return;
		}
		Static173.anInt3427 = 0;
		if (!Static165.aBoolean259 && Static324.aClass165_2 != null) {
			@Pc(35) Class3_Sub42 local35 = Static591.method7910(Static9.aClass199_3, Static574.aClass303_102);
			Static511.method6885(local35);
			try {
				Static84.method1672();
			} catch (@Pc(42) IOException local42) {
				Static165.aBoolean259 = true;
			}
		}
		Static236.method3658();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3436(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static601.method2816(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)Z")
	public static boolean method3437() {
		return Static10.method149("jaclib") ? Static10.method149("hw3d") : false;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
	public static void method3439() {
		if (Static353.anInt6188 == -1) {
			return;
		}
		@Pc(11) int local11 = Static465.aClass86_1.method7267();
		@Pc(15) int local15 = Static465.aClass86_1.method7265();
		@Pc(24) Class3_Sub1 local24 = (Class3_Sub1) Static68.aClass112_15.method3088();
		if (local24 != null) {
			local11 = local24.method5713();
			local15 = local24.method5711();
		}
		Static462.method6422(Static353.anInt6188, local11, 0, Static40.anInt758, local15, 0, 0, 0, Static308.anInt5171);
		if (Static493.aClass361_17 != null) {
			Static171.method3054(local15, local11);
		}
	}
}
