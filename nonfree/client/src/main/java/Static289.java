import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_165 = new Class214(41, -1);

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public static int anInt5362 = -1;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_31 = new Class91();

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_18 = new Class49(3, 3);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[BII)I")
	public static int method4466(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = Class4_Sub1_Sub8.anIntArray187[(arg1[local14] ^ local12) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4467(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (long) arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}
}
