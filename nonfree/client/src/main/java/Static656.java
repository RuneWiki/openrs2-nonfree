import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_68 = new Class22(4);

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!saa;")
	public static final Class327 aClass327_6 = new Class327();

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public static int anInt11250 = 0;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
	public static final boolean aBoolean799 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!gh;I)V")
	public static void method9621(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub2 arg0) {
		for (@Pc(10) Class2_Sub12 local10 = (Class2_Sub12) Static148.aClass271_11.method7177(); local10 != null; local10 = (Class2_Sub12) Static148.aClass271_11.method7175()) {
			if (arg0 == local10.aClass15_Sub3_Sub3_Sub1_Sub2_2) {
				if (local10.aClass2_Sub26_Sub5_1 != null) {
					Static270.aClass2_Sub26_Sub4_2.method7390(local10.aClass2_Sub26_Sub5_1);
					local10.aClass2_Sub26_Sub5_1 = null;
				}
				local10.method9825();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method9623() {
		if (Static587.aFileOutputStream1 != null) {
			try {
				Static587.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static587.aFileOutputStream1 = null;
	}
}
