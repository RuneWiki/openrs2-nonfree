import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!sg;")
	public static Class97 aClass97_4;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt644;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!nn;")
	public static Class11_Sub4_Sub12 method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class11_Sub4_Sub12 local15 = (Class11_Sub4_Sub12) Static186.aClass58_17.method1009((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class11_Sub4_Sub12(arg0, arg1);
			Static186.aClass58_17.method1006(local15.aLong215, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	public static void method513() {
		@Pc(5) Class26 local5 = Static34.aClass26_4;
		synchronized (Static34.aClass26_4) {
			Static34.aClass26_4.method329(5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	public static int method514() {
		return 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)C")
	public static char method516(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(41) char local41 = Static102.aCharArray2[local12 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local12 = local41;
		}
		return (char) local12;
	}
}
