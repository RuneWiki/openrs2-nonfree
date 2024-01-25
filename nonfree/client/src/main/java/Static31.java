import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_23 = new Class197(2, 4, 4, 0);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!io;")
	public static Class184 method7997(@OriginalArg(0) Component arg0) {
		return new Class184_Sub1(arg0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public static void method8010() throws Exception_Sub1 {
		if (Static240.anInt10701 == 1) {
			Static614.aClass145_14.method9644(Static15.anInt227, Static368.anInt5900);
		} else {
			Static614.aClass145_14.method9644(0, 0);
		}
	}
}
