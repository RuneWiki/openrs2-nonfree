import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class232 implements Interface17 {

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString80;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_194;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!in;Ljava/lang/String;)V")
	public Class232(@OriginalArg(0) Class157 arg0, @OriginalArg(1) String arg1) {
		this.aString80 = arg1;
		this.aClass157_194 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lclient!kea;")
	@Override
	public Class176 method8982() {
		return Static288.aClass176_3;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
	@Override
	public int method8981() {
		return this.aClass157_194.method4567(this.aString80) ? 100 : this.aClass157_194.method4551(this.aString80);
	}
}
