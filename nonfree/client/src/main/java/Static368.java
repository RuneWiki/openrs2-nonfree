import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
	public static int anInt6234;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "[Lclient!hr;")
	public static Class103[] aClass103Array2;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_52 = new Class268(64);

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
	public static int anInt6235 = 0;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
	public static int anInt6236 = -1;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "Lclient!la;")
	public static final Class136 aClass136_171 = new Class136(6, 11);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nq;[Lclient!pb;B)Lclient!su;")
	public static Class230 method5128(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class184[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong175 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg1.length; local40++) {
			OpenGL.glAttachObjectARB(local33, arg1[local40].aLong175);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static68.anIntArray66, 0);
		if (Static68.anIntArray66[0] == 0) {
			if (Static68.anIntArray66[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static68.anIntArray66, 1);
			if (Static68.anIntArray66[1] > 1) {
				@Pc(96) byte[] local96 = new byte[Static68.anIntArray66[1]];
				OpenGL.glGetInfoLogARB(local33, Static68.anIntArray66[1], Static68.anIntArray66, 0, local96, 0);
				System.out.println(new String(local96));
			}
			if (Static68.anIntArray66[0] == 0) {
				for (@Pc(120) int local120 = 0; local120 < arg1.length; local120++) {
					OpenGL.glDetachObjectARB(local33, arg1[local120].aLong175);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class230(arg0, local33, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([FIB)[F")
	public static float[] method5129(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static466.method208(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)I")
	public static int method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg1 >> 31 & arg0 - 1;
		return (arg1 + (arg1 >>> 31)) % arg0 + local19;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	public static void method5132() {
		if (Static34.anInt3343 < 0) {
			Static280.anInt4669 = -1;
			Static34.anInt3343 = 0;
			Static82.anInt1486 = -1;
		}
		if (Static34.anInt3343 > Static211.anInt273) {
			Static82.anInt1486 = -1;
			Static280.anInt4669 = -1;
			Static34.anInt3343 = Static211.anInt273;
		}
		if (Static436.anInt7297 < 0) {
			Static436.anInt7297 = 0;
			Static82.anInt1486 = -1;
			Static280.anInt4669 = -1;
		}
		if (Static436.anInt7297 > Static211.anInt277) {
			Static280.anInt4669 = -1;
			Static82.anInt1486 = -1;
			Static436.anInt7297 = Static211.anInt277;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILclient!nq;II[BZ)Lclient!ld;")
	public static Class137_Sub1_Sub1 method5133(@OriginalArg(0) int arg0, @OriginalArg(3) Class167_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3) {
		if (arg1.aBoolean357 || Static94.method1600(arg0) && Static94.method1600(arg2)) {
			return new Class137_Sub1_Sub1(arg1, 3553, 6406, arg0, arg2, false, arg3, 6406);
		} else if (arg1.aBoolean365) {
			return new Class137_Sub1_Sub1(arg1, 34037, 6406, arg0, arg2, false, arg3, 6406);
		} else {
			return new Class137_Sub1_Sub1(arg1, 6406, arg0, arg2, Static342.method4774(arg0), Static342.method4774(arg2), arg3, 6406);
		}
	}
}
