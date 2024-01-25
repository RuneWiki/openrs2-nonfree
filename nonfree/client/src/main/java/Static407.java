import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	public static int anInt6328;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "Lclient!nt;")
	public static Class270 aClass270_14;

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "Lclient!vga;")
	public static final Class392 aClass392_2 = new Class392();

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_32 = new Class313(512);

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_21 = new Class320(52);

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
	public static int anInt6329 = 0;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "J")
	public static long aLong214 = 1L;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
	public static void method5468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0 | (long) arg1 << 32, 19);
		local14.method9260();
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(III)Z")
	public static boolean method5470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
