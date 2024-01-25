import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!ch;")
	public static final Class41 aClass41_4 = new Class41(0);

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!pn;")
	public static final Class271 aClass271_14 = new Class271(2);

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_14 = new Class295(2, 4);

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JI)V")
	public static void method7571(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZII)V")
	public static void method7580(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub45 local10 = Static365.method5366(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray521.length; local15++) {
				local10.anIntArray521[local15] = -1;
				local10.anIntArray520[local15] = 0;
			}
		}
	}
}
