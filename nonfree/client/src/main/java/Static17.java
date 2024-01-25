import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "Lclient!bca;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_13 = new Class239(85, 8);

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_4 = new Class249();

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_13 = new Class202(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;JIZ)V")
	public static void method506(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static83.method1623();
			if (Static47.aString24.equals("")) {
				Static55.anInt972 = 39;
				return;
			}
		}
		@Pc(19) Class2_Sub29 local19 = new Class2_Sub29(576);
		local19.method5172(10);
		local19.method5217((int) (Math.random() * 65535.0D));
		local19.method5192(arg1);
		local19.method5217(arg2 ? Static338.anInt6263 : Static224.anInt4041);
		local19.method5185((int) (Math.random() * (double) 99999999));
		local19.method5189(arg0);
		local19.method5185((int) (Math.random() * 9.9999999E7D));
		if (arg2) {
			local19.method5192(Static156.method2700(Static47.aString24));
			try {
				local19.method5192(Long.parseLong(Static316.aString128));
			} catch (@Pc(108) Exception local108) {
				Static55.anInt972 = 39;
				return;
			}
		} else {
			local19.method5185((int) (Math.random() * 9.9999999E7D));
			local19.method5185((int) (Math.random() * 9.9999999E7D));
			local19.method5185((int) (Math.random() * 9.9999999E7D));
			local19.method5185((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5185((int) (Math.random() * 9.9999999E7D));
		local19.method5195(Static509.aBigInteger6, Static285.aBigInteger5);
		Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
		Static381.aClass2_Sub29_Sub2_2.method5172(arg2 ? Static319.aClass117_12.anInt3345 : Static319.aClass117_9.anInt3345);
		Static381.aClass2_Sub29_Sub2_2.method5217(local19.anInt6132 + 28);
		Static381.aClass2_Sub29_Sub2_2.method5217(607);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static172.anInt6352);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static185.aClass212_1.anInt6307);
		Static135.method2426(Static381.aClass2_Sub29_Sub2_2);
		Static381.aClass2_Sub29_Sub2_2.method5221(local19.anInt6132, local19.aByteArray96);
		Static527.anInt9119 = 0;
		Static520.anInt1939 = 0;
		Static55.anInt972 = -3;
		Static378.anInt7010 = 1;
	}
}
