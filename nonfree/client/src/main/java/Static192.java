import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
	public static int anInt3229;

	@OriginalMember(owner = "client!gja", name = "k", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_64 = new Class216(37, -1);

	@OriginalMember(owner = "client!gja", name = "t", descriptor = "I")
	public static int anInt3237 = 0;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BIIII)V")
	public static void method2986(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static527.anInt8177 = arg0;
		Static257.anInt4172 = arg1;
		Static472.anInt7503 = 0;
		Static73.anInt1542 = 0;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IZ[B)V")
	public static void method2988(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static200.aClass4_Sub11_6 == null) {
			Static200.aClass4_Sub11_6 = new Class4_Sub11(20000);
		}
		Static200.aClass4_Sub11_6.method8824(arg1, arg1.length, 0);
		if (!arg0) {
			return;
		}
		Static679.method9004(Static200.aClass4_Sub11_6.aByteArray107);
		Static382.aClass22_Sub1Array1 = new Class22_Sub1[Static180.anInt9918];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static288.anInt4570; local33 <= Static362.anInt5464; local33++) {
			@Pc(39) Class22_Sub1 local39 = Static271.method3931(local33);
			if (local39 != null) {
				Static382.aClass22_Sub1Array1[local31++] = local39;
			}
		}
		Static512.aBoolean628 = false;
		Static134.aLong84 = Static429.method5935();
		Static200.aClass4_Sub11_6 = null;
	}
}
