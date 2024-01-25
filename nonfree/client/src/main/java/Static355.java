import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!os", name = "wb", descriptor = "[[Lclient!jda;")
	public static Class142[][] aClass142ArrayArray1;

	@OriginalMember(owner = "client!os", name = "yc", descriptor = "Lclient!n;")
	public static Interface12 anInterface12_14;

	@OriginalMember(owner = "client!os", name = "Ed", descriptor = "Lclient!ua;")
	public static Class2_Sub44 aClass2_Sub44_1;

	@OriginalMember(owner = "client!os", name = "Ud", descriptor = "I")
	public static int anInt6705;

	@OriginalMember(owner = "client!os", name = "Mb", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_133 = new Class239(105, 0);

	@OriginalMember(owner = "client!os", name = "je", descriptor = "[I")
	public static int[] anIntArray514 = new int[1];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5747(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static62.aClass53_20.anInt1684 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static464.aClass115_1.anInt3310; local18++) {
			@Pc(25) Class300 local25 = Static464.aClass115_1.method2970(local18);
			if ((!arg0 || local25.aBoolean643) && local25.anInt8920 == -1 && local25.anInt8921 == -1 && local25.anInt8890 == 0 && local25.aString197.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static206.aShortArray70 = null;
					Static319.anInt5969 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(72) short[] local72 = new short[local14.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local16; local74++) {
						local72[local74] = local14[local74];
					}
					local14 = local72;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static206.aShortArray70 = local14;
		Static319.anInt5969 = local16;
		Static155.anInt2821 = 0;
		@Pc(116) String[] local116 = new String[Static319.anInt5969];
		for (@Pc(118) int local118 = 0; local118 < Static319.anInt5969; local118++) {
			local116[local118] = Static464.aClass115_1.method2970(local14[local118]).aString197;
		}
		Static260.method4054(local116, Static206.aShortArray70);
		Static62.aClass53_20.method1618();
		Static62.aClass53_20.anInt1684 = 2;
	}
}
