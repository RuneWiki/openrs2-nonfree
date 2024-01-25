import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public static void method6716() {
		for (@Pc(6) Class2_Sub12 local6 = (Class2_Sub12) Static158.aClass271_21.method7177(); local6 != null; local6 = (Class2_Sub12) Static158.aClass271_21.method7175()) {
			if (local6.aBoolean67) {
				local6.method1170();
			}
		}
		for (@Pc(35) Class2_Sub12 local35 = (Class2_Sub12) Static148.aClass271_11.method7177(); local35 != null; local35 = (Class2_Sub12) Static148.aClass271_11.method7175()) {
			if (local35.aBoolean67) {
				local35.method1170();
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(JJ)J")
	public static long method6720(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
