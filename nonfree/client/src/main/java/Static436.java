import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
	public static boolean aBoolean633 = false;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[B")
	public static byte[] method5722(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub4_Sub17 local16 = (Class3_Sub4_Sub17) Static349.aClass101_3.method2479((long) arg0);
		if (local16 == null) {
			@Pc(21) byte[] local21 = new byte[512];
			@Pc(27) Random local27 = new Random((long) arg0);
			for (@Pc(29) int local29 = 0; local29 < 255; local29++) {
				local21[local29] = (byte) local29;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(49) int local49 = 255 - local43;
				@Pc(54) int local54 = Static180.method2865(local27, local49);
				@Pc(58) byte local58 = local21[local54];
				local21[local54] = local21[local49];
				local21[local49] = local21[511 - local43] = local58;
			}
			local16 = new Class3_Sub4_Sub17(local21);
			Static349.aClass101_3.method2477((long) arg0, local16);
		}
		return local16.aByteArray95;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)[Lclient!fi;")
	public static Class77[] method5723() {
		return new Class77[] { Static26.aClass77_1, Static419.aClass77_4, Static362.aClass77_3 };
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
	public static void method5726(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static393.method5080(arg0, 1);
		local12.method3244();
	}
}
