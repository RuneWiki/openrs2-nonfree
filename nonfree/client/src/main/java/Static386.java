import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Z")
	public static boolean aBoolean722;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public static int anInt8408;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!gaa;I)V")
	public static void method6952(@OriginalArg(0) int arg0, @OriginalArg(2) Class108 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray8 != null) {
			@Pc(13) Class3_Sub51 local13 = new Class3_Sub51();
			local13.anObjectArray33 = arg1.anObjectArray8;
			local13.aClass108_13 = arg1;
			Static84.method2222(local13);
		}
		Static548.anInt9367 = arg1.anInt4028;
		Static461.anInt8388 = arg1.anInt4043;
		Static607.anInt10027 = arg2;
		Static159.anInt3866 = arg0;
		Static82.aBoolean192 = true;
		Static33.anInt612 = arg1.anInt4083;
		Static60.anInt1272 = arg1.anInt4059;
		Static287.anInt5894 = arg1.anInt4089;
		Static139.method3135(arg1);
	}
}
