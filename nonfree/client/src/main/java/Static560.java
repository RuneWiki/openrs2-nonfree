import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
	public static int anInt9754 = 0;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
	public static int anInt9756 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	public static void method7664(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class3_Sub30 local10 = (Class3_Sub30) Static407.aClass244_54.method5572(); local10 != null; local10 = (Class3_Sub30) Static407.aClass244_54.method5576()) {
			if (local10.aClass3_Sub16_Sub2_2 != null) {
				Static354.aClass3_Sub16_Sub4_2.method7757(local10.aClass3_Sub16_Sub2_2);
				local10.aClass3_Sub16_Sub2_2 = null;
			}
			if (local10.aClass3_Sub16_Sub2_3 != null) {
				Static354.aClass3_Sub16_Sub4_2.method7757(local10.aClass3_Sub16_Sub2_3);
				local10.aClass3_Sub16_Sub2_3 = null;
			}
			local10.method8128();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class3_Sub30 local49 = (Class3_Sub30) Static483.aClass244_60.method5572(); local49 != null; local49 = (Class3_Sub30) Static483.aClass244_60.method5576()) {
			if (local49.aClass3_Sub16_Sub2_2 != null) {
				Static354.aClass3_Sub16_Sub4_2.method7757(local49.aClass3_Sub16_Sub2_2);
				local49.aClass3_Sub16_Sub2_2 = null;
			}
			local49.method8128();
		}
		for (@Pc(78) Class3_Sub30 local78 = (Class3_Sub30) Static66.aClass297_3.method6529(); local78 != null; local78 = (Class3_Sub30) Static66.aClass297_3.method6532()) {
			if (local78.aClass3_Sub16_Sub2_2 != null) {
				Static354.aClass3_Sub16_Sub4_2.method7757(local78.aClass3_Sub16_Sub2_2);
				local78.aClass3_Sub16_Sub2_2 = null;
			}
			local78.method8128();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!da;IIII)Lclient!ll;")
	public static Class190 method7667(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == null ? null : new Class190(arg2, arg3, arg1, arg0.K(), arg0.KA(), arg0.l(), arg0.J(), arg0.H(), arg0.OA(), arg0.za());
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBLclient!ri;)Lclient!ba;")
	public static Class3_Sub7_Sub1 method7669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class284 arg2) {
		@Pc(14) Class3_Sub26 local14 = new Class3_Sub26(arg2.method6331(arg0, arg1));
		@Pc(45) Class3_Sub7_Sub1 local45 = new Class3_Sub7_Sub1(arg1, local14.method6786(), local14.method6786(), local14.method6816(), local14.method6816(), local14.method6814() == 1, local14.method6814(), local14.method6814());
		@Pc(58) int local58 = local14.method6814();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local45.aClass244_2.method5570(new Class3_Sub48(local14.method6814(), local14.method6811(), local14.method6811(), local14.method6811(), local14.method6811(), local14.method6811(), local14.method6811(), local14.method6811(), local14.method6811()));
		}
		local45.method331();
		return local45;
	}
}
