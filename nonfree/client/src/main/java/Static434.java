import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
	public static int anInt10639;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	public static final int anInt10640 = 50;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "[I")
	public static final int[] anIntArray762 = new int[anInt10640];

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "[Lclient!oka;")
	public static final Class279[] aClass279Array6 = new Class279[anInt10640];

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "[I")
	public static final int[] anIntArray763 = new int[anInt10640];

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "[I")
	public static final int[] anIntArray764 = new int[anInt10640];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!ika;)Lclient!er;")
	public static Class104_Sub1 method9044(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(14) Class104 local14 = Static707.method9440(arg0);
		@Pc(18) int local18 = arg0.method2036();
		@Pc(22) int local22 = arg0.method2036();
		return new Class104_Sub1(local14.aClass223_11, local14.aClass352_11, local14.anInt8368, local14.anInt8366, local14.anInt8371, local14.anInt8367, local14.anInt8375, local14.anInt8365, local14.anInt8370, local18, local22);
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
	public static void method9045() {
		if (Static41.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static41.anApplet1.getParameter("cookiehost");
			@Pc(22) int local22 = (int) (Static517.method6965() / (long) 86400000) - 11745;
			@Pc(38) String local38 = "usrdob=" + local22 + "; version=1; path=/; domain=" + local13;
			Static728.method687(Static41.anApplet1, "document.cookie=\"" + local38 + "\"");
		} catch (@Pc(54) Throwable local54) {
		}
	}
}
