import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_191 = new Class214(73, -1);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Z")
	public static boolean method5055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method5057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static321.anInt5401 = arg2;
		Static371.anInt6435 = arg1;
		Static168.anInt3287 = arg0;
		Static131.anInt2068 = arg3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
	public static void method5058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class169 local9 = Static195.aClass169ArrayArray2[arg0][arg1];
		if (local9 != null) {
			Static11.anInt208 = local9.anInt5002;
			Static221.anInt4446 = local9.anInt5011;
			Static129.anInt2664 = local9.anInt5014;
		}
		Static242.method4026();
	}
}
