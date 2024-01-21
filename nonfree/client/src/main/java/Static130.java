import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!ra;")
	public static Class72 aClass72_7;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public static int anInt3544;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_978 = Static158.method3034("Unable to find ");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!hc;")
	public static final Class32 aClass32_2 = new Class32();

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!ob;")
	public static Class60 aClass60_979 = aClass60_978;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_980 = Static158.method3034("<col=ffff00>*V");

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_981 = Static158.method3034("The server is being updated)3");

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!ob;")
	public static Class60 aClass60_982 = aClass60_981;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pe;III)Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 method2736(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static52.method1229(arg1, arg0, arg2) ? Static182.method3395() : null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!qe;I[B)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) Class2_Sub18 local15 = new Class2_Sub18();
		local15.aLong151 = arg0;
		local15.aByteArray43 = arg2;
		local15.aClass69_4 = arg1;
		local15.anInt3789 = 0;
		@Pc(30) Class67 local30 = Static99.aClass67_5;
		synchronized (Static99.aClass67_5) {
			Static99.aClass67_5.method2843(local15);
		}
		Static159.method3414();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public static int method2742(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
