import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!jia", name = "i", descriptor = "Lclient!qc;")
	public static Class2_Sub13_Sub3 aClass2_Sub13_Sub3_3;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
	public static boolean method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static437.method5996(arg0, arg1) || Static293.method4047(arg0, arg1);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!rea;)[I")
	public static int[] method3748(@OriginalArg(1) Class2_Sub40 arg0) {
		@Pc(10) Class2_Sub22 local10 = new Class2_Sub22(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8537(10);
		local10.method8552(local13[0]);
		local10.method8552(local13[1]);
		local10.method8552(local13[2]);
		local10.method8552(local13[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local10.method8552((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8500((int) (Math.random() * 9.9999999E7D));
		local10.method8493(Static475.aBigInteger6, Static171.aBigInteger3);
		arg0.aClass2_Sub22_Sub2_2.method8508(0, local10.anInt10247, local10.aByteArray115);
		return local13;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(II)V")
	public static void method3754(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub4 local12 = Static566.method7763(arg0, 4);
		local12.method669();
	}
}
