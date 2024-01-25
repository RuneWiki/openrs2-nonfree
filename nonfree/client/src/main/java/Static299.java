import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V")
	public static void method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class28_Sub6 local7 = new Class28_Sub6();
		local7.anInt8395 = arg5;
		local7.anInt8386 = arg4;
		local7.aString102 = arg6;
		local7.anInt8387 = arg2;
		local7.anInt8390 = arg1;
		local7.anInt8392 = Static588.anInt9467 + arg0;
		local7.anInt8385 = arg3;
		Static476.aClass371_4.method8908(local7);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method4616(@OriginalArg(0) Class13 arg0) {
		if (Static609.aBoolean752) {
			Static289.method4553(arg0);
		} else {
			Static615.method8695(arg0);
		}
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)I")
	public static int method4618() {
		return Static76.anInt1404 == 1 ? Static454.anInt5692 : Static519.anInt8360;
	}
}
