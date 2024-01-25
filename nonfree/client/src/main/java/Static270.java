import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_81 = new Class287(30, 7);

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "S")
	public static short aShort60 = 205;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
	public static int anInt5118 = 0;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "F")
	public static float aFloat122 = 0.25F;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!bea;[BII)Lclient!sm;")
	public static Class305 method4103(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static535.anIntArray537, 0);
		if (Static535.anIntArray537[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class305(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BLclient!ie;)V")
	public static void method4105(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(9) int local9 = arg0.method6832();
		Static421.aClass22Array1 = new Class22[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static421.aClass22Array1[local14] = new Class22();
			Static421.aClass22Array1[local14].anInt216 = arg0.method6832();
			Static421.aClass22Array1[local14].aString11 = arg0.method6797();
		}
		Static229.anInt4664 = arg0.method6832();
		Static467.anInt8130 = arg0.method6832();
		Static291.anInt5439 = arg0.method6832();
		Static23.aClass48_Sub1Array1 = new Class48_Sub1[Static467.anInt8130 + 1 - Static229.anInt4664];
		for (@Pc(67) int local67 = 0; local67 < Static291.anInt5439; local67++) {
			@Pc(73) int local73 = arg0.method6832();
			@Pc(81) Class48_Sub1 local81 = Static23.aClass48_Sub1Array1[local73] = new Class48_Sub1();
			local81.anInt1521 = arg0.method6814();
			local81.anInt1523 = arg0.method6816();
			local81.anInt1533 = local73 + Static229.anInt4664;
			local81.aString31 = arg0.method6797();
			local81.aString30 = arg0.method6797();
		}
		Static410.anInt7373 = arg0.method6816();
		Static244.aBoolean313 = true;
	}
}
