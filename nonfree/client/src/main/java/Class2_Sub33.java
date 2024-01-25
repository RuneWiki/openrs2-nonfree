import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	private Class2_Sub33() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub33(@OriginalArg(0) String arg0) {
		this.aString60 = arg0;
	}
}
