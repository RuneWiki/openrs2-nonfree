import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class204 implements Interface8 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!bt;")
	private final Class34 aClass34_70;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString57;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!bt;Ljava/lang/String;)V")
	public Class204(@OriginalArg(0) Class34 arg0, @OriginalArg(1) String arg1) {
		this.aClass34_70 = arg0;
		this.aString57 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	@Override
	public int method7616() {
		return this.aClass34_70.method1261(this.aString57) ? 100 : 0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class329 method7617() {
		return Static545.aClass329_2;
	}
}
