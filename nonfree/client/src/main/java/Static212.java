import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!nba;")
	public static final Class231 aClass231_3 = new Class231();

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
	public static final int[] anIntArray330 = new int[1];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JILclient!pu;IZIII)V")
	public static void method3331(@OriginalArg(0) long arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static290.anInt5018 = 10000;
		Static11.anInt142 = 1;
		Static61.anInt1177 = arg3;
		Static181.anInt3185 = 10000;
		Static24.anInt314 = 0;
		Static403.anInt7063 = arg2;
		Static500.aClass270_114 = arg1;
		Static240.aLong129 = arg0;
		Static243.aBoolean335 = false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lclient!su;")
	public static Class1_Sub6_Sub16 method3332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(27) Class1_Sub6_Sub16 local27 = (Class1_Sub6_Sub16) Static136.aClass187_13.method3797((long) arg0 << 32 | (long) arg1);
		if (local27 == null) {
			local27 = new Class1_Sub6_Sub16(arg0, arg1);
			Static136.aClass187_13.method3795(local27, local27.aLong301);
		}
		return local27;
	}
}
