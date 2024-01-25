import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "Lclient!fv;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
	public static int anInt5464;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
	public static int anInt5465;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_6 = new Class266(10, 8);

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
	public static int anInt5466 = 0;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)V")
	public static void method4543(@OriginalArg(1) int arg0) {
		for (@Pc(3) Class2 local3 = Static297.aClass222_20.method5474(); local3 != null; local3 = Static297.aClass222_20.method5472()) {
			if ((long) arg0 == (local3.aLong287 >> 48 & 0xFFFFL)) {
				local3.method8599();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;BIZLjava/lang/String;)V")
	public static void method4544(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class2_Sub50 local6 = Static79.method7505();
		local6.aClass2_Sub34_Sub2_2.method6894(Static10.aClass295_9.anInt8334);
		local6.aClass2_Sub34_Sub2_2.method6854(0);
		@Pc(21) int local21 = local6.aClass2_Sub34_Sub2_2.anInt8188;
		local6.aClass2_Sub34_Sub2_2.method6854(629);
		@Pc(32) int[] local32 = Static317.method4792(local6);
		@Pc(36) int local36 = local6.aClass2_Sub34_Sub2_2.anInt8188;
		local6.aClass2_Sub34_Sub2_2.method6918(arg0);
		local6.aClass2_Sub34_Sub2_2.method6854(Static619.anInt10076);
		local6.aClass2_Sub34_Sub2_2.method6918(arg3);
		local6.aClass2_Sub34_Sub2_2.method6871(Static541.aLong249);
		local6.aClass2_Sub34_Sub2_2.method6894(Static377.anInt6756);
		local6.aClass2_Sub34_Sub2_2.method6894(Static499.aClass63_15.anInt1690);
		Static195.method7971(local6.aClass2_Sub34_Sub2_2);
		@Pc(75) String local75 = Static484.aString76;
		local6.aClass2_Sub34_Sub2_2.method6894(local75 == null ? 0 : 1);
		if (local75 != null) {
			local6.aClass2_Sub34_Sub2_2.method6918(local75);
		}
		local6.aClass2_Sub34_Sub2_2.method6894(arg1);
		local6.aClass2_Sub34_Sub2_2.method6894(arg2 ? 1 : 0);
		local6.aClass2_Sub34_Sub2_2.anInt8188 += 7;
		local6.aClass2_Sub34_Sub2_2.method6892(local6.aClass2_Sub34_Sub2_2.anInt8188, local32, local36);
		local6.aClass2_Sub34_Sub2_2.method6862(local6.aClass2_Sub34_Sub2_2.anInt8188 - local21);
		Static311.method4754(local6);
		Static310.anInt5674 = 0;
		Static232.anInt7424 = -3;
		Static541.anInt9024 = 0;
		Static538.anInt8988 = 1;
		if (arg1 < 13) {
			Static447.aBoolean596 = true;
			Static472.method6793();
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
	public static int method4545() {
		return Static244.anInt4841 == 1 ? Static183.anInt4032 : 0;
	}
}
