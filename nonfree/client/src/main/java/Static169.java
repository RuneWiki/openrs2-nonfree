import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!ga;")
	public static Class30 aClass30_60;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_7;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1570 = method2903("Select a world");

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1571 = method2903("(U5");

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1572 = method2903("Hier wechseln");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public static final int anInt4118 = 0;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1573 = aClass23_1570;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt4122 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public static void method2899() {
		@Pc(1) Object local1 = Static110.anObject1;
		synchronized (Static110.anObject1) {
			if (Static60.anInt4358 != 0) {
				Static60.anInt4358 = 1;
				try {
					Static110.anObject1.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!fe;")
	public static Class1_Sub1_Sub8 method2900(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub1_Sub8 local17 = (Class1_Sub1_Sub8) Static156.aClass79_24.method2657((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static76.aClass30_30.method1301(16, arg0);
		local17 = new Class1_Sub1_Sub8();
		if (local27 != null) {
			local17.method782(new Class1_Sub8(local27));
		}
		Static156.aClass79_24.method2658((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method2901() {
		aClass1_Sub1_Sub12_Sub1_7 = null;
		aClass30_60 = null;
		aClass23_1570 = null;
		aClass23_1572 = null;
		aClass23_1573 = null;
		aClass23_1571 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZZ)I")
	public static int method2902() {
		return Static163.anInt4013 + Static181.anInt4353;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!ed;")
	public static Class23 method2903(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = local6.length;
		@Pc(15) Class23 local15 = new Class23();
		local15.aByteArray10 = new byte[local11];
		while (local11 > local8) {
			@Pc(27) int local27 = local6[local8++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local8 >= local11) {
					break;
				}
				@Pc(63) int local63 = local6[local8++] & 0xFF;
				local15.aByteArray10[local15.anInt1053++] = (byte) (local63 + local27 * 43 - 48 - 1720);
			} else if (local27 != 0) {
				local15.aByteArray10[local15.anInt1053++] = (byte) local27;
			}
		}
		local15.method664();
		return local15.method665();
	}
}
