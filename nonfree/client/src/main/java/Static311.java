import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "Lclient!ub;")
	public static Class344 aClass344_5;

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
	public static int anInt5146;

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "Lclient!vr;")
	public static Class33 aClass33_12;

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "Lclient!vr;")
	public static Class33 aClass33_13;

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_117 = new Class180(61, -1);

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4738(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(37) int local37 = arg0.indexOf(" ", "directlogin ".length());
			if (local37 >= 0) {
				@Pc(42) int local42 = arg0.length();
				arg0 = arg0.substring(0, local37) + " ";
				for (@Pc(58) int local58 = local37 + 1; local58 < local42; local58++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)V")
	public static void method4739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub11_Sub4 local17 = Static583.method8201(14, (long) arg0);
		local17.method2195();
		local17.anInt2394 = arg1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BII)Z")
	public static boolean method4740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
