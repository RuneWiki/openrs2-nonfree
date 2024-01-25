import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public static int anInt93;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_4 = new Class119(100, 14);

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Z")
	public static final boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_1 = new Class217(46, 7);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILclient!eh;Lclient!eh;)V")
	public static void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub4 arg3, @OriginalArg(4) Class7_Sub4 arg4) {
		@Pc(4) Class118 local4 = Static450.method5835(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass7_Sub4_2 = arg3;
			local4.aClass7_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method43() {
		Static166.aClass172_6.V(Static451.anInt7607, Static374.aClass20_Sub1_1.aBoolean190 ? Static119.anInt2533 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method44(@OriginalArg(0) int arg0) {
		Static172.anInt3456 = 1000 / arg0;
	}
}
