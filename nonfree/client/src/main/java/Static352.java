import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_135 = new Class265(49, 6);

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public static int anInt5971 = 0;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	public static void method4793() {
		@Pc(1) Class171 local1 = Static226.aClass171_22;
		synchronized (Static226.aClass171_22) {
			Static226.aClass171_22.method3934();
		}
		local1 = Static224.aClass171_36;
		synchronized (Static224.aClass171_36) {
			Static224.aClass171_36.method3934();
		}
	}
}
