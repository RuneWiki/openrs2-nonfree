import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!jd;")
	public static Class36 aClass36_22;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array4;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!pa;")
	public static Class51 aClass51_16;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Z")
	public static final boolean aBoolean51 = false;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_381 = Static2.method66(": ");

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_382 = Static2.method66("Lade Sprites )2 ");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_383 = Static2.method66("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public static int anInt832 = 0;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[1000][];

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_384 = Static2.method66("chatback");

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!ke;")
	private static Class39 aClass39_385 = Static2.method66("as it was used to break our rules)3");

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_386 = aClass39_385;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public static final int anInt837 = 5063219;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
	public static int[] anIntArray91 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public static int anInt838 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method567() {
		if (Static105.aClass29_1 != null) {
			@Pc(3) Class29 local3 = Static105.aClass29_1;
			synchronized (Static105.aClass29_1) {
				Static105.aClass29_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI)V")
	public static void method568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class2_Sub1_Sub14 local16 = (Class2_Sub1_Sub14) Static56.aClass57_1.method1678(local10);
		if (local16 != null) {
			Static102.aClass28_2.method822(local16);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method569() {
		aClass36_22 = null;
		aClass39_381 = null;
		aClass39_386 = null;
		aByteArrayArray4 = null;
		anIntArray90 = null;
		aClass39_384 = null;
		aClass51_16 = null;
		aClass39_383 = null;
		aClass39_382 = null;
		aClass2_Sub1_Sub4_Sub2Array4 = null;
		aClass39_385 = null;
		anIntArray91 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!jd;)[B")
	public static byte[] method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3) {
		@Pc(23) long local23 = (long) (arg1 + arg0 * 37 & 0xFFFF) + ((long) arg2 << 32) + ((long) (arg0 << 16));
		if (Static86.aClass54_25 != null) {
			@Pc(31) Class2_Sub1_Sub9 local31 = (Class2_Sub1_Sub9) Static86.aClass54_25.method1634(local23);
			if (local31 != null) {
				return local31.aByteArray15;
			}
		}
		@Pc(42) byte[] local42 = arg3.method1761(arg0, arg1);
		if (local42 == null) {
			return null;
		} else {
			if (Static86.aClass54_25 != null) {
				Static86.aClass54_25.method1637(local23, new Class2_Sub1_Sub9(local42));
			}
			return local42;
		}
	}
}
