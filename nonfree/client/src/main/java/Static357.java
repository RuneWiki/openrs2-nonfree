import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_194 = new Class272(29, -2);

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIIII)V")
	public static void method5351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class3_Sub3_Sub7 local10 = Static363.method5457(arg2, 4);
		local10.method839();
		local10.anInt1091 = arg0;
		local10.anInt1086 = arg3;
		local10.anInt1088 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!qh;)Lclient!u;")
	public static Class94_Sub3 method5352(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) Class94 local7 = Static574.method7617(arg0);
		@Pc(11) int local11 = arg0.method3116();
		@Pc(15) int local15 = arg0.method3116();
		@Pc(19) int local19 = arg0.method3109();
		return new Class94_Sub3(local7.aClass300_13, local7.aClass140_15, local7.anInt8266, local7.anInt8265, local7.anInt8263, local7.anInt8262, local7.anInt8268, local7.anInt8269, local7.anInt8267, local11, local15, local19);
	}
}
