import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public static int anInt3013;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array15;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_50 = new Class66(4);

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public static volatile int anInt3012 = 0;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_26 = new Class42(16);

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!vn;")
	public static Class211 aClass211_14 = new Class211();

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!bk;I)V")
	public static void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		if (Static243.aClass35_3 == null) {
			return;
		}
		try {
			Static243.aClass35_3.method892(0L);
			Static243.aClass35_3.method893(24, arg1.aByteArray18, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!ff;")
	public static Class5_Sub9_Sub6 method2745(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub6 local10 = (Class5_Sub9_Sub6) Static298.aClass215_10.method5683((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static260.aClass170_121.method4584(0, arg0);
		} else {
			local25 = Static244.aClass170_85.method4584(0, arg0 & 0x7FFF);
		}
		local10 = new Class5_Sub9_Sub6();
		if (local25 != null) {
			local10.method1899(new Class5_Sub1(local25));
		}
		if (arg0 >= 32768) {
			local10.method1904();
		}
		Static298.aClass215_10.method5687(local10, (long) arg0);
		return local10;
	}
}
