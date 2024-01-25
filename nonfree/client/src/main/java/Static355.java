import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_62 = new Class42(8);

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_110 = new Class66(64);

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt6625 = 2;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public static void method5834() {
		@Pc(3) Class24[] local3 = Class180.aClass24Array1;
		synchronized (Class180.aClass24Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class180.aClass24Array1.length; local7++) {
				Class180.aClass24Array1[local7] = new Class24();
				Static93.anIntArray126[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method5835(@OriginalArg(0) Class170 arg0) {
		Static131.aClass170_57 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)I")
	public static int method5837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static135.anIntArray166[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V")
	public static void method5838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub9_Sub16 local10 = Static239.method4052(14, arg0);
		local10.method4140();
		local10.anInt4723 = arg1;
	}
}
