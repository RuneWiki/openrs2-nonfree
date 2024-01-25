import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "Lclient!bk;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_125 = new Class156(11, -2);

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public static void method5605() {
		Static388.aClass155Array16 = null;
		Static415.aClass155Array17 = null;
		Static120.aClass155Array6 = null;
		Static99.aClass155Array4 = null;
		Static326.aClass155Array13 = null;
		Static256.aClass155Array14 = null;
		Static438.aClass155Array18 = null;
		Static414.aClass70_6 = null;
		Static196.aClass70_3 = null;
		Static510.aClass70_11 = null;
		Static28.aClass155_3 = null;
		Static453.aClass155Array19 = null;
		Static219.aClass155Array11 = null;
		Static280.aClass155_13 = null;
		Static225.aClass155Array12 = null;
		Static630.aClass155Array21 = null;
		Static170.aClass155Array10 = null;
		Static550.aClass155Array15 = null;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z")
	public static boolean method5606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) boolean local21 = (arg0 & 0x37) == 0 ? Static223.method3547(arg1, arg0) : Static273.method4462(arg1, arg0);
		return local21 | Static368.method5497(arg0, arg1) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!dp;IIZ)J")
	public static long method5607(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) long local11 = 4194304L;
		@Pc(13) long local13 = Long.MIN_VALUE;
		@Pc(20) Class354 local20 = Static528.aClass243_3.method5556(arg0.method8364());
		@Pc(41) long local41 = (long) (arg2 << 7 | arg1 | arg0.method8366() << 14 | arg0.method8367() << 20 | 0x40000000);
		if (local20.anInt9386 == 0) {
			local41 |= local13;
		}
		if (local20.anInt9378 == 1) {
			local41 |= local11;
		}
		return local41 | (long) arg0.method8364() << 32;
	}
}
