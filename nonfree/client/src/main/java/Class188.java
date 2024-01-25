import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class188 implements Interface8 {

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString44;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_67;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!bt;Ljava/lang/String;)V")
	public Class188(@OriginalArg(0) Class34 arg0, @OriginalArg(1) String arg1) {
		this.aString44 = arg1;
		this.aClass34_67 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
	@Override
	public int method7616() {
		return this.aClass34_67.method1246(this.aString44) ? 100 : this.aClass34_67.method1237(this.aString44);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class329 method7617() {
		return Static545.aClass329_3;
	}
}
