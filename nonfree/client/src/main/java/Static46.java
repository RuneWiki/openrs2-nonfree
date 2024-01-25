import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_27 = new Class198(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method1522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class88_Sub4 local7 = new Class88_Sub4();
		local7.anInt5025 = arg5;
		local7.anInt5024 = arg1;
		local7.anInt5022 = arg2;
		local7.aString56 = arg6;
		local7.anInt5029 = arg0;
		local7.anInt5031 = arg4;
		local7.anInt5030 = arg3 + Static85.anInt1536;
		Static107.aClass107_4.method2332(local7);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!gt;IIBII)Ljava/awt/Frame;")
	public static Frame method1526(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method2075()) {
			return null;
		}
		@Pc(20) Class146[] local20 = Static358.method4637(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg2 == local20[local28].anInt3802 && local20[local28].anInt3803 == arg3 && (!local26 || arg1 < local20[local28].anInt3804)) {
				local26 = true;
				arg1 = local20[local28].anInt3804;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(94) Class268 local94 = arg0.method2086(arg1, arg3, arg2);
		while (local94.anInt7420 == 0) {
			Static140.method2004(10L);
		}
		@Pc(106) Frame local106 = (Frame) local94.anObject10;
		if (local106 == null) {
			return null;
		} else if (local94.anInt7420 == 2) {
			Static218.method3704(arg0, local106);
			return null;
		} else {
			return local106;
		}
	}
}
