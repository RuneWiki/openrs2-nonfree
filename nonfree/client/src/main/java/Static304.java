import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kia", name = "F", descriptor = "[[B")
	public static final byte[][] aByteArrayArray29 = new byte[250][];

	@OriginalMember(owner = "client!kia", name = "I", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!kia", name = "N", descriptor = "I")
	public static int anInt5326 = 0;

	@OriginalMember(owner = "client!kia", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "(B)Z")
	public static boolean method4463() {
		@Pc(7) boolean local7 = true;
		if (Static73.aClass356_1 == null) {
			if (Static666.aClass386_141.method9206(Static381.anInt6971)) {
				Static73.aClass356_1 = Static688.method8622(Static666.aClass386_141, Static381.anInt6971);
			} else {
				local7 = false;
			}
		}
		if (Static533.aClass356_2 == null) {
			if (Static666.aClass386_141.method9206(Static192.anInt3589)) {
				Static533.aClass356_2 = Static688.method8622(Static666.aClass386_141, Static192.anInt3589);
			} else {
				local7 = false;
			}
		}
		if (Static580.aClass356_3 == null) {
			if (Static666.aClass386_141.method9206(Static10.anInt64)) {
				Static580.aClass356_3 = Static688.method8622(Static666.aClass386_141, Static10.anInt64);
			} else {
				local7 = false;
			}
		}
		if (Static130.aClass158_5 == null) {
			if (Static329.aClass386_78.method9206(Static655.anInt10935)) {
				Static130.aClass158_5 = Static527.method7557(Static329.aClass386_78, Static655.anInt10935);
			} else {
				local7 = false;
			}
		}
		if (Static245.aClass356Array5 == null) {
			if (Static666.aClass386_141.method9206(Static655.anInt10935)) {
				Static245.aClass356Array5 = Static688.method8616(Static666.aClass386_141, Static655.anInt10935);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "(II)V")
	public static void method4465(@OriginalArg(1) int arg0) {
		Static224.anInt4178 = arg0;
		@Pc(10) Class264 local10 = Static566.aClass264_56;
		synchronized (Static566.aClass264_56) {
			Static566.aClass264_56.method6360();
		}
	}
}
