import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hha", name = "s", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIILclient!uu;)Lclient!ej;")
	public static Class93 method3285(@OriginalArg(1) int arg0, @OriginalArg(3) Class343 arg1) {
		@Pc(9) byte[] local9 = arg1.method8132(arg0, 0);
		return local9 == null ? null : new Class93(local9);
	}
}
