import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_78 = new Class44(46, 3);

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!pc;)V")
	public static void method4674(@OriginalArg(1) Class188 arg0) {
		Static406.anInt7051 = arg0.method4279("titlebg");
		Static223.anInt4252 = arg0.method4279("logo");
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	public static void method4675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(0, 15);
		local8.method434();
		local8.anInt657 = arg1;
		local8.anInt656 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!dm;I)Lclient!kf;")
	public static Class134 method4678(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		@Pc(13) Class134 local13;
		if (Static417.aClass134_3 == null) {
			local13 = new Class134();
		} else {
			local13 = Static417.aClass134_3;
			Static417.aClass134_3 = Static417.aClass134_3.aClass134_2;
			local13.aClass134_2 = null;
			Static160.anInt3172--;
		}
		local13.anInt3955 = arg0;
		local13.aClass4_Sub2_1 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method4679(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg1, 3);
		local8.method434();
		local8.aString2 = arg0;
	}
}
