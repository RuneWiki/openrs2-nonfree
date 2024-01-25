import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[Lclient!ej;")
	public final Class90[] aClass90Array1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([Lclient!ej;)V")
	public Class1_Sub1(@OriginalArg(0) Class90[] arg0) {
		this.aClass90Array1 = arg0;
	}
}
