import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "Z")
	public static boolean aBoolean612;

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "Lclient!sj;")
	public static Class190 aClass190_4;

	@OriginalMember(owner = "client!uq", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray62 = new String[100];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method5330(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static298.method4991(local18) : local18;
		} else if (arg1 instanceof Class43) {
			@Pc(32) Class43 local32 = (Class43) arg1;
			return local32.method1471();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)Lclient!pe;")
	public static Class1_Sub4_Sub18 method5331(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub18 local10 = (Class1_Sub4_Sub18) Static225.aClass92_6.method2606((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static124.aClass216_43.method5648(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local10 = Static176.method3471(local22);
			Static225.aClass92_6.method2601((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)Lclient!wn;")
	public static Class1_Sub4_Sub21 method5332(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub21 local10 = (Class1_Sub4_Sub21) Static273.aClass92_8.method2606((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static256.aClass216_84.method5648(0, arg0);
		} else {
			local25 = Static187.aClass216_61.method5648(0, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub4_Sub21();
		if (local25 != null) {
			local10.method5642(new Class1_Sub8(local25));
		}
		if (arg0 >= 32768) {
			local10.method5635();
		}
		Static273.aClass92_8.method2601((long) arg0, local10);
		return local10;
	}
}
