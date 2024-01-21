import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_2;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt730;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!ff;")
	public static Class26 aClass26_3;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public static int[] anIntArray128 = new int[2000];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_221 = Static129.method2060("b12_full");

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!r;")
	private static Class61 aClass61_223 = Static129.method2060("Loaded interfaces");

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_222 = aClass61_223;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!r;")
	public static Class61 aClass61_224 = Static129.method2060("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_225 = Static129.method2060("(U0a )2 via: ");

	@OriginalMember(owner = "client!de", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIBILclient!jf;I)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26_Sub1 arg5) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg4);
		@Pc(21) Class5_Sub2_Sub4 local21 = (Class5_Sub2_Sub4) Static100.aClass20_10.method656(local15);
		if (local21 != null) {
			return;
		}
		local21 = (Class5_Sub2_Sub4) Static65.aClass20_7.method656(local15);
		if (local21 != null) {
			return;
		}
		local21 = (Class5_Sub2_Sub4) Static23.aClass20_2.method656(local15);
		if (local21 == null) {
			if (!arg1) {
				local21 = (Class5_Sub2_Sub4) Static29.aClass20_4.method656(local15);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class5_Sub2_Sub4();
			local21.aClass26_Sub1_4 = arg5;
			local21.aByte2 = arg3;
			local21.anInt895 = arg2;
			if (arg1) {
				Static100.aClass20_10.method647(local21, local15);
				Static50.anInt1257++;
			} else {
				Static67.aClass83_2.method2202(local21);
				Static23.aClass20_2.method647(local21, local15);
				Static113.anInt2957++;
			}
		} else if (arg1) {
			local21.method2172();
			Static100.aClass20_10.method647(local21, local15);
			Static113.anInt2957--;
			Static50.anInt1257++;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method509() {
		aClass26_3 = null;
		aClass61_224 = null;
		aClass61_225 = null;
		aClass61_223 = null;
		aClass61_221 = null;
		anIntArray127 = null;
		anIntArray128 = null;
		aClass61_222 = null;
		aClass5_Sub2_Sub1_Sub4_2 = null;
		aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!kb;")
	public static Class36 method512(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class36_Sub2");
			@Pc(18) Class36 local18 = (Class36) local6.getDeclaredConstructor().newInstance();
			local18.method1761(arg2, arg1, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class36_Sub1 local31 = new Class36_Sub1();
			local31.method1761(arg2, arg1, arg0);
			return local31;
		}
	}
}
