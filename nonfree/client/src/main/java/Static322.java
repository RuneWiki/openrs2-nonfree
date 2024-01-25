import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt6208 = 0;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString229 = " is already on your friend list.";

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
	public static void method5550(@OriginalArg(1) int arg0) {
		Static195.anInt3964 = -1;
		Static297.anInt5698 = arg0;
		Static273.anInt5198 = -1;
		Static22.method502();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public static void method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static102.anIntArray211[arg1] = arg0;
		@Pc(21) Class14_Sub38 local21 = (Class14_Sub38) Static279.aClass25_28.method691((long) arg1);
		if (local21 == null) {
			local21 = new Class14_Sub38(Static168.method3300() + 500L);
			Static279.aClass25_28.method687((long) arg1, local21);
		} else {
			local21.aLong206 = Static168.method3300() + 500L;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method5554() {
		@Pc(10) String local10 = "www";
		if (anInt6208 != 0) {
			local10 = "www-wtqa";
		}
		@Pc(19) String local19 = "";
		if (Static323.aString38 != null) {
			local19 = "/p=" + Static323.aString38;
		}
		return Static45.anInt1136 == 1 ? "http://" + local10 + ".stellardawn.com/l=" + Static201.anInt4054 + "/a=" + Static74.anInt5346 + local19 + "/" : "http://" + local10 + ".runescape.com/l=" + Static201.anInt4054 + "/a=" + Static74.anInt5346 + local19 + "/";
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Lclient!ps;")
	public static Class14_Sub2_Sub18 method5556(@OriginalArg(1) int arg0) {
		@Pc(10) Class14_Sub2_Sub18 local10 = (Class14_Sub2_Sub18) Static281.aClass11_124.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static252.aClass143_93.method3745(26, arg0);
		local10 = new Class14_Sub2_Sub18();
		if (local20 != null) {
			local10.method4413(new Class14_Sub4(local20));
		}
		Static281.aClass11_124.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIB)I")
	public static int method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
