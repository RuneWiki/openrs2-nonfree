import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class180 implements Interface17 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!in;")
	private final Class157 aClass157_147;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString67;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!in;Ljava/lang/String;)V")
	public Class180(@OriginalArg(0) Class157 arg0, @OriginalArg(1) String arg1) {
		this.aClass157_147 = arg0;
		this.aString67 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
	@Override
	public int method8981() {
		return this.aClass157_147.method4570(this.aString67) ? 100 : 0;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)Lclient!kea;")
	@Override
	public Class176 method8982() {
		return Static288.aClass176_2;
	}
}
