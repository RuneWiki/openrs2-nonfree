import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!jg;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public static int anInt5408;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public static int anInt5405 = 0;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Ljava/lang/String;")
	public static final String aString192 = "wave2:";

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	public static void method4551() {
		Static177.aClass162_1 = new Class162(8);
		Static60.anInt1277 = 0;
		for (@Pc(25) Class8_Sub5 local25 = (Class8_Sub5) Static223.aClass65_7.method1462(); local25 != null; local25 = (Class8_Sub5) Static223.aClass65_7.method1461()) {
			local25.method3577();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!sj;)Lclient!sj;")
	public static Class181 method4552(@OriginalArg(1) Class181 arg0) {
		if (arg0.anInt5734 != -1) {
			return Static20.method415(arg0.anInt5734);
		}
		@Pc(26) int local26 = arg0.anInt5761 >>> 16;
		@Pc(31) Class60 local31 = new Class60(Static188.aClass24_21);
		for (@Pc(36) Class3_Sub32 local36 = (Class3_Sub32) local31.method1271(); local36 != null; local36 = (Class3_Sub32) local31.method1274()) {
			if (local36.anInt4348 == local26) {
				return Static20.method415((int) local36.aLong211);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Lclient!qr;")
	public static Class170 method4553(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static56.aClass198_15;
		@Pc(14) Class170 local14;
		synchronized (Static56.aClass198_15) {
			local14 = (Class170) Static56.aClass198_15.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static74.aClass100_29.method2319(Static188.method3394(arg0), Static6.method5168(arg0));
		local14 = new Class170();
		local14.anInt5232 = arg0;
		if (local34 != null) {
			local14.method4418(new Class3_Sub4(local34));
		}
		local14.method4407();
		if (local14.aBoolean314) {
			local14.anInt5211 = 0;
			local14.aBoolean303 = false;
		}
		if (!Static111.aBoolean122 && local14.aBoolean304) {
			local14.aStringArray33 = null;
			local14.anIntArray422 = null;
		}
		@Pc(75) Class198 local75 = Static56.aClass198_15;
		synchronized (Static56.aClass198_15) {
			Static56.aClass198_15.method5231((long) arg0, local14);
			return local14;
		}
	}
}
