import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "Lclient!ar;")
	public static Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_82 = new Class117(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)Lclient!sd;")
	public static Class182 method4263(@OriginalArg(1) int arg0) {
		@Pc(10) Class182 local10 = (Class182) Static168.aClass26_30.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static61.aClass144_22.method3896(arg0, 35);
		local10 = new Class182();
		if (local20 != null) {
			local10.method4713(new Class11_Sub25(local20));
		}
		local10.method4714();
		Static168.aClass26_30.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIBIIIIII)V")
	public static void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class11_Sub44 local7 = new Class11_Sub44();
		local7.anInt6686 = arg1;
		local7.anInt6683 = arg8;
		local7.anInt6684 = arg7;
		local7.anInt6677 = arg3;
		local7.anInt6685 = arg0;
		local7.anInt6678 = arg9;
		local7.anInt6679 = arg6;
		local7.anInt6687 = arg4;
		local7.anInt6688 = arg10;
		local7.anInt6682 = arg11;
		local7.anInt6671 = arg5;
		local7.anInt6672 = arg2;
		Static90.aClass16_38.method190(local7);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	public static void method4265() {
		@Pc(5) Class26 local5 = Static114.aClass26_18;
		synchronized (Static114.aClass26_18) {
			Static114.aClass26_18.method333();
		}
	}
}
