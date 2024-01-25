import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3066 = 0;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	public static void method3234() {
		@Pc(5) Class70 local5 = Static340.aClass70_20;
		synchronized (Static340.aClass70_20) {
			Static340.aClass70_20.method1397(5);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)Lclient!bh;")
	public static Class18 method3235(@OriginalArg(0) int arg0) {
		@Pc(5) Class70 local5 = Static184.aClass70_62;
		@Pc(14) Class18 local14;
		synchronized (Static184.aClass70_62) {
			local14 = (Class18) Static184.aClass70_62.method1396((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static262.aClass53_119.method1033(Static212.method3771(arg0), Static6.method122(arg0));
		local14 = new Class18();
		local14.anInt394 = arg0;
		if (local34 != null) {
			local14.method366(new Class6_Sub10(local34));
		}
		local14.method362();
		@Pc(57) Class70 local57 = Static184.aClass70_62;
		synchronized (Static184.aClass70_62) {
			Static184.aClass70_62.method1406(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!pf;")
	public static Class44_Sub4 method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class214 local14 = local7.aClass214_19; local14 != null; local14 = local14.aClass214_21) {
			@Pc(18) Class44_Sub4 local18 = local14.aClass44_Sub4_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort90 == arg1 && local18.aShort89 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	public static void method3238() {
		if (Static210.aBoolean290) {
			return;
		}
		Static110.method2221(Static321.aClass187ArrayArrayArray3);
		if (Static287.aClass187ArrayArrayArray2 != null) {
			Static110.method2221(Static287.aClass187ArrayArrayArray2);
		}
		Static210.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
	public static void method3240() {
		Static322.aClass70_90.method1397(5);
		Static309.aClass70_100.method1397(5);
	}
}
