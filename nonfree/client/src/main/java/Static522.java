import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sia", name = "D", descriptor = "I")
	public static int anInt7724 = -1;

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)[B")
	public static byte[] method6791(@OriginalArg(0) int arg0) {
		@Pc(19) Class5_Sub4_Sub20 local19 = (Class5_Sub4_Sub20) Static547.aClass368_3.method8528((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static57.method964(local54, local30);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class5_Sub4_Sub20(local24);
			Static547.aClass368_3.method8527((long) arg0, local19);
		}
		return local19.aByteArray98;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ph;")
	public static RuntimeException_Sub1 method6793(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString109 = local9.aString109 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)I")
	public static int method6795(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(CB)Z")
	public static boolean method6796(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
