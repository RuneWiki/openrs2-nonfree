import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!ur;")
	public static final Class377 aClass377_3 = new Class377();

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[200];

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
	public static void method8264(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg2.length() > 320 || !Static137.method2243()) {
			return;
		}
		Static276.method4225();
		Static707.anInt11053 = arg0;
		Static715.aString107 = arg2;
		Static321.aString95 = arg1;
		Static638.method8657(6);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIBI)[B")
	public static byte[] method8266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) byte[] local16 = new byte[arg1];
		Static735.method9185(arg0, arg2, local16, 0, arg1);
		return local16;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)Lclient!bh;")
	public static Class3_Sub4_Sub2 method8267() {
		@Pc(10) Class3_Sub4_Sub2 local10 = (Class3_Sub4_Sub2) Static102.aClass283_3.method7031();
		if (local10 != null) {
			local10.method9446();
			local10.method8848();
			return local10;
		}
		do {
			local10 = (Class3_Sub4_Sub2) Static515.aClass283_11.method7031();
			if (local10 == null) {
				return null;
			}
			if (local10.method631() > Static626.method8479()) {
				return null;
			}
			local10.method9446();
			local10.method8848();
		} while ((Long.MIN_VALUE & local10.aLong363) == 0L);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(BI)V")
	public static void method8269(@OriginalArg(1) int arg0) {
		Static217.anInt4229 = arg0;
		Static526.aClass338_44.method8051();
	}
}
