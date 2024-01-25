import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!lb;")
	public static Class221 aClass221_97;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Lclient!bka;")
	public static Class9 aClass9_18;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_57 = new Class286(49, 8);

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static int anInt5896 = 0;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_107 = new Class186(71, 6);

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Z")
	public static boolean aBoolean473 = true;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
	public static boolean method5023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIILclient!wha;)V")
	public static void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19_Sub1_Sub5 arg3) {
		@Pc(4) Class262 local4 = Static512.method7319(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass19_Sub1_Sub5_1 = arg3;
		@Pc(19) int local19 = Static639.aClass313Array2 == Static711.aClass313Array3 ? 1 : 0;
		if (arg3.method9366()) {
			if (arg3.method9360()) {
				arg3.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local19];
				Static358.aClass19_Sub1Array2[local19] = arg3;
				return;
			}
			arg3.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local19];
			Static660.aClass19_Sub1Array5[local19] = arg3;
			Static70.aBoolean89 = true;
			return;
		}
		arg3.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local19];
		Static634.aClass19_Sub1Array4[local19] = arg3;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)Z")
	public static boolean method5025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
