import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class Class12 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_228 = new Class145(71, 0);

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public static int anInt6223 = 0;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!ss;")
	public Class12 aClass12_23;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!ss;")
	public Class12 aClass12_24;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 119)
	public final void method5685() {
		if (this.aClass12_23 != null) {
			this.aClass12_23.aClass12_24 = this.aClass12_24;
			this.aClass12_24.aClass12_23 = this.aClass12_23;
			this.aClass12_23 = null;
			this.aClass12_24 = null;
		}
	}
}
