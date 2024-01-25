import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "Lclient!f;")
	public static Class39 aClass39_9;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_69 = new Class286(45, 1);

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_23 = new Class8();

	@OriginalMember(owner = "client!iga", name = "k", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
	public static void method3491() {
		@Pc(13) Class2_Sub16 local13 = (Class2_Sub16) Static445.aClass8_54.method210();
		@Pc(24) boolean local24 = Static288.aClass196_3 != null || Static36.anInt909 > 0;
		if (local24) {
			Static6.anInt294 = 1;
		}
		if (Static561.aBoolean709 && Static529.aClass177_10.method4001(81) && Static347.anInt6255 > 2) {
			if (local24) {
				Static122.aClass2_Sub5_1 = (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285.aClass2_285;
			} else {
				Static543.method7395(local13.method6005(), (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285.aClass2_285, local13.method6004());
			}
		} else if (local24) {
			Static122.aClass2_Sub5_1 = (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285;
		} else {
			Static543.method7395(local13.method6005(), (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285, local13.method6004());
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!rj;Z)V")
	public static void method3492(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class287 arg1) {
		while (true) {
			@Pc(10) Class347 local10 = arg1.method6550(arg0);
			while (local10.anInt9172 == 0) {
				Static459.method6498(10L);
			}
			if (local10.anInt9172 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static459.method6498(100L);
		}
	}
}
