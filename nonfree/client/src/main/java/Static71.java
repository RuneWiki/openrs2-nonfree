import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!lm;")
	public static Class134 aClass134_31;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt1495;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "Lclient!fh;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!lq;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1254() {
		Static283.anIntArray555 = null;
		Static268.aByteArrayArrayArray10 = null;
		Static44.anIntArray68 = null;
		Static276.anIntArrayArrayArray12 = null;
		Static338.anIntArray660 = null;
		Static334.aByteArrayArrayArray12 = null;
		Static100.aByteArrayArrayArray4 = null;
		Static44.anIntArray69 = null;
		Static192.anIntArray381 = null;
		Static228.aByteArrayArrayArray7 = null;
		Static48.anIntArray72 = null;
		Static47.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1255(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static112.aClass220_1);
		arg0.addMouseMotionListener(Static112.aClass220_1);
		arg0.addFocusListener(Static112.aClass220_1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BI)Z")
	public static boolean method1256(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub21 local8 = new Class1_Sub21(arg0);
		@Pc(12) int local12 = local8.method5720();
		if (local12 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method5720() == 1;
		if (local35) {
			Static38.method2705(local8);
		}
		Static312.method5357(local8);
		return true;
	}
}
